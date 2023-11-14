package mto.pos.order.update;
/********************************************************************************
 * US 92543 Siebel Sale Order Processing
 * 09/01/2023 Nayya Gupta constant class to handle constant values
 *******************************************************************************/
public class MtoOrderUpdateResponseBean {
  
	private String id;
	private String modId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModId() {
		return modId;
	}
	public void setModId(String modId) {
		this.modId = modId;
	}
}
