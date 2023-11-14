//$Id$
package mto.pos.order.addItem;

import javax.inject.Inject;

import dtv.pos.framework.form.BasicEditModel;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.form.ICardinality;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderConstants;
import mto.pos.order.MtoOrderList;


public class MtoOrderAddItemFormModel extends BasicEditModel {
	@Inject
	protected TransactionScope _transactionScope;

  public static final String ITEM_ID_FIELD = "itemId";
  public static final String DESCR_FIELD = "description";
  public static final String PRICE_FIELD = "price";
  public static final String DEPT_FIELD = "department";
  public static final String QUANTITY_FIELD = "quantity";
  public static final String TAXABLE_FIELD = "taxable";

  private String itemId_ = null;
  private String description_ = null;
  private String price_ = null;
  private String department_ = null;
  public String quantity_=null;
  public String taxable_=null;

  /** Constructs a <code>MTOOrderAddItemFormModel</code>.
   * 
   */
  public MtoOrderAddItemFormModel(String argMessage) {  
    super(FF.getSimpleFormattable(argMessage), FF.getTranslatable("_mtoItemNotFoundFormDescription"));
    this.addField("itemId", String.class);
    this.addField("description", String.class);
    this.addField("price", String.class);
    this.addField("department", String.class);
    this.addField("quantity", String.class);
    this.addField("taxable", String.class);
  }
  

  /**
   * Returns 
   * @return 
   */
  public String getPrice() {
    return price_;
  }
  /**
   * Specifies
   * @param argPrice 
   */
  public void setPrice(String argPrice) {
    price_ = argPrice;
  }
  /**
   * Returns 
   * @return 
   */
  public String getItemId() {
    return itemId_;
  }
  /**
   * Specifies
   * @param argItemId 
   */
  public void setItemId(String argItemId) {
    itemId_ = argItemId;
  }
  /**
   * Returns 
   * @return 
   */
  public String getDescription() {
    return description_;
  }
  /**
   * Specifies
   * @param argDescription 
   */
  public void setDescription(String argDescription) {
    description_ = argDescription;
  }
  /**
   * Returns 
   * @return 
   */
  public String getDepartment() {
    return department_;
  }
  /**
   * Specifies
   * @param argDepartment 
   */
  public void setDepartment(String argDepartment) {
	  department_ = argDepartment;
  }
  /**
   * Returns 
   * @return 
   */
  public String getQuantity() {
		return quantity_;
	}
  /**
   * Specifies
   * @param argQuantity 
   */
	public void setQuantity(String argQuantity) {
		this.quantity_ = argQuantity;
	}
	  /**
	   * Returns 
	   * @return 
	   */
	public String getTaxable() {
		return taxable_;
	}
	 /**
	   * Specifies
	   * @param argTaxable 
	   */
	public void setTaxable(String argTaxable) {
		this.taxable_ = argTaxable;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void setValue(String argFieldKey, Object argValue) {
		

		  MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		//  getFieldDef.setValue(MtoOrderAddItemFormModel.ITEM_ID_FIELD, orderSelected.getId());
	     getFieldDef(ITEM_ID_FIELD).setValue(orderSelected.getId());
		 getFieldDef(DESCR_FIELD).setValue(orderSelected.getTransactionType());
		 getFieldDef(PRICE_FIELD).setValue (orderSelected.getCurrentOrderTotalNetPrice());
		 getFieldDef(QUANTITY_FIELD).setValue(MtoOrderConstants.ITEM_QUNATITY);
		getFieldDef(ITEM_ID_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		getFieldDef(DESCR_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		getFieldDef(PRICE_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		getFieldDef(QUANTITY_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		getFieldDef(DEPT_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		getFieldDef(TAXABLE_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
	}
}
