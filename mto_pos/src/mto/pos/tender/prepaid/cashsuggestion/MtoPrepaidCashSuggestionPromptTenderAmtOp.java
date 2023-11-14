package mto.pos.tender.prepaid.cashsuggestion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import javax.inject.Inject;

import dtv.event.eventor.DefaultEventor;
import dtv.hardware.custdisplay.IDtvCustDisplayDevice;
import dtv.i18n.FormatterFactory;
import dtv.i18n.FormatterType;
import dtv.i18n.IFormattable;
import dtv.i18n.OutputContextType;
import dtv.pos.common.CommonHelper;
import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.action.IXstActionFactory;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.framework.ui.prompt.IPrompt;
import dtv.pos.framework.ui.prompt.IPromptFactory;
import dtv.pos.framework.ui.prompt.PromptOverrideProperties;
import dtv.pos.iframework.action.IXstAction;
import dtv.pos.iframework.action.IXstDataActionKey;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.tender.PromptTenderAmtOp;

import dtv.pos.tender.validation.TenderAmountData;
import dtv.util.Money;
import dtv.xst.cleandto.tnd.Tender;
import dtv.xst.dao.tnd.TenderStatus;
import dtv.xst.dao.trn.IPosTransaction;
import dtv.xst.dao.ttr.ITenderLineItem;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import mto.pos.tender.prepaid.validation.MtoPrepaidTenderAmountData;

/**
 * 
 * @author Nishanthi_Babu 
 * US# 89135 Prepaid Tender type
 * 
 */
public class MtoPrepaidCashSuggestionPromptTenderAmtOp extends PromptTenderAmtOp {

	@Inject
	private IPromptFactory _promptFactory;
	@Inject
	private FormatterFactory _formatter;
	@Inject
	private IXstActionFactory _actionFactory;
	@Inject
	private CommonHelper _commonHelper;
	@Inject
	protected TransactionScope _transactionScope;
	private boolean initButtons_ = false;

	@Override
	public String getDefaultPromptKey() {
		return "ENTER_PREPAID_TENDER_AMOUNT";
	}
	
	@Override
	protected PromptOverrideProperties createPromptOverrides() {
		PromptOverrideProperties overrides = super.createPromptOverrides();
		ITenderLineItem tenderLine = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		Tender tender = this._tenderHelper.getTenderByLine(tenderLine, (long) this._stationState.getWorkstationId(),
				"");
		Currency currency = Currency.getInstance(this._tenderHelper.getCurrencyId(tender));

		BigDecimal prePaidBalance = BigDecimal.ZERO;
		MtoOrderList orders = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		prePaidBalance = orders.getMtoAccountPrepaidBalance();
	    BigDecimal prepaidAmt = _transactionScope.getValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT);
		prepaidAmt = prepaidAmt.setScale(currency.getDefaultFractionDigits(),
				ConfigurationMgr.getLocalCurrencyRoundingMode());
		ConfigurationMgr.getLocalCurrencyId();
		if (!this.initButtons_) {

			this.initButtons_ = true;
			IPrompt prompt = this._promptFactory.getPrompt(this.getPromptKey());

			List<IXstAction> actions = new ArrayList<IXstAction>(prompt.getActions());
			List<IXstAction> cashSuggestions = setupCashButtons(prepaidAmt, tender);
			actions.addAll(cashSuggestions);
			overrides.setActionOverrides(actions);

		}

