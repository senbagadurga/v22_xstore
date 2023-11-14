package mto.tenderauth.cdserv;

import java.io.Serializable;

public interface ICDServMessage extends Serializable {
	
	String getMessageType();
	
	Serializable getMessageData();
	
	void setMessageData(Serializable paramSerializable);

}
