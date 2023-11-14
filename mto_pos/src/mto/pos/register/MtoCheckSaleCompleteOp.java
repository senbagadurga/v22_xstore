package mto.pos.register;


/********************************************************************************
 * US 92543 Siebel Sale Order Processing
 * 09/01/2023 Nayya Gupta constant class to handle constant values
 *  Bug#105126 Adding Card#,trace# and verification code
 * in ListOfPayments Siebel WS call
 *******************************************************************************/
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.math.BigDecimal;
import javax.inject.Inject;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.siebel.orpos.order.ORPOSExecuteOutput;
import com.siebel.xml.orpos_order_entry_io.data.ListOfPaymentsData;
import com.siebel.xml.orpos_order_entry_io.data.PaymentsData;
import com.siebel.xml.orpos_order_entry_io.id.OrderEntryOrdersId;

import dtv.data2.access.DataFactory;
import dtv.data2.access.IObjectId;
import dtv.i18n.IFormattable;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.register.CheckSaleCompleteOp;
import dtv.util.NumberUtils;
import dtv.xst.dao.trl.IRetailTransactionLineItem;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.ttr.ICreditDebitTenderLineItemModel;
import dtv.xst.dao.ttr.ITenderAuthLog;
import dtv.xst.dao.ttr.ITenderAuthLogProperty;
import dtv.xst.dao.ttr.ITenderLineItem;
import dtv.xst.dao.ttr.IVoucherTenderLineItemModel;
import dtv.xst.dao.ttr.TenderAuthLogId;
import dtv.xst.dao.ttr.impl.CheckTenderLineItemModel;
import dtv.xst.dao.ttr.impl.CreditDebitTenderLineItemModel;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderConstants;
import mto.pos.order.MtoOrderHelper;
import mto.pos.order.MtoOrderList;

public class MtoCheckSaleCompleteOp extends CheckSaleCompleteOp {
	private static final Logger logger_ = LogManager.getLogger(MtoCheckSaleCompleteOp.class);

	@Inject
	MtoOrderHelper _orderHelper;
	static boolean isRequestSend = false;

	@Override
	protected IOpResponse handleSaleComplete() {
		// prevent request from resending
		if (getScopedValue(MtoValueKeys.SIEBEL_ORDER_FLOW_COMPLETE) != null
				&& getScopedValue(MtoValueKeys.SIEBEL_ORDER_FLOW_COMPLETE)) {
			logger_.error("handlePromptResponse step2");
			return this.HELPER.getCompleteStackChainResponse(getSaleCompleteOpChainKey());
		}

		logger_.error("MtoCheckSaleCompleteOp.handleSaleComplete() starts");
		// send update request
		MtoOrderList orderSelected = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);

		int seqNumber = 0;
		try {
			// send updated for tenders
			IPosTransaction currentTransaction = this._transactionScope.getValue(TransactionScope.CURRENT_TRANSACTION);
			ListOfPaymentsData paymentDetails = preparePaymentDetails(currentTransaction);
			if (paymentDetails != null && paymentDetails.getPayments() != null
					&& !paymentDetails.getPayments().isEmpty()) {
				logger_.error("MtoCheckSaleCompleteOp.handleSaleComplete() sending payment request");
				ORPOSExecuteOutput paymentOutput = _orderHelper.orposExecute(orderSelected, paymentDetails,
						currentTransaction);

				boolean isReqSuccess = handleSiebelUpdateResponse(paymentOutput, orderSelected, paymentDetails,
						seqNumber++);
				if (isReqSuccess) {
					logger_.error("MtoCheckSaleCompleteOp.handleSaleComplete() sending funded request");
					ORPOSExecuteOutput fundedOutput = _orderHelper.orposExecute(orderSelected, null,
							currentTransaction);
					logger_.error("handlePromptResponse step4: response received from siebel Order funded flow");
					handleSiebelUpdateResponse(fundedOutput, orderSelected, null, seqNumber++);
				} else {
					logger_.error(
							"MtoCheckSaleCompleteOp.handleSaleComplete() payment request failed--> skip funded request");
				}
			}
		} catch (Exception e) {
			logger_.error("Exception occurred while sending the order update " + e.getMessage());
			processOfflineResponses(orderSelected, null, seqNumber++);
		}

