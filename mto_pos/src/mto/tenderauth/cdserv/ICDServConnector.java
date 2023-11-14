package mto.tenderauth.cdserv;

import java.io.Serializable;

public interface ICDServConnector {
	
	  Serializable sendMessage(Serializable paramSerializable) throws MtoCDServMessageException;
}