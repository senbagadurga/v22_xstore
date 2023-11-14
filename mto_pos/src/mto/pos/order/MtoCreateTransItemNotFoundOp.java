package mto.pos.order;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import dtv.data2.access.DataFactory;
import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.order.CreateOrderSaleLineOp;
import dtv.pos.register.ItemLocator;
import dtv.xst.dao.itm.IItem;
import dtv.xst.dao.itm.ItemId;
import dtv.xst.dao.trl.ISaleReturnLineItem;
import dtv.xst.dao.trl.SaleItemType;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.addItem.MtoOrderAddItemFormModel;

public class MtoCreateTransItemNotFoundOp  extends CreateOrderSaleLineOp{

	@Inject
	protected TransactionScope _transactionScope;
	private static final Logger logger = Logger.getLogger(MtoCreateTransItemNotFoundOp.class);
	
	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {
		
	MtoOrderAddItemFormModel orderModel= _transactionScope.getValue(MtoValueKeys.MTO_ENTERED_ITEM_DETAILS);
	ISaleReturnLineItem lineItem = null;
	
       IItem item= getItem();
       if(item!=null) {
       item.setMeasurementRequired(false);
       item.setItemId(orderModel.getItemId());
       item.setDescription(orderModel.getDescription());
       item.setListPrice(new BigDecimal(orderModel.getPrice()));
     
	
       lineItem =  ItemLocator.getLocator().getSaleLineItem(item, SaleItemType.SALE, false, "keyed");
       //sale return lineitem object is setting with siebel response values
       lineItem.setItemId(orderModel.getItemId());
       lineItem.setReturn(false);
       lineItem.setEnteredDescription(orderModel.getDescription());
       lineItem.setNetQuantity(new BigDecimal(orderModel.getQuantity()));
       lineItem.setQuantity(new BigDecimal(orderModel.getQuantity()));
       lineItem.setUnitPrice(new BigDecimal(orderModel.getPrice()));
       lineItem.setRegularBasePrice(new BigDecimal(orderModel.getPrice()));
       lineItem.setBaseUnitPrice(new BigDecimal(orderModel.getPrice()));
       lineItem.setBaseExtendedPrice(new BigDecimal(orderModel.getPrice()));
       lineItem.setDisallowDealFlag(false);
       lineItem.setInitialQuantity(new BigDecimal(orderModel.getQuantity()));
       lineItem.setUnitCost(new BigDecimal(orderModel.getPrice()));
       
       item.setListPrice(new BigDecimal(orderModel.getPrice()));
       
       clearScopedValue(ValueKeys.CURRENT_SALE_LINE);
       clearScopedValue(ValueKeys.CURRENT_ITEM);
   
       
       setScopedValue(ValueKeys.CURRENT_ITEM,item);
       setScopedValue(ValueKeys.CURRENT_SALE_LINE,lineItem);
       this.setScopedValue(ValueKeys.ENTERED_ITEM_PRICE, new BigDecimal(orderModel.getPrice()));
	   this.setScopedValue(ValueKeys.ENTERED_ITEM_ID, orderModel.getItemId());
	   this.setScopedValue(ValueKeys.ENTERED_ITEM_DESCRIPTION, orderModel.getDescription());
	   logger.info("Item entry Form is called"+orderModel.getItemId());
       }
      
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