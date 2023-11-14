//$Id$
package mto.pos.order.voidorder;

import java.math.BigDecimal;
import javax.inject.Inject;
import dtv.pos.framework.form.BasicEditModel;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.form.ICardinality;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
/**
 * US#90370 Void Orders
 * @author afreenfathima.m
 *
 */
public class MtoVoidOrderItemFormModel extends BasicEditModel {
	@Inject
	protected TransactionScope _transactionScope;

  public static final String TRANS_NUM_FIELD = "transNum";
  public static final String TRANS_TYPE_FIELD = "transType";
  public static final String AMOUNT_FIELD = "amount";
  public static final String REASCODE_FIELD = "reascode";

  private String transNum_ = null;
  private String transType_ = null;
  private BigDecimal amount_ = null;
  private String reascode_ = null;

  /** Constructs a <code>MTOOrderAddItemFormModel</code>.
   * 
   */
  public MtoVoidOrderItemFormModel(String argMessage) {  
    super(FF.getSimpleFormattable(argMessage), FF.getTranslatable("_mtoVoidOrderMessage"));
    this.addField("transNum", String.class);
    this.addField("transType", String.class);
    this.addField("amount", BigDecimal.class);
    this.addField("reascode", String.class);
  }  

  /**
   * Returns 
   * @return 
   */
  public BigDecimal getAmount() {
    return amount_;
  }
  /**
   * Specifies
   * @param argAmount 
   */
  public void setAmount(BigDecimal argAmount) {
	  amount_ = argAmount;
  }
  /**
   * Returns 
   * @return 
   */
  public String getTransNum() {
    return transNum_;
  }
  /**
   * Specifies
   * @param argTransNum 
   */
  public void setTransNum(String argTransNum) {
	  transNum_ = argTransNum;
  }
  /**
   * Returns 
   * @return 
   */
  public String getTransType() {
    return transType_;
  }
  /**
   * Specifies
   * @param argTransType 
   */
  public void setTransType(String argTransType) {
	  transType_ = argTransType;
  }
  /**
   * Returns 
   * @return 
   */
  public String getReascode() {
    return reascode_;
  }
  /**
   * Specifies
   * @param argReascode 
   */
  public void setReascode(String argReascode) {
	  reascode_ = argReascode;
  }
  
  @SuppressWarnings("unchecked")
	@Override
	public void setValue(String argFieldKey, Object argValue) {
		
		 MtoOrderList orderSelected=  _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);		
	     getFieldDef(TRANS_NUM_FIELD).setValue(orderSelected.getMtoPaymentRefNumber());
		 getFieldDef(TRANS_TYPE_FIELD).setValue(orderSelected.getTransactionType());
		 getFieldDef(AMOUNT_FIELD).setValue (orderSelected.getCurrentOrderTotalNetPrice());
		 getFieldDef(REASCODE_FIELD).setValue("INCORRECT_PRICE");
		 getFieldDef(TRANS_NUM_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		 getFieldDef(TRANS_TYPE_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		 getFieldDef(AMOUNT_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);
		 getFieldDef(REASCODE_FIELD).setCardinality(ICardinality.NOT_AVAILABLE);;
	}
}
