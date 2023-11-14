package mto.pos.till.count;

import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import mto.pos.common.MtoValueKeys;

/**
 * US#89120	- closing a till
 * Skipping reasonCode selection
 * @author kameswari.srishtu
 *
 */
public class MtoPromptTillCountDiscrepancyCommentOp extends AbstractPromptOp {

	@Override
	public String getDefaultPromptKey() {
		return "TILL_COUNT_DISCREPANCY_COMMENT";
	}

	@Override
    public IOpResponse handlePromptResponse(IXstEvent argEvent) {
        String message = argEvent == null ? null : argEvent.getStringData();
        if (message != null) {            
            this.setScopedValue(MtoValueKeys.ENDCOUNT_MESSAGE,message);            
        } 
        return this.HELPER.completeResponse();
    }

}
