package mto.tenderauth.cdserv;

import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.log4j.Logger;

import mto.pos.tender.MtoCDServConstants;

public class MtoCDServFormatter implements ICDServFormatter {
	
	protected static Logger logger = Logger.getLogger(MtoCDServFormatter.class);
	
	public ICDServMessage msg;
	
	public MtoCDServFormatter(ICDServMessage argMsg) {
		
		this.msg = argMsg;
		
	}


	@Override
	public Serializable formatConnectorMessage(ICDServMessage msg) throws MtoCDServMessageException{
		
		MtoCDServAuthorizeTransferRequest authorize =(MtoCDServAuthorizeTransferRequest)msg.getMessageData();
		String request =null;
		
		/*if(msg.getMessageData() instanceof ReversalRequest)
		{
			request =getSaleVoidRequest(authorize,msg);
		}
		else */
		
		if(((MtoCDServAuthorizeTransferRequest)authorize).getOption()!=null)
		{
				request =getAdminRequest((MtoCDServAuthorizeTransferRequest)authorize,msg);
		}
		else
		{
			//  request =getSaleVoidRequest((MtoAuthorizeTransferRequest)authorize,msg);
			
		}
		return request;
	}
		
	public ICDServMessageResponse translateConnectorResponse(Serializable msg) throws MtoCDServMessageException 
	{
		logger.debug("Inside Translate Response Method");
		File f = new File("C:\\CD\\CDSVPRNT.DAT");
		int msgLength =0;
	    if(f.exists()) 
	    { 
	 	f.delete();
	    }
	    MtoCDServAuthorizeTransferResponse response = new MtoCDServAuthorizeTransferResponse();
		if(msg != null)
		{
		String input = msg.toString();
		msgLength = input.length();
		logger.debug("The length of the response"+msgLength);
		if(msgLength == 0) {
			response.setResponseCode(ICDServMessageResponse.ResponseCode.Timeout);
		}
		else if(input.contains("POS"))
		{
			response.setAdminResponse(input);
		}
		else if(input.contains("VOID"))
		{
			response.setVoidResponse(input);
			//response.setTenderType(ICDServMessageResponse.TenderType.CREDIT);
		}
		
		else if(((input.substring(0,3)).equals(MTOCDServeCodes.CD_SERVE_REQUEST_FIN.getValue())) && ((input.substring(3,4)).equals(MTOCDServeCodes.CD_SERVE_RSP_RESPONSE_CODE.getValue()))) 
		{
			logger.debug("Translating the success Response FIN***");
			response.setRspResponseCode(input.substring(3,4));
			if((input.substring(8,11).equals(MTOCDServeCodes.CD_SERVE_RSP_CODE.getValue())) && input.substring(11,13).equals(MTOCDServeCodes.CD_SERVE_MTO_RESPONSE_CODE.getValue()))
			{
				response.setRspCode(input.substring(8,11));
				response.setMtoResponsecode(input.substring(11,13));
				//response.setResponseCode(PaymentServiceResponseIfc.ResponseCode.Approved);
				response.setResponseCode(ICDServMessageResponse.ResponseCode.Approved);
			}
			String maskedAccount = input.substring(21,40);
			response.setMaskedAccountNumber(maskedAccount);
			if(input.substring(40,41).equals(MTOCDServeCodes.CD_SERVE_CARD_TYPE_CREDIT.getValue()))
			{
				response.setTenderType(ICDServMessageResponse.TenderType.CREDIT);
			}
			if(input.substring(40,41).equals(MTOCDServeCodes.CD_SERVE_CARD_TYPE_DEBIT.getValue()))
			{
				response.setTenderType(ICDServMessageResponse.TenderType.DEBIT);
			}
			//response.setCardType(input.substring(40,41));
			response.setReferenceCode(input.substring(88,97));
			response.setAuthorizationCode(input.substring(13,21));
			response.setAuthorizationResponseCode(input.substring(3,4));
			//response.setCardExpiryMM(input.substring(43,45));
			//response.setCardExpiryYY(input.substring(41,43));
			response.setPospadId(input.substring(97,109));
			response.setBankValueDate(input.substring(50,56));
			response.setDataEntry(input.substring(45,46));
			response.setTrnLpsCode(input.substring(114,117));
			response.setTrnFallbackInd(input.substring(117,118));
			
			if(input.substring(118,119).equals("V"))
			{
			response.setCardType(MtoCDServConstants.VISA);
			}
			else if(input.substring(118,119).equals("M"))
			{
				response.setCardType(MtoCDServConstants.MASTERCARD);
			}
			else if(input.substring(118,120).equals("AM"))
			{
				response.setCardType(MtoCDServConstants.AMERICAN_EXPRESS);
			}
			response.setTraceNumber(input.substring(120,msgLength));
			
				
		}
		else if((input.substring(0,3)).equals(MTOCDServeCodes.CD_SERVE_REQUEST_TXT.getValue()))
		{
			logger.debug("Translating the error Response TXT***");
			if(input.contains("("))
			{
				Integer i=Integer.parseInt(input.substring((input.indexOf('('))+1,(input.indexOf('('))+4));
				switch(i)
				{
				case 50:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.FormatError);
					break;
				case 51:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.MissingMandatoryData);
					break;
				case 52:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.UnsupportedType);
					break;
				case 53:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.UnsupportedVersion);
					break;
				case 54:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.InvalidData);
					break;
				case 55:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.TerminalBusy);
					break;
				case 99:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.InValidOthers);
					break;
				case 100:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.TransactionNotAccepted);
					break;
				case 101:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.TransactionNotCompleted);
					break;
				case 102:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.TransactionNotCompletedOthers);
					break;
				case 204:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.TransactionReversed);
					break;
				case 205:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.TransactionReversedMAC);
					break;
				case 250:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.RequestRejected);
					break;
				case 251:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.RequiredAdditionalInput);
					break;
				case 252:				
					response.setResponseCode(ICDServMessageResponse.ResponseCode.RequiredAdditionalInputInvlid);
					break;
				case 103:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.Timeout);
					break;
				case 201:
				case 202:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.Declined);
					break;
				default:
					response.setResponseCode(ICDServMessageResponse.ResponseCode.Offline);
					break;
				
				}
			}
			
		}
		else {
			logger.debug("Translating the error Response TXT***");
			response.setResponseCode(ICDServMessageResponse.ResponseCode.Timeout);
			
			}
		}
		return (MtoCDServAuthorizeTransferResponse)response;
	}
		

	/*public String getSaleVoidRequest(AuthorizeTransferRequest authorize,MessageIfc msg)
	{
		StringBuilder sb = new StringBuilder(116);
		sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_FIN.getValue());
		sb.append(getWhiteSpaces(3));
		sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_OPID.getValue());
		sb.append(getWhiteSpaces(6));
		sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_PRID.getValue());
		sb.append(getWhiteSpaces(6));
		if(authorize.getRequestType().name().equals("ReverseGiftCard"))
		{
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_REVERSAL.getValue());
		}
		else if(authorize.getRequestType().name().equals("ReverseCard"))
		{
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_VOID.getValue());
			
		}
		else if(msg.getMessageData() instanceof AuthorizeTransferRequest)
		{
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_AUTH.getValue());
		}
	
		sb.append(getAmountFormat(authorize));
		if(msg.getMessageData() instanceof ReversalRequest)
		{
			sb.append(((MTOReversalRequestIfc)authorize).getCustomerAval());
		}
		else
		{
		sb.append(((MtoAuthorizeTransferRequest)authorize).getCustomerAval());
		}
		sb.append(getWhiteSpaces(83));
		return sb.toString();
	} */



	public String getWhiteSpaces(int count)
	{
		String s="";
		for(int i=0;i<count;i++)
		{
			s=s+" ";
		}
		return s;
	}

	public String getAmountFormat(MtoCDServAuthorizeTransferRequest amountRequest)
	{
		BigDecimal amount1 =amountRequest.getBaseAmount();
		//BigDecimal amount1=amount.getDecimalValue();
		amount1=amount1.multiply(BigDecimal.valueOf(100));
		int amount2=amount1.intValueExact();
		String withDecimal = String.valueOf(amount2);
		if(withDecimal.length()<7)
		{
			do
			{
				withDecimal="0"+withDecimal;
			}while(withDecimal.length()<7);
		}
		return withDecimal;
	} 
	public String getAdminRequest(MtoCDServAuthorizeTransferRequest authorize,ICDServMessage msg)
	{
		StringBuilder sb = new StringBuilder(55);
		sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_ADM.getValue());
		sb.append(authorize.getOption());
		if(authorize.getOption().length() ==1)
		{
		sb.append(getWhiteSpaces(5));
		}
		if(authorize.getOption().length() ==2)
		{
		sb.append(getWhiteSpaces(4));
		}
		if(authorize.getOption().equals("5") || authorize.getOption().equals("9"))
		{
			sb.append(authorize.getDescription());
		}
		return sb.toString();
	}


	public ICDServMessage getMsg() {
		return msg;
	}


	public void setMsg(ICDServMessage msg) {
		this.msg = msg;
	}
	

}