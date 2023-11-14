package mto.pos.tender;

import javax.inject.Inject;

import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;

/**
 * US#89999 NNP Orders
 * Displaying Warning Msg to use Debit Card 
 * Payments Only
 * @author kameswari.srishtu
 *
 */

public class MtoDisplayNNPOrdersWarningMsgOp 
extends AbstractPromptOp{

	 @Inject
	private TransactionScope _transactionScope;
	
	@Override
	public String getDefaultPromptKey() {
		return "CDSERV_NNP_ORDERS_WARNING";
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent arg0) {
		return HELPER.completeResponse();
	}
	
	@Override
	public boolean isOperationApplicable() {
	MtoOrderList orders =	_transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
	String nnpval=getNnpOrderTransactionType();
		 if (orders != null && orders.getTransactionType()!= null
				 && (orders.getTransactionType().equalsIgnoreCase(nnpval))){
			 return true;
		      
		 }	 return false;
	 }

	
   public String getNnpOrderTransactionType() {
	  String value=MtoConfigurationMgr.getNnpOrderTransactionType();
      return (value);
    }
	
}