package mto.tenderauth.cdserv;

public class MtoCDServConnectorStatistics{
	
	protected static final String EOL = "\n";
	  
	  protected int msgCount;
	  
	  protected long msgMinTime;
	  
	  protected long msgMaxTime;
	  
	  protected long msgCulmTime;
	  
	  protected int msgSuccess;
	  
	  protected int msgException;
	  
	  protected Throwable lastException;
	  
	  public void reset() {
	    this.msgCount = 0;
	    this.msgMinTime = Long.MAX_VALUE;
	    this.msgMaxTime = 0L;
	    this.msgCulmTime = 0L;
	    this.msgSuccess = 0;
	    this.msgException = 0;
	    this.lastException = null;
	  }
	  
	  public void updateSuccess(long elapsedTime) {
	    this.msgCount++;
	    this.msgSuccess++;
	    this.msgCulmTime += elapsedTime;
	    if (elapsedTime > this.msgMaxTime) {
	      this.msgMaxTime = elapsedTime;
	    } else if (elapsedTime < this.msgMinTime) {
	      this.msgMinTime = elapsedTime;
	    } 
	  }
	  
	  protected void updateException(Throwable eth) {
	    this.msgCount++;
	    this.msgException++;
	    this.lastException = eth;
	  }
	  
	  public String toString() {
	    StringBuilder buffer = new StringBuilder("Connector Statistics: ");
	    buffer.append("\n");
	    buffer.append("Message Count: ");
	    buffer.append(this.msgCount);
	    buffer.append("\n");
	    buffer.append("Success Count: ");
	    buffer.append(this.msgSuccess);
	    buffer.append("\n");
	    buffer.append("Exception Count: ");
	    buffer.append(this.msgException);
	    buffer.append("\n");
	    buffer.append("Max Time: ");
	    buffer.append(this.msgMaxTime);
	    buffer.append("\n");
	    buffer.append("Min Time: ");
	    buffer.append(this.msgMinTime);
	    buffer.append("\n");
	    if (this.msgCount > 0) {
	      buffer.append("Average Time: ");
	      buffer.append(this.msgCulmTime / this.msgCount);
	      buffer.append("\n");
	    } 
	    if (this.lastException != null) {
	      buffer.append("Last Exception: ");
	      buffer.append(this.lastException.getLocalizedMessage());
	      buffer.append("\n");
	    } 
	    return buffer.toString();
	  }
}

