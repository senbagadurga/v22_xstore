package mto.pos.bpm.impl;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import dtv.servicex.ServiceType;
import dtv.servicex.impl.AbstractJaxWsHandler;
import mto.bpm.cardpaymentlog.cc.siebel.CardPaymentLogRequest;
import mto.bpm.cardpaymentlog.cc.siebel.logif.CardPaymentLogIF;
import mto.bpm.cardpaymentlog.cc.siebel.logif.CardPaymentLogIFExport1CardPaymentLogIFHttpService;
import mto.pos.bpm.MtoIBpmRequest;
import mto.pos.bpm.MtoIBpmResponse;

public class MtoBpmRequestHandler extends AbstractJaxWsHandler<CardPaymentLogIF, MtoIBpmRequest, MtoIBpmResponse>{
	
	public MtoIBpmResponse handleService(MtoIBpmRequest request, ServiceType<MtoIBpmRequest, MtoIBpmResponse> argServiceType) 
	{
	    try 
	    {
	    	CardPaymentLogIF port = (CardPaymentLogIF)getServicePort();
	    	port.getCardPaymentlog(prepareCarePaymentLogRequest(request));
	    } catch (Exception ex) {
	      throw translateException(ex);
	    } 
	    MtoBpmResponse bpmResponse = new MtoBpmResponse();
	    return bpmResponse;
	 }
	
	@Override
	public void setServicePort(CardPaymentLogIF argServicePort) {
		// TODO Auto-generated method stub
		super.setServicePort(argServicePort);
	}
	
	 private CardPaymentLogRequest prepareCarePaymentLogRequest(MtoIBpmRequest request) {
		 CardPaymentLogRequest cardRequest = new CardPaymentLogRequest();
		 cardRequest.setAccountNumber(request.getAccountNumber());
		 cardRequest.setAuthorizationCode(request.getAuthorizationCode());
		 cardRequest.setMerchantId(request.getMerchantId());
		 cardRequest.setOrderNumber(request.getOrderNumber());
		 cardRequest.setPaymentMethod(request.getPaymentMethod());
		 cardRequest.setPaymentType(request.getPaymentType());
		 cardRequest.setProcessorId(request.getProcessorId());
		 cardRequest.setSourceSystemName(request.getSourceSystemName());
		 GregorianCalendar cal = new GregorianCalendar();
		 cal.setTime(new Date());
		 XMLGregorianCalendar xCal = null;
		try {
			xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 cardRequest.setSourceTransactionDateTime(xCal);
		 cardRequest.setSourceTransactionId(request.getSourceTransactionId());
		 cardRequest.setTransactionAmount(request.getTransactionAmount().toString());
		 cardRequest.setTransactionDate(request.getTransactionDate());
		 cardRequest.setTransactionTime(request.getTransactionTime());
		 cardRequest.setTransactionType(request.getTransactionType());
		 cardRequest.setTrnFallbackInd(String.valueOf(request.getTrnFallbackInd()));
		 cardRequest.setTrnLpsCode(request.getTrnLpsCode());
		 cardRequest.setTrsanctionId(request.getTrsanctionId());
		 cardRequest.setUserId(request.getUserId());
		return cardRequest;
	}

	protected MtoBpmResponse parseResponse()
	 {
		 return null;
	 }
}
