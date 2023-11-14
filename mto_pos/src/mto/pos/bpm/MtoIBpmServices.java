package mto.pos.bpm;

import dtv.service.IService;
import mto.pos.bpm.impl.MtoBpmRequest;

public interface MtoIBpmServices extends IService{
	
	public MtoIBpmResponse sendCreditDebitDetailsToBpm(MtoBpmRequest request);
}