		// show a prompt
		isRequestSend = true;
		setScopedValue(MtoValueKeys.SIEBEL_ORDER_FLOW_COMPLETE, true);
		return this.HELPER.getPromptResponse("COMPLETE_SALE_PROMPT", new dtv.i18n.IFormattable[0]);

	}

	protected boolean handleSiebelUpdateResponse(ORPOSExecuteOutput output, MtoOrderList orderSelected,
			ListOfPaymentsData paymentDetails, int seqNumber) {
		logger_.error("handleSiebelUpdateResponse step5: start");
		try {
			String orderModId = null;
			if (output == null) {
				logger_.error(
						"handleSiebelUpdateResponse step6: no response received from Siebel : same request in db");
				processOfflineResponses(orderSelected, paymentDetails, seqNumber);
				return false;
			}

			_transactionScope.setValue(MtoValueKeys.SIEBEL_ORDER_ORDER_UPDATE, output);

			// not handling any response except null as its not required according to
			// requirements provided
			if (output != null) {
				List<OrderEntryOrdersId> updateOrdersList = output.getListOfORPOSOrderEntryIo().getOrderEntryOrders();
				if (updateOrdersList != null) {
					for (OrderEntryOrdersId orderData : updateOrdersList) {
						orderModId = orderData.getModId();
						logger_.warn(
								"Update Order: Received mod id hence considering as success response" + orderModId);

					}

				}
			}
			if (orderModId == null) {
				logger_.error("handleSiebelUpdateResponse step6: no mode id is received");
				String message = "Mod id is not received in the response";
				IFormattable errorMsg = _formattables.getSimpleFormattable(message);
			}

		} catch (Exception ex) {
			logger_.error("Exception Handled: " + ex.getMessage());
		}
		logger_.error("handleSiebelUpdateResponse step7: end");
		return true;
	}

	protected ListOfPaymentsData preparePaymentDetails(IPosTransaction currentTransaction) {
		logger_.error("MtoCheckSaleCompleteOp.preparePaymentDetails() step1:");
		List<IRetailTransactionLineItem> tenders = currentTransaction.getTenderLineItems();
		BigDecimal transTotal = currentTransaction.getTotal();
		BigDecimal tot = BigDecimal.ZERO;

		ListOfPaymentsData paymentData = new ListOfPaymentsData();

		if (tenders != null && tenders.size() > 0) {
			for (Iterator iterator = tenders.iterator(); iterator.hasNext();) {

				ITenderLineItem tender = (ITenderLineItem) iterator.next();
				// added check for void tender
				BigDecimal enteredAmount = tender.getAmount();// tendered amount - entered amount
				if (tender != null && !tender.getVoid()) {

					logger_.error("MtoCheckSaleCompleteOp.preparePaymentDetails() step2:");
					PaymentsData data = new PaymentsData();
					data.setOperation(MtoOrderConstants.ORDER_PAYMENT_OPERATION);
					if (tender.getTenderId().equalsIgnoreCase("CAD_CURRENCY")) {
						data.setPaymentMethod(MtoOrderConstants.ORDER_TENDER_CASH);
						if (!iterator.hasNext()) {// check if cash is the last payment
							data.setTransactionAmount(transTotal.subtract(tot));

						}

					} else if (tender.getTenderId().equalsIgnoreCase("MASTER_CARD")
							|| tender.getTenderId().equalsIgnoreCase("AMEX")
							|| tender.getTenderId().equalsIgnoreCase("VISA")
							|| tender.getTenderId().equalsIgnoreCase("CREDIT_CARD")) {
						logger_.error("MtoCheckSaleCompleteOp: credit card payment:" + tender.getTenderId());
						data.setPaymentMethod(MtoOrderConstants.ORDER_TENDER_CC);
						ICreditDebitTenderLineItemModel ctl = (ICreditDebitTenderLineItemModel) tender;
						data.setMTOCreditCardNumber(ctl.getAccountNumber().trim());
						data.setAuthorizationCode(ctl.getTraceNumber());
						XMLGregorianCalendar result = null;
						try {
							GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar.getInstance();
							result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
						} catch (DatatypeConfigurationException e) {
							e.printStackTrace();
						}
						if (result != null)
							data.setMTOCreditAuthorizationTime(result);
					}

					else if (tender.getTenderId().equalsIgnoreCase("DEBIT_CARD")) {
						logger_.error("MtoCheckSaleCompleteOp: debit card payment:" + tender.getTenderId());
						data.setPaymentMethod(MtoOrderConstants.ORDER_TENDER_DC);
						CreditDebitTenderLineItemModel ctl = (CreditDebitTenderLineItemModel) tender;
						data.setMTOCreditCardNumber(ctl.getAccountNumber().trim());
						data.setAuthorizationCode(ctl.getTraceNumber());
					}

					else if (tender.getTenderId().equalsIgnoreCase("CERTIFIED_FUND")) {
						logger_.error("MtoCheckSaleCompleteOp: certified fund payment:" + tender.getTenderId());
						data.setPaymentMethod(tender.getTenderDescription());
						IVoucherTenderLineItemModel vocher = (IVoucherTenderLineItemModel) tender;
						vocher.getTraceNumber();
						// tender.getRetailTransactionLineItemExt().getClass(IVoucherTenderLineItemModel.class)
						data.setMTOPaymentInstrNumber(vocher.getTraceNumber());
					} else if (tender.getTenderId().equalsIgnoreCase("CHECK")) {
						logger_.error("MtoCheckSaleCompleteOp: check payment:" + tender.getTenderId());
						data.setPaymentMethod(tender.getTenderDescription());
						CheckTenderLineItemModel check = (CheckTenderLineItemModel) tender;
						data.setVerificationNumber(check.getCheckSequenceNumber());
					} else {
						if (tender.getTenderId().equalsIgnoreCase("PREPAID_PAYMENT") && !iterator.hasNext()) {
							data.setTransactionAmount(transTotal.subtract(tot));
						}
						data.setPaymentMethod(tender.getTenderDescription());
					}
					logger_.error("MtoCheckSaleCompleteOp.preparePaymentDetails() step3:");
					logger_.error("MtoCheckSaleCompleteOp.preparePaymentDetails() step4:" + data.getPaymentMethod());
					data.setPaymentStatus(MtoOrderConstants.ORDER_TENDER_PAYMENT_STATUS);
					if (data.getTransactionAmount() == null) {
						data.setTransactionAmount(tender.getAmount());
						
					}
					logger_.error(
							"MtoCheckSaleCompleteOp.preparePaymentDetails() step5:" + data.getTransactionAmount());
					/*
					 * List<PaymentsData> list = new ArrayList<>(); list.add(data);
					 */
					paymentData.getPayments().add(data);
					tot = NumberUtils.add(tot, tender.getAmount());// total
				} else {
					logger_.error("MtoCheckSaleCompleteOp void tender : skip the payment request");
				}
			}
		}
		return paymentData;
	}

	protected void processOfflineResponses(MtoOrderList orderSelected, ListOfPaymentsData paymentDetails,
			int seqNumber) {

		logger_.error("MtoSaveSiebelUpdateRequestOp.handleSaleComplete() starts:");

		/**
		 * Siebel offline flow Save update request in database for retry
		 */
		try {
			IPosTransaction currentTransaction = this._transactionScope.getValue(TransactionScope.CURRENT_TRANSACTION);
			logger_.error("processOfflineResponses step1:");
			if (currentTransaction != null) {
				List<ITenderAuthLogProperty> properties = new ArrayList<>();
				logger_.error("processOfflineResponses step2:");
				TenderAuthLogId authId = _orderHelper.makeLogEntryId(currentTransaction);
				ITenderAuthLog tenderAuthEntry = (ITenderAuthLog) DataFactory.createObject((IObjectId) authId,
						ITenderAuthLog.class);
				tenderAuthEntry.setResponseCode("200");
				tenderAuthEntry.setErrorText("Siebel Offline");
				tenderAuthEntry.setBusinessDate(currentTransaction.getBusinessDate());
				if (orderSelected != null) {
					tenderAuthEntry.setStringProperty("OrderId", orderSelected.getId());
					logger_.error("processOfflineResponses step3: order id",
							tenderAuthEntry.getStringProperty("OrderId"));
				}
				if (paymentDetails != null && paymentDetails.getPayments() != null
						&& paymentDetails.getPayments().size() > 0) {
					tenderAuthEntry.setStringProperty("tenderID",
							paymentDetails.getPayments().get(0).getPaymentMethod());
					tenderAuthEntry.setDecimalProperty("TenderAmount",
							paymentDetails.getPayments().get(0).getTransactionAmount());
					ITenderAuthLogProperty updateRequest = _orderHelper.addProperty("TENDER_REQUEST", tenderAuthEntry,
							seqNumber, 0);
					properties.add(updateRequest);
				} else {
					ITenderAuthLogProperty fundedRequest = _orderHelper.addProperty("FUNDED_REQUEST", tenderAuthEntry,
							seqNumber, 0);
					fundedRequest.setRetailTransactionLineItemSequence(seqNumber);
					properties.add(fundedRequest);
				}

				tenderAuthEntry.setProperties(properties);
				DataFactory.makePersistent(tenderAuthEntry);
			}

		} catch (Exception e) {
			logger_.error("processOfflineResponses error occurred while saving the request " + e.getMessage());
		}
		logger_.error("processOfflineResponses ends:");

	}

}
