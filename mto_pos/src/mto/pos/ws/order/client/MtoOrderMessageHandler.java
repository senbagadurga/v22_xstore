package mto.pos.ws.order.client;


import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.sun.xml.ws.transport.Headers;
import com.sun.xml.ws.util.ByteArrayBuffer;

import dtv.util.StringUtils;
import dtv.util.XmlUtils;


public class MtoOrderMessageHandler implements IMtoOrderMessageHandler{

	  private String username_;
	  private String password_;
	  private boolean mustUnderstand_ = false;

	  private static final String USER_NAME_ELEMENT_NAME = "UsernameToken";
	  private static final String PASSWORD_ELEMENT_NAME = "PasswordText";

	  public static final String WSSE_NS = "http://siebel.com/ORPOS/Order";
	 // public static final String WSSE_SECURITY_LNAME = "UserCredentials";
	  public static final String WSSE_NS_PREFIX = "sws";

	  private static final org.apache.logging.log4j.Logger logger_ = LogManager.getLogger(MtoOrderMessageHandler.class.getName());

	  /** {@inheritDoc} */
	  @Override
	  public Set<QName> getHeaders() {
	    return null;
	  }

	  /** {@inheritDoc} */
	  @Override
	  public void close(MessageContext argArg0) {}

	  /** {@inheritDoc} */
	  @Override
	  public boolean handleFault(SOAPMessageContext context) {
	    SOAPMessage message = null;

	    if (context != null) {
	      try {
	        message = context.getMessage();
	      }
	      catch (Exception ex) {
	        logger_.debug("Could not get message from context", ex);
	        Headers headers = (Headers) context.get(MessageContext.HTTP_RESPONSE_HEADERS);
	        if (headers != null) {
	          String fault = headers.get(null).toString();
	          logger_.warn("Error Message from webservice: " + fault);
	        }
	      }

	      if (message != null) {
	        logMessage(getXMLMessage(message), "RESPONSE");
	      }
	    }

	    return false;
	  }

	  protected String getXMLMessage(SOAPMessage argMessage) {
	    ByteArrayBuffer buffer = new ByteArrayBuffer();
	    try {
	      argMessage.writeTo(buffer);
	    }
	    catch (Exception ex) {
	      logger_.warn("Could not get XML message from SOAPMessage" + ex.getMessage());
	      logger_.warn(ex);
	      buffer.write(0);
	      
	    }
	    return buffer.toString();
	  }


	  public boolean handleMessage(SOAPMessageContext context) {
	    boolean outBound = false;
	    //SOAPMessage message = context.getMessage();
	    String XmlMessage = null;
	  
	    Object contextOutBound = context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
	    if (contextOutBound != null && contextOutBound.equals(Boolean.TRUE)) {
	      try {
	        addRequestHeader(context);
	        XmlMessage = getXMLMessage(context.getMessage());
	      }
	      catch (SOAPException ex) {
	        logger_.warn("Failed to add request header: " + ex.getMessage());
	      }
	      logger_.debug(XmlMessage);
	      outBound = true;
	    }
	    else {
	    	//Added to check the response value
	        XmlMessage = getXMLMessage(context.getMessage());
	    	logger_.debug(XmlMessage);
	    }
	    return outBound;
	  }

	  protected void addRequestHeader(SOAPMessageContext context)
	      throws SOAPException {

	    SOAPEnvelope soapEnvelope = context.getMessage().getSOAPPart().getEnvelope();
	    SOAPHeader soapHeader = context.getMessage().getSOAPHeader();
	    if (soapHeader == null) {
	      soapHeader = soapEnvelope.addHeader();
	    }

	    if (!StringUtils.isEmpty(username_) && !StringUtils.isEmpty(password_)) {
	      addSecurityInfoInHeader(soapHeader);
	      
	    }
	  }

	  protected void addSecurityInfoInHeader(SOAPHeader soapHeader)
	      throws SOAPException {
	    Name userCredentials = SOAPFactory.newInstance().createName(USER_NAME_ELEMENT_NAME, WSSE_NS_PREFIX, WSSE_NS);
	    SOAPHeaderElement userCredentialElement = soapHeader.addHeaderElement(userCredentials);
	    userCredentialElement.addTextNode(getUsername());

	    Name pwdCredentials = SOAPFactory.newInstance().createName(PASSWORD_ELEMENT_NAME, WSSE_NS_PREFIX, WSSE_NS);
	    SOAPHeaderElement pwdCredentialsElement = soapHeader.addHeaderElement(pwdCredentials);
	    pwdCredentialsElement.addTextNode(getPassword());

	   
	  }

	  protected void logMessage(String message, String type) {
	  //  System.out.println(type + ":\n" + XmlUtils.getBeautifiedXml(message));
	   logger_.debug(type + ":\n" + XmlUtils.getBeautifiedXml(message));
	   // logger_.warn(type + ":\n" + XmlUtils.getBeautifiedXml(message));
	  }

	  @Override
	  public String getUsername() {
	    return username_;
	  }

	  @Override
	  public void setUsername(String argUsername) {
	    username_ = argUsername;
	  }

	  @Override
	  public String getPassword() {
	    return password_;
	  }

	  @Override
	  public void setPassword(String argPassword) {
	    password_ = argPassword;
	  }

	  @Override
	  public boolean isMustUnderstand() {
	    return mustUnderstand_;
	  }

	  @Override
	  public void setMustUnderstand(boolean argMustUnderstand) {
	    mustUnderstand_ = argMustUnderstand;
	  }
	}

