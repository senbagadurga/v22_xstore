package mto.pos.tender.certifiedfund;
import java.math.BigDecimal;

import dtv.pos.common.ValueKeys;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.type.VoucherActivityCodeType;
import dtv.pos.tender.PromptTenderAmtOp;
import dtv.pos.tender.validation.TenderAmountData;
import dtv.util.NumberUtils;
import dtv.xst.cleandto.tnd.Tender;
import dtv.xst.cleandto.tnd.TenderOptions;
import dtv.xst.dao.ttr.ITenderLineItem;
import dtv.xst.dao.ttr.IVoucher;
import dtv.xst.dao.ttr.IVoucherTenderLineItem;
import mto.pos.common.MtoValueKeys;

/**
 * US#89134 Tender Type Certified Funds
 * @author kameswari.srishtu
 *
 */
public class MtoPromptCertifiedFundTenderAmtOp extends PromptTenderAmtOp {
	@Override
	public String getDefaultPromptKey() {
		return "ENTER_VOUCHER_AMOUNT";
	}
	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		IOpResponse response = super.handlePromptResponse(argEvent);
		IVoucher voucher = (IVoucher) this.getScopedValue(ValueKeys.CURRENT_VOUCHER);
		String voucherNumber = getScopedValue(MtoValueKeys.MTO_ENTERED_SERIAL_NUMBER);
		ITenderLineItem tenderLine = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		VoucherActivityCodeType activityCode = (VoucherActivityCodeType) this
				.getScopedValue(ValueKeys.SELECTED_VOUCHER_ACTIVITY);
		if(voucher !=null) {
		
		BigDecimal unspentBalance = NumberUtils.nonNull(voucher.getUnspentBalanceAmount())
				.add(tenderLine.getAmount().negate());
		unspentBalance = NumberUtils.isNegative(unspentBalance) ? BigDecimal.ZERO : unspentBalance;
		voucher.setUnspentBalanceAmount(unspentBalance);
		if (activityCode.equals(VoucherActivityCodeType.ISSUED)) {
			if (tenderLine instanceof IVoucherTenderLineItem) {
				((IVoucherTenderLineItem) tenderLine).setFaceValueAmount(unspentBalance);
			}

			voucher.setFaceValueAmount(tenderLine.getAmount());
		}
		}
		if (tenderLine instanceof IVoucherTenderLineItem) {
			((IVoucherTenderLineItem) tenderLine).setFaceValueAmount(tenderLine.getAmount());
			((IVoucherTenderLineItem) tenderLine).setTraceNumber(voucherNumber);
			((IVoucherTenderLineItem) tenderLine).setVoucherTypeCode(tenderLine.getTenderId());		
		
		}
		return response;
	}
	@Override
	public boolean isOperationApplicable() {
		ITenderLineItem tenderLine = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		TenderAmountData amountData = (TenderAmountData) this.getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
		if (amountData != null && amountData.getEnteredAmount() != null) {
			return false;
		} else {
			Tender tender = this._tenderHelper.getTenderByLine(tenderLine, (long) this._stationState.getWorkstationId(),
					"");
			return ((TenderOptions) tender.getTenderOptions().get(0)).getAuthRequired()
					|| super.isOperationApplicable();
		}
	}
	
	
    
}