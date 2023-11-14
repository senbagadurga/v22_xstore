package mto.pos.systemcycle.workstation;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.systemcycle.SystemCycleHelper;
 import dtv.pos.framework.validation.AbstractValidationRule;
import dtv.pos.iframework.ILocationFactory;
 import dtv.pos.iframework.validation.IValidationResult;
import dtv.pos.iframework.validation.SimpleValidationResult;
import dtv.pos.till.TillHelper;
 import dtv.xst.dao.tsn.ISession;
import dtv.xst.dao.tsn.ISessionWorkstation;

import java.util.List;
 import javax.inject.Inject;


public class MtoValidateCloseWorkstationRule extends AbstractValidationRule {
	   @Inject
       private SystemCycleHelper _systemCycleHelper;
	  @Inject
	  private TillHelper _tillHelper;
      @Inject
	  private ILocationFactory _locationFactory;
	
      
	  public IValidationResult validate() {
      IValidationResult result = IValidationResult.SUCCESS;
      ISession selectedSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION);
      String registerId_ = String.valueOf(((ISessionWorkstation)selectedSession.getSessionWorkstations().get(0)).getWorkstationId());
      int workStationID= Integer.valueOf(registerId_) ;
	      if (!this._systemCycleHelper.isRetailLocationOpen()) {
	     result = SimpleValidationResult.getFailed("_systemCycleUnableToCloseRegisterStoreIsClosed");
	
	      }
	      else if (!this._systemCycleHelper.isWorkstationOpen((long)this._stationState.getRetailLocationId(), (long)workStationID)) {
	    	
	    	        result = SimpleValidationResult.getFailed("_systemCycleUnableToCloseLocationMsgWkstn");
	    	 
	    	      } 
	      else if (this._locationFactory.getStoreById((long)this._stationState.getRetailLocationId()).getUseTillAccountability()) {

	
	          List<ISession> attachedTills = this._tillHelper.getAttachedTills((long)this._stationState.getWorkstationId(), (long)this._stationState.getRetailLocationId());
	
	
	        if (attachedTills != null && !attachedTills.isEmpty()) {
	            result = SimpleValidationResult.getFailed("_closeWorkstationTillsAreAttached");
	       }
	      }
	
	      return result;
	  }
	}
