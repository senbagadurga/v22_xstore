package mto.pos.tender.validation;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;

import dtv.i18n.IFormattable;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.framework.validation.AbstractValidationRule;
import dtv.pos.iframework.validation.IValidationResult;
import dtv.pos.iframework.validation.SimpleValidationResult;
import dtv.pos.register.type.LineItemType;
import dtv.pos.tender.validation.TenderAmountData;
import dtv.util.NumberUtils;
import dtv.xst.dao.ttr.ITenderLineItem;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;

public class MtoMaximumSplitTenderCheckRule extends AbstractValidationRule {
	private static final org.apache.logging.log4j.Logger logger_ = LogManager.getLogger(MtoMaximumSplitTenderCheckRule.class);

	@Inject
	private TransactionScope _transactionScope;

	private static final int MAXIMUM_ALLOWED_SPLIT_PAYMENT = 2;

	@Override
	public IValidationResult validate() {
		// TODO Auto-generated method stub

		if (getSplitCount() == MAXIMUM_ALLOWED_SPLIT_PAYMENT) {

			if (isCurrentTenderPrepaid() && isInvalidPrepaidBalance()) {

				if (isBalanceNotCovered()) {
					return reportError();
				}

			}
			if (isInvalidEnteredAmount() && !isCurrentTenderPrepaid()) {
				return reportError();
			}
		}
		return IValidationResult.SUCCESS;
	}

	/**
	 * Return Validation error with formatted message
	 * 
	 * @return
	 */
	protected IValidationResult reportError() {
		// IFormattable max = this.FF.getSimpleFormattable(maxSplitNum,
		// FormatterType.SIMPLE);
		IFormattable errorMessage = this.FF.getTranslatable("_validationMessageSplitTender");
		return SimpleValidationResult.getFailed(errorMessage);
	}

	/**
	 * Method to get the count of the split
	 * 
	 * @param tenderLineItemList, transaction tenderLineItem list from the current
	 *                            transaction scope
	 * @return count of all non-voided tender line items
	 */
	protected int getSplitCount() {
		List<ITenderLineItem> tenderLineItemList = this._transactionScope.getTransaction()
				.getLineItemsByTypeCode(LineItemType.TENDER.getName(), ITenderLineItem.class);
		int splitCounter = 0;
		for (ITenderLineItem tenderLineItem : tenderLineItemList) {
			if (!tenderLineItem.getVoid()) {
				splitCounter++;
			}
		}
		return splitCounter;

	}

	protected boolean isCurrentTenderPrepaid() {
		ITenderLineItem tenderLine = (ITenderLineItem) this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
		return tenderLine.getTenderId().equals("PREPAID_PAYMENT");
	}

	protected boolean isInvalidEnteredAmount() {
		TenderAmountData data = (TenderAmountData) getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
		return NumberUtils.isGreaterThan(data.getBalanceDue(), data.getEnteredAmount());
	}

	protected boolean isInvalidPrepaidBalance() {
		TenderAmountData data = (TenderAmountData) getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
		BigDecimal prePaidBalance = BigDecimal.ZERO;
		MtoOrderList orders = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		prePaidBalance = orders.getMtoAccountPrepaidBalance();
		logger_.error("isInvalidPrepaidBalance");
		return ((data.getEnteredAmount().compareTo(prePaidBalance) > 0));

	}

	protected boolean isBalanceNotCovered() {
		TenderAmountData data = (TenderAmountData) getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
		BigDecimal prePaidBalance = BigDecimal.ZERO;
		MtoOrderList orders = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		prePaidBalance = orders.getMtoAccountPrepaidBalance();
		logger_.error("isBalanceNotCovered");
		return data.getBalanceDue().compareTo(prePaidBalance) == 1;

	}
}