package mto.pos.siebelorder.webservice;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.siebel.orpos.order.ORPOSExecuteOutput;
import com.siebel.xml.orpos_order_entry_io.id.OrderEntryOrdersId;
import dtv.i18n.IFormattable;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import mto.pos.ws.order.client.MtoOrderServiceHelper;

public class MtoOrderUpdateOp extends Operation {
	@Inject
	protected TransactionScope _transactionScope;
	private static final Logger logger_ = LogManager.getLogger(MtoOrderUpdateOp.class);

	public ORPOSExecuteOutput UpdateOrderStatus() {
		ORPOSExecuteOutput result = null;
		MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		try {
			result = MtoOrderServiceHelper.getInstance().orposExecute(orderSelected);
			logger_.warn("Response received" + result);
		} catch (Exception e) {
			logger_.warn("Lookup Order" + e.getMessage());
		}

		return result;

	}

	public IOpResponse handleOrderLookupWSCallSearch() {
		ORPOSExecuteOutput request = UpdateOrderStatus();
		return handleResponseObject(request);

	}

	private IOpResponse handleResponseObject(ORPOSExecuteOutput argResponseObject) {
		try {
			String orderModId = null;
			if (argResponseObject == null) {
				String message = "No network found";
				IFormattable errorMsg = _formattables.getSimpleFormattable(message);
				return this.HELPER.getPromptResponse("MTO_NETWORK_OFFLINE", errorMsg);
			}

			_transactionScope.setValue(MtoValueKeys.SIEBEL_ORDER_ORDER_UPDATE, argResponseObject);

			// not handling any response except null as its not required according to
			// requirements provided
			if (argResponseObject != null) {
				List<OrderEntryOrdersId> updateOrdersList = argResponseObject.getListOfORPOSOrderEntryIo()
						.getOrderEntryOrders();
				if (updateOrdersList != null) {
					for (OrderEntryOrdersId orderData : updateOrdersList) {
						orderModId = orderData.getModId();
						logger_.warn(
								"Update Order: Received mod id hence considering as success response" + orderModId);
						return HELPER.completeResponse();
					}

				}
			}
			if (orderModId == null) {
				String message = "Mod id is not received in the response";
				IFormattable errorMsg = _formattables.getSimpleFormattable(message);
				return this.HELPER.getPromptResponse("MTO_ERROR", errorMsg);
			}

		} catch (Exception ex) {
			logger_.error("Exception Handled: " + ex.getMessage());
		}
		// For any Exception Response.
		return null;
	}

	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {
		// TODO Auto-generated method stub
		handleOrderLookupWSCallSearch();
		return HELPER.completeResponse();
	}
}
