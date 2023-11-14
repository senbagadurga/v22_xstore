package mto.pos.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dtv.pos.framework.form.BasicEditModel;

public class MtoOrdersModel extends BasicEditModel {
	
	public static final String ORDER_LIST_FIELD = "orderListModel";
	public static final String ORDER_NUMBER_FIELD = "orderNumber";
	public static final String CREATED_FIELD = "created";
	public static final String ACCOUNT_NUMBER_FIELD = "account";
	public static final String LAST_NAME_FIELD = "contactLastName";
	public static final String TOTAL_FIELD = "currentOrderTotalNetPrice";
	private MtoOrderListModel _orderListModel;
	private List<MtoOrderList> _allOrders;		
	private String orderNumber; 
	private Date created;  
	private String account;  
	private String contactLastName;  
	private BigDecimal currentOrderTotalNetPrice;
  
	public MtoOrdersModel(List<MtoOrderList> argOrderList) {
	   
	    this._allOrders      = new ArrayList<>(argOrderList);
	    this._orderListModel = new MtoOrderListModel();
	    _orderListModel.setResults(argOrderList);
	    addField("orderListModel", MtoOrderListModel.class, 10);
	    addField("orderNumber", String.class, 2);
	    addField("created", Date.class, 2);
	    addField("account", String.class, 2);
	    addField("contactLastName", String.class, 2);
	    addField("currentOrderTotalNetPrice", BigDecimal.class, 2);
	  }
	
	 public void filterAndRefresh() {
		    this._orderListModel.displayResultsWithGivenIndexSelected( this._allOrders, new int[] { 0 });
		  }
	 
	 
  public MtoOrdersModel() {
		super();
	}



public MtoOrderListModel getOrderListModel() {
	return _orderListModel;
}

public void setOrderListModel(MtoOrderListModel _orderListModel) {
	this._orderListModel = _orderListModel;
}

public String getOrderNumber() {
	return orderNumber;
}

public void setOrderNumber(String orderNumber) {
	this.orderNumber = orderNumber;
}

public Date getCreated() {
	return created;
}

public void setCreated(Date created) {
	this.created = created;
}

public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public String getContactLastName() {
	return contactLastName;
}

public void setContactLastName(String contactLastName) {
	this.contactLastName = contactLastName;
}

public BigDecimal getCurrentOrderTotalNetPrice() {
	return currentOrderTotalNetPrice;
}

public void setCurrentOrderTotalNetPrice(BigDecimal currentOrderTotalNetPrice) {
	this.currentOrderTotalNetPrice = currentOrderTotalNetPrice;
}
}
