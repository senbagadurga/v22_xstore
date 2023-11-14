package mto.pos.order.voidorder;

import java.util.Date;

import javax.inject.Inject;
import dtv.i18n.FormatterType;
import dtv.i18n.IFormattable;
import dtv.pos.common.OpChainKey;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.action.IXstDataAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.security.StationState;

/**
 * US#90370 Void Orders
 * @author afreenfathima.m
 *
 */
public class MtoPromptInvalidVoidOrderOp extends AbstractPromptOp{
	@Inject
	protected TransactionScope _transactionScope;
	@Inject
	protected StationState _stationState;
	@Override
	public String getDefaultPromptKey() {
		return "MTO_INVALID_VOIDORDER_PROMPT";
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent arg0) {
		
		return this.HELPER.completeResponse();
	}
	
	protected IFormattable[] getPromptArgs(IXstEvent argEvent) {
		Date businessDate = this._stationState.getCurrentBusinessDate(); 		
		IFormattable reg = this._formattables.getSimpleFormattable(String.valueOf(this._stationState.getWorkstationId()));		 
		IFormattable formattedDate = this._formattables.getSimpleFormattable(businessDate, FormatterType.DATE_FULL);
		return new IFormattable[]{formattedDate, reg};		
	}
	
	protected IOpResponse handleDataAction(IXstDataAction argEvent) {
	 return  this.HELPER.getCompleteStackChainResponse(OpChainKey.valueOf("PRE_SALE_TRANSACTION"));	
	}
}