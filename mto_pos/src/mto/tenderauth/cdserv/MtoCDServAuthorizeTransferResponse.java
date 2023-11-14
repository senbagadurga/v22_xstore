package mto.tenderauth.cdserv;

import java.io.Serializable;

public class MtoCDServAuthorizeTransferResponse implements ICDServMessageResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cardNumber;
	private String dataEntry;
	private String mtoResponsecode;

	private String bankValueDate;
	private String cardExpiryYY;
	private String cardExpiryMM;
	private String pospadId;
	private String cardType;
	private String trnLpsCode;
	private String trnFallbackInd;
	private String trnCardType;
	private String rspCode;
	private String rspResponseCode;
	private String adminResponse;
	private String voidResponse;
	private String maskedAccountNumber;
	private String referenceCode;
	private String authorizationCode;
	private String authorizationResponseCode;
	private ResponseCode responseCode;
	private Serializable response;
	private TenderType tenderType;
	private String traceNumber;
	
	
	public MtoCDServAuthorizeTransferResponse() {
		
	}
	
	public String getVoidResponse() {
		return voidResponse;
	}

	public void setVoidResponse(String voidResponse) {
		this.voidResponse = voidResponse;
	}

	public String getAdminResponse() 
	{
		return adminResponse;
	}

	public void setAdminResponse(String adminResponse) {
		this.adminResponse = adminResponse;
	}
	
	public String getRspResponseCode() {
		return rspResponseCode;
	}

	public void setRspResponseCode(String rspResponseCode) {
		this.rspResponseCode = rspResponseCode;
	}

	public String getRspCode() {
		return rspCode;
	}

	public void setRspCode(String rspCode) {
		this.rspCode = rspCode;
	}
	
	
	public String getTrnLpsCode() {
		return trnLpsCode;
	}

	public void setTrnLpsCode(String trnLpsCode) {
		this.trnLpsCode = trnLpsCode;
	}

	public String getTrnFallbackInd() {
		return trnFallbackInd;
	}

	public void setTrnFallbackInd(String trnFallbackInd) {
		this.trnFallbackInd = trnFallbackInd;
	}

	public String getTrnCardType() {
		return trnCardType;
	}

	public void setTrnCardType(String trnCardType) {
		this.trnCardType = trnCardType;
	}



	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	public String getMtoResponsecode() {
		return mtoResponsecode;
	}

	public void setMtoResponsecode(String mtoResponsecode) {
		this.mtoResponsecode = mtoResponsecode;
	}

	public String getDataEntry() {
		return dataEntry;
	}

	public void setDataEntry(String dataEntry) {
		this.dataEntry = dataEntry;
	}

	public String getBankValueDate() {
		return bankValueDate;
	}

	public void setBankValueDate(String String) {
		this.bankValueDate = String;
	}

	public String getCardExpiryYY() {
		return cardExpiryYY;
	}

	public void setCardExpiryYY(String cardExpiryYY) {
		this.cardExpiryYY = cardExpiryYY;
	}

	public String getCardExpiryMM() {
		return cardExpiryMM;
	}

	public void setCardExpiryMM(String cardExpiryMM) {
		this.cardExpiryMM = cardExpiryMM;
	}

	public String getPospadId() {
		return pospadId;
	}

	public void setPospadId(String pospadId) {
		this.pospadId = pospadId;
	}


	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public Serializable getResponse() {
		return response;
	}

	@Override
	public void setResponse(Serializable arg) {
		this.response = arg;
		
		
	}

	public String getMaskedAccountNumber() {
		return maskedAccountNumber;
	}

	public void setMaskedAccountNumber(String maskedAccountNumber) {
		this.maskedAccountNumber = maskedAccountNumber;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getAuthorizationResponseCode() {
		return authorizationResponseCode;
	}

	public void setAuthorizationResponseCode(String authorizationResponseCode) {
		this.authorizationResponseCode = authorizationResponseCode;
	}

	public ResponseCode getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}

	public TenderType getTenderType() {
		return tenderType;
	}

	public void setTenderType(TenderType tenderType) {
		this.tenderType = tenderType;
	}

	public String getTraceNumber() {
		return traceNumber;
	}

	public void setTraceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
	}
	
	
	
	
}
