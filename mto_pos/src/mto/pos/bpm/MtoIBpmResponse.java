package mto.pos.bpm;

import java.math.BigDecimal;

import dtv.service.req.IServiceResponse;

public interface MtoIBpmResponse extends IServiceResponse {

	public String getFaultcode();
	public void setFaultcode(String faultcode);
	public String getFaultstring();
	public void setFaultstring(String faultstring);
	public String getFault_description();
	public void setFault_description(String fault_description);
	public String getDetails();
	public void setDetails(String details);
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
