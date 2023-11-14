package mto.pos.ws.order.client;

import java.net.URL;

import com.siebel.orpos.order.ORPOSORDERPORT;
import com.siebel.orpos.order.ORPOSOrderWebService;
import mto.pos.ws.order.client.IMtoOrderMessageHandler;

public interface IMtoOrderServiceProxy {

	public ORPOSOrderWebService getOrposOrderWebService();
	
	public void setOrposOrderWebService(ORPOSOrderWebService argService);
	
	 public URL locateWSDLFile(String packageName, String fileName);

	  public String getEndPointURL();

	  public void setEndPointURL(String argURL);

	  public void setRequestTimeout(String argTimeout);

	  public String getRequestTimeout();

	  public void setConnectTimeout(String argTimeout);

	  public String getConnectTimeout();
	  
	  public ORPOSORDERPORT getPort(ORPOSORDERPORT argProvider);
	  
	  public IMtoOrderMessageHandler getHandler();
	  
	  public Object getResponse(Object argRequest)
		      throws Exception;

		  public String getServiceType();

		  public void setPropertiesRoot(String argRoot);

		  public String getPropertiesRoot();
	  
	  
	
}
