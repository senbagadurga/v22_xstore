package mto.pos.till.reconcile;

/**
 * @author Nishanthi_Babu
 * User story 92929 Reconcile Till
 */
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.AbstractRunCondition;
import dtv.xst.dao.tsn.ISession;

public class MtoReconcileRunCondition extends AbstractRunCondition {

	    protected boolean shouldRunImpl() {
	    	   ISession selectedSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION);
	    	   selectedSession.getStatusCode();
	    	   if (selectedSession.getStatusCode().equalsIgnoreCase("RECONCILED")) {
	    			return false;
	    	   }
	    	 		return true;
	     
	    }
	 }

