package mto.pos.systemcycle.workstation;

import javax.inject.Inject;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.systemcycle.SystemCycleHelper;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.xst.dao.tsn.ISession;
import dtv.xst.dao.tsn.ISessionWorkstation;

public class MtoCloseWorkstationForReconcileOp extends Operation {
  @Inject
  private SystemCycleHelper _systemCycleHelper;

  ISession selectedSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION);
	 
	 String registerId_ = String.valueOf(((ISessionWorkstation)selectedSession.getSessionWorkstations().get(0)).getWorkstationId());
	  int workStationID= Integer.valueOf(registerId_) ;

  @Override
 public IOpResponse handleOpExec(IXstEvent argEvent) {
     return !this._systemCycleHelper.closeWorkstation((long)this._stationState.getRetailLocationId(), (long)workStationID, this._stationState.getCurrentBusinessDate()) ? this.HELPER.errorNotifyResponse() : this.HELPER.completeResponse();
   }
 }
