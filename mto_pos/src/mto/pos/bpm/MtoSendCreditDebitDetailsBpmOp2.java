package mto.pos.bpm;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sun.xml.ws.developer.JAXWSProperties;

import dtv.data2.access.DataFactory;
import dtv.data2.access.IObjectId;
import dtv.pos.framework.op.Operation;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.util.ClassPathUtils;
import dtv.util.EndsWithNameFilter;
import dtv.util.INameFilter;
import dtv.xst.dao.trl.IRetailTransactionLineItem;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.trn.IPostVoidTransaction;
import dtv.xst.dao.ttr.ICreditDebitTenderLineItem;
import dtv.xst.dao.ttr.ITenderAuthLog;
import dtv.xst.dao.ttr.ITenderAuthLogProperty;
import dtv.xst.dao.ttr.ITenderLineItem;
import dtv.xst.dao.ttr.TenderAuthLogId;
import mto.bpm.cardpaymentlog.cc.siebel.CardPaymentLogRequest;
import mto.bpm.cardpaymentlog.cc.siebel.CardPaymentLogResponse;
import mto.bpm.cardpaymentlog.cc.siebel.logif.CardPaymentLogIF;
import mto.bpm.cardpaymentlog.cc.siebel.logif.CardPaymentLogIFExport1CardPaymentLogIFHttpService;
import mto.pos.bpm.impl.MtoBpmMessageHandler;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderConstants;
import mto.pos.order.MtoOrderHelper;
import mto.pos.order.MtoOrderList;

public class MtoSendCreditDebitDetailsBpmOp2 extends Operation {


