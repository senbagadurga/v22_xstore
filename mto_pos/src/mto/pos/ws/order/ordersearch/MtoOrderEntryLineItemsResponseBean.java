package mto.pos.ws.order.ordersearch;

import java.math.BigDecimal;

public class MtoOrderEntryLineItemsResponseBean {
	
	private String id;
	private String actionCode;
	private String carrierCode;
	private Integer lineNumber2;
	private BigDecimal netPrice;
	private String parentOrderItemId;
	 private String partNumber;
	 private String priceType;
	 private String product;
	 private Integer quantityRequested;
	 private String serviceId;
	 private String shipToAccountId;
	 private String shipToAddress;
	 private String shipToAddress2;
	 private String shipToAddressId;
	 private String shipToCity2;
	 private String shipToContactId;
	 private String shipToCountry2;
	 private String shipToState2;
	 private String shipToZip2;
	 private boolean updateToSourceFlag = true;
	 
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getActionCode() {
			return actionCode;
		}
		public void setActionCode(String actionCode) {
			this.actionCode = actionCode;
		}
		public String getCarrierCode() {
			return carrierCode;
		}
		public void setCarrierCode(String carrierCode) {
			this.carrierCode = carrierCode;
		}
		public Integer getLineNumber2() {
			return lineNumber2;
		}
		public void setLineNumber2(Integer lineNumber2) {
			this.lineNumber2 = lineNumber2;
		}
		public BigDecimal getNetPrice() {
			return netPrice;
		}
		public void setNetPrice(BigDecimal netPrice) {
			this.netPrice = netPrice;
		}
		public String getParentOrderItemId() {
			return parentOrderItemId;
		}
		public void setParentOrderItemId(String parentOrderItemId) {
			this.parentOrderItemId = parentOrderItemId;
		}
		public String getPartNumber() {
			return partNumber;
		}
		public void setPartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		public String getPriceType() {
			return priceType;
		}
		public void setPriceType(String priceType) {
			this.priceType = priceType;
		}
		public String getProduct() {
			return product;
		}
		public void setProduct(String product) {
			this.product = product;
		}
		public Integer getQuantityRequested() {
			return quantityRequested;
		}
		public void setQuantityRequested(Integer quantityRequested) {
			this.quantityRequested = quantityRequested;
		}
		public String getServiceId() {
			return serviceId;
		}
		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}
		public String getShipToAccountId() {
			return shipToAccountId;
		}
		public void setShipToAccountId(String shipToAccountId) {
			this.shipToAccountId = shipToAccountId;
		}
		public String getShipToAddress() {
			return shipToAddress;
		}
		public void setShipToAddress(String shipToAddress) {
			this.shipToAddress = shipToAddress;
		}
		public String getShipToAddress2() {
			return shipToAddress2;
		}
		public void setShipToAddress2(String shipToAddress2) {
			this.shipToAddress2 = shipToAddress2;
		}
		public String getShipToAddressId() {
			return shipToAddressId;
		}
		public void setShipToAddressId(String shipToAddressId) {
			this.shipToAddressId = shipToAddressId;
		}
		public String getShipToCity2() {
			return shipToCity2;
		}
		public void setShipToCity2(String shipToCity2) {
			this.shipToCity2 = shipToCity2;
		}
		public String getShipToContactId() {
			return shipToContactId;
		}
		public void setShipToContactId(String shipToContactId) {
			this.shipToContactId = shipToContactId;
		}
		public String getShipToCountry2() {
			return shipToCountry2;
		}
		public void setShipToCountry2(String shipToCountry2) {
			this.shipToCountry2 = shipToCountry2;
		}
		public String getShipToState2() {
			return shipToState2;
		}
		public void setShipToState2(String shipToState2) {
			this.shipToState2 = shipToState2;
		}
		public String getShipToZip2() {
			return shipToZip2;
		}
		public void setShipToZip2(String shipToZip2) {
			this.shipToZip2 = shipToZip2;
		}
		
		public boolean isUpdateToSourceFlag() {
		return updateToSourceFlag;
	}
	public void setUpdateToSourceFlag(boolean updateToSourceFlag) {
		this.updateToSourceFlag = updateToSourceFlag;
	}
}
