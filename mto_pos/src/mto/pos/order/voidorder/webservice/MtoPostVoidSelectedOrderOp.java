package mto.pos.order.voidorder.webservice;

import java.util.GregorianCalendar;
import java.util.List;

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

import dtv.i18n.IFormattable;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.register.type.LineItemType;
import dtv.xst.dao.tnd.TenderStatus;
import dtv.xst.dao.trl.IRetailTransactionLineItem;
import dtv.xst.dao.trn.IPostVoidTransaction;
import dtv.xst.dao.ttr.ICreditDebitTenderLineItemModel;
import dtv.xst.dao.ttr.ITenderLineItem;
import dtv.xst.dao.ttr.IVoucherTenderLineItemModel;
import dtv.xst.dao.ttr.impl.CheckTenderLineItemModel;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderConstants;
import mto.pos.order.MtoOrderHelper;
import mto.pos.order.MtoOrderList;

/**
 * US#92635 Integration Siebel Xstore void order processing
 * Bug#105126 Adding Card#,trace# and verification code
 * in ListOfPayments Siebel WS call
 * @author Nishanthi_Babu
 *
 */
public class MtoPostVoidSelectedOrderOp extends Operation {
	private static final Logger logger_ = LogManager.getLogger(MtoPostVoidSelectedOrderOp.class);
	@Inject
	MtoOrderHelper _orderHelper;
	static boolean isRequestSend = false;

	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {
		// TODO Auto-generated method stub
		handleSiebelVoidWSCallSearch();
		return HELPER.completeResponse();
	}

	public IOpResponse handleSiebelVoidWSCallSearch() {
		// sending update void request
		MtoOrderList orderSelected = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);

		int seqNumber = 0;
		try {
			// send updated for tenders
			IPostVoidTransaction currentTransaction = (IPostVoidTransaction) this._transactionScope
					.getValue(TransactionScope.CURRENT_TRANSACTION);
			ListOfPaymentsData paymentDetails = prepareVoidPaymentDetails(currentTransaction);
			if (paymentDetails != null && paymentDetails.getPayments() != null
					&& !paymentDetails.getPayments().isEmpty()) {
				logger_.error("MtoPostVoidSelectedOrderOp.handleOrderLookupWSCallSearch() sending payment request");
				ORPOSExecuteOutput paymentOutput = _orderHelper.orposExecute(orderSelected, paymentDetails,
						currentTransaction, MtoOrderConstants.ORDER_VOID_STATUS);
				boolean isReqSuccess = handleSiebelVoidUpdateResponse(paymentOutput, orderSelected, paymentDetails,
						seqNumber++);
				if (isReqSuccess) {
					logger_.error("MtoPostVoidSelectedOrderOp.handleOrderLookupWSCallSearch() sending void request");
					ORPOSExecuteOutput fundedOutput = _orderHelper.orposExecute(orderSelected, null, currentTransaction,
							MtoOrderConstants.ORDER_VOID_STATUS);
					logger_.error("handlePromptResponse step4: response received from siebel Order void flow");
					handleSiebelVoidUpdateResponse(fundedOutput, orderSelected, null, seqNumber++);
				} else {
					logger_.error(
							"MtoPostVoidSelectedOrderOp.handleSiebelVoidWSCallSearch() payment request failed--> skip funded request");
				}
			}
		} catch (Exception e) {
			logger_.error("Exception occurred while sending the order void update " + e.getMessage());
			// processOfflineResponses(orderSelected,null,seqNumber++);
		}