	@Inject
	MtoOrderHelper _orderHelper;
	private MtoBpmMessageHandler messageHandler_;
	private Logger _logger = LogManager.getLogger(MtoSendCreditDebitDetailsBpmOp2.class);
	protected static final INameFilter XML_EXTENSION = new EndsWithNameFilter(new String[] {".xml"});

	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {
	    try
	    {
		URL bpmWsdl = locateWSDLFile("wsdl","BPMORPOSCARDPAYMENT.xml");
		CardPaymentLogIFExport1CardPaymentLogIFHttpService service = new CardPaymentLogIFExport1CardPaymentLogIFHttpService(bpmWsdl); 
		CardPaymentLogIF port = service.getCardPaymentLogIFExport1CardPaymentLogIFHttpPort();
		
		//select the current order
		MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		//select the current transaction
		IPosTransaction currentTransaction = _transactionScope.getTransaction();
		
		 BindingProvider bindingProvider = (BindingProvider) port;
		 bindingProvider = getPortGeneric(bindingProvider);
		 Map<String, Object> context = bindingProvider.getRequestContext();
		 
		 String envType = System.getProperty("mto.pos.envType");
		 _logger.info("MtoSendCreditDebitDetailsBpmOp2: envType---> "+envType);
		 
		 String _url = System.getProperty("bpmservice.url."+envType);
		 _logger.info("MtoSendCreditDebitDetailsBpmOp2: serviceurl---> "+_url);
		 
		 //context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://ws.sit2.rlso-bpm.mto.gov.on.ca/cardPaymentLog_CC_ORPOSWeb/sca/cardPaymentLog_IFExport1");
		 context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, _url);
		 //context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://ws.sit2.rlso-bpm.mto.gov.on.ca/cardPaymentLog_CC_ORPOSWeb/sca/cardPaymentLog_IFExport1");
		_logger.debug("prepareRequestObject(): current transaction "+currentTransaction.getTransactionSequence())	;
		_logger.debug("prepareRequestObject(): current order "+orderSelected.getId())	;
		//changes for Void order
		if(currentTransaction != null 
				&& currentTransaction instanceof IPostVoidTransaction)
		{
			_logger.error("Order void flow starts here");
			IPostVoidTransaction postvoidTransaction = (IPostVoidTransaction)currentTransaction;
			if(postvoidTransaction.getTenderLineItems() != null)
			_logger.debug("Number of tenders in postvoid "+postvoidTransaction.getTenderLineItems().size());
			for (Iterator<IRetailTransactionLineItem> iterator = postvoidTransaction.getTenderLineItems().iterator(); iterator.hasNext();) {
				IRetailTransactionLineItem type = (IRetailTransactionLineItem) iterator.next();
				_logger.debug("obj type"+type);
				if(type instanceof ITenderLineItem)
				_logger.debug("tender type in postvoid "+((ITenderLineItem)type).getTenderId());
				_logger.debug("tender void flag in postvoid "+((ITenderLineItem)type).getVoid());
			}
			List<IRetailTransactionLineItem> tenders = postvoidTransaction.getVoidedTransaction()
					.getTenderLineItems();
			_logger.debug("Number of tenders in orig txn "+tenders.size());
			if(tenders != null && !tenders.isEmpty())
			{
				for (Iterator iterator = tenders.iterator(); iterator.hasNext();) 
				{
					_logger.error("in for loop");
					IRetailTransactionLineItem iRetailTransactionLineItem = (IRetailTransactionLineItem) iterator.next();
					if(iRetailTransactionLineItem instanceof ITenderLineItem)
					{
					_logger.debug("tender type in orig trans "+((ITenderLineItem)iRetailTransactionLineItem).getTenderId());
					_logger.debug("tender void flag in orig trans "+((ITenderLineItem)iRetailTransactionLineItem).getVoid());
					}
					if(iRetailTransactionLineItem instanceof ICreditDebitTenderLineItem
							&& !iRetailTransactionLineItem.getVoid())
					{
						_logger.debug("prepareRequestObject(): credit debit payment selected")	;
						String transactionType = MtoOrderConstants.BPM_VOID_TRANSACTION_TYPE;
						_logger.debug("prepareRequestObject(): transaction type: "+transactionType)	;
						CardPaymentLogResponse response = port.getCardPaymentlog(prepareRequestObject((ICreditDebitTenderLineItem)iRetailTransactionLineItem,orderSelected,currentTransaction,transactionType));
						 if(response!= null)
						 {
						    		_logger.error("Success reposne received from BPM for account --->"+response.getAccountNumber());
						 }
					}
					_logger.error("in for loop completes");
				}
			}
			_logger.error("Order void flow ends here");
		}
		else if(currentTransaction != null 
					&& currentTransaction.getTenderLineItems() != null
					&& !currentTransaction.getTenderLineItems().isEmpty())
			{
			_logger.info("in IF loop");
				List<IRetailTransactionLineItem> tenders = currentTransaction.getTenderLineItems();
				for (Iterator iterator = tenders.iterator(); iterator.hasNext();) 
				{
					_logger.debug("in for loop");
					IRetailTransactionLineItem iRetailTransactionLineItem = (IRetailTransactionLineItem) iterator.next();
					if(iRetailTransactionLineItem instanceof ICreditDebitTenderLineItem
							&& !iRetailTransactionLineItem.getVoid())
					{
						_logger.debug("prepareRequestObject(): credit debit payment selected")	;
						String transactionType = MtoOrderConstants.BPM_PURCHASE_TRANSACTION_TYPE;
						CardPaymentLogResponse response = port.getCardPaymentlog(prepareRequestObject((ICreditDebitTenderLineItem)iRetailTransactionLineItem,orderSelected,currentTransaction,transactionType));
						 
						 if(response!= null && response.getAccountNumber() != null)
						 {
						     _logger.error("Success reposne received from BPM for account --->"+response.getAccountNumber());
						 }
					}
					_logger.error("in for loop completes");
				}
				
				_logger.error("in if loop completes");
			}
			
		 
		 }catch(Exception e )
		 {
		    	_logger.error("Exception occurred while sending BPM request--->"+e.getMessage());
		    	//handle offline scenario
		    	//select the current order
				MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
				//select the current transaction
				IPosTransaction currentTransaction = _transactionScope.getTransaction();
		    	if(currentTransaction != null 
						&& currentTransaction.getTenderLineItems() != null
						&& !currentTransaction.getTenderLineItems().isEmpty())
				{
				_logger.info("in IF loop");
					List<IRetailTransactionLineItem> tenders = currentTransaction.getTenderLineItems();
					for (Iterator iterator = tenders.iterator(); iterator.hasNext();) 
					{
						_logger.debug("in for loop");
						IRetailTransactionLineItem iRetailTransactionLineItem = (IRetailTransactionLineItem) iterator.next();
						if(iRetailTransactionLineItem instanceof ICreditDebitTenderLineItem
								&& !iRetailTransactionLineItem.getVoid())
						{
							processOfflineResponses((ICreditDebitTenderLineItem)iRetailTransactionLineItem, orderSelected, currentTransaction);
						}
					}
				}
		    	
		 }
	    
