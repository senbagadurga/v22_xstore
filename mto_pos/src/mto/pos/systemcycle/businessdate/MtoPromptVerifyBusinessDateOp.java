package mto.pos.systemcycle.businessdate;

import java.util.Date;

import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.ValueKeys;
import dtv.pos.systemcycle.businessdate.PromptVerifyBusinessDateOp;
import dtv.util.DateUtils;
import mto.pos.common.MtoValueKeys;

/**
 * US#89114 Store Open
 * @author Kameswari.Srishtu
 * Validation of Business date for past/future dates
 *
 */
public class MtoPromptVerifyBusinessDateOp extends PromptVerifyBusinessDateOp{


	private Date currentBusinessDate;
	private Date enteredDate;
	private Date actualProposedDate;
	private Date today_;

	@Override
	public String getDefaultPromptKey() {
		enteredDate = (Date) this.getScopedValue(ValueKeys.PROPOSED_BUSINESS_DATE);
		currentBusinessDate = _stationState.getCurrentBusinessDate();
		String promptKey = "";
		if (enteredDate.before(currentBusinessDate)) {
			promptKey = "VALIDATE_BDATE_NOT_SYSTEM_DATE_PAST";
		} 
		else {
			promptKey = "VALIDATE_BDATE_NOT_SYSTEM_DATE";
		}
		return promptKey;
	}
	
	@Override
	public boolean isOperationApplicable() {
		this.today_ = DateUtils.getNewDate();
		Date currentDate = (Date) this.getScopedValue(ValueKeys.PROPOSED_BUSINESS_DATE);
		actualProposedDate = (Date) this.getScopedValue(MtoValueKeys.ACTUAL_PROPOSED_BUSINESS_DATE);
		return !DateUtils.isSameDay(this.today_, currentDate) && !ConfigurationMgr.getRollingCloseType().enabled()
				&& !DateUtils.isSameDay(actualProposedDate, currentDate);
	}
	
    
}
