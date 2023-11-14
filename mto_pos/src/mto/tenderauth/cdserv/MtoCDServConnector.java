package mto.tenderauth.cdserv;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.Serializable;

import javax.inject.Inject;

import dtv.hardware.jposservice.connector.AbstractHardwareConnector;
import dtv.hardware.jposservice.protocol.Message;
import dtv.pos.iframework.security.StationState;
import mto.tenderauth.cdserv.ICDServMessageResponse.ConnectionStatus;

//import oracle.retail.stores.commext.connector.Connector;
//import oracle.retail.stores.commext.message.MessageException;



public class MtoCDServConnector  implements ICDServConnector{
	

	private transient Serializable outgoing;
	  
	private transient Serializable incoming;
	
	protected String name;
	
	private ConnectionStatus status;
	
	private MtoCDServConnectorStatistics statistics;

	
	public MtoCDServConnector() {
		
		  this.statistics = new MtoCDServConnectorStatistics();
		  this.status = ConnectionStatus.CONNECTOR_CLOSED;
	}
	public Serializable sendMessage(Serializable msg) throws MtoCDServMessageException{
		

	      this.incoming = null;
	      this.outgoing = msg;
	     
	    try 
	    {
	       File f = new File("C:\\CD\\CDSVPRNT.DAT");
	       if(f.exists()) 
	       { 
	    	f.delete();
	       }
	       
	     String voidRequest = this.outgoing.toString();
	    RandomAccessFile pipe = new RandomAccessFile("\\\\.\\pipe\\CDSERVEX.PPP", "rw");
	  
	    if(voidRequest.substring(23,25).equals("58"))
	    {
	    	 Thread.sleep(6000);
	    }
	     pipe.write(this.outgoing.toString().getBytes());
	   
	    
	    for(int i=0 ; i<120 ; i++)
	    {
	     if(pipe.length()==0)
	     {
	     Thread.sleep(1000);
	     i++;
	     }
	     
	     else
	     {
	      break;
	     }
	     }
	       	
	    
	    
	    long fileLen = pipe.length();
	    
	    byte respArr[]=new byte[(int)fileLen];
	    
	    for (int i = 0; i < fileLen; i++) 
	    {
	     respArr[i] = pipe.readByte();
	    }
	    String response = new String(respArr);
	    this.incoming =response;
	    }
	    catch (Exception e) 
	      {
	    	e.printStackTrace();
	      } 
	    File f = new File("C:\\CD\\CDSVPRNT.DAT");
	    if(f.exists()) 
	    { 
	 	f.delete();
	    }
	 
	 incoming="FIN0    000AA914781  452001******5685   C    S    160228                                001034004MT1234567897     CA11AM";
  
	    
	  return this.incoming ;
		
	}
	
	 protected void closeConnector() 
	 {
	 }

	 protected void openConnector() throws MtoCDServMessageException
	 {
	 }

	 protected void updateConnector() throws MtoCDServMessageException 
	 {
	 }

	 public final void close() {
	    setStatus(ICDServMessageResponse.ConnectionStatus.CONNECTOR_CLOSE_PENDING);
	    closeConnector();
	    setStatus(ICDServMessageResponse.ConnectionStatus.CONNECTOR_CLOSED);
	}
		  
	  public final void open() throws MtoCDServMessageException {
	    try {
	      openConnector();
	      setStatus(ICDServMessageResponse.ConnectionStatus.CONNECTOR_OPEN);
	    } catch (MtoCDServMessageException emsg) {
	      setStatus(ICDServMessageResponse.ConnectionStatus.CONNECTOR_ERROR);
	      throw emsg;
	    } 
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  
	  
  protected final void setStatus(ConnectionStatus newStatus) {
    if (!newStatus.equals(this.status)) {
      this.status = newStatus;
    //  ConnectorStatusNotification notification = new ConnectorStatusNotification("connector.status.change", this, seqNumber++, newStatus, this.status, getDispatcherName());
      //sendNotification(notification);
    } 
  }

	public ConnectionStatus getStatus() {
		return status;
	}
	
	public boolean isOpen() {
		if(!(this.getStatus() == null && !this.getStatus().equals(ConnectionStatus.CONNECTOR_OPEN))){
			this.status = ConnectionStatus.CONNECTOR_OPEN;
		}
	    return this.status.equals(ConnectionStatus.CONNECTOR_OPEN);
	  }
	public Serializable getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(Serializable outgoing) {
		this.outgoing = outgoing;
	}
	public Serializable getIncoming() {
		return incoming;
	}
	public void setIncoming(Serializable incoming) {
		this.incoming = incoming;
	}
	public MtoCDServConnectorStatistics getStatistics() {
		return statistics;
	}
	public void setStatistics(MtoCDServConnectorStatistics statistics) {
		this.statistics = statistics;
	}
	
 
}
