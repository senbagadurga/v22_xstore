package mto.pos.order;
/********************************************************************************
 * US 92543 Siebel Sale Order Processing
 *******************************************************************************/
public class MtoOrderConstants {
	
	 public static final String ORDER_UPDATE_STATUS ="Tender In Process";
	 public static final String ORDER_OPERATION_TYPE ="update";
	 public static final boolean RECORDCOUNT_NEEDED = true;
	 public static final String LOVLANGUAGEMODE = "LIC";
	 public static final String LOOKUPVIEWMODE = "Organization";
	 public static final String ORDER_TYPE = "Sales Order";
	 public static final String ORDER_STATUS ="Ready To Tender";
	 public static final String ACTIVE_QUERY_TYPE="='Y'";
	 public static final String CREATED_SORT_ORDER = "DESC";
	 public static final String CREATED_SORT_SEQUENCE = "1";
	 public static final String QUERYTYPE_SORT_ORDER="ASC";
	 public static final String QUERYTYPE_SORT_SEQUENCE="1";
	 public static final String UPDATE_VIEW_MODE="All";
	 public static final String ORDER_STATUS_TENDER_IN_PROGRESS 	= "Tender In Process";
	 public static final String ORDER_TENDER_PAYMENT_STATUS 		= "Completed";
	 public static final String ORDER_LIC 						= "LIC";
	 public static final String ORDER_VIEW_MODE 				= "All";
	 public static final String ORDER_PAYMENT_OPERATION			= "insert";
	 public static final String ORDER_TENDER_CASH				= "Cash";
	 public static final String ORDER_FUNDED_STATUS				= "Funded";
	 public static final String ITEM_QUNATITY				= "1";
	/* Start US#92635 Integration- Siebel - Xstore void order processing */
	 public static final String ORDER_VOID_STATUS				= "VOID";
	 /* End US#92635 Integration- Siebel - Xstore void order processing */
	 public static final String ORDER_TENDER_CC				= "Credit Card";
	 public static final String ORDER_TENDER_DC				= "Debit Card";
	 public static final String BPM_VOID_TRANSACTION_TYPE	= "VOID";
	 public static final String BPM_PURCHASE_TRANSACTION_TYPE	= "PURCHASE";
}
