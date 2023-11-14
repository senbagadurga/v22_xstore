package mto.pos.ws.order.ordervoid;

import com.siebel.orpos.order.ORPOSExecuteInput;
import com.siebel.xml.orpos_order_entry_io.data.ListOfORPOSOrderEntryIoData;
import com.siebel.xml.orpos_order_entry_io.data.OrderEntryOrdersData;
import mto.pos.order.MtoOrderConstants;
import mto.pos.order.MtoOrderList;

public class MtoOrposExecuteVoidRequestPreparer {

	public ORPOSExecuteInput buildOrderVoidRequestPreparer(MtoOrderList argOrderSelected) {
				ORPOSExecuteInput orderRequest = new ORPOSExecuteInput();
		OrderEntryOrdersData orderEntry = new OrderEntryOrdersData();
		orderEntry.setId(argOrderSelected.getId());
		orderEntry.setStatus(MtoOrderConstants.ORDER_STATUS);
		orderEntry.setOperation(MtoOrderConstants.ORDER_OPERATION_TYPE);

		ListOfORPOSOrderEntryIoData entryIoDataList = new ListOfORPOSOrderEntryIoData();
		entryIoDataList.getOrderEntryOrders().add(orderEntry);
		orderRequest.setListOfORPOSOrderEntryIo(entryIoDataList);
		orderRequest.setLOVLanguageMode(MtoOrderConstants.LOVLANGUAGEMODE);
		orderRequest.setViewMode(MtoOrderConstants.UPDATE_VIEW_MODE);
		return orderRequest;
	}


}