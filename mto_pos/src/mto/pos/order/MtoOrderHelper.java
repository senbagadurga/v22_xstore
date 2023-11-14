package mto.pos.order;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/********************************************************************************
 * US 92543 Siebel Sale Order Processing
 * 09/01/2023 Nayya Gupta constant class to handle constant values
 *******************************************************************************/
import com.siebel.orpos.order.ORPOSExecuteInput;
import com.siebel.orpos.order.ORPOSExecuteOutput;
import com.siebel.orpos.order.ORPOSORDERPORT;
import com.siebel.xml.orpos_order_entry_io.data.ListOfORPOSOrderEntryIoData;
import com.siebel.xml.orpos_order_entry_io.data.ListOfPaymentsData;
import com.siebel.xml.orpos_order_entry_io.data.OrderEntryOrdersData;

import dtv.data2.access.DataFactory;
import dtv.data2.access.IObjectId;
import dtv.pos.order.OrderHelper;
import dtv.util.NumberEncoding;
import dtv.util.NumberUtils;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.ttr.ITenderAuthLog;
import dtv.xst.dao.ttr.ITenderAuthLogProperty;
import dtv.xst.dao.ttr.TenderAuthLogId;
import dtv.xst.dao.ttr.TenderAuthLogPropertyId;
import mto.pos.ws.order.client.MtoOrderServiceHelper;

public class MtoOrderHelper extends OrderHelper {


	public ORPOSExecuteInput buildOrderUpdateRequestPreparer(MtoOrderList orderSelected, String orderStatus,
			ListOfPaymentsData paymentDetails, IPosTransaction currentTransaction) throws DatatypeConfigurationException {
		
		  ORPOSExecuteInput orderRequest = new ORPOSExecuteInput();
		  
		  // String status = MtoConfigurationMgr.getOrderUpdateStatus();
		  OrderEntryOrdersData orderEntry = new OrderEntryOrdersData();
		  orderEntry.setId(orderSelected.getId());
		  if(orderStatus != null)
		  orderEntry.setStatus(orderStatus);
		  orderEntry.setOperation(MtoOrderConstants.ORDER_OPERATION_TYPE);
		  		  
		  if(paymentDetails != null)
		  {
			  orderEntry.setListOfPayments(paymentDetails);
		  }
		  else
		  {
			  //for order funded request
			  /**
			   * 5 digit store number + 3 digit register number + 4 digit transaction sequence
			   */
			  orderEntry.setMTOPaymentRefNumber(createReferenceNumber(currentTransaction));
			  XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(currentTransaction.getBusinessDate()));
			  orderEntry.setMTOBusinessDate(date);
			  orderEntry.setId(orderSelected.getId());
			  //pasing the status void or fund
			  orderEntry.setStatus(orderStatus);
			  orderEntry.setDiscountAmount(BigDecimal.ZERO);
			  orderEntry.setTaxAmount(BigDecimal.ZERO);
		  }
		  ListOfORPOSOrderEntryIoData entryIoDataList = new	  ListOfORPOSOrderEntryIoData();
		  entryIoDataList.getOrderEntryOrders().add(orderEntry);
		  orderRequest.setListOfORPOSOrderEntryIo(entryIoDataList);
		  orderRequest.setLOVLanguageMode(MtoOrderConstants.ORDER_LIC); 
		  orderRequest.setViewMode(MtoOrderConstants.ORDER_VIEW_MODE);
		  
		
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
	
	protected String createReferenceNumber(IPosTransaction currentTransaction) {
		String referenceNumber = "";
		String storeNumber = parseData(currentTransaction.getRetailLocationId(),5);
		String registerNumber = parseData(currentTransaction.getWorkstationId(),3);
		String trnsactionSeq = parseData(currentTransaction.getTransactionSequence(),4);
		referenceNumber = storeNumber+registerNumber+trnsactionSeq;
		return referenceNumber;
	}

