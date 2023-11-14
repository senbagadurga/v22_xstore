package mto.pos.register;

import dtv.pos.common.ValueKeys;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.register.CreateTransactionAsNeededOp;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.tsn.ISession;
import dtv.xst.dao.tsn.ISessionWorkstation;

public class MtoCreateTransactionAsNeededOp<T extends IPosTransaction> extends CreateTransactionAsNeededOp<T>{

	ISession selectedSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION);
	 
	 String registerId_ = String.valueOf(((ISessionWorkstation)selectedSession.getSessionWorkstations().get(0)).getWorkstationId());
	  long workStationID= Long.valueOf(registerId_) ;

	@Override
	public IOpResponse handleOpExec(IXstEvent argEvent) {
	     this.getTransaction();
	     IPosTransaction tran = this._transactionScope.getTransaction();
	    // tran.setWorkstationId(workStationID);
       return this.HELPER.completeResponse();
	  }
}
