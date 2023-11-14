package mto.pos.report.storeclose;

import dtv.pos.common.OpChainKey;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.op.PromptYesNoOp;
import dtv.pos.iframework.action.IXstActionKey;
import dtv.pos.iframework.action.IXstDataAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;

public  class MtoStoreSummaryPrintPromptOp extends PromptYesNoOp {
	
	@Override
	public String getDefaultPromptKey() {
		return "STORE_SUMMARY_PROMPT";
	}	
	@Override
	  public IOpResponse handlePromptResponse(IXstEvent argEvent) {			
		if (argEvent instanceof IXstDataAction) {
			IXstDataAction action = (IXstDataAction) argEvent;
			IXstActionKey key = action.getActionKey();			
			if (key == XstDataActionKey.YES) {					
				return this.HELPER.getCompleteStackChainResponse(OpChainKey.valueOf("STORE_SUMMARY_REPORT"));
			} else if (key == XstDataActionKey.NO) {
				return this.HELPER.completeResponse();				
			} 
		}
		return this.HELPER.completeResponse();			
	}
}
