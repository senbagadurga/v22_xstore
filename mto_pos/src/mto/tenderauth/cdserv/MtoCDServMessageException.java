package mto.tenderauth.cdserv;

public class MtoCDServMessageException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected int errorCode;
	
	protected int errorSubtype;
	
	public MtoCDServMessageException(int type,String msg) {
		super(msg);
		this.errorCode = type;	
	}
	
	public MtoCDServMessageException(int type,String msg, Throwable nested) {
		super(msg,nested);
		this.errorCode = type;	
	}
	
	public MtoCDServMessageException(int type,int subType,String msg,Throwable nested) {
		this(type,msg,nested);
		this.errorSubtype = type;	
	}
	
	public MtoCDServMessageException(int type,int subType,String msg) {
		this(type,msg);
		this.errorSubtype = type;	
	}
	
	
	public int getErrorCode() {
		return this.errorCode;
	}
	
	public int getErrorSubType() {
		return this.errorSubtype;
	}
	
}