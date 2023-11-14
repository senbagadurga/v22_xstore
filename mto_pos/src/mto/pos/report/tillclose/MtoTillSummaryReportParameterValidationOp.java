package mto.pos.report.tillclose;

import dtv.pos.common.OpChainKey;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.form.FormConstants;
import dtv.pos.framework.reporting.ReportInfo;
import dtv.pos.iframework.action.IXstActionKey;
import dtv.pos.iframework.action.IXstDataAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IOpState;
import dtv.pos.reporting.PromptReportParametersOp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*
 *  <!--NewTillReport-->
 */
public  class MtoTillSummaryReportParameterValidationOp extends PromptReportParametersOp {	
	private OpChainKey displayOpChain_ = OpChainKey.valueOf("REPORT_FILL_AND_DISPLAY");
	private OpChainKey saveOpChain_ = OpChainKey.valueOf("REPORT_SAVE");
	private OpChainKey printOpChain_ = OpChainKey.valueOf("REPORT_FILL_AND_PRINT");
	private static final Logger _logger = LogManager.getLogger(MtoTillSummaryReportParameterValidationOp.class);
	
	@Override
	protected IOpResponse handleFormResponse(IXstEvent argEvent) {
	    if (argEvent instanceof IXstDataAction) {
	       IXstDataAction action = (IXstDataAction)argEvent;
	       IXstActionKey key = action.getActionKey();
	       OpChainKey chainKey;
	       boolean complete;	      
	       if (key == XstDataActionKey.ACCEPT) {	    	  
	          chainKey = this.displayOpChain_;
	          complete = false;	          
	       } else if (key == FormConstants.SAVE) {
	          chainKey = this.saveOpChain_;
	          complete = true;
	       } else {
	          if (key != PRINT) {            }
	          chainKey = this.printOpChain_;
	          complete = true;
	          _logger.warn(key);
	        
	       }
	       IOpResponse response = null;
	       ReportInfo reportInfo = (ReportInfo)this.getScopedValue(ValueKeys.REPORT_INFO);	       	       
	          this.populateReportInfo(reportInfo, argEvent);
	          this.setOpState((IOpState)null);
	          response = complete ? this.HELPER.getCompleteStackChainResponse(chainKey) : this.HELPER.getWaitStackChainResponse(chainKey);	       	       
	       return response;
	    	} else {
	       _logger.warn(argEvent);
	       return this.HELPER.waitResponse();
	    }
	 }			
}