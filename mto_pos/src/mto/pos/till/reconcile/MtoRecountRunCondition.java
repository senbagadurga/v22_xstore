package mto.pos.till.reconcile;


import dtv.pos.framework.op.AbstractRunCondition;

import mto.pos.common.MtoValueKeys;

public class MtoRecountRunCondition extends AbstractRunCondition {

    protected boolean shouldRunImpl() {
    	String flag = this.getScopedValue(MtoValueKeys.OVERSHOT_FLAG);
    	  
    	   if (!flag.isEmpty() && flag.equalsIgnoreCase("Y")) {
    			return true;
    	   }
    	 		return false;
    }
 }
