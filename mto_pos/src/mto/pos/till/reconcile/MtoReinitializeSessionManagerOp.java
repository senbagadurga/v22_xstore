package mto.pos.till.reconcile;

import javax.inject.Inject;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.till.SessionManager;
import dtv.xst.dao.tsn.ISession;
import dtv.xst.dao.tsn.ISessionWorkstation;

public class MtoReinitializeSessionManagerOp extends Operation {
	   @Inject
	   private SessionManager _sessionManager;
	   @Inject
		protected TransactionScope _transactionScope;
	


@Override
public IOpResponse handleOpExec(IXstEvent var1) {
	// TODO Auto-generated method stub
	  ISession selectedSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION);
	  selectedSession.getTenderRepositoryId();
	
	 String registerId_ = String.valueOf(((ISessionWorkstation)selectedSession.getSessionWorkstations().get(0)).getWorkstationId());
	  int workStationID= Integer.valueOf(registerId_) ;
	 this._sessionManager.initialize((long)this._stationState.getRetailLocationId(), (long)workStationID);
		
     return this.HELPER.completeResponse();
}
	 }
