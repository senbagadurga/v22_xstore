package mto.tenderauth.cdserv;

import java.io.Serializable;

public class CDServMessage implements ICDServMessage {
	
	String messageType;
	
	Serializable messageData;
	
	public CDServMessage(String type,Serializable data) {
		
		this.messageType=type;
		this.messageData=data;
	}

	@Override
	public String getMessageType() {
		return this.messageType;
	}

	@Override
	public Serializable getMessageData() {
		return this.messageData;
	}

	@Override
	public void setMessageData(Serializable paramSerializable) {
		this.messageData = paramSerializable;
		
	}
	
	
}