package mto.pos.siebelorder.webservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.siebel.orpos.order.ORPOSQueryPageOutput;
import com.siebel.xml.orpos_order_entry_io.data.ListOfORPOSOrderEntryIoData;
import com.siebel.xml.orpos_order_entry_io.data.ListOfOrderEntryLineItemsData;
import com.siebel.xml.orpos_order_entry_io.data.OrderEntryLineItemsData;
import com.siebel.xml.orpos_order_entry_io.data.OrderEntryOrdersData;

import dtv.i18n.IFormattable;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.security.StationState;
import dtv.util.StringUtils;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.common.MtoValueKeys;
import mto.pos.ws.order.client.MtoOrderServiceHelper;
import mto.pos.ws.order.ordersearch.MtoOrderEntryLineItemsResponseBean;
import mto.pos.ws.order.ordersearch.MtoOrderLookupResponseBean;



public class MtoOrderLookupOp extends Operation {
	@Inject
	protected TransactionScope _transactionScope;
	 private static final Logger logger_ = LogManager.getLogger(MtoOrderLookupOp.class);
	 private static MtoOrderLookupOp INSTANCE;
		@Inject
		private StationState stationState;
		private static final Logger _logger = LogManager.getLogger(MtoOrderLookupOp.class);

		public static MtoOrderLookupOp getINSTANCE() {
			return INSTANCE;
		}

		public static void setINSTANCE(MtoOrderLookupOp iNSTANCE) {
			INSTANCE = iNSTANCE;
		}
	
	public ORPOSQueryPageOutput lookupOrderInfo(String argLoginUserId) {
		ORPOSQueryPageOutput result = null;
	
		if(!StringUtils.isEmpty(argLoginUserId)) {
			try {
				result = MtoOrderServiceHelper.getInstance().orposQueryPage(argLoginUserId);
			      logger_.warn("Response received" + result);
			}
			catch(Exception e)
			{
				 logger_.warn("Lookup Order" + e.getMessage());
			}
		}
		return result;
		
	}

	public IOpResponse handleOrderLookupWSCallSearch() {
		// TODO Auto-generated method stub
		String loginUserId = null;
	
			if (stationState != null) {
				loginUserId = stationState.getSystemUser().getOperatorParty().getEmployeeId();
			}
			ORPOSQueryPageOutput request = lookupOrderInfo(loginUserId);
			return handleResponseObject(request);
	
	}
	
	private IOpResponse handleResponseObject(ORPOSQueryPageOutput argResponseObject) {
		ArrayList<MtoOrderLookupResponseBean> externalOrders = new ArrayList<MtoOrderLookupResponseBean>();
		//setting it here so that the previous search results are not displayed
		_transactionScope.setValue(MtoValueKeys.SIEBEL_ORDER_INQUIRY_RESULTS, externalOrders);
		
		try// TODO Auto-generated method stub
		{
			if (argResponseObject == null) {
				String message ="No network found";
				IFormattable ErrorMsg = _formattables.getSimpleFormattable(message);
				return this.HELPER.getPromptResponse("MTO_NETWORK_OFFLINE", ErrorMsg);
			} else {
				ListOfORPOSOrderEntryIoData orderList = argResponseObject.getListOfORPOSOrderEntryIo();
		
				int maxOrders = Integer.parseInt(MtoConfigurationMgr.getSiebelServicePageSize());
	
				if ((orderList == null) || (orderList.getRecordcount().intValue() == 0)) {
				   
				  setOpState(null);
					return this.HELPER.getPromptResponse("MTO_NO_RECORD_FOUND");
				}
				if ((orderList.getRecordcount() != null) && (orderList.getRecordcount().intValue() > maxOrders)) {
					String message = new StringBuilder().append("Number of records returned (")
							.append(orderList.getRecordcount().intValue()).append(") exceeds limit (").append(maxOrders)
							.append(")").toString();
					IFormattable ErrorMsg = _formattables.getSimpleFormattable(message);
					//commenting this for now as dev siebel returns more than 50 
					//return this.HELPER.getPromptResponse("MTO_MAX_RECORDS_EXCEEDED", ErrorMsg);

				}

				_transactionScope.setValue(MtoValueKeys.SIEBEL_ORDER_INQUIRY_RESPONSE, argResponseObject);

				// setting to the response class

				List<OrderEntryOrdersData> orders = orderList.getOrderEntryOrders();
			

				if (orders != null) {
					for (OrderEntryOrdersData orderData : orders) {
						MtoOrderLookupResponseBean order = (MtoOrderLookupResponseBean) translateExternalOrder(
								orderData);
						externalOrders.add(order);
					}
					_transactionScope.setValue(MtoValueKeys.SIEBEL_ORDER_INQUIRY_RESULTS, externalOrders);
				}
			
			
				return HELPER.completeResponse();

			}
		} catch (Exception ex) {
			_logger.error("Exception Handled: " + ex.getMessage());
		}
		// For any Exception Response.
		return null;
	}

