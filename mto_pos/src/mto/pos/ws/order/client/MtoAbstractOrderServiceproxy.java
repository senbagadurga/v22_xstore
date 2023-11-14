package mto.pos.ws.order.client;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import org.apache.logging.log4j.LogManager;

import com.siebel.orpos.order.ORPOSORDERPORT;
import com.siebel.orpos.order.ORPOSOrderWebService;
import com.sun.xml.ws.developer.JAXWSProperties;

import dtv.util.ClassPathUtils;
import dtv.util.crypto.DtvDecrypter;
import dtv.util.*;

public abstract class MtoAbstractOrderServiceproxy implements IMtoOrderServiceProxy {

	private String endPointURL_ = null;
	private String requestTimeout_ = "15000";
	private String connectTimeout_ = "15000";
	private IMtoOrderMessageHandler messageHandler_;
	private String PROPERTIES_ROOT = null;

	private ORPOSOrderWebService orposOrderWebService_;
	protected static final INameFilter XML_EXTENSION = new EndsWithNameFilter(new String[] { ".xml" });
	private static final org.apache.logging.log4j.Logger logger_ = LogManager
			.getLogger(MtoAbstractOrderServiceproxy.class);
	private static final String ENV_TYPE = "mto.pos.envType";

	public MtoAbstractOrderServiceproxy() {

		initialize();
	}

	protected abstract void initialize();

	public ORPOSOrderWebService getOrposOrderWebService() {
		return orposOrderWebService_;
	}

	public void setOrposOrderWebService(ORPOSOrderWebService orposOrderWebService) {
		this.orposOrderWebService_ = orposOrderWebService;
	}

	@Override
	public URL locateWSDLFile(String argPackageName, String argFileName) {

		URL siebelWSDLURL = null;

		String[] wsdlURLs = ClassPathUtils.getDirectoryBasedConfigFileListRelativePaths(argPackageName, XML_EXTENSION);

		for (String wsdlURL : wsdlURLs) {
			String filepath = wsdlURL;
			File wSDLFile = new File(filepath);
			String fileName = wSDLFile.getName();

			if (argFileName.equals(fileName)) {
				siebelWSDLURL = ClassPathUtils.getResource(wsdlURL);
				logger_.info("The located WSDL file is: " + siebelWSDLURL.getPath());
				break;
			}
		}

		if (siebelWSDLURL == null) {
			logger_.fatal("System has been unable to locate WSDL file " + argFileName + " under path " + argPackageName
					+ ".");
		}

		return siebelWSDLURL;
	}

	/** {@inheritDoc} */
	@Override
	public String getEndPointURL() {
		return endPointURL_;
	}

	/** {@inheritDoc} */
	@Override
	public void setEndPointURL(String argURL) {
		endPointURL_ = argURL;
	}

	/** {@inheritDoc} */
	@Override
	public void setRequestTimeout(String argTimeout) {
		requestTimeout_ = argTimeout;
	}

	/** {@inheritDoc} */
	@Override
	public String getRequestTimeout() {
		return requestTimeout_;
	}

	/** {@inheritDoc} */
	@Override
	public void setConnectTimeout(String argTimeout) {
		connectTimeout_ = argTimeout;
	}

	/** {@inheritDoc} */
	@Override
	public String getConnectTimeout() {
		return connectTimeout_;
	}

	private BindingProvider getPortGeneric(BindingProvider bindingProvider) {

		Map<String, Object> context = bindingProvider.getRequestContext();

		@SuppressWarnings("rawtypes")
		List<Handler> handlerChain = new ArrayList<Handler>();
		handlerChain.add(getHandler());
		bindingProvider.getBinding().setHandlerChain(handlerChain);
		context.put(JAXWSProperties.CONNECT_TIMEOUT, Integer.valueOf(getConnectTimeout()));
		context.put(JAXWSProperties.REQUEST_TIMEOUT, Integer.valueOf(getRequestTimeout()));
		return bindingProvider;
	}

