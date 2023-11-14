package mto.pos.bpm;

import java.math.BigDecimal;

import dtv.service.req.IServiceRequest;

public interface MtoIBpmRequest extends IServiceRequest {
	
	public String getUserName();
	public void setUserName(String userName);
	public String getPassword();
	public void setPassword(String password);
	public String getCreated();
	public void setCreated(String created);
	public String getProcessorId();
	public void setProcessorId(String processorId);
	public String getSourceSystemName();
	public void setSourceSystemName(String sourceSystemName);
	public String getSourceTransactionDateTime();
	public void setSourceTransactionDateTime(String sourceTransactionDateTime);
	public String getSourceTransactionId();
	public void setSourceTransactionId(String sourceTransactionId);
	public String getUserId();
	public void setUserId(String userId);
	public BigDecimal getTransactionAmount();
	public void setTransactionAmount(BigDecimal transactionAmount);
	public String getAuthorizationCode();
	public void setAuthorizationCode(String authorizationCode);
	public String getAccountNumber();
	public void setAccountNumber(String accountNumber);
	public String getPaymentMethod();
	public void setPaymentMethod(String paymentMethod);
	public String getMerchantId();
	public void setMerchantId(String merchantId);
	public String getOrderNumber();
	public void setOrderNumber(String orderNumber);
	public String getTrsanctionId();
	public void setTrsanctionId(String trsanctionId);
	public String getTransactionType();
	public void setTransactionType(String transactionType);
	public String getTransactionDate();
	public void setTransactionDate(String transactionDate);
	public String getTransactionTime();
	public void setTransactionTime(String transactionTime);
	public String getPaymentType();
	public void setPaymentType(String paymentType);
	public int getTrnFallbackInd();
	public void setTrnFallbackInd(int trnFallbackInd);
	public String getTrnLpsCode();
	public void setTrnLpsCode(String trnLpsCode);
	public int getTraceNumber();
	public void setTraceNumber(int traceNumber);
}
