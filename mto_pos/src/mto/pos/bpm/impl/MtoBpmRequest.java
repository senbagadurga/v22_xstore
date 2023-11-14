package mto.pos.bpm.impl;

import java.math.BigDecimal;

import mto.pos.bpm.MtoIBpmRequest;

public class MtoBpmRequest implements MtoIBpmRequest {
	
	private String userName;
	private String password;
	private String created;
	private String processorId;
	private String sourceSystemName;
	private String sourceTransactionDateTime;
	private String sourceTransactionId;
	private String userId;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getProcessorId() {
		return processorId;
	}
	public void setProcessorId(String processorId) {
		this.processorId = processorId;
	}
	public String getSourceSystemName() {
		return sourceSystemName;
	}
	public void setSourceSystemName(String sourceSystemName) {
		this.sourceSystemName = sourceSystemName;
	}
	public String getSourceTransactionDateTime() {
		return sourceTransactionDateTime;
	}
	public void setSourceTransactionDateTime(String sourceTransactionDateTime) {
		this.sourceTransactionDateTime = sourceTransactionDateTime;
	}
	public String getSourceTransactionId() {
		return sourceTransactionId;
	}
	public void setSourceTransactionId(String sourceTransactionId) {
		this.sourceTransactionId = sourceTransactionId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
