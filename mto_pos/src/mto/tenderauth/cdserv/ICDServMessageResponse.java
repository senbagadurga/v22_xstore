package mto.tenderauth.cdserv;

import java.io.Serializable;

public interface ICDServMessageResponse extends Serializable {
	
	public Serializable getResponse();
	
	public void setResponse(Serializable arg);
	
	public enum ResponseCode {
		
		Active,AlreadyActive,Approved,ApprovedFloorLimit,ApprovedNotEcheck,ApprovedReferral,ApprovedSpiltTender,ApprovedZeroAmount,CallCenter,CardNumError,
		CheckVelocity,ConfigurationError,Deactive,Declined,DeviceTimeout,Duplicate,ErrorOnEntry,Expended,Expired,Offline,Timeout,FormatError,MissingMandatoryData,
		UnsupportedType,UnsupportedVersion,InvalidData,TerminalBusy,InValidOthers,TransactionNotCompletedOthers,RequiredAdditionalInputInvlid,
		TransactionNotAccepted,TransactionReversed,TransactionReversedMAC,RequestRejected,
		RequiredAdditionalInput,TransactionNotCompleted;
	}
	
	public enum TenderType{
		
		CREDIT,DEBIT,INSTANT_CREDIT;
	}
	
	public enum ConnectionStatus{
		
		CONNECTOR_CLOSE_PENDING,CONNECTOR_CLOSED,CONNECTOR_OPEN,CONNECTOR_ERROR;
	}
	
	
	
}
