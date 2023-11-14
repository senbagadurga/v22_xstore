package mto.pos.shared.visibilityrules;

import java.math.BigDecimal;

import javax.inject.Inject;

import dtv.pos.common.SysConfigAccessor;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.action.access.AbstractVisibilityRule;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.visibilityrules.AccessLevel;
import dtv.pos.iframework.visibilityrules.IAccessLevel;
import dtv.xst.dao.ttr.ITenderLineItem;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import mto.pos.tender.prepaid.validation.MtoPrepaidTenderAmountData;


/**
 * 
 * @author Nishanthi_Babu
 * US# 89135 Prepaid Tender type
 * Disable Prepaid Tender type when balance is zero 
 * US# 89999 NNP Orders 
 * Disable Prepaid Tender if transaction type is NNP 
 */
public class MtoPrepaidPaymentCheck extends AbstractVisibilityRule{
	
	 @Inject
	private TransactionScope _transactionScope;
	 @Inject
	 private SysConfigAccessor _sysConfig;
	
	   public String getNnpOrderTransactionType() {
		   String value=MtoConfigurationMgr.getNnpOrderTransactionType();
	      return (value);
	    }
	 @Override
	protected IAccessLevel checkVisibilityImpl() {
	IAccessLevel access = AccessLevel.DENIED;
	MtoOrderList orders =	_transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
	MtoPrepaidTenderAmountData value=_transactionScope.getValue(MtoValueKeys.CURRENT_PREPAID_AMOUNT_DATA);
	BigDecimal prepaid =_transactionScope.getValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT);
	String nnpval=getNnpOrderTransactionType();
	 if (orders != null &&!(orders.getTransactionType().equalsIgnoreCase(nnpval))&& 
			 (orders.getMtoAccountPrepaidBalance().compareTo(BigDecimal.ZERO)>0) && prepaid.compareTo(BigDecimal.ZERO)>0) {
	      access = AccessLevel.GRANTED;
	   }
	 
	     return access;
   }

	
}