		// show a prompt
		isRequestSend = true;
		setScopedValue(MtoValueKeys.SIEBEL_ORDER_FLOW_COMPLETE, true);
		return this.HELPER.getPromptResponse("COMPLETE_VOID_PROMPT", new dtv.i18n.IFormattable[0]);

	}

	@SuppressWarnings("unused")
	protected boolean handleSiebelVoidUpdateResponse(ORPOSExecuteOutput output, MtoOrderList orderSelected,
			ListOfPaymentsData paymentDetails, int seqNumber) {
		logger_.error("handleSiebelVoidUpdateResponse step5: start");
		try {
			String orderModId = null;
			if (output == null) {
				logger_.error(
						"handleSiebelVoidUpdateResponse step6: no response received from Siebel : same request in db");
				// processOfflineResponses(orderSelected,paymentDetails,seqNumber);
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
				logger_.error("handleSiebelVoidUpdateResponse step6: no mode id is received");
				String message = "Mod id is not received in the response";
				IFormattable errorMsg = _formattables.getSimpleFormattable(message);
			}

		} catch (Exception ex) {
			logger_.error("Exception Handled: " + ex.getMessage());
		}
		logger_.error("handleSiebelVoidUpdateResponse step7: end");
		return true;
	}

	protected ListOfPaymentsData prepareVoidPaymentDetails(IPostVoidTransaction currentTransaction) {
		logger_.error("MtoPostVoidSelectedOrderOp.prepareVoidPaymentDetails() step1:");
		List<IRetailTransactionLineItem> tenders = currentTransaction.getVoidedTransaction()
				.getRetailTransactionLineItems();
		ListOfPaymentsData paymentData = new ListOfPaymentsData();

		for (IRetailTransactionLineItem lineItem : tenders) {
			if (lineItem.getLineItemTypeCode().equalsIgnoreCase(LineItemType.TENDER.getName())) {
				ITenderLineItem line = (ITenderLineItem) lineItem;
				//Bug 104078#Void request not reaching Siebel.
				if (line != null && !line.getVoid() && 
						!line.getTenderStatusCode().equalsIgnoreCase(TenderStatus.CHANGE.getName())) {
					logger_.error("MtoPostVoidSelectedOrderOp.prepareVoidPaymentDetails() step2:");
					PaymentsData data = new PaymentsData();
					data.setOperation(MtoOrderConstants.ORDER_PAYMENT_OPERATION);
					if (line.getTenderId().equalsIgnoreCase("CAD_CURRENCY")) {
						data.setPaymentMethod(MtoOrderConstants.ORDER_TENDER_CASH);
					}
					else if(line.getTenderId().equalsIgnoreCase("MASTER_CARD")|| 
							line.getTenderId().equalsIgnoreCase("AMEX")
							|| line.getTenderId().equalsIgnoreCase("VISA") ) {
						
						data.setPaymentMethod(MtoOrderConstants.ORDER_TENDER_CC);
						 ICreditDebitTenderLineItemModel ctl = (ICreditDebitTenderLineItemModel)line;
						 data.setMTOCreditCardNumber(ctl.getAccountNumber().trim());
						 data.setAuthorizationCode(ctl.getTraceNumber());
						 XMLGregorianCalendar result = null;
					      try
					      {
					        GregorianCalendar gcal = (GregorianCalendar)GregorianCalendar.getInstance();
					        result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
					      }
					      catch (DatatypeConfigurationException e)
					      {
					        e.printStackTrace();
					      }
					      if (result!=null) 
					      data.setMTOCreditAuthorizationTime(result);
					    }
					
				
					else if(line.getTenderId().equalsIgnoreCase("DEBIT_CARD")) {
						data.setPaymentMethod(MtoOrderConstants.ORDER_TENDER_DC);
						 ICreditDebitTenderLineItemModel ctl = (ICreditDebitTenderLineItemModel)line;
						 data.setMTOCreditCardNumber(ctl.getAccountNumber().trim());
						 data.setAuthorizationCode(ctl.getTraceNumber());
						 XMLGregorianCalendar result = null;
					      try
					      {
					        GregorianCalendar gcal = (GregorianCalendar)GregorianCalendar.getInstance();
					        result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
					      }
					      catch (DatatypeConfigurationException e)
					      {
					        e.printStackTrace();
					      }
					      if (result!=null) 
					      data.setMTOCreditAuthorizationTime(result);
					    }
					else if(line.getTenderId().equalsIgnoreCase("CERTIFIED_FUND")) {
						logger_.error("MtoCheckSaleCompleteOp: certified fund payment:"+line.getTenderId());
						data.setPaymentMethod(line.getTenderDescription());
						IVoucherTenderLineItemModel vocher = (IVoucherTenderLineItemModel)line;
						data.setMTOPaymentInstrNumber(vocher.getTraceNumber());
					}
					else if(line.getTenderId().equalsIgnoreCase("CHECK")) {
						logger_.error("MtoCheckSaleCompleteOp: check payment:"+line.getTenderId());
						data.setPaymentMethod(line.getTenderDescription());
						CheckTenderLineItemModel check =(CheckTenderLineItemModel)line;
						data.setVerificationNumber(check.getCheckSequenceNumber());
					}
					
					else {
						data.setPaymentMethod(line.getTenderDescription());
					}
					logger_.error("MtoPostVoidSelectedOrderOp.prepareVoidPaymentDetails() step3:");
					logger_.error(
							"MtoPostVoidSelectedOrderOp.prepareVoidPaymentDetails() step4:" + data.getPaymentMethod());
					data.setPaymentStatus(MtoOrderConstants.ORDER_VOID_STATUS);
					data.setTransactionAmount(line.getAmount());
					logger_.error("MtoPostVoidSelectedOrderOp.prepareVoidPaymentDetails() step5:"
							+ data.getTransactionAmount());
					paymentData.getPayments().add(data);
				} else {
					logger_.error(
							"MtoPostVoidSelectedOrderOp.prepareVoidPaymentDetails() void tender : skip the payment request");
				}
			}
		}

		return paymentData;
	}

}
