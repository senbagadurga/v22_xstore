package mto.xst.query.results;

import java.math.BigDecimal;
import java.util.Date;

import dtv.data2.access.AbstractQueryResult;
import dtv.data2.access.IObjectId;
import dtv.i18n.FormatterFactory;
import dtv.i18n.IFormatter;
import dtv.i18n.OutputContextType;
import dtv.util.CalendarField;
import dtv.util.DateUtils;
import dtv.util.StringUtils;
import dtv.xst.dao.tsn.SessionId;

/**
 * @author Nishanthi_Babu
 * User story 92929 Reconcile Till
 */
public class MtoAllTillStatusResult extends AbstractQueryResult {
	private static final long serialVersionUID = 1L;
	private long _organizationId;
	private long _sessionId;
	private long _wkstnId;
	private String _statCode;
	private String _cashDrawerId;
	private String _cashDrawerDescription;
	private Date _beginDatetimestamp;
	private Date _endDatetimestamp;
	private BigDecimal _declaredAmount;
	private BigDecimal _overShort;
	private String _flag;
	private String _employee;
	private String Employee_Lastname;
	private String _tillId;
	private String _status;
	private BigDecimal _systemAmount;
	
	
	/* Start Reconcile Till - UI Changes -100042 */
	public BigDecimal getSystemAmount() {
		return _systemAmount;
	}

	public void setSystemAmount(BigDecimal argSystemAmount) {
		this._systemAmount = argSystemAmount;
	}
	/* End Reconcile Till - UI Changes-100042 */
	public String getStatus() {
		return _status;
	}

	public void setStatus(String _argStatus) {
		this._status = _argStatus;
	}

	public String getTillId() {
		return _tillId;
	}

	public void setTillId(String _argTillId) {
		this._tillId = _argTillId;
	}

	public String getEmployee() {
		return _employee;
	}

	public void setEmployee(String agrEmployee) {
		this._employee = agrEmployee;
	}

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String argFlag) {
		this._flag = argFlag;
	}

	public BigDecimal getDeclaredAmount() {
		return _declaredAmount;
	}

	public void setDeclaredAmount(BigDecimal _argDeclaredAmount) {
		this._declaredAmount = _argDeclaredAmount;
	}

	public BigDecimal getOverShort() {
		return _overShort;
	}

	public void setOverShort(BigDecimal _argOverShort) {
		this._overShort = _argOverShort;
	}

	public Date getBeginDatetimestamp() {
		return this._beginDatetimestamp;
	}

	public String getCashDrawerDescription() {
		return this._cashDrawerDescription;
	}

	public String getCashDrawerId() {
		return this._cashDrawerId;
	}

	public Date getEndDatetimestamp() {
		return this._endDatetimestamp;
	}

	public long getOrganizationId() {
		return this._organizationId;
	}

	public String getSessionData() {
		StringBuilder sessionData = new StringBuilder(40);
		String id = String.valueOf(this.getSessionId());
		if (id.length() >= 4) {
			sessionData.append(StringUtils.right(id, 4));
		} else {
			sessionData.append(id);
		}

		IFormatter dateTimeShortFormatter = FormatterFactory.getInstance().getDateTimeShortFormatter();
		sessionData.append(" ");
		Date beginDateTime = this.getBeginDatetimestamp();
		sessionData.append(dateTimeShortFormatter.format(beginDateTime, OutputContextType.VIEW));
		sessionData.append("-");
		Date endDateTime = this.getEndDatetimestamp();
		if (endDateTime != null) {
			if (DateUtils.dateDiff(CalendarField.DAY, beginDateTime, endDateTime) == 0L) {
				String[] formattedEndDate = dateTimeShortFormatter.format(endDateTime, OutputContextType.VIEW)
						.split("\\s");
				int length = formattedEndDate.length;
				sessionData.append(formattedEndDate[length - 2]);
				sessionData.append(" ").append(formattedEndDate[length - 1]);
			} else {
				sessionData.append(dateTimeShortFormatter.format(endDateTime, OutputContextType.VIEW));
			}
		}

		return sessionData.toString();
	}

	public long getSessionId() {
		return this._sessionId;
	}

	public long getWkstnId() {
		return this._wkstnId;
	}

	public void setBeginDatetimestamp(Date argBeginDatetimestamp) {
		this._beginDatetimestamp = argBeginDatetimestamp;
	}

	public void setCashDrawerDescription(String argCashDrawerDescription) {
		this._cashDrawerDescription = argCashDrawerDescription;
	}

	public void setCashDrawerId(String argCashDrawerId) {
		this._cashDrawerId = argCashDrawerId;
	}

	public void setEndDatetimestamp(Date argEndDatetimestamp) {
		this._endDatetimestamp = argEndDatetimestamp;
	}

	public void setOrganizationId(long argOrganizationId) {
		this._organizationId = argOrganizationId;
	}

	public void setSessionId(long argSessionId) {
		this._sessionId = argSessionId;
	}

	public void setWkstnId(long argWkstnId) {
		this._wkstnId = argWkstnId;
	}

	protected IObjectId getObjectIdImpl() {
		SessionId id = new SessionId();
		id.setOrganizationId(this.getOrganizationId());
		id.setSessionId(this.getSessionId());
		return id;
	}

	public String getStatCode() {
		return this._statCode;
	}
	public void setStatCode(String argStatCode) {
		this._statCode = argStatCode;
	}
	
	public long getSubsetSessionId() {
		
		String id = String.valueOf(this.getSessionId());
		long se= Long.valueOf(id.substring(8));
		
		
	
		return se;
	}
	public String getEmployeeLastname() {
		return Employee_Lastname;
	}

	public void setEmployeeLastName(String Employee_Lastname) {
		this.Employee_Lastname = Employee_Lastname;
	}
	/** Bug from Build4.3
	 * Correcting the TillId 
	 * in Till Status Screen
	 * @return
	 */
	public String getSubSetRegisterSessionId() {
		String id = String.valueOf(this.getSessionId());
		int size = 12;
        char padChar = '0';
		String result = StringUtils.leftPad(id, size, padChar);
		String value=( (result.substring(3,6))+ '-' +(result.substring(6)) );
		return value;
	}
}