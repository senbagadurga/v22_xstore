package mto.pos.tender.check;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dtv.hardware.types.HardwareType;
import dtv.i18n.IFormattable;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.framework.op.OpState;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.hardware.IHardwareType;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IOpState;
import dtv.pos.iframework.op.OpStatus;
import dtv.xst.dao.ttr.ICheckTenderLineItem;
import dtv.xst.dao.ttr.ITenderLineItem;

/**
 * US#89133 Tender Type Cheque
 * @author kameswari.srishtu
 *
 */

public class MtoPromptCheckNumberOp extends AbstractPromptOp{
	
	protected final IOpState POST_CHECKNUM_PROMPT = new OpState("POST_CHECKNUM_PROMPT");
	protected final IOpState ERROR_PROMPT = new OpState("ERROR_PROMPT");
	private static final Logger LOG = LogManager.getLogger(MtoPromptCheckNumberOp.class);

	@Override
	public String getDefaultPromptKey() {
		return "ENTER_CHECK_NUMBER";
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		  String checkNum;
		  if (argEvent == null) {
			     return this.showEnterCheckNumber();   
		  }
		ITenderLineItem tenderLine = (ITenderLineItem)this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		ICheckTenderLineItem checkTender = (ICheckTenderLineItem)tenderLine;
		if (argEvent.getData() == null) {
		   checkNum = null;
		
		} else {
		 checkNum = argEvent.getStringData();
		 setScopedValue(ValueKeys.CHECK_MANUAL_ENTRY_DATA, checkNum);
		 checkTender.setCheckSequenceNumber(checkNum.trim());
		}
		 IOpResponse resp = this.runValidationCheck(argEvent, this.getValidationErrorMessagePrompt());
		 if (!resp.getOpStatus().equals(OpStatus.COMPLETE)) {
		         return resp;	 
		  }
	     try {
	                 IHardwareType entryMethodType = HardwareType.forUse("KEYBOARD", "KEYBOARD");
	                 if (entryMethodType == null) {
	                    LOG.warn("null entry method?!?!?!");
	  
	                 } else {
	                    checkTender.setEntryMethodCode(entryMethodType.getName());
	 			  
	                 }
			  }catch (Exception var8) {
			           this.setOpState(this.ERROR_PROMPT);
			 	        return HELPER.getPromptResponse(this.getValidationErrorMessagePrompt(), new IFormattable[]{_formattables.getTranslatable("_entryIsRequired")});
			  }
	   
		 
		return resp;
	}
	/**
	 * Validation Prompt
	 * @return
	 */
	protected String getValidationErrorMessagePrompt() {
		       return "VALIDATION_ERROR_MESSAGE";
		}
	/**
	 * Enter CheckNumber Prompt
	 * @return
	 */
	protected IOpResponse showEnterCheckNumber() {
		      LOG.debug("entering showEnterCheckNumber");
		       this.setOpState(this.POST_CHECKNUM_PROMPT);
		       return this.HELPER.getPromptResponse(this.getDefaultPromptKey(), new IFormattable[]{IFormattable.EMPTY});
		}

}
