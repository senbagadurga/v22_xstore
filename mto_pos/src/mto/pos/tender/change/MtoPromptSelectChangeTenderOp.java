package mto.pos.tender.change;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dtv.pos.framework.op.AbstractListPromptOp;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.register.type.LineItemType;
import dtv.pos.tender.TenderHelper;
import dtv.pos.tender.change.PromptSelectChangeTenderOp;
import dtv.xst.cleandto.tnd.Tender;
import dtv.xst.dao.tnd.TenderStatus;
import dtv.xst.dao.trl.IRetailTransaction;
import dtv.xst.dao.ttr.ITenderLineItem;

public class MtoPromptSelectChangeTenderOp extends PromptSelectChangeTenderOp {

	private static final Logger logger_;
	@Inject
	private TenderHelper _tenderHelper;
	static {
		logger_ = LogManager.getLogger((Class<?>) MtoPromptSelectChangeTenderOp.class);
	}

	protected List<Tender> getChangeTenderIdChoices(final IRetailTransaction trans, final BigDecimal changeAmount) {
		final Set<Tender> changeTenders = new HashSet<Tender>();
		List<ITenderLineItem> tenderLineItemList = trans.getLineItems((Class<ITenderLineItem>) ITenderLineItem.class);
		ITenderLineItem lastTenderLineItem = null;
		for (ITenderLineItem tenderLineItem : tenderLineItemList) {
			if (!tenderLineItem.getVoid()
					&& TenderStatus.TENDER.getName().equalsIgnoreCase(tenderLineItem.getTenderStatusCode())) {
				lastTenderLineItem = tenderLineItem;
			}
		}
		if (null != lastTenderLineItem && !lastTenderLineItem.getTenderId().contains("CURRENCY")) {
			final Tender lastTender = this._tenderHelper.getTenderByLine(lastTenderLineItem,
					Long.valueOf((long) this._stationState.getWorkstationId()), (Object) "");
			final String changeTenderId = lastTender.getTenderOptions().get(0).getChangeTenderId();

			final Tender changeTender = this._tenderHelper.getTender(changeTenderId,
					Long.valueOf((long) this._stationState.getWorkstationId()), (Object) this);
			if (changeTender == null) {
				logger_.error(changeTenderId + " is not a valid tender");
			} else {
				changeTenders.add(changeTender);
			}

			final List<Tender> sortedChoices = new ArrayList<Tender>();
			sortedChoices.addAll(changeTenders);
			return sortedChoices;
		}

		return super.getChangeTenderIdChoices(trans, changeAmount);
	}

}
