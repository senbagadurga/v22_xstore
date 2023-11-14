package mto.xst.query.results;

import dtv.data2.access.AbstractQueryResult;
import dtv.data2.access.IObjectId;

public class MtoTillSumaryValidationResult extends AbstractQueryResult {
	private static final long serialVersionUID = 1L;
	private long _status;


	public long getStatus() {
		return _status;
	}
	public void setStatus(long argStatus) {
		this._status = argStatus;
	}	
	@Override
	protected IObjectId getObjectIdImpl() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
