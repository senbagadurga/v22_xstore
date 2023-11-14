package mto.pos.till.reconcile;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.OpState;
import dtv.pos.framework.op.Operation;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IOpState;
import dtv.pos.till.SessionManager;
import dtv.pos.till.types.SessionStatusCode;
import dtv.xst.dao.tsn.ISession;
import dtv.i18n.IFormattable;
import javax.inject.Inject;

public class MtoCheckCurrentSessionStatusOp extends Operation {

	 private static final String PARAM_ACCEPTED_STATUS = "AcceptedStatus";
	 private static final String NO_COUNT_STATUE_FOR_TILL = "NO_COUNT_STATUE_FOR_TILL";
	 private SessionStatusCode _countStatus = null;
	 ISession selectedSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION);
	  @Inject
	  private SessionManager _sessionManager;
	  protected String ERROR_WITH_INFO = "ERROR_WITH_INFO";
	    private final IOpState POST_NOTIFY = new OpState("POST_NOTIFY");
	    
	    public IOpResponse handleOpExec(IXstEvent argEvent) {
	       ISession session = this._sessionManager.getSession();
	  
	      if (this.POST_NOTIFY.equals(this.getOpState())) {
	         this.setOpState((IOpState)null);
	          return this.HELPER.getBackupResponse();
	 
	       } else if (session != null && this._countStatus.name().equals(session.getStatusCode())) {
	    	   
	       } else {
	       this.setOpState(this.POST_NOTIFY);
	         return this.HELPER.getPromptResponse("NO_COUNT_STATUE_FOR_TILL", new IFormattable[0]);
	      }
		return null;
	
	    }
	

   public void setParameter(String argName, String argValue) {
	       if ("AcceptedStatus".equalsIgnoreCase(argName)) {
	         this._countStatus = SessionStatusCode.valueOf(argValue);
	
	      } else {
	          super.setParameter(argName, argValue);
	       }
	   }
	
}
