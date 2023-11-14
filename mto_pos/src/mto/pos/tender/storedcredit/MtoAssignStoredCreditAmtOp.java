package mto.pos.tender.storedcredit;

import java.math.BigDecimal;

import javax.inject.Inject;

import dtv.event.eventor.DefaultEventor;
import dtv.hardware.custdisplay.IDtvCustDisplayDevice;
import dtv.pos.common.CommonHelper;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.tender.TenderHelper;
import dtv.pos.tender.validation.TenderAmountData;
import dtv.xst.dao.tnd.TenderStatus;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.ttr.ITenderLineItem;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;

/**
 * US#89136 Tender Type StoredCredit
 * @author kameswari.srishtu
 *
 */
public class MtoAssignStoredCreditAmtOp extends Operation {
	
	 @Inject
	 protected TenderHelper _tenderHelper;
	 @Inject
	 private CommonHelper _commonHelper;
	 @Inject
	 protected TransactionScope _transactionScope;
   @Override
   public IOpResponse handleOpExec(IXstEvent var1) {
	   
	   (new DefaultEventor(IDtvCustDisplayDevice.TENDER_CANCELLED_EVENT_DESCRIPTOR)).post(IDtvCustDisplayDevice.TENDER_CANCELLED_EVENT);
	   
	     ITenderLineItem tenderLine = (ITenderLineItem)this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
	     MtoOrderList selectedOrder = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
	     IPosTransaction txn = _transactionScope.getTransaction();
	     TenderAmountData amountData = null;
	    if(amountData == null) {

			BigDecimal enteredAmount =  _commonHelper.roundCurrency(selectedOrder.getMtoAccountSCBalance());
			BigDecimal tenderedAmt = this._tenderHelper.getTotalForTender(this._tenderHelper.getTenderByLine(tenderLine, (long)this._stationState.getWorkstationId(), ""), txn);

			amountData = new TenderAmountData(enteredAmount, tenderedAmt, txn.getAmountDue());
			setScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA,amountData);

	    }
	    BigDecimal tenderAmount = amountData.getEnteredAmount();
		tenderAmount = this._commonHelper.roundCurrency(tenderAmount);
   
	          if (tenderLine.getTenderStatusCode().equalsIgnoreCase(TenderStatus.TENDER.getName())) {
	             tenderLine.setAmount(tenderAmount);
	             clearScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
	    
	             } else {
	             tenderLine.setAmount(tenderAmount.negate());
	          }
	      return HELPER.completeResponse();

   }



}