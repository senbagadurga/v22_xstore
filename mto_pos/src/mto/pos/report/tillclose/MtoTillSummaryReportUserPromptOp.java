package mto.pos.report.tillclose;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.QueryKey;
import dtv.pos.common.ConfigurationMgr;
import dtv.pos.framework.op.AbstractListPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import mto.xst.query.results.MtoTillSumaryCashierResult;
/*
 * NewTillReport
 */

public class MtoTillSummaryReportUserPromptOp extends AbstractListPromptOp{
	private final IQueryKey<Object[]> MTO_TSR_CASHIER_UPDATE = new QueryKey<Object[]>("MTO_TSR_CASHIER_UPDATE", Object[].class);	
	private final IQueryKey<MtoTillSumaryCashierResult> MTO_TSR_USER_LIST = new QueryKey<MtoTillSumaryCashierResult>("MTO_TSR_USER_LIST", MtoTillSumaryCashierResult.class);	
	
	public String getDefaultPromptKey() {
		       return "REPORT_USER_PROMPT";
	    }

	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		MtoTillSumaryCashierResult queryResult = (MtoTillSumaryCashierResult) argEvent.getData();
		Map<String, Object> qparams = new HashMap<String, Object>();	
		qparams.put("argFirst",queryResult.getEmpFirst());	
		qparams.put("argLast",queryResult.getEmpLast());	
		qparams.put("argTill", queryResult.getTill());		
		DataFactory.executeQuery(MTO_TSR_CASHIER_UPDATE, qparams);		
		return this.HELPER.completeResponse();
	}

	@Override
	protected String getEmptyListPromptKey() {	
		return null;
	}

	@Override
	protected Object[] getPromptList(IXstEvent arg0) 
	{
		  Long orgId = ConfigurationMgr.getOrganizationId();
	      Map<String, Object> params = new HashMap<String, Object>();
	      params.put("argOrganizationId", orgId);
	      List<MtoTillSumaryCashierResult> result = DataFactory.getObjectByQueryNoThrow(MTO_TSR_USER_LIST, params);
	     
	      return result.toArray();
		
	}	
	protected boolean showListIfOne() {
		return true;
	}

	

}
