package mto.pos.tender;

import javax.inject.Inject;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.action.IXstAction;
import dtv.pos.iframework.action.IXstActionKey;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.tender.TenderHelper;
import dtv.xst.cleandto.tnd.Tender;
import dtv.xst.dao.ttr.ITenderLineItem;
import mto.pos.common.MtoValueKeys;

/**
 * US#89993 Tender Type Credit/Debit
 * Showing Customer Present Prompt
 * @author kameswari.srishtu
 *
 */

public class MtoIsCustomerPresentCheckOp extends AbstractPromptOp {
	
	@Inject
	private TenderHelper _tenderHelper;
	
	@Inject
	private TransactionScope _transactionScope;

	@Override
	public String getDefaultPromptKey() {
		return "CANCEL_CUSTOMER_PRESENT";
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		 IXstActionKey key =((IXstAction) argEvent).getActionKey();
		 if(key == XstDataActionKey.YES) {
			 _transactionScope.setValue(MtoValueKeys.IS_CUSTOMER_PRESENT, true);
		 }
		 else {
			 _transactionScope.setValue(MtoValueKeys.IS_CUSTOMER_PRESENT, false);
		 }
		return this.HELPER.completeResponse();
	}
	
	@Override
	public boolean isOperationApplicable() {
		ITenderLineItem tenderLine = getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		Tender tender = _tenderHelper.getTender(tenderLine.getTenderId(), (long) _stationState.getWorkstationId(),"");
		if(tender.getTenderTypecode().equals(MtoCDServConstants.CREDIT_TYPE)
				||tender.getTenderTypecode().equals(MtoCDServConstants.DEBIT_TYPE)){
	
			return true;
		}
		
		return false;
		
	}

}