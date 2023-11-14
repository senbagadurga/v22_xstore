package mto.pos.shared.visibilityrules;

import java.math.BigDecimal;

import javax.inject.Inject;

import dtv.pos.common.SysConfigAccessor;
import dtv.pos.framework.action.access.AbstractVisibilityRule;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.visibilityrules.AccessLevel;
import dtv.pos.iframework.visibilityrules.IAccessLevel;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;


public class MtoDisableCheckForNNP extends AbstractVisibilityRule{
	
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
	String nnpval=getNnpOrderTransactionType();
	 if (orders != null &&!(orders.getTransactionType().equalsIgnoreCase(nnpval)))
	{
	      access = AccessLevel.GRANTED;
	   }
	 
	     return access;
	 }
}
