package mto.pos.till.reconcile;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dtv.pos.common.TransactionHelper;
import dtv.pos.common.TransactionType;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.till.count.PromptTillCountOp;
import dtv.xst.dao.tsn.ISession;
import dtv.xst.dao.tsn.ISessionWorkstation;
import dtv.xst.dao.tsn.ITenderControlTransaction;


public class MtoPromptTillCountOp extends PromptTillCountOp {
	
	@Inject
	protected TransactionScope _transactionScope;
	private static final Logger logger_ = LogManager.getLogger(MtoPromptTillCountOp.class);
	ISession selectedSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION);
	 
	 String registerId_ = String.valueOf(((ISessionWorkstation)selectedSession.getSessionWorkstations().get(0)).getWorkstationId());
	  long workStationID= Long.valueOf(registerId_) ;

	 protected void createTenderControlTransaction() {
	      if (this._transactionScope.getTransaction(TransactionType.TENDER_CONTROL) == null) {
		     ITenderControlTransaction transaction = (ITenderControlTransaction)TransactionHelper.createTransaction(TransactionType.TENDER_CONTROL);
		         transaction.setTypeCode(this.getTenderCountTransactionType().getName());
		         //transaction.setWorkstationId(workStationID);
					/*
					 * List<IReceiptSource> rcptSrcList = new ArrayList(); rcptSrcList.add(trans);
					 * this._transactionScope.setValue(TransactionScopeKeys.CURRENT_RECEIPT_SOURCE,
					 * rcptSrcList);
					 */
		         
		    }
		  }
}
