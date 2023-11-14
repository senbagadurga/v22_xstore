package mto.pos.systemcycle.close;

import dtv.i18n.FormatterType;
import dtv.i18n.IFormattable;
import dtv.pos.common.SysConfigAccessor;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;

import java.util.Date;

import javax.inject.Inject;

public class MtoDisplayFinalSystemCloseMsgOp extends AbstractPromptOp {
   
   @Inject
   private SysConfigAccessor _sysConfig;
   public String getDefaultPromptKey() {
      return "DISPLAY_STORE_CLOSE_COMPLETE_MESSAGE";
   }

   public IOpResponse handlePromptResponse(IXstEvent argEvent) {
      return this.HELPER.completeResponse();
   }

   public boolean isOperationApplicable() {
      return this._sysConfig.promptToInitiateClose();
   }
   @Override
   public IFormattable[] getPromptArgs(IXstEvent argEvent) {
	   Date businessDate = this._stationState.getCurrentBusinessDate();     
     IFormattable formattedDate = this._formattables.getSimpleFormattable(businessDate, FormatterType.DATE_FULL);    
     return new IFormattable[]{formattedDate};  
   }
}