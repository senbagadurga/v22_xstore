package mto.pos.register;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
/********************************************************************************
 * US 92543 Siebel Sale Order Processing
 * 09/01/2023 Nayya Gupta constant class to handle constant values
 *******************************************************************************/
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.siebel.orpos.order.ORPOSExecuteInput;
import com.siebel.orpos.order.ORPOSExecuteOutput;
import com.siebel.orpos.order.ORPOSORDERPORT;
import com.siebel.xml.orpos_order_entry_io.data.ListOfORPOSOrderEntryIoData;
import com.siebel.xml.orpos_order_entry_io.data.ListOfPaymentsData;
import com.siebel.xml.orpos_order_entry_io.data.OrderEntryOrdersData;
import com.siebel.xml.orpos_order_entry_io.data.PaymentsData;

import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryResultList;
import dtv.data2.access.ObjectNotFoundException;
import dtv.data2.access.QueryKey;
import dtv.pos.iframework.security.StationState;
import dtv.util.NumberEncoding;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.ttr.ITenderAuthLog;
import dtv.xst.dao.ttr.ITenderAuthLogProperty;
import mto.pos.order.MtoOrderConstants;
import mto.pos.order.MtoOrderHelper;
import mto.pos.ws.order.client.MtoOrderServiceHelper;

public class MtoProcessOfflineRequestsWorker implements Runnable {
	  private static final Logger _logger = LogManager.getLogger(MtoProcessOfflineRequestsWorker.class);

