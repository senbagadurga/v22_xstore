package mto.pos.tender.prepaid;

import java.math.BigDecimal;

import javax.inject.Inject;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.xst.dao.ttr.ITenderLineItem;
import mto.pos.common.MtoValueKeys;
import mto.pos.tender.prepaid.validation.MtoPrepaidTenderAmountData;

/**
 * @author Nishanthi_Babu 
 * US# 89135 Prepaid Tender type 
 * When Store User/Cashier void the Prepaid LineItem and 
 * Uses the same Prepaid tender type again,
 * Response balance has to maintain
 */
public class MtoVoidPrepaidBalanceTenderLineItemOp extends Operation {

	@Inject
	protected TransactionScope _transactionScope;
	@Override
	public IOpResponse handleOpExec(IXstEvent var1) {
		ITenderLineItem tenderLineItem = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		if (tenderLineItem.getTenderId().equalsIgnoreCase("PREPAID_PAYMENT") && tenderLineItem.getVoid()) {
			tenderLineItem.getAmount();
			BigDecimal prepaidAmt = _transactionScope.getValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT);
			_transactionScope.setValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT,
					prepaidAmt.add(tenderLineItem.getAmount()));
		}

		return this.HELPER.completeResponse();
	}

	@Override
	/* This Class needs to excute when 
	 * Prepaid Tender Type is used */
	public boolean isOperationApplicable() {
		ITenderLineItem tenderLineItem = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		if (tenderLineItem.getTenderId().equalsIgnoreCase("PREPAID_PAYMENT")) {
			return true;
		}
		return false;
	}
}
