package mto.pos.ws.order.client;

import java.net.URL;

import org.apache.logging.log4j.LogManager;

import com.siebel.orpos.order.ORPOSOrderWebService;

public class MtoOrderServiceProxy  extends MtoAbstractOrderServiceproxy{

	private static MtoOrderServiceProxy INSTANCE;
	private static final org.apache.logging.log4j.Logger logger_ = LogManager.getLogger(MtoOrderServiceProxy.class);
	private static final String ENV_TYPE = "mto.pos.envType";

	static {
		INSTANCE = new MtoOrderServiceProxy();
	}
	
	public static MtoOrderServiceProxy getInstance()
	{
		if(INSTANCE.getOrposOrderWebService() == null) {
			INSTANCE = new MtoOrderServiceProxy();
		}
		return INSTANCE;
	}
	
	private MtoOrderServiceProxy() {
		super();
	}
	
	@Override
	  protected void initialize() {
	    String endPointURL = null;
	    URL siebelWSDL = null;
	    try {
	 
		String envType = getEnvType();
	      siebelWSDL = locateWSDLFile("wsdl", "ORPOSOrder.xml");
	      if (envType != null && envType.equalsIgnoreCase("MTO_SIT")) {
				//endPointURL = MtoConfigurationMgr.getSiebelServiceEndPointURL();
	      endPointURL = System.getProperty("siebel.url.sit");
	      logger_.info("The Url from conig file is SIT"+ endPointURL);
	      setEndPointURL(endPointURL);
	      setOrposOrderWebService(new ORPOSOrderWebService(siebelWSDL));
	      setConnectTimeout("7000");
		  setRequestTimeout("7000");
		  
			} else if (envType != null && envType.equalsIgnoreCase("MTO_TEST")) {
				//endPointURL = MtoConfigurationMgr.getSiebelServiceTestEndPointURL();
				//endPointURL = System.getProperty("siebel.url.dev");
				logger_.info("The Url from conig file is DEV"+ endPointURL);
				String actualEndPoint= endPointURL.replaceAll("&amp;", "&");
				logger_.info("The end point url is DEV"+ actualEndPoint);
				setEndPointURL(actualEndPoint);
				setOrposOrderWebService(new ORPOSOrderWebService(siebelWSDL));
				setConnectTimeout("7000");
				setRequestTimeout("7000");
			}
			else if (envType != null && envType.equalsIgnoreCase("MTO_UAT")) {
				//endPointURL = MtoConfigurationMgr.getSiebelServiceTestEndPointURL();
				endPointURL = System.getProperty("siebel.url.uat");
				logger_.info("The Url from conig file is UAT"+ endPointURL);
				//String actualEndPoint= endPointURL.replaceAll("&amp;", "&");
				logger_.info("The end point url is UAT"+ endPointURL);
				setEndPointURL(endPointURL);
				setOrposOrderWebService(new ORPOSOrderWebService(siebelWSDL));
				setConnectTimeout("7000");
				setRequestTimeout("7000");
			}
			else if (envType != null && envType.equalsIgnoreCase("MTO_PROD")) {
				//endPointURL = MtoConfigurationMgr.getSiebelServiceTestEndPointURL();
				endPointURL = System.getProperty("siebel.url.prod");
				logger_.info("The Url from conig file is PROD"+ endPointURL);
				//String actualEndPoint= endPointURL.replaceAll("&amp;", "&");
				logger_.info("The end point url is PROD"+ endPointURL);
				setEndPointURL(endPointURL);
				setOrposOrderWebService(new ORPOSOrderWebService(siebelWSDL));
				setConnectTimeout("7000");
				setRequestTimeout("7000");
			}
		}

		catch (Exception e) {
			logger_.fatal(
					"System failed to initialize SiebelOrderServiceProxy. Please check Siebel server availability etc. The Siebel server used by you is "
							+ endPointURL + ".");
			logger_.fatal("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private String getEnvType() {
		String envType = System.getProperty("mto.pos.envType");
		if (envType != null && envType.equalsIgnoreCase("sit")) {
			return "MTO_SIT";
		}
		else if (envType != null && envType.equalsIgnoreCase("uat")) {
			return "MTO_UAT";
		}
		else if (envType != null && envType.equalsIgnoreCase("prod")) {
			return "MTO_PROD";
		}
		return "MTO_TEST";
	}

}
