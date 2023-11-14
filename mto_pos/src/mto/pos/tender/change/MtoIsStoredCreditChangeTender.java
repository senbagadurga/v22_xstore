package mto.pos.tender.change;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.AbstractRunCondition;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.register.type.LineItemType;
import dtv.xst.dao.tnd.TenderStatus;
import dtv.xst.dao.ttr.ITenderLineItem;


public class MtoIsStoredCreditChangeTender extends AbstractRunCondition{
	
	private static final Logger logger_;
	
	@Inject
	protected TransactionScope _transactionScope;
	
	static {
		logger_ = LogManager.getLogger((Class) MtoIsStoredCreditChangeTender.class);
	}

	@Override
	protected boolean shouldRunImpl() {
		// TODO Auto-generated method stub
		List<ITenderLineItem> tenderLineItemList = this._transactionScope.getTransaction()
				.getLineItemsByTypeCode(LineItemType.TENDER.getName(), ITenderLineItem.class);
		ITenderLineItem lastTender = null;
		for (ITenderLineItem tenderLineItem : tenderLineItemList) {
			logger_.error(tenderLineItem.getTenderStatusCode()+"-"+tenderLineItem.getTenderId());
			if (!tenderLineItem.getVoid() && TenderStatus.TENDER.getName().equalsIgnoreCase(tenderLineItem.getTenderStatusCode())) {
				lastTender = tenderLineItem;
			}
		}
		
//		String tenderStatus = this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE).getTenderId();
//		if(tenderStatus.equalsIgnoreCase(TenderStatus.CHANGE.getName())){
//			ITenderLineItem changeTenderLineItem = this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
//			changeTenderLineItem.
//		}
		return(lastTender.getTenderId().equals("STORED_CREDIT")||lastTender.getTenderId().equals("CERTIFIED_FUND")||lastTender.getTenderId().equals("CHECK"));
		 
	}

}
