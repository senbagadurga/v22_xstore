package mto.pos.order;



import javax.inject.Inject;

import org.apache.log4j.Logger;

import dtv.data2.access.DataFactory;
import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.hardware.IHardwareType;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.order.CreateOrderSaleLineOp;
import dtv.pos.register.ItemLocator;
import dtv.xst.dao.itm.IItem;
import dtv.xst.dao.itm.ItemId;
import dtv.xst.dao.trl.ISaleReturnLineItem;
import dtv.xst.dao.trl.SaleItemType;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.common.MtoValueKeys;
import oracle.retail.xstore.itm.custitem.CustomerItem;
import oracle.retail.xstore.itm.custitem.CustomerItem.ItemType;

public class MtoCreateSiebelOrderTransactionOp extends CreateOrderSaleLineOp {
	private static final Logger logger = Logger.getLogger(MtoCreateSiebelOrderTransactionOp.class);
    @Inject
	protected TransactionScope _transactionScope;
	IHardwareType entryMethod = (IHardwareType)this.getScopedValue(ValueKeys.VALUE_ENTRY_METHOD);

	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {	
		
		IItem orderItem = getScopedValue(ValueKeys.CURRENT_ITEM);
		IItem item= getItem();
		
		CustomerItem currentCustItem =  getScopedValue(ValueKeys.CURRENT_CUST_LIST_ITEM);
		MtoOrderList orderSelected =_transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		 ISaleReturnLineItem lineItem = null;
		 
		if((currentCustItem != null) && currentCustItem.getItemType().equals(ItemType.TRANSACTION_ITEM)) {
			lineItem = getCurrentLineItem(currentCustItem);
		} else {
			//104077 Incorrect orderdetails display on sale screen
			       item.setMeasurementRequired(false);
			       item.setItemId(orderSelected.getId());
			       item.setDescription(orderSelected.getTransactionType());
			       item.setListPrice(orderSelected.getCurrentOrderTotalNetPrice());
			lineItem =  ItemLocator.getLocator().getSaleLineItem(item, SaleItemType.SALE, false, "keyed");
		}
		   lineItem.setItemId(orderSelected.getId());
	       lineItem.setReturn(false);
	       lineItem.setEnteredDescription(orderSelected.getTransactionType());
	       lineItem.setUnitPrice(orderSelected.getCurrentOrderTotalNetPrice());
	       lineItem.setRegularBasePrice(orderSelected.getCurrentOrderTotalNetPrice());
	       lineItem.setBaseUnitPrice(orderSelected.getCurrentOrderTotalNetPrice());
	       lineItem.setBaseExtendedPrice(orderSelected.getCurrentOrderTotalNetPrice());
	       lineItem.setDisallowDealFlag(false);
	       lineItem.setUnitCost(orderSelected.getCurrentOrderTotalNetPrice());
	       
	       item.setListPrice(orderSelected.getCurrentOrderTotalNetPrice());
	       
	       clearScopedValue(ValueKeys.CURRENT_SALE_LINE);
	       clearScopedValue(ValueKeys.CURRENT_ITEM);
		   
	       setScopedValue(ValueKeys.CURRENT_ITEM,item);
	       setScopedValue(ValueKeys.CURRENT_SALE_LINE,lineItem);
		   this.setScopedValue(ValueKeys.ENTERED_ITEM_PRICE, orderSelected.getCurrentOrderTotalNetPrice());
		   this.setScopedValue(ValueKeys.ENTERED_ITEM_ID, orderSelected.getId());
		   this.setScopedValue(ValueKeys.ENTERED_ITEM_DESCRIPTION, orderSelected.getTransactionType());
		   logger.info("Item id "+orderSelected.getId());
        return HELPER.completeResponse();

	}
	private IItem getItem() {
		// TODO Auto-generated method stub
		ItemId itemId= new ItemId();
		itemId.setOrganizationId(Long.valueOf(ConfigurationMgr.getOrganizationId()));
		//to set the default not found item here , make sure 9999999 is present in the database
		itemId.setItemId(MtoConfigurationMgr.getDefaultItemNotOnFile());
		IItem item = DataFactory.getObjectByIdNoThrow(itemId);
		return item;
	}

}
