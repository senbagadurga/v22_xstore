package mto.pos.order.voidorder;

import javax.inject.Inject;
import dtv.pos.framework.scope.TransactionScope;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import weblogic.utils.StringUtils;
import dtv.pos.framework.op.AbstractRunCondition;

public class MtoVoidOrderCheckRunCondition extends AbstractRunCondition  {
	@Inject
	protected TransactionScope _transactionScope;
	
	protected boolean shouldRunImpl() {
		MtoOrderList currentOrder = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);			
		if (!StringUtils.isEmptyString(currentOrder.getMtoPaymentRefNumber())) 
			{return true;}
		else return false;
		 }
}

	

