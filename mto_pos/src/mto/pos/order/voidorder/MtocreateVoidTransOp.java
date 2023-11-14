package mto.pos.order.voidorder;

import java.util.Date;
import javax.inject.Inject;
import dtv.pos.common.TransactionHelper;
import dtv.pos.common.TransactionType;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.security.StationState;
import dtv.xst.dao.trl.IRetailTransaction;
import dtv.xst.dao.trn.IPostVoidTransaction;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
/**
 * US#90370 Void Orders
 * @author afreenfathima.m
 *
 */
public class MtocreateVoidTransOp extends Operation {
	@Inject
	protected TransactionScope _transactionScope;
	@Inject
	protected StationState _stationState;	

	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {
		MtoOrderList currentOrder = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);		
		String refNum = currentOrder.getMtoPaymentRefNumber();
		long refNumStore = Long.valueOf(refNum.substring(0, 5));
		long refNumReg = Long.valueOf(refNum.substring(5, 8));			
		long refNumTrans = Long.valueOf(refNum.substring(8));
		/* Start US#92635 Integration- Siebel - Xstore void order processing */
		Date cdate = this._stationState.getCurrentBusinessDate();		
		IRetailTransaction currentOrigTrans = (IRetailTransaction)TransactionHelper.searchTransaction(cdate,refNumTrans,refNumReg,refNumStore);
		setScopedValue(ValueKeys.SELECTED_TRANSACTION, currentOrigTrans);					
		IPostVoidTransaction voidTrans = (IPostVoidTransaction)TransactionHelper.createTransaction(TransactionType.POST_VOID);		
		 voidTrans.setVoidedTransaction(currentOrigTrans);
		 voidTrans.setVoidedTransactionEntryCode("EJOURNAL");		 		 
		 voidTrans.setPostVoidReasonCode("INCORRECT PRICE");
		 voidTrans.addTransactionNotes(TransactionHelper.createNote((String)this.getScopedValue(ValueKeys.ENTERED_COMMENT)));
		 return this.HELPER.completeResponse();
	}	
}
