package mto.pos.order.addItem;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.siebel.orpos.order.ORPOSQueryPageInput;

import dtv.data2.access.IQueryResultList;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.inventory.lookup.ItemLookupFormData;
import dtv.pos.inventory.lookup.ItemLookupModule;
import dtv.pos.register.ItemLocator;
import dtv.xst.dao.itm.IItem;
import dtv.xst.query.results.BasicItemQueryResult;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import mto.pos.ws.order.ordersearch.MtoOrderEntryLineItemsResponseBean;
import mto.pos.ws.order.ordersearch.MtoOrderLookupResponseBean;

public class MtoOrderItemLookupOp extends Operation {
	@Inject
	private ItemLookupModule _itemLookupModule;
	@Inject
	protected TransactionScope _transactionScope;
	private static final Logger logger = Logger.getLogger(MtoOrderItemLookupOp.class);

	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {

		MtoOrderList orderSelected = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		/*
		 * Start Task 100597 Item Not on File prompt appearing for transaction type
		 * available in DB
		 */
		MtoOrderLookupResponseBean orderItem=   _transactionScope.getValue(MtoValueKeys.SIEBEL_ORDER_LINEITEM_DETAILS);
		if (orderSelected != null && orderItem.getItemList() !=null && !orderItem.getItemList().isEmpty()) {
			String itemId = orderSelected.getId();
			for (MtoOrderEntryLineItemsResponseBean item : orderItem.getItemList()) {
				String lineItemId=item.getPartNumber();
				ItemLookupFormData searchModel = new ItemLookupFormData();
				if (lineItemId != null) {
					searchModel.setItemId(lineItemId);
					
					IQueryResultList<BasicItemQueryResult> itemList = _itemLookupModule.lookupItemByAttributes(searchModel,
							(long) this._stationState.getRetailLocationId());
					logger.info("Item List is found" + itemList);
				}
				IItem item1 = (IItem) ItemLocator.getLocator().lookupItem(lineItemId);
				if (item1 != null) {
					setScopedValue(ValueKeys.CURRENT_ITEM, item1);
					setScopedValue(ValueKeys.ENTERED_ITEM_ID, lineItemId);
					logger.info("Item ID is found" + item1);
				} else if (item1 == null) {
					return this.HELPER.getPromptResponse("MTO_ITEM_NOT_ON_FILE_NOTIFY");
				}
			}
		}
			else if (orderSelected != null) {
				String itemId = orderSelected.getId();
				ItemLookupFormData searchModel = new ItemLookupFormData(); 
				if (itemId != null) 
				{ 
				searchModel.setItemId(itemId); 
				IQueryResultList<BasicItemQueryResult>
				itemList = _itemLookupModule.lookupItemByAttributes(searchModel, (long)
						this._stationState.getRetailLocationId());
				logger.info("Item List is found" + itemList); 
				} 
				IItem item = (IItem) ItemLocator.getLocator().lookupItem(itemId);
				if (item != null)
				{
				setScopedValue(ValueKeys.CURRENT_ITEM, item);
				setScopedValue(ValueKeys.ENTERED_ITEM_ID, itemId);
				logger.info("Item ID is found" + item); 
				} 
				else if (item == null) 
				{ 
					return this.HELPER.getPromptResponse("MTO_ITEM_NOT_ON_FILE_NOTIFY"); 
				}		
			}
		/*
		 * End Task 100597 Item Not on File prompt appearing for transaction type
		 * available in DB
		 */
		 else {
			logger.info("Order Selected is null");
			return this.HELPER.getPromptResponse("MTO_ERROR");
		}
		return this.HELPER.completeResponse();

	}
}
