package mto.pos.ws.order.ordersearch;

import java.math.BigInteger;

import com.siebel.orpos.order.ORPOSQueryPageInput;
import com.siebel.xml.orpos_order_entry_io.query.ListOfORPOSOrderEntryIoQuery;
import com.siebel.xml.orpos_order_entry_io.query.ListOfOrderEntryLineItemsQuery;
import com.siebel.xml.orpos_order_entry_io.query.OrderEntryLineItemsQuery;
import com.siebel.xml.orpos_order_entry_io.query.OrderEntryOrdersQuery;
import com.siebel.xml.orpos_order_entry_io.query.QueryType;

import dtv.util.StringUtils;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.order.MtoOrderConstants;

public class MtoOrposQueryPageInputRequestPreparer {
	protected static final QueryType EMPTY_QUERY = new QueryType();


	public ORPOSQueryPageInput buildOrderLookupRequestPreparer(String argLoginUserId) {
		ORPOSQueryPageInput orderRequest = new ORPOSQueryPageInput();
		ListOfORPOSOrderEntryIoQuery entryIoQuery = new ListOfORPOSOrderEntryIoQuery();


		entryIoQuery.setPagesize(new BigInteger(MtoConfigurationMgr.getSiebelServicePageSize()));
		entryIoQuery.setRecordcountneeded(MtoOrderConstants.RECORDCOUNT_NEEDED);
		orderRequest.setListOfORPOSOrderEntryIo(entryIoQuery);
		OrderEntryOrdersQuery orderEntry = new OrderEntryOrdersQuery();
		// to make changes
	
		String searchSpec = getSearchSpec(argLoginUserId);
		orderEntry.setSearchspec(searchSpec);

		
		orderEntry.setId(getQueryType());	
		orderEntry.setAccount(EMPTY_QUERY);
		orderEntry.setActive(getActiveQueryType());
		orderEntry.setContactFirstName(EMPTY_QUERY);
		orderEntry.setContactLastName(EMPTY_QUERY);
		orderEntry.setContactWorkPhone(EMPTY_QUERY);
		
		orderEntry.setCurrentOrderTotalNetPrice(EMPTY_QUERY);
		orderEntry.setCreated(getCreatedQueryType());
		orderEntry.setTransactionType(EMPTY_QUERY);
		orderEntry.setMTOPaymentRefNumber(EMPTY_QUERY);
		orderEntry.setMTOAccountSCBalance(EMPTY_QUERY);
		orderEntry.setMTOAccountPrepaidBalance(EMPTY_QUERY);
	
		orderEntry.setOrderNumber(EMPTY_QUERY);
		entryIoQuery.setOrderEntryOrders(orderEntry);
		orderRequest.setLOVLanguageMode(MtoOrderConstants.LOVLANGUAGEMODE);
		orderRequest.setViewMode(MtoOrderConstants.LOOKUPVIEWMODE);

		return orderRequest;

	}

	private QueryType getActiveQueryType() {
		QueryType request = new QueryType();
		request.setValue(MtoOrderConstants.ACTIVE_QUERY_TYPE);
		return request;
	}

	private QueryType getCreatedQueryType() {
		QueryType request = new QueryType();
		request.setSortorder(MtoOrderConstants.CREATED_SORT_ORDER);
		request.setSortsequence(MtoOrderConstants.CREATED_SORT_SEQUENCE);
		return request;
	}

	private QueryType getQueryType() {
		// TODO Auto-generated method stub
		QueryType request = new QueryType();
		request.setSortorder(MtoOrderConstants.QUERYTYPE_SORT_ORDER);
		request.setSortsequence(MtoOrderConstants.QUERYTYPE_SORT_SEQUENCE);
		return request;
	}

	protected String getSearchSpec(String argLoginUserId) {
		StringBuilder spec = new StringBuilder();
		spec.append("(");

		spec.append("[OrderType]");
		spec.append("=");
		spec.append("'");
		spec.append(MtoOrderConstants.ORDER_TYPE);
		//spec.append("Sales Order");
		spec.append("'");

		spec.append(")");
		spec.append(" ");
		spec.append("AND");
		spec.append(" ");
		
		if(!StringUtils.isEmpty(argLoginUserId))
			spec.append("(");
		spec.append("[Status]");
		spec.append("=");
		spec.append("'");
	    spec.append(MtoOrderConstants.ORDER_STATUS);
		
		spec.append("'");

		spec.append(")");
		spec.append(" ");
		spec.append("AND");
		spec.append(" ");

		spec.append("(");
		spec.append("[CreatedByName]");
		spec.append("=");
		spec.append("'");
	
		spec.append(argLoginUserId);
		//usng this for testing purpose
		//spec.append("SADMIN");
		spec.append("'");
		spec.append(")");

	
		return spec.toString();
	}

	protected ListOfOrderEntryLineItemsQuery formatLineItemQueryList() {
		ListOfOrderEntryLineItemsQuery query = new ListOfOrderEntryLineItemsQuery();
		BigInteger pageSize = new BigInteger(MtoConfigurationMgr.getSiebelServiceOrderDetailPageSize());
		query.setPagesize(pageSize);
		query.setRecordcountneeded(Boolean.valueOf(true));
		query.setOrderEntryLineItems(formatlineitemQuery());	
		return query;
		
	}
	
