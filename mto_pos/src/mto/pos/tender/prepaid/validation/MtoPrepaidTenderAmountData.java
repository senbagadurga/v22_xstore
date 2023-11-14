package mto.pos.tender.prepaid.validation;

import java.math.BigDecimal;

import dtv.pos.iframework.validation.ValidationData;
import dtv.util.NumberUtils;


/**
 * @author Nishanthi_Babu
 * US# 89135 Prepaid Tender type8
 * To Maintain Prepaid balance while performing the transaction
 */
public class MtoPrepaidTenderAmountData extends ValidationData{
	private final BigDecimal _enteredAmount;
	private final BigDecimal tenderedAmount_;
	private final BigDecimal balanceDue_;
	private final BigDecimal prePaidBalance_;
	private final BigDecimal newTenderTotal_;
	private BigDecimal amountRounded_;

	public MtoPrepaidTenderAmountData(BigDecimal enteredAmount, BigDecimal tenderedAmount, BigDecimal balanceDue, BigDecimal prePaidBalance) {
		super(enteredAmount);
		BigDecimal enteredAmt = NumberUtils.nonNull(enteredAmount);
		this._enteredAmount = enteredAmount;
		this.newTenderTotal_ = prePaidBalance.subtract(enteredAmount.abs());
		this.tenderedAmount_ = tenderedAmount;
		this.balanceDue_ = balanceDue;
		this.prePaidBalance_ = prePaidBalance;
		this.amountRounded_ = BigDecimal.ZERO;
	}

	public BigDecimal getPrePaidBalance_() {
		return prePaidBalance_;
	}
	public MtoPrepaidTenderAmountData(BigDecimal enteredAmount, BigDecimal tenderedAmount, BigDecimal balanceDue, BigDecimal prePaidBalance,BigDecimal amountRounded) {
		this(enteredAmount, tenderedAmount, balanceDue,prePaidBalance);
		this.amountRounded_ = amountRounded;
	}
	public BigDecimal getAmountRounded() {
		return this.amountRounded_;
	}

	public BigDecimal getBalanceDue() {
		return this.balanceDue_;
	}

	public BigDecimal getEnteredAmount() {
		return this._enteredAmount;
	}

	public BigDecimal getNewTenderTotal() {
		return this.newTenderTotal_;
	} 

	public BigDecimal getTenderedAmount() {
		return this.tenderedAmount_;
	}

}
