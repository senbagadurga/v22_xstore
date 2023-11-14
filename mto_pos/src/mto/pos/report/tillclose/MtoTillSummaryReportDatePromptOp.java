package mto.pos.report.tillclose;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.QueryKey;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import mto.xst.query.results.MtoTillSumaryValidationResult;

public class MtoTillSummaryReportDatePromptOp extends AbstractPromptOp{
	private final IQueryKey<Object[]> MTO_TSR_DATE_UPDATE = new QueryKey<Object[]>("MTO_TSR_DATE_UPDATE", Object[].class);
	private final IQueryKey<MtoTillSumaryValidationResult> MTO_TSR_DATE_VALIDATION = new QueryKey<MtoTillSumaryValidationResult>("MTO_TSR_DATE_VALIDATION", MtoTillSumaryValidationResult.class);
	
	
	public String getDefaultPromptKey() {
		       return "REPORT_BUSINESS_DATE";
	    }

	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		Date reportRunningDate= (Date)argEvent.getData();
		Map<String, Object> qparams = new HashMap<String, Object>();				
		qparams.put("argBusinessDate", reportRunningDate);
		List<MtoTillSumaryValidationResult> dateFlag = DataFactory.getObjectByQueryNoThrow(MTO_TSR_DATE_VALIDATION,qparams );																						
		if (dateFlag.get(0).getStatus()==0)
			return this.HELPER.getPromptResponse("MTO_REPORT_INVALID_DATE_PROMPT");
		Map<String, Object> qparams1 = new HashMap<String, Object>();				
		qparams1.put("argBusinessDate", reportRunningDate);
		DataFactory.executeQuery(MTO_TSR_DATE_UPDATE, qparams1);
		return this.HELPER.completeResponse();
	}
		
		

}