	protected OrderEntryLineItemsQuery formatlineitemQuery() {
		OrderEntryLineItemsQuery query = new OrderEntryLineItemsQuery();
		query.setId(EMPTY_QUERY);
		query.setParentOrderItemId(EMPTY_QUERY);
		query.setLineNumber2(EMPTY_QUERY);
		query.setProduct(EMPTY_QUERY);
		query.setPartNumber(EMPTY_QUERY);
		query.setQuantityRequested(EMPTY_QUERY);
		query.setNetPrice(EMPTY_QUERY);
		query.setPriceType(EMPTY_QUERY);
		query.setActionCode(EMPTY_QUERY);
		query.setServiceId(EMPTY_QUERY);
		query.setSerialized(EMPTY_QUERY);
		
		query.setCarrierPriority(EMPTY_QUERY);
		query.setCarrierCode(EMPTY_QUERY);
		query.setFreightAmount(EMPTY_QUERY);
		query.setShipToAccountId(EMPTY_QUERY);
		query.setShipToContactId(EMPTY_QUERY);
		query.setShipToAddress(EMPTY_QUERY);
		query.setShipToAddress2(EMPTY_QUERY);
		query.setShipToCity2(EMPTY_QUERY);
		query.setShipToState2(EMPTY_QUERY);
		query.setShipToZip2(EMPTY_QUERY);
		query.setShipToCountry2(EMPTY_QUERY);
		return query;
	}
	/*Start Task 100597 Item Not on File prompt appearing for transaction type  available in DB */
	public ORPOSQueryPageInput buildOrderItemLookupRequestPreparer(String argLoginUserId,String argItemId) {
		ORPOSQueryPageInput orderRequest = new ORPOSQueryPageInput();
		ListOfORPOSOrderEntryIoQuery entryIoQuery = new ListOfORPOSOrderEntryIoQuery();


		entryIoQuery.setPagesize(new BigInteger(MtoConfigurationMgr.getSiebelServiceOrderDetailPageSize()));
		//entryIoQuery.setPagesize(new BigInteger (10));
		entryIoQuery.setRecordcountneeded(MtoOrderConstants.RECORDCOUNT_NEEDED);
		orderRequest.setListOfORPOSOrderEntryIo(entryIoQuery);
		OrderEntryOrdersQuery orderEntry = new OrderEntryOrdersQuery();
		// to make changes
	
		String searchSpec = getSearchSpec(argLoginUserId,argItemId);
		orderEntry.setSearchspec(searchSpec);

		
		orderEntry.setId(getQueryType());	
		orderEntry.setAccount(EMPTY_QUERY);
		orderEntry.setActive(getActiveQueryType());
		orderEntry.setContactFirstName(EMPTY_QUERY);
		orderEntry.setContactLastName(EMPTY_QUERY);
		orderEntry.setContactWorkPhone(EMPTY_QUERY);
		
		orderEntry.setCurrentOrderTotalNetPrice(EMPTY_QUERY);
		orderEntry.setCreated(getCreatedQueryType());
		orderEntry.setTransactionType(EMPTY_QUERY);
		orderEntry.setMTOPaymentRefNumber(EMPTY_QUERY);
		orderEntry.setMTOAccountSCBalance(EMPTY_QUERY);
		orderEntry.setMTOAccountPrepaidBalance(EMPTY_QUERY);
	
		orderEntry.setOrderNumber(EMPTY_QUERY);
		entryIoQuery.setOrderEntryOrders(orderEntry);
		orderRequest.setLOVLanguageMode(MtoOrderConstants.LOVLANGUAGEMODE);
		orderRequest.setViewMode(MtoOrderConstants.LOOKUPVIEWMODE);
		orderEntry.setListOfOrderEntryLineItems(formatLineItemQueryList());
		return orderRequest;

	}
	protected String getSearchSpec(String argLoginUserId, String argItemId) {
		StringBuilder spec = new StringBuilder();
		spec.append("(");

		spec.append("[OrderType]");
		spec.append("=");
		spec.append("'");
		spec.append(MtoOrderConstants.ORDER_TYPE);
		//spec.append("Sales Order");
		spec.append("'");

		spec.append(")");
		spec.append(" ");
		spec.append("AND");
		spec.append(" ");
		
		if(!StringUtils.isEmpty(argItemId))
			spec.append("(");
		spec.append("[Id]");
		spec.append("=");
		spec.append("'");
	    spec.append(argItemId);
		
		spec.append("'");

		spec.append(")");
		spec.append(" ");
		spec.append("AND");
		spec.append(" ");
		
		if(!StringUtils.isEmpty(argLoginUserId))
			spec.append("(");
		spec.append("[Status]");
		spec.append("=");
		spec.append("'");
	    spec.append(MtoOrderConstants.ORDER_STATUS);
		
		spec.append("'");

		spec.append(")");
		spec.append(" ");
		spec.append("AND");
		spec.append(" ");

		spec.append("(");
		spec.append("[CreatedByName]");
		spec.append("=");
		spec.append("'");
	
		spec.append(argLoginUserId);
		//usng this for testing purpose
		//spec.append("SADMIN");
		spec.append("'");
		spec.append(")");

	
		return spec.toString();
	}
	/*End Task 100597 Item Not on File prompt appearing for transaction type  available in DB */
}