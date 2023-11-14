package mto.pos.tender.overtender;


import dtv.util.NumberUtils;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.PromptYesNoOp;
import dtv.pos.tender.validation.TenderAmountData;

public class MtoPromptOverTenderOp extends PromptYesNoOp{


 
    @Override
    public String getDefaultPromptKey() {
    	return "VALIDATE_OVER_TENDER";
    }
    
    @Override
    public boolean isOperationApplicable() {
        TenderAmountData tenderAmountData = (TenderAmountData) getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
        return NumberUtils.isGreaterThan(tenderAmountData.getEnteredAmount(), tenderAmountData.getBalanceDue());
    }
}
