package mto.pos.till;
import javax.inject.Inject;

import dtv.i18n.IFormattable;
import dtv.pos.framework.op.OpState;
import dtv.pos.framework.op.Operation;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IOpState;
import dtv.pos.till.SessionManager;
import dtv.xst.dao.hrs.IEmployee;
import mto.pos.order.MtoConstants;

/**
 * Restricting Unassigned cashier logging into Till
 * @author kameswari.srishtu
 * US#89123   Login
 *
 */
public class MtoValidateEmployeeTillAttachedOp extends Operation{
	@Inject
	private SessionManager _sessionManager;
	
	protected String ERROR_WITH_INFO = "RESTRICT_LOGIN_UNASSIGNED_CASHIER";
	private final IOpState POST_NOTIFY = new OpState("POST_NOTIFY");


	public IOpResponse handleOpExec(IXstEvent argEvent) {
		IOpResponse response = this.HELPER.completeResponse();
		if(_sessionManager.getSession() != null) {
			String sessionCreateEmployeeId = _sessionManager.getSession().getCreateUserId();
			IEmployee loggedInEmployee= ((IEmployee)_stationState.getSystemUser());
			if(sessionCreateEmployeeId != null && loggedInEmployee != null) {			
				if (sessionCreateEmployeeId.equals(String.valueOf(loggedInEmployee.getPartyId()))
						|| loggedInEmployee.getPrimaryGroupId().equals(MtoConstants.ROLE_MANAGER)
					||  loggedInEmployee.getPrimaryGroupId().equals(MtoConstants.ROLE_ADMIN)) {
					HELPER.completeResponse();
			}
			else {
				//IFormattable promptArg = this._formattables.getLiteral(sessionWkstn.getWorkstationId());
				IFormattable message = this._formattables.getSimpleFormattable("_noTillAssignedToCashier",
						new IFormattable[]{});
				this.setOpState(this.POST_NOTIFY);
				response = this.HELPER.getPromptResponse(this.ERROR_WITH_INFO, new IFormattable[]{message});
			}
			}
		}
	return response;
	}

	public boolean isOperationApplicable() {
		return true;
	}

}
