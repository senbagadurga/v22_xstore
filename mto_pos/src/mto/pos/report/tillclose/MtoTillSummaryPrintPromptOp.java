package mto.pos.report.tillclose;

import dtv.pos.common.OpChainKey;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.op.PromptYesNoOp;
import dtv.pos.iframework.action.IXstActionKey;
import dtv.pos.iframework.action.IXstDataAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import mto.pos.common.MtoValueKeys;

public  class MtoTillSummaryPrintPromptOp extends PromptYesNoOp {	
	@Override
	public String getDefaultPromptKey() {
		return "TILL_SUMMARY_PROMPT";
	}	
	@Override
	  public IOpResponse handlePromptResponse(IXstEvent argEvent) {			
		if (argEvent instanceof IXstDataAction) {
			IXstDataAction action = (IXstDataAction) argEvent;
			IXstActionKey key = action.getActionKey();			
			if (key == XstDataActionKey.YES) {					
				return this.HELPER.getCompleteStackChainResponse(OpChainKey.valueOf("TILL_SUMMARY_REPORT"));
			} else if (key == XstDataActionKey.NO) {
			       clearScopedValue(MtoValueKeys.ENDCOUNT_SESSION_ID);	
			       clearScopedValue(MtoValueKeys.ENDCOUNT_MESSAGE);
				return this.HELPER.completeResponse();				
			} 
		}
		return this.HELPER.completeResponse();			
	}
}
