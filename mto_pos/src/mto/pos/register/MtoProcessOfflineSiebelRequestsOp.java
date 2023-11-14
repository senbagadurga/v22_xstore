package mto.pos.register;
/********************************************************************************
 * US 92543 Siebel Sale Order Processing
 * 09/01/2023 Nayya Gupta constant class to handle constant values
 *******************************************************************************/
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import dtv.pos.framework.op.Operation;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;

public class MtoProcessOfflineSiebelRequestsOp extends Operation {
  
	  @Inject
	  private ScheduledExecutorService executorService_;
	  
	@Override
	public IOpResponse handleOpExec(IXstEvent arg0) {
		int refreshInterval = 10;
	    refreshInterval = (refreshInterval < 10) ? 10 : refreshInterval;
	    this.executorService_.scheduleWithFixedDelay(new MtoProcessOfflineRequestsWorker(10), refreshInterval, refreshInterval, TimeUnit.MINUTES);
	    return this.HELPER.completeResponse();
}

}
