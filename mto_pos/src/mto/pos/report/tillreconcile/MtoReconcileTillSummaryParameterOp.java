package mto.pos.report.tillreconcile;

import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.OpChainKey;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.reporting.ReportInfo;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.xst.dao.tsn.ISession;

public  class MtoReconcileTillSummaryParameterOp extends Operation {
	 public IOpResponse handleOpExec(IXstEvent argEvent) {		 
		   ReportInfo reportInfo = (ReportInfo)this.getScopedValue(ValueKeys.REPORT_INFO);
	       reportInfo.getParameterMap().put("organizationId", ConfigurationMgr.getOrganizationId());
	       reportInfo.getParameterMap().put("argBusinessDateStart",this._stationState.getCurrentBusinessDate());	       
	       ISession session = (ISession) this.getScopedValue(ValueKeys.CURRENT_SESSION);
	       reportInfo.getParameterMap().put("sessionId", session.getSessionId());
	       return this.HELPER.getCompleteStackChainResponse(OpChainKey.valueOf("REPORT_FILL_AND_DISPLAY"));                             
	}
	 

}
	