	    _logger.error("flow completes");
		return HELPER.completeResponse();
	}

	private BindingProvider getPortGeneric(BindingProvider bindingProvider) {

	    Map<String, Object> context = bindingProvider.getRequestContext();

	    @SuppressWarnings("rawtypes")
	    List<Handler> handlerChain = new ArrayList<Handler>();
	    handlerChain.add(getHandler());
	    bindingProvider.getBinding().setHandlerChain(handlerChain);
	    context.put(JAXWSProperties.CONNECT_TIMEOUT, Integer.valueOf(30000));//increase the timeout value as BPM void request was failing
	    context.put(JAXWSProperties.REQUEST_TIMEOUT, Integer.valueOf(30000));//increase the timeout value as BPM void request was failing
	    return bindingProvider;
	  }

	  public MtoBpmMessageHandler getHandler() {
	    if (messageHandler_ == null) {
	
	        messageHandler_ = new MtoBpmMessageHandler();
			_logger.info("MtoOrderMessageHandler has been initialized.");
	      }
	    
	    return messageHandler_;
	  }
	
	  public URL locateWSDLFile(String argPackageName, String argFileName) {

	    URL bpmWSDLURL = null;

	    String[] wsdlURLs =
	        ClassPathUtils.getDirectoryBasedConfigFileListRelativePaths(argPackageName, XML_EXTENSION);

	    for (String wsdlURL : wsdlURLs) {
	      String filepath = wsdlURL;
	      File wSDLFile = new File(filepath);
	      String fileName = wSDLFile.getName();

	      if (argFileName.equals(fileName)) {
	    	  bpmWSDLURL = ClassPathUtils.getResource(wsdlURL);
	        _logger.info("The located WSDL file is: " + bpmWSDLURL.getPath());
	        break;
	      }
	    }

	    if (bpmWSDLURL == null) {
	      _logger.fatal("System has been unable to locate WSDL file " + argFileName + " under path "
	          + argPackageName + ".");
	    }

	    return bpmWSDLURL;
	  }

	/**
	 * 
	 * @param currentTransaction
	 * @param orderSelected
	 * @return
	 */
	protected CardPaymentLogRequest prepareRequestObject(ICreditDebitTenderLineItem iRetailTransactionLineItem, MtoOrderList orderSelected,IPosTransaction currentTransaction,String transactionType) {
		CardPaymentLogRequest request = null;
		
		try
		{
		
		_logger.debug("prepareRequestObject(): current order "+orderSelected.getOrderNumber())	;
		_logger.debug("prepareRequestObject(): credit  payment selected "+iRetailTransactionLineItem.getTenderId())	;
		ICreditDebitTenderLineItem creditTender = (ICreditDebitTenderLineItem)iRetailTransactionLineItem;
		request = new CardPaymentLogRequest();
		request.setAccountNumber(creditTender.getAccountNumber().trim());
		request.setAuthorizationCode(creditTender.getAuthorizationCode().trim());
		//request.setCreated(creditTender.getCreateDate().toString());
		request.setMerchantId(creditTender.getMediaIssuerId());
		request.setOrderNumber(orderSelected.getOrderNumber());
		//request.setPassword("");
		if(creditTender.getTenderId().equalsIgnoreCase("VISA")
							|| creditTender.getTenderId().equalsIgnoreCase("MASTER_CARD")
							|| creditTender.getTenderId().equalsIgnoreCase("AMEX")
							|| creditTender.getTenderId().equalsIgnoreCase("CREDIT_CARD"))
		{
			request.setPaymentMethod("Credit");
		}
		else if(creditTender.getTenderId().equalsIgnoreCase("DEBIT_CARD"))
		{
			request.setPaymentMethod("Debit");
		}
					
		request.setProcessorId(currentTransaction.getCreateUserId());
		request.setSourceSystemName("XSTORE");
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		XMLGregorianCalendar xCal = DatatypeFactory.newInstance()
		   .newXMLGregorianCalendar(cal);
		request.setSourceTransactionDateTime(xCal);
		request.setSourceTransactionId(generateRefernceId(currentTransaction));
		request.setTraceNumber(creditTender.getTraceNumber());
		if(creditTender != null && creditTender.getAmount() != null)
		{
			
			if(transactionType.equals(MtoOrderConstants.BPM_VOID_TRANSACTION_TYPE))
			{
				BigDecimal amt = creditTender.getAmount().negate();
				request.setTransactionAmount(amt.toString());
			}
			else
			{
				request.setTransactionAmount(creditTender.getAmount().toString());
			}
			/*
			 * if(creditTender.getAmount().compareTo(BigDecimal.ZERO)>0) {
			 * request.setTransactionType("PURCHASE"); } else {
			 * request.setTransactionType("VOID"); }
			 */
		}
		request.setTransactionType(transactionType);
		//request.setTransactionDate(currentTransaction.getBusinessDate().toString());
		String transactionDate = new SimpleDateFormat("yyyyMMdd").format(currentTransaction.getBusinessDate());
		
		request.setTransactionDate(transactionDate);
		String transactionTime = new SimpleDateFormat("hhmmss").format(currentTransaction.getCreateDate().getTime());
		_logger.debug("transaction time-->"+transactionTime);
		request.setTransactionTime(transactionTime);	
		request.setTrnFallbackInd("0");
		request.setTrnLpsCode("RAF");
		request.setTrsanctionId(String.valueOf(currentTransaction.getTransactionSequence()));
		request.setUserId(currentTransaction.getCreateUserId());
			
		if(creditTender.getTenderId().equalsIgnoreCase("VISA"))
		{
			request.setPaymentType("V");
		}
		else if(creditTender.getTenderId().equalsIgnoreCase("MASTER_CARD"))
		{
			request.setPaymentType("M");
		}
		else if(creditTender.getTenderId().equalsIgnoreCase("AMEX"))
		{
			request.setPaymentType("AM");
		}
		else if(creditTender.getTenderId().equalsIgnoreCase("DEBIT_CARD"))
		{
			request.setPaymentType("P");
		}
			
		//request.setUserName("Siebel_User");
	
			/*
			 * request = new CardPaymentLogRequest();
			 * request.setAccountNumber("**********1610");
			 * request.setAuthorizationCode("1234"); //request.setCreated("");
			 * request.setMerchantId("MT2206233142"); request.setOrderNumber("111111111");
			 * //request.setPassword(""); request.setPaymentMethod("Debit");
			 * request.setProcessorId("R3BCRPR"); request.setSourceSystemName("XSTORE");
			 * //request.setSourceTransactionDateTime("");
			 * request.setSourceTransactionId("62001099"); request.setTraceNumber("12");
			 * request.setTransactionAmount("10.00");
			 * request.setTransactionDate("20231005"); request.setTransactionTime("133646");
			 * request.setTransactionType("PURCHASE"); request.setTrnFallbackInd("0");
			 * request.setTrnLpsCode("RAF"); request.setTrsanctionId("99");
			 * request.setUserId("R3BCRPR"); //request.setUserName("Siebel_User");
			 */
		}
		catch(Exception e)
		{
			_logger.error("Exception occurred while creating the request "+e.getMessage());
		}
		return request;
	}

	protected String generateRefernceId(IPosTransaction currentTransaction) {
		String referenceNumber = "";
		String storeNumber = parseData(currentTransaction.getRetailLocationId(),5);
		String registerNumber = parseData(currentTransaction.getWorkstationId(),3);
		String trnsactionSeq = parseData(currentTransaction.getTransactionSequence(),4);
		referenceNumber = storeNumber+registerNumber+trnsactionSeq;
		return referenceNumber;
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
	
	protected void processOfflineResponses(ICreditDebitTenderLineItem iRetailTransactionLineItem, MtoOrderList orderSelected,IPosTransaction currentTransaction)
	{

		_logger.error("MtoSendCreditDebitDetailsBpmOp2.processOfflineResponses() starts:");
				
		/**
		 * BPM offline flow
		 * Save update request in database for retry
		 */
		try
		{
				_logger.error("processOfflineResponses step1:");
				if(currentTransaction != null)
				{
					List<ITenderAuthLogProperty> properties = new ArrayList<>();
					_logger.error("processOfflineResponses step2:");
					TenderAuthLogId authId = _orderHelper.makeLogEntryId(currentTransaction);
					ITenderAuthLog tenderAuthEntry = (ITenderAuthLog)DataFactory.createObject((IObjectId)authId, ITenderAuthLog.class);
					tenderAuthEntry.setResponseCode("200");
					tenderAuthEntry.setErrorText("BPM Offline");
					tenderAuthEntry.setBusinessDate(currentTransaction.getBusinessDate());
					if(orderSelected != null)
					{
						tenderAuthEntry.setStringProperty("OrderId",orderSelected.getId() );
						_logger.error("processOfflineResponses step3: order id",tenderAuthEntry.getStringProperty("OrderId"));
					}
					if(iRetailTransactionLineItem != null)
					{
						tenderAuthEntry.setStringProperty("tenderID",iRetailTransactionLineItem.getTenderId());
						tenderAuthEntry.setDecimalProperty("tenderAmount", iRetailTransactionLineItem.getAmount());
						ITenderAuthLogProperty updateRequest = _orderHelper.addProperty("BPM_REQUEST",tenderAuthEntry,1,0);
						properties.add(updateRequest);
					}
					
					tenderAuthEntry.setProperties(properties);		
					DataFactory.makePersistent(tenderAuthEntry);
				}
				
		}catch(Exception e)
		{
			_logger.error("processOfflineResponses error occurred while saving the request "+e.getMessage());
		}
		_logger.error("processOfflineResponses ends:");
	
	}

}
