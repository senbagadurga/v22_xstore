package mto.pos.systemcycle.close;


import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dtv.pos.common.OpChainKey;
import dtv.pos.common.SysConfigAccessor;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.framework.systemcycle.SystemCycleHelper;
import dtv.pos.iframework.action.IXstAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.xst.dao.loc.IWorkstation;
/**
 * US#89121 Closing a Store 
 * Force close Scenario
 * @author kameswari.srishtu
 *
 */
public class MtoValidateWorkstationsClosedOp extends AbstractPromptOp {
	private static final Logger logger_ = LogManager.getLogger(MtoValidateWorkstationsClosedOp.class);
	@Inject
	private SystemCycleHelper _systemCycleHelper;
	@Inject
	private SysConfigAccessor _sysConfig;

	public String getDefaultPromptKey() {
		return "WORKSTATIONS_STATUS_LIST_NOACTION";
	}

	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		IOpResponse response;
	
		if(argEvent instanceof IXstAction && ((IXstAction)argEvent).getActionKey().equals(XstDataActionKey.YES)) {
			logger_.info("Starting the Reconcile Till Flow");
			 response=HELPER.getStartChainResponse(OpChainKey.valueOf("RECONCILE_TILL"));
		}
		else {
			response = HELPER.getStartChainResponse(OpChainKey.valueOf("MENU_TRAVERSAL_FORWARD"));
		}
		return response;
	}
		

	public boolean isOperationApplicable() {
		return this._sysConfig.requireWSClosed() && !this.getOpenWorkstations().isEmpty();
	}

	/*
	 * protected String getEmptyListPromptKey() { return
	 * "UNABLE_TO_CLOSE_RETAIL_LOCATION_WORKSTATIONS"; }
	 */

	protected List<IWorkstation> getOpenWorkstations() {
		return this._systemCycleHelper.getNonClosedWorkStations((long) this._stationState.getRetailLocationId());
	}

	/*
	 * protected Object[] getPromptList(IXstEvent argEvent) { List<IWorkstation>
	 * workstations = this.getOpenWorkstations(); if (!workstations.isEmpty()) {
	 * logger_.info(workstations); if (this._sysConfig.listOpenWS()) { return
	 * workstations.toArray(); } }
	 * 
	 * return null; }
	 */

	/*
	 * protected boolean showListIfOne() { return true; }
	 */
}