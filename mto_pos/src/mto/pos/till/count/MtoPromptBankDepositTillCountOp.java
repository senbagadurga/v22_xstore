package mto.pos.till.count;

import dtv.pos.common.ValueKeys;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.till.count.CountSummaryItem;
import dtv.pos.till.count.PromptBankDepositTillCountOp;
import dtv.i18n.IFormattable;
import dtv.pos.common.SysConfigAccessor;
import dtv.pos.framework.op.OpState;
import dtv.pos.iframework.op.IOpState;
import dtv.util.NumberUtils;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

public class MtoPromptBankDepositTillCountOp extends PromptBankDepositTillCountOp {
	@Inject
	private SysConfigAccessor _sysConfig;
	private final IOpState _postRecountState = new OpState("_postRecountState");
@Override
protected String getTillOutOfBalancePromptKey() {
	
	return "OUT_OF_BALANCE_STORE";
}

@Override
public IOpResponse handlePromptResponse(IXstEvent argEvent) {
	   this.setScopedValue(ValueKeys.CURRENT_TILL_COUNT_ITEMS, this.getCountSummaryList());
	   this.setScopedValue(ValueKeys.DISCREPANCY_LESS_THAN_THRESHOLD, true);

	   if (!this.displayBalanceStatusMessage()) {
	      this.createTenderControlTransaction();
	      return this.HELPER.completeResponse();


	   } else {
	      StringBuffer message = new StringBuffer();
	      boolean tillBalanced = true;
	      boolean forceRecount = false;
	      List<CountSummaryItem> countSummaryItems = this._model.getCountSummaryList();

	      if (countSummaryItems != null && !countSummaryItems.isEmpty()) {            Iterator var6;            CountSummaryItem item;
	         if (this._sysConfig.getRecountCloseCountDiscrepancyOverThreshold()) {
	            var6 = countSummaryItems.iterator();               while(var6.hasNext()) {                  item = (CountSummaryItem)var6.next();
	               if (item.getDifferenceAmount(true).abs().compareTo(item.getCloseCountThresholdAmt()) > 0) {
	                  tillBalanced = false;
	                  forceRecount = true;
	                  if (message.length() != 0) {
	                     message.append(", ");
	                  }
	                  message.append(item.getDescription());
	               }               }

	            if (!forceRecount) {
	               var6 = countSummaryItems.iterator();                  while(var6.hasNext()) {                     item = (CountSummaryItem)var6.next();
	                  if (!NumberUtils.isZero(item.getDifferenceAmount(true))) {
	                     tillBalanced = false;
	                     if (message.length() != 0) {
	                        message.append(", ");
	                     }
	                     message.append(item.getDescription());

	                  }
	               }
	            }
	         } else {
	            var6 = countSummaryItems.iterator();               while(var6.hasNext()) {                  item = (CountSummaryItem)var6.next();
	               if (!NumberUtils.isZero(item.getDifferenceAmount())) {
	                  if (item.getDifferenceAmount().abs().compareTo(item.getCloseCountThresholdAmt()) > 0) {
	                     this.setScopedValue(ValueKeys.DISCREPANCY_LESS_THAN_THRESHOLD, false);
	                  }
	                  tillBalanced = false;
	                  if (message.length() != 0) {
	                     message.append(", ");
	                  }
	                  message.append(item.getDescription());
	               }
	            }
	         }
	      }

	      if (tillBalanced) {
	         this.createTenderControlTransaction();
	         IFormattable tillNameArg = this._formattables.getLiteral(this._model.getTillName());
	         return this.HELPER.getCompletePromptResponse("BALANCED_STORE_COUNT", new IFormattable[]{tillNameArg});

	      } else if (message.length() > 0) {            IFormattable[] args;
	         if (this._sysConfig.getRecountCloseCountDiscrepancyOverThreshold() && forceRecount) {

	            this.setOpState(this._postRecountState);
	            args = new IFormattable[]{IFormattable.EMPTY};
	            args[0] = this._formattables.getLiteral(message.toString());
	            return this.HELPER.getPromptResponse("OUT_OF_BALANCE_TILL_RECOUNT", args);


	         } else {
	            this.setOpState(this.POST_STATUS_PROMPT);
	            args = new IFormattable[]{IFormattable.EMPTY};
	            args[0] = this._formattables.getLiteral(message.toString());
	            return this.HELPER.getPromptResponse(this.getTillOutOfBalancePromptKey(), args);

	         }
	      } else {
	         this.createTenderControlTransaction();
	         return this.HELPER.completeResponse();
	      }
	   }
	}
}
