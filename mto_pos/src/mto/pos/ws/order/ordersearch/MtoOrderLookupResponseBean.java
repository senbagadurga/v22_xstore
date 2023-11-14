package mto.pos.ws.order.ordersearch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import dtv.service.req.IServiceResponse;

public class MtoOrderLookupResponseBean implements IServiceResponse {

	private BigDecimal mtoAccountSCBalance;
	private BigDecimal mtoAccountPrepaidBalance;
	private String mtoPaymentRefNumber;
	private String transactionType;
	private String id;
	private Date created;
	private String account;
	private boolean active;
	private String contactFirstName;
	private String contactLastName;
	private String workPhone;
	private BigDecimal currentOrderTotalNetPrice;
	private String orderNumber;
	private boolean isNnpFlag;
	private String contractId;
    private ArrayList<MtoOrderEntryLineItemsResponseBean> itemList = new ArrayList<MtoOrderEntryLineItemsResponseBean>();
	
	public ArrayList<MtoOrderEntryLineItemsResponseBean> getItemList() {
		return itemList;
	}

	public void addItem(MtoOrderEntryLineItemsResponseBean item) {
		this.itemList.add(item);
	}
    
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public BigDecimal getMtoAccountSCBalance() {
		return mtoAccountSCBalance;
	}
	public void setMtoAccountSCBalance(BigDecimal mtoAccountSCBalance) {
		this.mtoAccountSCBalance = mtoAccountSCBalance;
	}
	public BigDecimal getMtoAccountPrepaidBalance() {
		return mtoAccountPrepaidBalance;
	}
	public void setMtoAccountPrepaidBalance(BigDecimal mtoAccountPrepaidBalance) {
		this.mtoAccountPrepaidBalance = mtoAccountPrepaidBalance;
	}
	public String getMtoPaymentRefNumber() {
		return mtoPaymentRefNumber;
	}
	public void setMtoPaymentRefNumber(String mtoPaymentRefNumber) {
		this.mtoPaymentRefNumber = mtoPaymentRefNumber;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public BigDecimal getCurrentOrderTotalNetPrice() {
		return currentOrderTotalNetPrice;
	}
	public void setCurrentOrderTotalNetPrice(BigDecimal currentOrderTotalNetPrice) {
		this.currentOrderTotalNetPrice = currentOrderTotalNetPrice;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public boolean isNnpFlag() {
		return isNnpFlag;
	}
	public void setNnpFlag(boolean isNnpFlag) {
		this.isNnpFlag = isNnpFlag;
	}
	
}
