package mto.pos.ws.order.client;

import java.util.Map;

import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.siebel.orpos.order.ORPOSExecuteInput;
import com.siebel.orpos.order.ORPOSExecuteOutput;
import com.siebel.orpos.order.ORPOSORDERPORT;
import com.siebel.orpos.order.ORPOSOrderWebService;
import com.siebel.orpos.order.ORPOSQueryPageInput;
import com.siebel.orpos.order.ORPOSQueryPageOutput;
import com.siebel.xml.orpos_order_entry_io.query.QueryType;

import mto.pos.order.MtoOrderList;
import mto.pos.ws.order.ordersearch.MtoOrposQueryPageInputRequestPreparer;
import mto.pos.ws.order.orderupdate.MtoOrposExecuteInputRequestPreparer;
import mto.pos.ws.order.ordervoid.MtoOrposExecuteVoidRequestPreparer;

public class MtoOrderServiceHelper {

	private static MtoOrderServiceHelper INSTANCE_;
	private static ORPOSORDERPORT orposOrderPort_;
	private static final Logger logger_ = LogManager.getLogger(MtoOrderServiceHelper.class);
	protected static final QueryType EMPTY_QUERY = new QueryType();

	public static MtoOrderServiceHelper getInstance() {
		if (INSTANCE_ == null || MtoOrderServiceHelper.orposOrderPort_ == null) {
			INSTANCE_ = new MtoOrderServiceHelper();
		}
		return INSTANCE_;
	}

	private MtoOrderServiceHelper() {
		init();
	}

	private void init() {
		logger_.warn("Initializing port for web service start...");
		try {
			MtoOrderServiceProxy proxy = MtoOrderServiceProxy.getInstance();
			ORPOSOrderWebService service = proxy.getOrposOrderWebService();
			orposOrderPort_ = proxy.getPort(service.getORPOSORDERPORT());
		} catch (Exception e) {
			logger_.warn("Failed to Initialize the order service proxy" + e.getMessage());
		}
	}

	public ORPOSORDERPORT getORPOSORDERPORT() {
		ORPOSORDERPORT orderServicePort = null;
		orderServicePort = orposOrderPort_;

		Map<String, Object> context = ((BindingProvider) orderServicePort).getRequestContext();
		logger_.info("SIEBEL  END POINT ADDRESS: " + context.get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));

		return orderServicePort;

	}

	public ORPOSQueryPageOutput orposQueryPage(String argLoginUserId) throws Exception {

		ORPOSQueryPageOutput memberTransactionInfo = null;
		try {
			MtoOrposQueryPageInputRequestPreparer request = new MtoOrposQueryPageInputRequestPreparer();
			ORPOSQueryPageInput pageInput = request.buildOrderLookupRequestPreparer(argLoginUserId);
			ORPOSORDERPORT siebelService = getORPOSORDERPORT();
			//Map<String, Object> context =  siebelService.getRequestContext();
			
			  // SOAPEnvelope soapEnvelope = context.getMessage().getSOAPPart().getEnvelope();
			 //  SOAPHeader soapHeader = soapEnvelope.getHeader();
			
			
			memberTransactionInfo = siebelService.orposQueryPage(pageInput);

		} catch (Exception e) {
			logger_.warn("Error occurred on post() - " + e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return memberTransactionInfo;
	}

	public ORPOSExecuteOutput orposExecute(MtoOrderList argOrderSelected) throws Exception {

		ORPOSExecuteOutput memberTransactionInfo = null;
		try {
			MtoOrposExecuteInputRequestPreparer request = new MtoOrposExecuteInputRequestPreparer();
			ORPOSExecuteInput pageInput = request.buildOrderUpdateRequestPreparer(argOrderSelected);
			ORPOSORDERPORT siebelService = getORPOSORDERPORT();
			memberTransactionInfo = siebelService.orposExecute(pageInput);

		} catch (Exception e) {
			logger_.warn("Error occurred on post() - " + e.getMessage());
			e.printStackTrace();
			// throw e;
		}
		return memberTransactionInfo;
	}

	public ORPOSExecuteOutput orposExecuteVoid(MtoOrderList argOrderSelected) throws Exception {

		ORPOSExecuteOutput memberTransactionInfo = null;
		try {
			MtoOrposExecuteVoidRequestPreparer request = new MtoOrposExecuteVoidRequestPreparer();
			ORPOSExecuteInput pageInput = request.buildOrderVoidRequestPreparer(argOrderSelected);
			ORPOSORDERPORT siebelService = getORPOSORDERPORT();
			memberTransactionInfo = siebelService.orposExecute(pageInput);

		} catch (Exception e) {
			logger_.warn("Error occurred on post() - " + e.getMessage());
			e.printStackTrace();

		}
		return memberTransactionInfo;
	}
	/*Start Task 100597 Item Not on File prompt appearing for transaction type  available in DB */
	public ORPOSQueryPageOutput orposQueryPage(String argLoginUserId,String argItemId) throws Exception {

		ORPOSQueryPageOutput memberTransactionInfo = null;
		try {
			MtoOrposQueryPageInputRequestPreparer request = new MtoOrposQueryPageInputRequestPreparer();
			ORPOSQueryPageInput pageInput = request.buildOrderItemLookupRequestPreparer(argLoginUserId,argItemId);
			ORPOSORDERPORT siebelService = getORPOSORDERPORT();
			//Map<String, Object> context =  siebelService.getRequestContext();
			
			  // SOAPEnvelope soapEnvelope = context.getMessage().getSOAPPart().getEnvelope();
			 //  SOAPHeader soapHeader = soapEnvelope.getHeader();
			
			
			memberTransactionInfo = siebelService.orposQueryPage(pageInput);

		} catch (Exception e) {
			logger_.warn("Error occurred on post() - " + e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return memberTransactionInfo;
	}
	/*End Task 100597 Item Not on File prompt appearing for transaction type  available in DB */
}
