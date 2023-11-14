package mto.pos.tender.validation;

import javax.inject.Inject;

import dtv.i18n.FormatterType;
import dtv.i18n.IFormattable;
import dtv.pos.common.SysConfigAccessor;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.validation.AbstractValidationRule;
import dtv.pos.iframework.validation.IValidationResult;
import dtv.pos.iframework.validation.SimpleValidationResult;
import dtv.xst.dao.ttr.ICheckTenderLineItem;
import dtv.xst.dao.ttr.ITenderLineItem;

public class MtoMinimumCheckNumberRule extends AbstractValidationRule {

	 @Inject
	 private SysConfigAccessor _sysConfig;

    public IValidationResult validate() {
     ITenderLineItem tenderLine = (ITenderLineItem)this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
     ICheckTenderLineItem checkTender = (ICheckTenderLineItem)tenderLine;
      long minCheckNum = this._sysConfig.getMinimumCheckNumber();
 
       try {
          long checkNum = (checkTender.getCheckSequenceNumber().length());
 
          if (checkNum < minCheckNum) {
             return this.reportError(minCheckNum);
 
          }
      } catch (Exception var7) {
	        return this.reportError(minCheckNum);
	       }
	 
	 return IValidationResult.SUCCESS;
	 }

	 protected IValidationResult reportError(long minCheckNum) {
	       IFormattable min = this.FF.getSimpleFormattable(minCheckNum, FormatterType.SIMPLE);
	       IFormattable errorMessage = this.FF.getTranslatable("_validatemessage41", new IFormattable[]{min});
	 
	        return SimpleValidationResult.getFailed(errorMessage);
	 }
}
