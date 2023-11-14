package mto.tenderauth.cdserv;

import java.io.Serializable;

public interface ICDServFormatter {
	
	Serializable formatConnectorMessage(ICDServMessage msg) throws MtoCDServMessageException;
	
	ICDServMessageResponse translateConnectorResponse(Serializable param) throws MtoCDServMessageException;
	

}