	  private static final QueryKey<ITenderAuthLog> ALL_OFFLINE_REQUESTS = new QueryKey("ALL_OFFLINE_REQUESTS", ITenderAuthLog.class);
	  @Inject
		MtoOrderHelper _orderHelper;
	  @Inject
	  protected StationState _stationState;
	  public MtoProcessOfflineRequestsWorker(int value) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		
		_logger.error("MtoProcessOfflineRequestsWorker --> "+System.currentTimeMillis());
		 IQueryResultList<ITenderAuthLog> resultList = null;
		    try {
		    	Map<String, Object> params = new HashMap<>();
		    	_logger.error("MtoProcessOfflineRequestsWorker --> step1");
		        params.put("argRetailLocationId", 62);
		        _logger.error("MtoProcessOfflineRequestsWorker --> step1");
		    	resultList = DataFactory.getObjectByQuery(ALL_OFFLINE_REQUESTS, params);
		    	_logger.error("MtoProcessOfflineRequestsWorker --> step2");
		    	if(resultList != null && !resultList.isEmpty())
		    	{
		    		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
						ITenderAuthLog iTenderAuthLog = (ITenderAuthLog) iterator.next();
						_logger.error("Transaction: "+iTenderAuthLog.getTransactionSequence());
						if(iTenderAuthLog.getProperties() != null && !iTenderAuthLog.getProperties().isEmpty())
						{
							List<ITenderAuthLogProperty> list = iTenderAuthLog.getProperties();
							for (Iterator iterator2 = list.iterator(); iterator2.hasNext();) {
								ITenderAuthLogProperty iTenderAuthLogProperty = (ITenderAuthLogProperty) iterator2
										.next();
								_logger.error("property txn: "+iTenderAuthLogProperty.getTransactionSequence());
								_logger.error("property code: "+iTenderAuthLogProperty.getPropertyCode());
								try
								{
									ORPOSExecuteOutput fundedOutput = null;
								    ORPOSExecuteInput 		pageInput 		= null;
								    pageInput 		= buildOrderUpdateRequestPreparer(iTenderAuthLog,iTenderAuthLogProperty);
								  	MtoOrderServiceHelper 	serviceHelper 	= MtoOrderServiceHelper.getInstance();
								    ORPOSORDERPORT siebelService = serviceHelper.getORPOSORDERPORT();
								    fundedOutput = siebelService.orposExecute(pageInput);
									//handleSiebelUpdateResponse(fundedOutput,orderSelected,null,seqNumber++);
									
								}
								catch(Exception e)
								{
									_logger.error("Exception occurred while sending the order update "+e.getMessage());
									//processOfflineResponses(orderSelected,null,seqNumber++);
								}
							}
						}
						
					}
		    	}
		    } catch (ObjectNotFoundException e) {
		    	_logger.error(e.getMessage());
		    } catch (Exception e) {
		    	_logger.error("MtoProcessOfflineRequestsWorker EXCEPTION occurred", e.getMessage());
		    	e.printStackTrace();
		    } 
		    
		   
		
	}
	/**
	 * method to create request from object
	 * @param iTenderAuthLogProperty
	 * @return
	 */
	protected ORPOSExecuteInput buildOrderUpdateRequestPreparer(ITenderAuthLog iTenderAuthLog,ITenderAuthLogProperty iTenderAuthLogProperty) 
	{
		
		  ORPOSExecuteInput orderRequest = new ORPOSExecuteInput();
		  OrderEntryOrdersData orderEntry = new OrderEntryOrdersData();
		  try {
		  orderEntry.setId(iTenderAuthLog.getStringProperty("OrderId"));
		  orderEntry.setOperation(MtoOrderConstants.ORDER_OPERATION_TYPE);
		  		  
		  if(iTenderAuthLogProperty != null && iTenderAuthLogProperty.getPropertyCode().equalsIgnoreCase("TENDER_REQUEST"))
		  {
			  orderEntry.setStatus(MtoOrderConstants.ORDER_OPERATION_TYPE);
			  ListOfPaymentsData paymentData = new ListOfPaymentsData();
		      PaymentsData data = new PaymentsData();
			  data.setOperation(MtoOrderConstants.ORDER_PAYMENT_OPERATION);
			  data.setPaymentMethod(iTenderAuthLog.getStringProperty("tenderID"));
			  data.setPaymentStatus(MtoOrderConstants.ORDER_TENDER_PAYMENT_STATUS);
		      data.setTransactionAmount(iTenderAuthLog.getDecimalProperty("TenderAmount"));
			  paymentData.getPayments().add(data);
			  orderEntry.setListOfPayments(paymentData);
		  }
		  else
		  {
			  //for order funded request
			  /**
			   * 5 digit store number + 3 digit register number + 4 digit transaction sequence
			   */
			  orderEntry.setMTOPaymentRefNumber(createReferenceNumber(iTenderAuthLog));
			  XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(iTenderAuthLog.getBusinessDate()));
			  orderEntry.setMTOBusinessDate(date);
			  orderEntry.setId(iTenderAuthLog.getStringProperty("OrderId"));
			  orderEntry.setStatus(MtoOrderConstants.ORDER_FUNDED_STATUS);
			  orderEntry.setDiscountAmount(BigDecimal.ZERO);
			  orderEntry.setTaxAmount(BigDecimal.ZERO);
		  }
		  ListOfORPOSOrderEntryIoData entryIoDataList = new	  ListOfORPOSOrderEntryIoData();
		  entryIoDataList.getOrderEntryOrders().add(orderEntry);
		  orderRequest.setListOfORPOSOrderEntryIo(entryIoDataList);
		  orderRequest.setLOVLanguageMode(MtoOrderConstants.ORDER_LIC); 
		  orderRequest.setViewMode(MtoOrderConstants.ORDER_VIEW_MODE);
		  }catch(Exception e)
		  {
			  
		  }
		
		  return orderRequest;
		  
		 }
	protected String parseData(Long value, int length)
	{
		String parsedValue = String.valueOf(value);
		String stringValue = "";
		if(length>0 && parsedValue.length()<length)
		{
			
			for (int i = 0; i < length-parsedValue.length(); i++) {
				stringValue = stringValue+"0";
			}
		}
		return stringValue+parsedValue;
	}
	
	protected String createReferenceNumber(ITenderAuthLog iTenderAuthLog) {
		String referenceNumber = "";
		String storeNumber = parseData(iTenderAuthLog.getRetailLocationId(),5);
		String registerNumber = parseData(iTenderAuthLog.getWorkstationId(),3);
		String trnsactionSeq = parseData(iTenderAuthLog.getTransactionSequence(),4);
		referenceNumber = storeNumber+registerNumber+trnsactionSeq;
		return referenceNumber;
	}

}
