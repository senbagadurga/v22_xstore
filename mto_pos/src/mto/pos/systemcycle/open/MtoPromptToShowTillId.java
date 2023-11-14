package mto.pos.systemcycle.open;
import javax.inject.Inject;
import dtv.i18n.IFormattable;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.till.SessionManager;


public class MtoPromptToShowTillId extends AbstractPromptOp {

	@Inject
	private SessionManager _sessionManager;
	
	@Override
	public String getDefaultPromptKey() {
		// TODO Auto-generated method stub
		return "SHOW_TILLID";
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent arg0) {
		// TODO Auto-generated method stub
		return  this.HELPER.completeResponse();
		
	}
	@Override
	protected IFormattable[] getPromptArgs(final IXstEvent argEvent) {
	
		  Long sessionId = _sessionManager.getSession().getSessionId();
		 
		  return new IFormattable[]{this._formattables.getSimpleFormattable(String.valueOf(sessionId))};
	}

}