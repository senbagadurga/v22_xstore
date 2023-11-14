package mto.pos.hardware.op;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dtv.hardware.IHardwareMgr;
import dtv.pos.common.TransactionHelper;
import dtv.pos.hardware.op.DisplayChangeDueOp;
import dtv.pos.register.type.LineItemType;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.ttr.ITenderLineItem;

public class MtoDisplayChangeDueOp extends DisplayChangeDueOp {
	private static final String CURRENCY = "CURRENCY";
	private static final String TENDER_STATUS = "Tender";
	@Inject
	private IHardwareMgr _hardwareMgr;

	public String getDefaultPromptKey() {
		final IPosTransaction trans = this._transactionScope.getTransaction();

		final BigDecimal change = (BigDecimal) TransactionHelper.getChangeDue(trans);
		if (change != null && !isCashChangeDueApplicable()) {
			return "CHANGE_DUE_NON_CASH_TENDER";
		}
		return super.getDefaultPromptKey();
	}

	protected Boolean isCashChangeDueApplicable() {
		List<ITenderLineItem> tenderLineItemList = this._transactionScope.getTransaction()
				.getLineItemsByTypeCode(LineItemType.TENDER.getName(), ITenderLineItem.class);
		ITenderLineItem lastTender = null;
		for (ITenderLineItem tenderLineItem : tenderLineItemList) {
			if (!tenderLineItem.getVoid() && TENDER_STATUS.equalsIgnoreCase(tenderLineItem.getTenderStatusCode())) {
				lastTender = tenderLineItem;
			}
		}
		return lastTender.getTenderId().contains(CURRENCY);
	}
}
