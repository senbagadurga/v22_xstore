package mto.pos.bpm.impl;

import java.math.BigDecimal;

import mto.pos.bpm.MtoIBpmResponse;

public class MtoBpmResponse implements MtoIBpmResponse {
	
	private String faultcode;
	private String faultstring;
	private String fault_description;
	private String details;
	private BigDecimal transactionAmount;
	private String authorizationCode;
	private String accountNumber;
	private String paymentMethod;
	private String merchantId;
	private String orderNumber;
	private String trsanctionId;
	private String transactionType;
	private String transactionDate;
	private String transactionTime;
	private String paymentType;
	private int trnFallbackInd;
	private String trnLpsCode;
	private int traceNumber;
	public String getFaultcode() {
		return faultcode;
	}
	public void setFaultcode(String faultcode) {
		this.faultcode = faultcode;
	}
	public String getFaultstring() {
		return faultstring;
	}
	public void setFaultstring(String faultstring) {
		this.faultstring = faultstring;
	}
	public String getFault_description() {
		return fault_description;
	}
	public void setFault_description(String fault_description) {
		this.fault_description = fault_description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getTrsanctionId() {
		return trsanctionId;
	}
	public void setTrsanctionId(String trsanctionId) {
		this.trsanctionId = trsanctionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getTrnFallbackInd() {
		return trnFallbackInd;
	}
	public void setTrnFallbackInd(int trnFallbackInd) {
		this.trnFallbackInd = trnFallbackInd;
	}
	public String getTrnLpsCode() {
		return trnLpsCode;
	}
	public void setTrnLpsCode(String trnLpsCode) {
		this.trnLpsCode = trnLpsCode;
	}
	public int getTraceNumber() {
		return traceNumber;
	}
	public void setTraceNumber(int traceNumber) {
		this.traceNumber = traceNumber;
	}

}
