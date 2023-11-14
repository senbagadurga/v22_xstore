package mto.pos.ws.order.client;

import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public interface IMtoOrderMessageHandler  extends SOAPHandler<SOAPMessageContext> {

	  public String getUsername();

	  public void setUsername(String argUsername);

	  public String getPassword();

	  public void setPassword(String argPassword);

	  public boolean isMustUnderstand();

	  public void setMustUnderstand(boolean argMustUnderstand);
	}


