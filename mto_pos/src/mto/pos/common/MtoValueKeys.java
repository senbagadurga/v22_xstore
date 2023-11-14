package mto.pos.common;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.siebel.orpos.order.ORPOSExecuteOutput;
import com.siebel.orpos.order.ORPOSQueryPageOutput;

import dtv.pos.framework.scope.ValueKey;
import mto.pos.order.MtoOrderList;
import mto.pos.order.addItem.MtoOrderAddItemFormModel;
import mto.pos.tender.prepaid.validation.MtoPrepaidTenderAmountData;
import mto.pos.ws.order.ordersearch.MtoOrderLookupResponseBean;
import mto.tenderauth.cdserv.MtoCDServAuthorizeTransferResponse;

public class MtoValueKeys  {
	
	public static final ValueKey<MtoOrderList> SELECTED_SIEBEL_ORDER = new ValueKey<MtoOrderList>(MtoOrderList.class, "SELECTED_SIEBEL_ORDER");
	public static final ValueKey<String> SELECTED_ITEM_DESC = new ValueKey<String>(String.class, "SELECTED_ITEM_DESC");
	public static final ValueKey<Boolean> IS_CUSTOMER_PRESENT = new ValueKey<Boolean>(Boolean.class, "IS_CUSTOMER_PRESENT");
	public static final ValueKey<String> MTO_ENTERED_SERIAL_NUMBER = new ValueKey<String>(String.class,"MTO_ENTERED_SERIAL_NUMBER");
	/* US# 89135 START Prepaid Tender type */
	public static final ValueKey<BigDecimal> PREPAID_ORIGINAL_AMOUNT = new ValueKey<BigDecimal>(BigDecimal.class, "PREPAID_ORIGINAL_AMOUNT");
	public static final ValueKey<MtoPrepaidTenderAmountData> CURRENT_PREPAID_AMOUNT_DATA = new ValueKey<MtoPrepaidTenderAmountData>(MtoPrepaidTenderAmountData.class, "CURRENT_PREPAID_AMOUNT_DATA");
	/* US# 89135 END Prepaid Tender type */
	public static final ValueKey<Long> ENDCOUNT_SESSION_ID = new ValueKey<Long>(Long.class, "ENDCOUNT_SESSION_ID");
    public static final ValueKey<String>ENDCOUNT_MESSAGE = new ValueKey<String>(String.class, "ENDCOUNT_MESSAGE");
		public static final ValueKey<BigDecimal> MTO_ENTERED_SC_AMOUNT = new ValueKey<BigDecimal>(BigDecimal.class,"MTO_ENTERED_SC_AMOUNT");
	public static final ValueKey<Boolean> MTO_IS_REDEEM_STORED_CREDIT = new ValueKey<Boolean>(Boolean.class, "MTO_IS_REDEEM_STORED_CREDIT");
		public static final ValueKey<ORPOSQueryPageOutput> SIEBEL_ORDER_INQUIRY_RESPONSE = new ValueKey<ORPOSQueryPageOutput>(ORPOSQueryPageOutput.class, "SIEBEL_ORDER_INQUIRY_RESPONSE");
	public static final ValueKey<List<MtoOrderLookupResponseBean>> SIEBEL_ORDER_INQUIRY_RESULTS = new ValueKey(List.class, "SIEBEL_ORDER_INQUIRY_RESULTS");
	public static final ValueKey<MtoOrderLookupResponseBean> SIEBEL_ORDER_SELECTED = new ValueKey(MtoOrderLookupResponseBean.class, "SIEBEL_ORDER_SELECTED");
	public static final ValueKey<Boolean> REQUEST_DETAIL = new ValueKey<Boolean>(Boolean.class, "REQUEST_DETAIL");
	public static final ValueKey<MtoOrderLookupResponseBean> SIEBEL_ORDER_LINEITEM_DETAILS = new ValueKey(MtoOrderLookupResponseBean.class, "SIEBEL_ORDER_SELECTED");
	public static final ValueKey<ORPOSExecuteOutput> SIEBEL_ORDER_ORDER_UPDATE = new ValueKey<ORPOSExecuteOutput>(ORPOSExecuteOutput.class, "SIEBEL_ORDER_ORDER_UPDATE");
	public static final ValueKey<MtoOrderAddItemFormModel> MTO_ENTERED_ITEM_DETAILS = new ValueKey(MtoOrderAddItemFormModel.class, "MTO_ENTERED_ITEM_DETAILS");
	public static final ValueKey<Boolean> SIEBEL_ORDER_FLOW_COMPLETE = new ValueKey<Boolean>(Boolean.class, "SIEBEL_ORDER_FLOW_COMPLETE");
	public static final ValueKey<MtoCDServAuthorizeTransferResponse> CURRENT_CDSERV_RESPONSE = new ValueKey<MtoCDServAuthorizeTransferResponse>(MtoCDServAuthorizeTransferResponse.class, "CURRENT_CDSERV_RESPONSE");
	
	/*Start Task 100597 Item Not on File prompt appearing for transaction type  available in DB */
	public static final ValueKey<ORPOSQueryPageOutput> SIEBEL_ORDER_INQUIRY_RESPONSE_ITEM = new ValueKey<ORPOSQueryPageOutput>(ORPOSQueryPageOutput.class, "SIEBEL_ORDER_INQUIRY_RESPONSE_ITEM");
	public static final ValueKey<List<MtoOrderLookupResponseBean>> SIEBEL_ORDER_INQUIRY_RESULTS_ITEM = new ValueKey(List.class, "SIEBEL_ORDER_INQUIRY_RESULTS_ITEM");
	/*End Task 100597 Item Not on File prompt appearing for transaction type  available in DB */
	public static final ValueKey<String>OVERSHOT_FLAG = new ValueKey<String>(String.class, "OVERSHOT_FLAG");
	public static final ValueKey<Date> ACTUAL_PROPOSED_BUSINESS_DATE = new ValueKey(Date.class, "ACTUAL_PROPOSED_BUSINESS_DATE");
}
