package mto.pos.systemcycle.workstation;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dtv.data2.access.DataFactory;
import dtv.data2.access.DefaultQueryResult;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.QueryKey;
import dtv.pos.iframework.validation.IValidationResult;
import dtv.pos.iframework.validation.SimpleValidationResult;
import dtv.pos.systemcycle.workstation.ValidateOpenWorkstationRule;
import dtv.xst.dao.hrs.IEmployee;
import mto.pos.order.MtoConstants;

public class MtoValidateOpenWorkstationRule extends ValidateOpenWorkstationRule {
	private static final Logger logger_ = LogManager.getLogger(MtoValidateOpenWorkstationRule.class);
	private final IQueryKey<DefaultQueryResult> MTO_TILL_OPEN_QUERY = new QueryKey<DefaultQueryResult>("MTO_TILL_OPEN_QUERY", DefaultQueryResult.class);
	@Override
	public IValidationResult validate() {
		IEmployee loggedInEmployee = ((IEmployee)this._stationState.getSystemUser());
		
		Map<String, Object> qparams = new HashMap<String, Object>();	
		String logedInEmployeeId =String.valueOf(loggedInEmployee.getPartyId());/* _sessionManager.getSession().getCreateUserId(); */
		qparams.put("argLogedInEmployeeId", logedInEmployeeId);									
		List<DefaultQueryResult> openTillIdList = DataFactory.getObjectByQueryNoThrow(MTO_TILL_OPEN_QUERY,qparams );
		logger_.error("opentilllist: "+openTillIdList);
		logger_.error("argLogedInEmployeeId: "+logedInEmployeeId);
		logger_.error("userId: "+loggedInEmployee.getCreateUserId());
		logger_.error("partyId: "+loggedInEmployee.getPartyId());
		logger_.error("employeerole: "+loggedInEmployee.getEmployeeRoleCode());
		if(loggedInEmployee.getPrimaryGroupId().equalsIgnoreCase(MtoConstants.ROLE_CASHIER) && openTillIdList.size()>=1) {
			logger_.error("IN IF: ");
			return SimpleValidationResult.getFailed("_systemCycleWorkstationALreadyAttached", new Object[] {loggedInEmployee.getEmployeeId() });
			
		}
		return super.validate();
	}

}