	@Override
	public ORPOSORDERPORT getPort(ORPOSORDERPORT argProvider) {

		BindingProvider bindingProvider = (BindingProvider) argProvider;
		bindingProvider = getPortGeneric(bindingProvider);
		Map<String, Object> context = bindingProvider.getRequestContext();
		context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, getEndPointURL());
		return argProvider;
	}

	@Override
	public IMtoOrderMessageHandler getHandler() {
		if (messageHandler_ == null) {

			String enyType = getEnvType();
			if (enyType != null && enyType.equals("MTO_TEST")) {
				messageHandler_ = new MtoOrderMessageHandler();
				messageHandler_.setUsername("");
				messageHandler_.setPassword("");
				logger_.info("MtoOrderMessageHandler has been initialized.");
			} else if (enyType != null && enyType.equals("MTO_SIT")) {
				String userName=System.getProperty("siebel.username.sit");
				String password=System.getProperty("siebel.password.sit");
				messageHandler_ = new MtoOrderMessageHandler();
				String userNum=DtvDecrypter.getInstance("config").decrypt(userName);
				String passWord=DtvDecrypter.getInstance("config").decrypt(password);
				messageHandler_.setUsername(userNum);
				messageHandler_.setPassword(passWord);
				logger_.info("MtoOrderMessageHandler has been initialized.");
			} else if (enyType != null && enyType.equals("MTO_UAT")) {
				String userName=System.getProperty("siebel.username.uat");
				String password=System.getProperty("siebel.password.uat");
				messageHandler_ = new MtoOrderMessageHandler();
				String userNum=DtvDecrypter.getInstance("config").decrypt(userName);
				String passWord=DtvDecrypter.getInstance("config").decrypt(password);
				messageHandler_.setUsername(userNum);
				messageHandler_.setPassword(passWord);
				//messageHandler_.setUsername(System.getProperty("siebel.username.uat"));
				//messageHandler_.setPassword(System.getProperty("siebel.password.uat"));
				logger_.info("MtoOrderMessageHandler has been initialized.");
			} else if (enyType != null && enyType.equals("MTO_PROD")) {
				String userName=System.getProperty("siebel.username.prod");
				String password=System.getProperty("siebel.password.prod");
				messageHandler_ = new MtoOrderMessageHandler();
				String userNum=DtvDecrypter.getInstance("config").decrypt(userName);
				String passWord=DtvDecrypter.getInstance("config").decrypt(password);
				messageHandler_.setUsername(userNum);
				messageHandler_.setPassword(passWord);
				//messageHandler_ = new MtoOrderMessageHandler();
				//messageHandler_.setUsername(System.getProperty("siebel.username.prod"));
				//messageHandler_.setPassword(System.getProperty("siebel.password.prod"));
				logger_.info("MtoOrderMessageHandler has been initialized.");
			}
		}
		return messageHandler_;
	}

	/*
	 * @Override public IMtoOrderMessageHandler getHandler() { if (messageHandler_
	 * == null) {
	 * 
	 * messageHandler_ = new MtoOrderMessageHandler();
	 * 
	 * messageHandler_.setUsername("ORPOSSBL");
	 * messageHandler_.setPassword("uattso123");
	 * 
	 * messageHandler_.setUsername(""); messageHandler_.setPassword("");
	 * logger_.info("MtoOrderMessageHandler has been initialized."); }
	 * 
	 * return messageHandler_; }
	 */
	/** {@inheritDoc} */
	@Override
	public Object getResponse(Object argRequest) throws Exception {
		// should be implemented per service level
		return null;
	}

	/** {@inheritDoc} */
	@Override
	public String getServiceType() {
		return null;
	}

	protected String buildUrlString() {
		StringBuilder url = new StringBuilder();

		String address = System.getProperty(PROPERTIES_ROOT + ".address");
		String port = System.getProperty(PROPERTIES_ROOT + ".port");
		String path = System.getProperty(PROPERTIES_ROOT + ".path");

		url.append(address);
		if (!StringUtils.isEmpty(port)) {
			url.append(":" + port);
		}
		url.append(path);

		return url.toString();
	}

	@Override
	public void setPropertiesRoot(String argRoot) {
		PROPERTIES_ROOT = argRoot;
	}

	@Override
	public String getPropertiesRoot() {
		return PROPERTIES_ROOT;
	}

	private String getEnvType() {
		String envType = System.getProperty(ENV_TYPE);
		if (envType != null && envType.equalsIgnoreCase("prod")) {
			return "MTO_PROD";
		} else if (envType != null && envType.equalsIgnoreCase("uat")) {
			return "MTO_UAT";
		} else if (envType != null && envType.equalsIgnoreCase("sit")) {
			return "MTO_SIT";
		}
		return "MTO_TEST";
	}

}
