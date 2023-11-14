package mto.pos.report.storeclose;

import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.OpChainKey;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.reporting.ReportInfo;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;



public  class MtoStoreSummaryParameterOp extends Operation {
	
	public IOpResponse handleOpExec(IXstEvent argEvent) {		
		ReportInfo reportInfo = (ReportInfo)this.getScopedValue(ValueKeys.REPORT_INFO);
		reportInfo.getParameterMap().put("organizationId", ConfigurationMgr.getOrganizationId());
		reportInfo.getParameterMap().put("retailLocationId", Long.valueOf(this._stationState.getRetailLocationId()));  
		reportInfo.getParameterMap().put("argBusinessDateStart",this._stationState.getCurrentBusinessDate());		
		return this.HELPER.getCompleteStackChainResponse(OpChainKey.valueOf("REPORT_FILL_AND_DISPLAY"));  		 
	}
}
	
