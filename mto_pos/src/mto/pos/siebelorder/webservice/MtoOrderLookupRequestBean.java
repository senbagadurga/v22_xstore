package mto.pos.siebelorder.webservice;

import com.siebel.orpos.order.ORPOSQueryPageInput;

import dtv.service.req.IServiceRequest;

public class MtoOrderLookupRequestBean implements IServiceRequest {

	ORPOSQueryPageInput requestObject;
	
	public MtoOrderLookupRequestBean(ORPOSQueryPageInput argRequestObject) 
	{
		super();
		requestObject = argRequestObject;
	}
	
	public ORPOSQueryPageInput getRequestObject() {
		return requestObject;
	}

	public void setRequestObject(ORPOSQueryPageInput requestObject) {
		this.requestObject = requestObject;
	}


}
