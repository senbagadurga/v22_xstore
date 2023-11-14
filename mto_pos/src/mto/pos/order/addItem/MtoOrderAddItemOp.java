//$Id$
package mto.pos.order.addItem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dtv.hardware.types.InputType;
import dtv.pos.framework.op.AbstractFormOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.event.IXstEventObserver;
import dtv.pos.iframework.event.IXstEventType;
import dtv.pos.iframework.form.ICardinality;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IReversibleOp;
import dtv.pos.iframework.validation.IValidationResultList;
import dtv.pos.iframework.validation.SimpleValidationResult;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderConstants;
import mto.pos.order.MtoOrderList;

public class MtoOrderAddItemOp extends AbstractFormOp<MtoOrderAddItemFormModel> 
  implements IXstEventObserver, IReversibleOp {
  private static final Logger _logger = LogManager.getLogger(MtoOrderAddItemOp.class); 
  private static final IXstEventType[] EVENTS = new IXstEventType[] {InputType.INPUT_ITEM};
  private boolean _isScanEvent = false;
  private MtoOrderAddItemFormModel model_ = null;
  
  
  /** {@inheritDoc} */
  @Override
  public IXstEventType[] getObservedEvents() {
    return EVENTS;
  }
  
  /** {@inheritDoc} */
  @Override
  public IOpResponse handleOpReverse(IXstEvent argEvent) {
    //Clear the scanned barcode when click back..
    //Item lookup Form - Clear the inputs when click back on display item search result list only for barcode event.
	  String message="";
    if (_isScanEvent) {
      model_ = new MtoOrderAddItemFormModel(message);
    }
    //Reset the scan event..
    setOpState(null);
    _isScanEvent = false;
    return HELPER.completeResponse();
  }
  
  /** {@inheritDoc} */
  @Override
  protected IOpResponse handleFormResponse(IXstEvent argEvent) {
    String searchTerm = null;
    //get the search term from lookup form and pass to request to get the response
    MtoOrderAddItemFormModel searchModel = getModel();
    if(searchModel.getItemId() != null) {
    	   searchTerm = searchModel.getItemId();
    }  if(searchModel.getDescription() != null) {
      searchTerm = searchModel.getDescription();
    } 
     if(searchModel.getDepartment() != null) {
        searchTerm = searchModel.getDepartment();
        
    }  if(searchModel.getPrice() != null) {
      searchTerm = searchModel.getPrice();
    }  if(searchModel.getQuantity() != null) {
      searchTerm = searchModel.getQuantity();
    }  if(searchModel.getTaxable()!= null) {
        searchTerm = searchModel.getTaxable();
      }
    _logger.info(">> Item Lookup Search Term: " + searchTerm);
    _transactionScope.setValue(MtoValueKeys.MTO_ENTERED_ITEM_DETAILS, searchModel);
    return HELPER.completeResponse();
  }
  
  /** {@inheritDoc} */
  @Override
  protected IOpResponse handleBeforeDataAction(IXstEvent argEvent) {

	  MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
    
	  MtoOrderAddItemFormModel searchModel = getModel();
     
      searchModel.revertChanges();
      searchModel.setValue(MtoOrderAddItemFormModel.ITEM_ID_FIELD, orderSelected.getId());
     // getFieldDef((MtoOrderAddItemFormModel.ITEM_ID_FIELD).setCardinality(ICardinality.NOT_AVAILABLE));
      searchModel.setValue(MtoOrderAddItemFormModel.DESCR_FIELD, orderSelected.getTransactionType());
      searchModel.setValue(MtoOrderAddItemFormModel.PRICE_FIELD, orderSelected.getCurrentOrderTotalNetPrice());
      searchModel.setValue(MtoOrderAddItemFormModel.QUANTITY_FIELD, MtoOrderConstants.ITEM_QUNATITY);
      return super.handleBeforeDataAction(argEvent);
    }
   
    
 
  /**
   * @return
   */
  protected boolean showListIfOne() {
    if (_isScanEvent) {
      return false;
    }
    return true;
  }

  /** {@inheritDoc} */
  @Override
  protected MtoOrderAddItemFormModel createModel() {
	  MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
	  //this is to create the form title
	  String posItem = "Item" +orderSelected.getId();
	 String orderId= "Order #"+orderSelected.getOrderNumber();
	 String message =orderId+"  "+posItem;
	  
    if (model_ == null) {
      model_ = new MtoOrderAddItemFormModel(message);
    }
    return model_;
  }

  /** {@inheritDoc} */
  @Override
  protected String getFormKey() {
    return "MTO_ORDER_ITEM_LOOKUP";
  }    
  
  /** {@inheritDoc} */
  @Override
  protected IValidationResultList validateForm(MtoOrderAddItemFormModel argModel) {
    IValidationResultList results = super.validateForm(argModel);
    if (results.isValid()) {
      if ((argModel.getQuantity() == null || argModel.getQuantity().isEmpty()) 
          && (argModel.getItemId() == null || argModel.getItemId().isEmpty()) 
          && (argModel.getDescription() == null || argModel.getDescription().isEmpty()) 
          && (argModel.getPrice() == null || argModel.getPrice().isEmpty())) {
        results.add(SimpleValidationResult.getFailed("_mtoInvalidEmptyDataFields")); 
      } else {
        SimpleValidationResult.getPassed();
      }
    }
    return results;
  }

 
 
}
