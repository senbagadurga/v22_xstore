package mto.pos.tender.certifiedfund;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.tender.TenderHelper;
import dtv.util.StringUtils;
import dtv.xst.dao.ttr.IVoucher;

/**
 *US#89134 Tender Type Certified Funds
 * 
 * */

import mto.pos.common.MtoValueKeys;

public class MtoPromptCertifiedFundNumberOp
    extends AbstractPromptOp {
  private static final Logger logger_ = Logger.getLogger(MtoPromptCertifiedFundNumberOp.class);
  
  @Inject
  TenderHelper _tenderHelper;

  @Override
  public String getDefaultPromptKey() {
    return "MTO_ENTER_CERTIFIED_FUND_NUMBER";
  }

  @Override
  public IOpResponse handleOpExec(IXstEvent argEvent) {
	logger_.warn(">> Executing the method handleOpExec for MtoPromptCertifiedNumberFundOp !!");
    try { 
      String certifiedFundNumber = argEvent.getStringData();
     // String certifiedFundNumber = this.getScopedValue(MtoValueKeys.MTO_ENTERED_CF_NUMER);
      if (!StringUtils.isEmpty(certifiedFundNumber)) {
        setScopedValue(MtoValueKeys.MTO_ENTERED_SERIAL_NUMBER, certifiedFundNumber);
        logger_.warn(">> MtoPromptCertifiedNumberFundOp: Entered Certified Fund Number: " + certifiedFundNumber + " !! ");
      }
    }
    catch (Exception ex) {
      logger_.error(ex.getMessage());
    }

   if (ERROR_MESSAGE_PROMPT.equals(getOpState())) {
      clearScopedValue(ValueKeys.ENTERED_SERIAL_NUMBER);
      clearScopedValue(ValueKeys.VOUCHER_INPUT_EVENT);
      clearScopedValue(MtoValueKeys.MTO_ENTERED_SERIAL_NUMBER);
    }
    return super.handleOpExec(argEvent);
   }
  
  @Override
  public IOpResponse handlePromptResponse(IXstEvent argEvent) {
	 if(argEvent != null) {
		 String cfNumber =  argEvent.getStringData();
		 setScopedValue(MtoValueKeys.MTO_ENTERED_SERIAL_NUMBER, cfNumber);
		 String voucherType = getScopedValue(ValueKeys.SELECTED_VOUCHER_TYPE);
		 IVoucher voucher = this._tenderHelper.lookupVoucher(voucherType, cfNumber);
		 setScopedValue(ValueKeys.CURRENT_VOUCHER, voucher);
	 }
	return HELPER.completeResponse();  
  }

}
