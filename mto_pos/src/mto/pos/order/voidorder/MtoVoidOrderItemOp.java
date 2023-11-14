//$Id$
package mto.pos.order.voidorder;

import dtv.hardware.types.InputType;
import dtv.pos.common.OpChainKey;
import dtv.pos.framework.op.AbstractFormOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.event.IXstEventObserver;
import dtv.pos.iframework.event.IXstEventType;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IReversibleOp;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
/**
 * US#90370 Void Orders
 * @author afreenfathima.m
 *
 */
public class MtoVoidOrderItemOp extends AbstractFormOp<MtoVoidOrderItemFormModel> implements IXstEventObserver, IReversibleOp {
	
  private static final IXstEventType[] EVENTS = new IXstEventType[] {InputType.INPUT_ITEM};
  private boolean _isScanEvent = false;
  private MtoVoidOrderItemFormModel model_ = null;
  
  
  @Override
  public IXstEventType[] getObservedEvents() {
    return EVENTS;
  }
  

  @Override
  public IOpResponse handleOpReverse(IXstEvent argEvent) {
   
    return HELPER.getCompleteStackChainResponse(OpChainKey.valueOf("PRE_SALE_TRANSACTION"));
  }
  

  @Override
  protected IOpResponse handleFormResponse(IXstEvent argEvent) {	  
    return HELPER.completeResponse();
  }
  

  @Override
  protected IOpResponse handleBeforeDataAction(IXstEvent argEvent) {
	  MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
	  MtoVoidOrderItemFormModel searchModel = getModel();
	  String voidReascode = "INCORRECT_PRICE";
	  searchModel.revertChanges();
	  searchModel.setValue(MtoVoidOrderItemFormModel.TRANS_NUM_FIELD, orderSelected.getMtoPaymentRefNumber());
	  searchModel.setValue(MtoVoidOrderItemFormModel.TRANS_TYPE_FIELD, orderSelected.getTransactionType());
	  searchModel.setValue(MtoVoidOrderItemFormModel.AMOUNT_FIELD, orderSelected.getCurrentOrderTotalNetPrice());		 
	  searchModel.setValue(MtoVoidOrderItemFormModel.REASCODE_FIELD, voidReascode);
      return super.handleBeforeDataAction(argEvent);
    }
   
  protected boolean showListIfOne() {
    if (_isScanEvent) {
      return false;
    }
    return true;
  }


  @Override
  protected MtoVoidOrderItemFormModel createModel() {
	  MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);	  
	  String posItem = "Item " +orderSelected.getId();
	  String orderId= "Order #"+orderSelected.getOrderNumber();
	  String message =orderId+"  "+posItem;
	    if (model_ == null) {
	      model_ = new MtoVoidOrderItemFormModel(message);
	    }
	    return model_;
  }

  @Override
  protected String getFormKey() {
    return "MTO_VOID_ORDER_FORM";
  }     
}