	public ORPOSExecuteInput buildOrderUpdateRequestPreparer(MtoOrderList orderSelected) {
		
		  ORPOSExecuteInput orderRequest = new ORPOSExecuteInput();
		  
		  // String status = MtoConfigurationMgr.getOrderUpdateStatus();
		  OrderEntryOrdersData orderEntry = new OrderEntryOrdersData();
		  orderEntry.setId(orderSelected.getId());
		  orderEntry.setMTOPaymentRefNumber(GENERIC_SHIPPING_LOCATION);
		  
		  ListOfORPOSOrderEntryIoData entryIoDataList = new	  ListOfORPOSOrderEntryIoData();
		  entryIoDataList.getOrderEntryOrders().add(orderEntry);
		  orderRequest.setListOfORPOSOrderEntryIo(entryIoDataList);
		  orderRequest.setLOVLanguageMode(MtoOrderConstants.ORDER_LIC); 
		  orderRequest.setViewMode(MtoOrderConstants.ORDER_VIEW_MODE);
		  
		
		  return orderRequest;
		  
		 }
	
			
			
			
	public ORPOSExecuteOutput orposExecute(MtoOrderList orderSelected,ListOfPaymentsData paymentDetails,IPosTransaction currentTransaction) throws Exception {

		ORPOSExecuteOutput memberTransactionInfo = null;
		    try {
		    	ORPOSExecuteInput 		pageInput 		= null;
		    	 if(paymentDetails != null)
		    	 {
		        	pageInput 		= this.buildOrderUpdateRequestPreparer(orderSelected,null,paymentDetails,currentTransaction);
				    }
				    else
				    {
				    	//using same method to differentiate Funded status or void
				    	pageInput 		= this.buildOrderUpdateRequestPreparer(orderSelected,MtoOrderConstants.ORDER_FUNDED_STATUS,null,currentTransaction);
				    }
		        	MtoOrderServiceHelper 	serviceHelper 	= MtoOrderServiceHelper.getInstance();
		        	ORPOSORDERPORT siebelService = serviceHelper.getORPOSORDERPORT();
		        	memberTransactionInfo = siebelService.orposExecute(pageInput);
		        	
		  }
		    catch (Exception e) {
		      e.printStackTrace();
		      throw e;
		    }
		    return memberTransactionInfo;
		  }
	

	public ORPOSExecuteOutput orposExecute(MtoOrderList orderSelected) throws Exception {

		ORPOSExecuteOutput memberTransactionInfo = null;
		    try {
		        	ORPOSExecuteInput 		pageInput 		= this.buildOrderUpdateRequestPreparer(orderSelected);
		        	MtoOrderServiceHelper 	serviceHelper 	= MtoOrderServiceHelper.getInstance();
		        	ORPOSORDERPORT siebelService = serviceHelper.getORPOSORDERPORT();
		        	memberTransactionInfo = siebelService.orposExecute(pageInput);
		        	
		  }
		    catch (Exception e) {
		      e.printStackTrace();
		      throw e;
		    }
		    return memberTransactionInfo;
		  }
	
	
	public TenderAuthLogId makeLogEntryId(IPosTransaction transaction) {
		TenderAuthLogId tenderAuthId = new TenderAuthLogId();
		tenderAuthId.setOrganizationId(Long.valueOf(transaction.getOrganizationId()));
		tenderAuthId.setRetailLocationId(Long.valueOf(transaction.getRetailLocationId()));
		tenderAuthId.setWorkstationId(Long.valueOf(transaction.getWorkstationId()));
		tenderAuthId.setBusinessDate(transaction.getBusinessDate());
		tenderAuthId.setTransactionSequence(Long.valueOf(transaction.getTransactionSequence()));
		tenderAuthId.setRetailTransactionLineItemSequence(0);
		tenderAuthId.setAttemptSequence(0);
		return tenderAuthId;
	}

	public ITenderAuthLogProperty addProperty(String name, ITenderAuthLog tenderAuthEntry, int seq, int attempt) {
		TenderAuthLogPropertyId propertyId = new TenderAuthLogPropertyId();
		propertyId.setOrganizationId(tenderAuthEntry.getOrganizationId());
		propertyId.setRetailLocationId(tenderAuthEntry.getRetailLocationId());
		propertyId.setBusinessDate(tenderAuthEntry.getBusinessDate());
		propertyId.setWorkstationId(tenderAuthEntry.getWorkstationId());
		propertyId.setTransactionSequence(tenderAuthEntry.getTransactionSequence());
		propertyId.setRetailTransactionLineItemSequence(seq);
		propertyId.setAttemptSequence(attempt);
		propertyId.setPropertyCode(name);
		ITenderAuthLogProperty propery = (ITenderAuthLogProperty) DataFactory.createObject((IObjectId) propertyId,
				ITenderAuthLogProperty.class);
		return propery;
	}

	/* Start US#92635 Integration- Siebel - Xstore void order processing */
	public ORPOSExecuteOutput orposExecute(MtoOrderList orderSelected,ListOfPaymentsData paymentDetails,IPosTransaction currentTransaction,String voidStatus) throws Exception {

		ORPOSExecuteOutput memberTransactionInfo = null;
		    try {
		    	ORPOSExecuteInput 		pageInput 		= null;
		    	 if(paymentDetails != null)
		    	 {
		        	pageInput 		= this.buildOrderUpdateRequestPreparer(orderSelected,null,paymentDetails,currentTransaction);
				    }
				    else
				    {
				    	pageInput 		= this.buildOrderUpdateRequestPreparer(orderSelected,voidStatus,null,currentTransaction);
				    }
		        	MtoOrderServiceHelper 	serviceHelper 	= MtoOrderServiceHelper.getInstance();
		        	ORPOSORDERPORT siebelService = serviceHelper.getORPOSORDERPORT();
		        	memberTransactionInfo = siebelService.orposExecute(pageInput);
		        	
		  }
		    catch (Exception e) {
		      e.printStackTrace();
		      throw e;
		    }
		    return memberTransactionInfo;
		  }
	/* End US#92635 Integration- Siebel - Xstore void order processing */
}
