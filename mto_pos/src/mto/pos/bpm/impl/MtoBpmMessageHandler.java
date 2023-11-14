package mto.pos.bpm.impl;


import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.logging.log4j.LogManager;

import com.sun.xml.ws.transport.Headers;
import com.sun.xml.ws.util.ByteArrayBuffer;

import dtv.util.StringUtils;
import dtv.util.XmlUtils;
import dtv.util.crypto.DtvDecrypter;


public class MtoBpmMessageHandler implements SOAPHandler<SOAPMessageContext>{

	  private String username_;
	  private String password_;
	  private boolean mustUnderstand_ = false;

	  private static final String USER_NAME_ELEMENT_NAME = "UsernameToken";
	  private static final String PASSWORD_ELEMENT_NAME = "PasswordText";

	  public static final String WSSE_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	 // public static final String WSSE_SECURITY_LNAME = "UserCredentials";
	  public static final String WSSE_NS_PREFIX = "wsse";

	  private static final org.apache.logging.log4j.Logger logger_ = LogManager.getLogger(MtoBpmMessageHandler.class.getName());

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


	  public boolean handleMessage(SOAPMessageContext context) 
	  { 
		  	Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
      if (outboundProperty.booleanValue()) {
          SOAPMessage message = context.getMessage();
          try {
              SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
              SOAPHeader header = context.getMessage().getSOAPHeader();
              if (header == null) {
                  header = envelope.addHeader();
              }
             
    		    String envType = System.getProperty("mto.pos.envType");
    	        logger_.info("MtoBpmMessageHandler: envType---> " + envType);
    	        String value = "bpmservice.username." + envType;
    	        logger_.debug("MtoBpmMessageHandler: parameter value---> " + value);
    	        String encUsername = System.getProperty(value);
    	        logger_.debug("MtoBpmMessageHandler: encrypted username---> " + encUsername);

    	        this.username_ = DtvDecrypter.getInstance("config").decrypt(encUsername);
    	        logger_.debug("MtoBpmMessageHandler: username---> " + this.username_);
    	        String pvalue = "bpmservice.password." + envType;
    	        logger_.debug("MtoBpmMessageHandler: parameter pvalue---> " + pvalue);
    	        String encPassword = System.getProperty(pvalue);
    	        logger_.debug("MtoBpmMessageHandler: encrypted password---> " + encPassword);

    	        this.password_ = DtvDecrypter.getInstance("config").decrypt(encPassword);

    	        logger_.debug("MtoBpmMessageHandler: password---> " + this.password_);
    		  
              SOAPElement security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");

              SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
              usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
              usernameToken.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-FB1F8D4D6C9E64C41916877903273581");
              SOAPElement username = usernameToken.addChildElement("Username", "wsse");
              username.addTextNode(username_);
              SOAPElement password = usernameToken.addChildElement("Password", "wsse");
              password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
              password.addTextNode(password_);
              SOAPElement nonce = usernameToken.addChildElement("Nonce", "wsse");
              nonce.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
              nonce.addTextNode("T5rX/AP7SzgTtL4krvZDdQ==");
              SOAPElement created = usernameToken.addChildElement("Created","wsse");
              created.addTextNode("2023-09-03T14:38:47.357Z");
              SOAPFactory soapFactory = SOAPFactory.newInstance();
              //security.addAttribute(QName.valueOf("soapenv:mustUnderstand"), "1");
              message.saveChanges();
              message.writeTo(System.out);
              System.out.println("");
              logMessage(getXMLMessage(message), "REQUEST");
              envelope = context.getMessage().getSOAPPart().getEnvelope();
          } catch (Exception e) {
              e.printStackTrace();
          }

      } else {
          try {

              SOAPMessage message = context.getMessage();
              message.writeTo(System.out);
              System.out.println("");

          } catch (Exception ex) {
              ex.printStackTrace();
          }
      }
      
      return outboundProperty;

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
	    userCredentialElement.addTextNode(username_);

	    Name pwdCredentials = SOAPFactory.newInstance().createName(PASSWORD_ELEMENT_NAME, WSSE_NS_PREFIX, WSSE_NS);
	    SOAPHeaderElement pwdCredentialsElement = soapHeader.addHeaderElement(pwdCredentials);
	    pwdCredentialsElement.addTextNode(password_);

	   
	  }

	  protected void logMessage(String message, String type) {
	  //  System.out.println(type + ":\n" + XmlUtils.getBeautifiedXml(message));
		  if(message!=null) {
	   logger_.debug(type + ":\n" + XmlUtils.getBeautifiedXml(message));
		  }
	   // logger_.warn(type + ":\n" + XmlUtils.getBeautifiedXml(message));
	  }
	}

