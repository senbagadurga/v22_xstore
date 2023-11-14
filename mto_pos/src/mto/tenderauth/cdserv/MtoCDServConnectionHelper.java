package mto.tenderauth.cdserv;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import dtv.hardware.micr.TimeoutException;
import dtv.pos.iframework.security.StationState;
import dtv.util.NumberUtils;

public  class MtoCDServConnectionHelper
{
	@Inject
	public static StationState _stationState;
	
	public static final Logger _logger = Logger.getLogger(MtoCDServConnectionHelper.class);
	
	public static String filter;
	  
	public static ICDServFormatter formatter;
	  
	public MtoCDServConnector connector = new MtoCDServConnector();
	
	private static transient Serializable outgoing;
	
	private static transient Serializable incoming;
	
	public static final int ERROR_CONNECTIVITY= 500;
	public static final int ERROR_TIMEOUT=501;
	public static String ERROR_MSG = "";
	public static final String DECIMAL_FORMATTER = "0000000";
	
	/**
	 * send Message to CDServ Pipe
	 * @param msg
	 * @param request
	 * @return
	 * @throws MtoCDServMessageException
	 * @throws TimeoutException 
	 */
	  public static ICDServMessageResponse sendMessage(CDServMessage msg,MtoCDServAuthorizeTransferRequest request) 
			  throws MtoCDServMessageException, TimeoutException {
	    
	    	_logger.debug("Sending message down"); 
	    	_logger.debug("Inside Helper Class Before FormatConnectorMessage"); 
	        formatter = new MtoCDServFormatter(msg);
	        _logger.debug("Calling Formatter Method"); 
	        Serializable convertMesg = formatConnectorMessage(msg,request);
	        _logger.debug("Calling Connector Method"); 
	        Serializable connectorResp = sendMessage(convertMesg);
	        _logger.debug("Translating response."); 
	        MtoCDServAuthorizeTransferResponse response = (MtoCDServAuthorizeTransferResponse) formatter.translateConnectorResponse(connectorResp);
	      return response;
	     // _logger.debug("Connection \"" + connector.getName() + "\" was not open."); 
	   // throw new MtoCDServMessageException(15, "Connector \"" + this.connector.getName() + "\" is not available.");
	  }
	
	  /**
	   * formatting the message in pipe format
	   * @param msg
	   * @param authorize
	   * @return
	   */
	public static Serializable formatConnectorMessage(ICDServMessage msg,MtoCDServAuthorizeTransferRequest authorize) {
		StringBuilder sb = null;
		if(msg.getMessageType().equals("SALE")) {
			sb = new StringBuilder(55);
			if(NumberUtils.isPositive(authorize.getBaseAmount())){
				sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_FIN.getValue());
			}
			sb.append(getWhiteSpaces(3));
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_OPID.getValue());
			sb.append(getWhiteSpaces(6));
			{
				String prdId=authorize.getDescription().substring(0, 4);
				sb.append(prdId);
			}
			sb.append(getWhiteSpaces(6));
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_AUTH.getValue());
			DecimalFormat df = new DecimalFormat(DECIMAL_FORMATTER);
			BigDecimal amount = authorize.getBaseAmount().multiply(new BigDecimal(100));	
			String formattedAmt = df.format(amount); 
	
			sb.append(formattedAmt.trim());
			if(authorize.getCustomerAval().equals("true")) {
				sb.append("1");
			}
			else {
				sb.append("0");
			}
			_logger.debug("The final Pipe Request" + sb+ ""); 
		}
		if(msg.getMessageType().equals("VOID")) {
			sb = new StringBuilder(116);
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_FIN.getValue());
			sb.append(getWhiteSpaces(3));
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_OPID.getValue());
			sb.append(getWhiteSpaces(6));
			String prdId=authorize.getDescription().substring(0, 4);
			sb.append(prdId);
			//sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_PRID.getValue());
			sb.append(getWhiteSpaces(6));
			sb.append(MTOCDServeCodes.CD_SERVE_REQUEST_VOID.getValue());
			//DecimalFormat df = new DecimalFormat(DECIMAL_FORMATTER);
			//BigDecimal amount = authorize.getBaseAmount().multiply(new BigDecimal(100));	
			//String formattedAmt = df.format(amount); 
			//sb.append(formattedAmt.trim());
			//if(authorize.getCustomerAval().equals("true")) {
				//sb.append("1");
			//}
			//else {
				//sb.append("0");
			//}
			sb.append(getWhiteSpaces(46));
			sb.append(authorize.getMaskedAccNumber());
			sb.append(getWhiteSpaces(26));
			sb.append(authorize.getTraceNumber());
			_logger.debug("The final VOID Pipe Request" + sb+ ""); 
			
		}
		return sb.toString();
	
	}
	
	public static String getWhiteSpaces(int count)
	{
		String s="";
		for(int i=0;i<count;i++)
		{
			s=s+" ";
		}
		return s;
	}
	/**
	 * Messaging to CDServ
	 * @param msg
	 * @return
	 * @throws MtoCDServMessageException
	 * @throws TimeoutException 
	 */
	
	public static Serializable sendMessage(Serializable msg) throws MtoCDServMessageException, TimeoutException{
	
		 incoming = null;
	      outgoing = msg;
	      boolean timeout = false;
	     
	    
	   try {
		      File f = new File("C:\\CD\\CDSVPRNT.DAT");
		       _logger.debug("The Path of CDServ" +f.getPath());
		       if(f.exists()) 
		       { 
		    	f.delete();
		       }
		     String saleRequest = outgoing.toString();
		     _logger.debug("Before Accessing Pipe File "); 
		     RandomAccessFile pipe = new RandomAccessFile("\\\\.\\pipe\\CDSERVEX.PPP", "rw");
		    _logger.debug("Accessing Pipe File Successfull "); 
		    if(saleRequest.substring(23,25).equals("58"))
		    {
		    	 Thread.sleep(6000);
		    }
		    _logger.debug("Writing into Pipe File"); 
		     pipe.write(outgoing.toString().getBytes());
		    for(int i=0 ; i<360 ; i++)
		    {
		    	if (pipe.length() != 0L) 
		        	  break;
		          Thread.sleep(1000L);
		     }
		  long fileLen = pipe.length();
	      byte[] respArr = new byte[(int)fileLen];
	      pipe.readFully(respArr);
	      String response = new String(respArr);
	      _logger.debug("Received the response successfully from CDServ: " + response + " ");
	      incoming = response;
	   }
      catch (Exception e) {
    	  if(incoming == null && timeout) {
	    		throw new TimeoutException();
	    	}
	    	else {
		    	ERROR_MSG = "Error while accessing CDServ Pipe";
		    	throw new MtoCDServMessageException(ERROR_CONNECTIVITY, ERROR_MSG);
	    	}
	    } 
		File f = new File("C:\\CD\\CDSVPRNT.DAT");
		 if (f.exists())
		      f.delete(); 
		  int resplen = 0;
		  if(incoming !=null)
			  resplen = incoming.toString().length();
		  _logger.debug("CDServe Debugging : Response received and length is: " + resplen + " ");
		  
	    
	  return incoming ;
		
	}
}

