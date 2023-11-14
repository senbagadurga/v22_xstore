package mto.pos.till.count;

import dtv.pos.common.ValueKeys;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.till.count.CreateTillEndCountObjectsOp;
import dtv.xst.dao.tsn.ISession;
import mto.pos.common.MtoValueKeys;

public class MtoCreateTillEndCountObjectsOp extends CreateTillEndCountObjectsOp {
	
	@Override
	public IOpResponse handleOpExec(IXstEvent argEvent) {		
		ISession MtoCurrentEndCountSession = (ISession) this.getScopedValue(ValueKeys.CURRENT_SESSION);
		setScopedValue(MtoValueKeys.ENDCOUNT_SESSION_ID,MtoCurrentEndCountSession.getSessionId());		
		return super.handleOpExec(argEvent);
	}

}
