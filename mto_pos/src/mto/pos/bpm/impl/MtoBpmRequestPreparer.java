package mto.pos.bpm.impl;

import dtv.servicex.impl.AbstractPreparer;
import dtv.xst.dao.ttr.ICreditDebitTenderLineItem;

public class MtoBpmRequestPreparer extends AbstractPreparer {

	private ICreditDebitTenderLineItem creditTender;
	
	private MtoBpmRequestTypeWrapper requestObj;
	@Override
	public Object getPreparedObject() {
		return creditTender;
	}

	@Override
	public Object getTargetObject() {
		return requestObj;
	}

	@Override
	public void prepare(Object arg0) {
		

	}

}