	protected MtoOrderLookupResponseBean translateExternalOrder(OrderEntryOrdersData orderData) {
		_logger.info("QuerryFormatter: translateExternalOrder() starts for order id: " + orderData.getId().toString());
		MtoOrderLookupResponseBean order = new MtoOrderLookupResponseBean();
		order.setId(orderData.getId());
		order.setOrderNumber(orderData.getOrderNumber());

		if (orderData.getCreated() != null) {
			order.setCreated(orderData.getCreated().toGregorianCalendar().getTime());
		}
		order.setCurrentOrderTotalNetPrice(orderData.getCurrentOrderTotalNetPrice());
		order.setAccount(orderData.getAccount());
		order.setContactFirstName(orderData.getContactFirstName());
		order.setContactLastName(orderData.getContactLastName());
		order.setContractId(orderData.getAgreementId());

		order.setMtoAccountPrepaidBalance(orderData.getMTOAccountPrepaidBalance());
		order.setMtoAccountSCBalance(orderData.getMTOAccountSCBalance());
		order.setMtoPaymentRefNumber(orderData.getMTOPaymentRefNumber());
		order.setTransactionType(orderData.getTransactionType());

		_logger.info("QuerryFormatter: translateExternalOrder() ends for order id: " + orderData.getId().toString());
		// to be handled for the order to retrieve lineitems if needed
		/*Start Task 100597 Item Not on File prompt appearing for transaction type  available in DB */
		translateExternalOrderLineItems(order,orderData.getListOfOrderEntryLineItems(), orderData.getFreight());
		_transactionScope.setValue(MtoValueKeys.SIEBEL_ORDER_SELECTED, order);

		return order;
	}

	@Override
	public IOpResponse handleOpExec(IXstEvent argEvent) {
				//clear scope variable 
		setScopedValue(MtoValueKeys.SIEBEL_ORDER_FLOW_COMPLETE, false);
		IOpResponse response = handleOrderLookupWSCallSearch();
		
		return response;
		
	}
	
	
	 protected IOpResponse translateExternalOrderLineItems(MtoOrderLookupResponseBean order, ListOfOrderEntryLineItemsData lineItems, BigDecimal freightAmount) 
	    {
			BigInteger pageSize = new BigInteger(MtoConfigurationMgr.getSiebelServiceOrderDetailPageSize());
	
	        if (lineItems != null)
	        {
	            if (lineItems.isLastpage())
	            {
	                List<OrderEntryLineItemsData> lineItemsData = lineItems.getOrderEntryLineItems();
	                translateExternalOrderLineItems(order, lineItemsData, freightAmount);
	            }
	            else
	            {
	                //Order contains more line items then the maximum allowed
	    			String message = new StringBuilder().append("Number of records returned (")
							.append(lineItems.getRecordcount().intValue()).append(") exceeds limit (").append(pageSize)
							.append(")").toString();
					IFormattable ErrorMsg = _formattables.getSimpleFormattable(message);
	                return HELPER.getPromptResponse("MTO_RESPONSE_MAX_LINE_ITEMS_EXCEEDED", ErrorMsg);
	            }
	        }
			return null;
	    }

	  
	    protected void translateExternalOrderLineItems(MtoOrderLookupResponseBean order,
	            List<OrderEntryLineItemsData> lineItemsData,
	                                                   BigDecimal freightAmount)
	    {
	        if (lineItemsData != null)
	        {
	           // ShippingAggregatorIfc shippingTotals = new ShippingAggregator();

	            for (OrderEntryLineItemsData lineItemData : lineItemsData)
	            {

	                    MtoOrderEntryLineItemsResponseBean item = new MtoOrderEntryLineItemsResponseBean();
	                    item.setId(lineItemData.getId());
	                    item.setLineNumber2(lineItemData.getLineNumber2());
	                    //Pos item id is the response part number 
	                    item.setPartNumber(lineItemData.getPartNumber().toUpperCase());

						/*
						 * if (!getSellActionCode().equals(lineItemData.getActionCode())) { //only
						 * update sell LineItems item.setUpdateToSourceFlag(false); }
						 */
	                    item.setQuantityRequested(lineItemData.getQuantityRequested());
	                    // product from response - description of item in pos 
	                    //Product Description - truncate if number of bytes exceeds 250
	                    if (lineItemData.getProduct() != null && lineItemData.getProduct().getBytes().length > 250)
	                    {
	                        item.setProduct(lineItemData.getProduct().substring(0, 60));
	                    }
	                    else
	                    {
	                    	 item.setProduct(lineItemData.getProduct());
	                    }

	                    //return item
	                    //item.setSellItem(!StringUtils.equals(getReturnActionCode(), lineItemData.getActionCode()));

	                    //price
	                    BigDecimal netPrice = lineItemData.getNetPrice();

	                    if (netPrice != null)
	                    {
	                        item.setNetPrice(netPrice);
	                    }
	                    
	                    else
	                    {
	                    	 netPrice = BigDecimal.ZERO;
	                    	 item.setNetPrice(netPrice);
	                    }

	                    //serial number
	                    if (lineItemData.isSerialized() == null || !lineItemData.isSerialized())
	                    {
	                        item.setServiceId("");
	                    }
	                    else
	                    {
	                    	 item.setServiceId(lineItemData.getServiceId());
	                    }

	                   

	                    //is child?
	                    if (lineItemData.getParentOrderItemId()!=null)
	                    {
	                        item.setParentOrderItemId(lineItemData.getParentOrderItemId());
	                    }

	                    //add to order
	                    order.addItem(item);
	                    
	                  
	            }
	            _transactionScope.setValue(MtoValueKeys.SIEBEL_ORDER_LINEITEM_DETAILS, order);
	           
	        }
	    }
	    

}
