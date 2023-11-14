package mto.xst.query.results;

import dtv.data2.access.AbstractQueryResult;
import dtv.data2.access.IObjectId;
/*
 *  <!--NewTillReport-->
 */
public class MtoTillSumaryCashierResult extends AbstractQueryResult {
	private static final long serialVersionUID = 1L;
	private String empFirst;
	private String empLast;
	private String Till;
	
	@Override
	protected IObjectId getObjectIdImpl() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmpFirst() {
		return empFirst;
	}
	public void setEmpFirst(String empFirst) {
		this.empFirst = empFirst;
	}
	public String getEmpLast() {
		return empLast;
	}
	public void setEmpLast(String empLast) {
		this.empLast = empLast;
	}
	public String getTill() {
		return Till;
	}
	public void setTill(String Till) {
		this.Till = Till;
	}
}
