package mto.xst.query.results;

import java.math.BigDecimal;
import dtv.data2.access.AbstractQueryResult;
import dtv.data2.access.IObjectId;
/**
 * US#90370 Void Orders
 * @author afreenfathima.m
 *
 */
public class MtoVoidOrdertTenderListResult extends AbstractQueryResult {
	private static final long serialVersionUID = 1L;
	private String _status;
	private String _tender;
	private BigDecimal _amount;
	private String _num;
	private long _seq;

	@Override
	protected IObjectId getObjectIdImpl() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTender() {
		return _tender;
	}

	public void setTender(String _tender) {
		this._tender = _tender;
	}

	public BigDecimal getAmount() {
		return _amount;
	}

	public void setAmount(BigDecimal _amount) {
		this._amount = _amount;
	}

	public String getNum() {
		return _num;
	}

	public void setNum(String num) {
		this._num = num;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String _status) {
		this._status = _status;
	}

	public long geSeq() {
		return _seq;
	}

	public void seSeq(long _seq) {
		this._seq = _seq;
	}
	
}