		return overrides;
	}
	@Override
	protected IOpResponse handleInitialState(IXstEvent argEvent) {
		this.initButtons_ = false;
		return super.handleInitialState(argEvent);
	}

	/*
	 * To Show the StoreUser or Cashier the Prepaid Response Balance amount
	 */
	public List<IXstAction> setupCashButtons(BigDecimal argMaxAllowed, Tender argTender) {
		
		List<IXstAction> actionList = new ArrayList<IXstAction>();
		Money moneyOption = new Money(argMaxAllowed, this.getCurrencyForTender(argTender));
	
		String actionText = this._formatter.getMoneyFormatter().format(moneyOption, OutputContextType.VIEW);
		XstDataActionKey.ACCEPT.toString();
		IXstDataActionKey actionKey = XstDataActionKey.valueOf(XstDataActionKey.ACCEPT.toString());
		IXstAction action = this._actionFactory.getDataAction(actionKey);
		action.setVisible(true);

		action.setData(argMaxAllowed);
		action.setDataIsFinal(true);
		action.setActionNameKey(actionText);

		actionList.add(action);

		return actionList;
	}

	protected Currency getCurrencyForTender(Tender argTender) {
		return Currency.getInstance(argTender.getCurrencyId());
	}

	@Override
	protected IFormattable[] getPromptArgs(IXstEvent argEvent) {
		BigDecimal prePaidBalance = _transactionScope.getValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT);
		IFormattable prePaiddamt = this._formattables.getSimpleFormattable(prePaidBalance, FormatterType.MONEY);
		return new IFormattable[] { prePaiddamt };
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		(new DefaultEventor(IDtvCustDisplayDevice.TENDER_CANCELLED_EVENT_DESCRIPTOR))
				.post(IDtvCustDisplayDevice.TENDER_CANCELLED_EVENT);
		TenderAmountData amountData1 = this.getTenderAmountData(argEvent);
		MtoPrepaidTenderAmountData amt = this.getTenderPrepaidAmountData(argEvent);
		this.setScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA, amountData1);
		this.setScopedValue(MtoValueKeys.CURRENT_PREPAID_AMOUNT_DATA, amt);
		BigDecimal newPrepaidBalance = amt.getNewTenderTotal();
		BigDecimal prepaidAmt = BigDecimal.ZERO;

		if (newPrepaidBalance.compareTo(BigDecimal.ZERO) == -1) {

			_transactionScope.setValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT, prepaidAmt);
		} else {
			_transactionScope.setValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT, newPrepaidBalance);
		}

		ITenderLineItem tenderLine = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		TenderAmountData amountData = (TenderAmountData) this.getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
		MtoPrepaidTenderAmountData value = (MtoPrepaidTenderAmountData) this
				.getScopedValue(MtoValueKeys.CURRENT_PREPAID_AMOUNT_DATA);
		BigDecimal tenderAmount = amountData.getEnteredAmount();
		tenderAmount = this._commonHelper.roundCurrency(tenderAmount);

		if (tenderLine.getTenderStatusCode().equalsIgnoreCase(TenderStatus.TENDER.getName())) {
			if (value.getNewTenderTotal().compareTo(BigDecimal.ZERO) == -1) {
				tenderAmount.subtract(value.getNewTenderTotal().abs());
				tenderLine.setAmount(tenderAmount.subtract(value.getNewTenderTotal().abs()));
			} else {
				tenderLine.setAmount(tenderAmount);
			}
			if (this._tenderHelper.isForeignTender(
					this._tenderHelper.getTenderByLine(tenderLine, (long) this._stationState.getWorkstationId(), ""))) {
				this.setForeignTenderValues(argEvent, tenderLine);
			}
		} else {
			tenderLine.setAmount(tenderAmount.negate());
		}

		return this.HELPER.completeResponse();
	}
//
//	@Override
//	protected IOpResponse handlePromptEvent(IXstEvent argEvent) {
//		TenderAmountData amountData = this.getTenderAmountData(argEvent);
//		MtoPrepaidTenderAmountData amt = this.getTenderPrepaidAmountData(argEvent);
//		this.setScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA, amountData);
//		this.setScopedValue(MtoValueKeys.CURRENT_PREPAID_AMOUNT_DATA, amt);
//		BigDecimal newPrepaidBalance = amt.getNewTenderTotal();
//		BigDecimal prepaidAmt = BigDecimal.ZERO;
//
//		if (newPrepaidBalance.compareTo(BigDecimal.ZERO) == -1) {
//
//			_transactionScope.setValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT, prepaidAmt);
//		} else {
//			_transactionScope.setValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT, newPrepaidBalance);
//		}
//
//		return super.handlePromptEvent(argEvent);
//	}

	/*
	 * To Maintain Proper Balance Amount throughout our transaction object the
	 * Pre-paid Response Balance amount
	 */
	protected MtoPrepaidTenderAmountData getTenderPrepaidAmountData(IXstEvent argEvent) {
		ITenderLineItem tenderLine = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		IPosTransaction transaction = this._transactionScope.getTransaction();

		BigDecimal enteredAmount = this.getTenderAmount(argEvent);
		BigDecimal tenderedAmt = this._tenderHelper.getTotalForTender(
				this._tenderHelper.getTenderByLine(tenderLine, (long) this._stationState.getWorkstationId(), ""),
				transaction);
		BigDecimal prepaidAmt = _transactionScope.getValue(MtoValueKeys.PREPAID_ORIGINAL_AMOUNT);
		BigDecimal amountDue = this.getAmountDue(transaction);
		MtoPrepaidTenderAmountData amountData = new MtoPrepaidTenderAmountData(enteredAmount, tenderedAmt, amountDue,
				prepaidAmt);

		return amountData;
	}
}
