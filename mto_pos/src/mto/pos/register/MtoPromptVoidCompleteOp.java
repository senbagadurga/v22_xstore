package mto.pos.register;



import javax.inject.Inject;
import org.apache.log4j.Logger;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import mto.pos.order.MtoOrderHelper;

/**
 * Bug#105122 Display void is successful message if void is successful 
 *
 *
 */

public class MtoPromptVoidCompleteOp extends AbstractPromptOp {
	
	@Inject
	MtoOrderHelper _orderHelper;
	public static final Logger _logger = Logger.getLogger(MtoPromptVoidCompleteOp.class);
	
	@Override
	public String getDefaultPromptKey() {
		return "MTO_PAYMENT_SUCCESSFULL_PROMPT";
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent arg0) {
		return this.HELPER.completeResponse();
	}
	
	@Override
	public boolean isOperationApplicable() {
		return true;
	}

}
