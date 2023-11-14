package mto.pos.till.reconcile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.QueryKey;
import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.AbstractListPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.till.TillHelper;
import dtv.pos.till.types.TenderRepositoryTypeCode;
import dtv.xst.dao.tsn.ISession;
import mto.pos.common.MtoValueKeys;
import mto.xst.query.results.MtoAllTillStatusResult;

/**
 * @author Nishanthi_Babu 
 * User story 92929 Reconcile Till
 */
public class MtoPromptReconcileTillOp extends AbstractListPromptOp {
	
	private static final IQueryKey<MtoAllTillStatusResult> ALL_TILL_STATUS = new QueryKey<MtoAllTillStatusResult>("ALL_TILL_STATUS",
			MtoAllTillStatusResult.class);
	@Inject
	private TillHelper _tillHelper;

	public String getDefaultPromptKey() {
		return "RECONCILE_TILL_REGISTER_STATUS";
	}
    
	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		if (argEvent != null && argEvent.getData() != null) {
			ISession session = null;
			if (argEvent.getData() instanceof ISession) {
				session = (ISession) argEvent.getData();
			} else if (argEvent.getData() instanceof MtoAllTillStatusResult) {
				MtoAllTillStatusResult queryResult = (MtoAllTillStatusResult) argEvent.getData();
				//if(queryResult.getStatus().equalsIgnoreCase("RECONCILED")) {
					//Bug 100042
				//	return this.HELPER.getCompletePromptResponse("RECONCILE_RECOUNT_ERROR_PROMPT");
				//}
				if (queryResult!=null)
				{
					this.setScopedValue(MtoValueKeys.OVERSHOT_FLAG, queryResult.getFlag());
				}
				session = this._tillHelper.getSessionBySessionId(queryResult.getSessionId(),
						(long) this._stationState.getRetailLocationId());
			}
			if (session != null) {
				this.setScopedValue(ValueKeys.CURRENT_RECONCILABLE_SESSION, session);				
			}
			return this.HELPER.completeResponse();
		} else {
			return this.HELPER.waitResponse();
		}
	}

	protected String getEmptyListPromptKey() {
		return "NO_TILLS_TO_RECONCILE";
	}

	@Override
	protected Object[] getPromptList(IXstEvent argEvent) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("argOrganizationId", ConfigurationMgr.getOrganizationId());
		params.put("argRetailLocationId", this._stationState.getRetailLocationId());
		params.put("argBusinessDate", this._stationState.getCurrentBusinessDate());
		// params.put("argCountStatus", SessionStatusCode.BEGINCOUNT.name());
		String[] ignoredTypeCodes = new String[] { TenderRepositoryTypeCode.BANK.name(),
				TenderRepositoryTypeCode.STOREBANK.name() };
		params.put("@argIgnoredTypeCodes", Arrays.asList(ignoredTypeCodes));
		List<MtoAllTillStatusResult> sessionList = DataFactory.getObjectByQueryNoThrow(ALL_TILL_STATUS, params);
		return sessionList.toArray();

	}

	protected boolean showListIfOne() {
		return true;
	}

}
