package mto.pos.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dtv.pos.common.OpChainKey;
import dtv.pos.framework.op.AbstractFormOp;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.action.DataActionGroupKey;
import dtv.pos.iframework.action.IXstDataAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.service.IService;
import mto.pos.common.MtoModelKeys;
import mto.pos.common.MtoValueKeys;
import mto.pos.ws.order.ordersearch.MtoOrderLookupResponseBean;

public class MtoDisplaySiebelOrderListOp extends AbstractFormOp<MtoOrdersModel> implements IService {

	@Inject
	protected TransactionScope _transactionScope;

	private static final Logger _logger = LogManager.getLogger(MtoDisplaySiebelOrderListOp.class);

	@Override
	protected MtoOrdersModel createModel() {
	
		ArrayList<MtoOrderList> orderList = new ArrayList<MtoOrderList>();
		List<MtoOrderLookupResponseBean> orderLookupResults = _transactionScope
				.getValue(MtoValueKeys.SIEBEL_ORDER_INQUIRY_RESULTS);
		_logger.info("Orders List : " + orderLookupResults);
		if (orderLookupResults != null && !orderLookupResults.isEmpty()) {

			for (MtoOrderLookupResponseBean mtoOrderLookupSearchResult : orderLookupResults) {
				if (mtoOrderLookupSearchResult.getCurrentOrderTotalNetPrice() != null
						&& mtoOrderLookupSearchResult.getCurrentOrderTotalNetPrice().intValue() > 0) {
					MtoOrderList orderListResult = new MtoOrderList();
					orderListResult.setId(mtoOrderLookupSearchResult.getId());
					orderListResult.setOrderNumber(mtoOrderLookupSearchResult.getOrderNumber());
					orderListResult.setAccount(mtoOrderLookupSearchResult.getAccount());
					orderListResult
							.setCurrentOrderTotalNetPrice(mtoOrderLookupSearchResult.getCurrentOrderTotalNetPrice());
					orderListResult.setContactLastName(mtoOrderLookupSearchResult.getContactLastName());
					orderListResult.setCreated(mtoOrderLookupSearchResult.getCreated());
					orderListResult.setTransactionType(mtoOrderLookupSearchResult.getTransactionType());
					orderListResult .setMtoAccountPrepaidBalance(mtoOrderLookupSearchResult.
					 getMtoAccountPrepaidBalance());
					orderListResult.setMtoPaymentRefNumber(mtoOrderLookupSearchResult.getMtoPaymentRefNumber());
					orderListResult.setMtoAccountSCBalance(mtoOrderLookupSearchResult.getMtoAccountSCBalance());
					orderList.add(orderListResult);
				}
			}

			_logger.info("Orders final List : " + orderList);
		}
		MtoOrdersModel editModel = new MtoOrdersModel(orderList);
		_logger.info("Orders Model : " + editModel);
		_logger.info("Final List on the UI : " + editModel.getOrderListModel());
		this._modeProvider.get().getStationModel().setListModel(MtoModelKeys.SIEBEL_ORDERS,
				editModel.getOrderListModel());

		return editModel;
	}

	@Override
	protected String getFormKey() {
		return "SIEBEL_ORDER_LIST";
	}

	@Override
	protected DataActionGroupKey getActionGroupKey() {

		return DataActionGroupKey.DEFAULT;
	}

	@Override
	protected IOpResponse handleDataAction(IXstDataAction argAction) {
		if (argAction != null && argAction.getData() != null) {
			MtoOrderList selectedOrder = (MtoOrderList) argAction.getData();
			_transactionScope.setValue(MtoValueKeys.SELECTED_SIEBEL_ORDER, selectedOrder);
			selectedOrder.getMtoAccountPrepaidBalance();
	    	_transactionScope.setValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT, selectedOrder.getMtoAccountPrepaidBalance());
		} else
			return this.handleExit();
		return this.HELPER.getStartChainResponse(OpChainKey.valueOf("MTO_ORDER_PROCESS_FLOW"));

	}

	@Override
	protected IOpResponse handleDisplayAgain() {
		getModel().filterAndRefresh();
		return super.handleDisplayAgain();
	}

	@Override
	protected IOpResponse handleBeforeDataAction(IXstEvent argAction) {
		return super.handleBeforeDataAction(argAction);
	}

}
