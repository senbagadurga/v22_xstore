package mto.tenderauth.impl.cdserv.op;

import java.math.BigDecimal;
import java.util.Map;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.EntryMessage;

import dtv.event.eventor.DefaultEventor;
import dtv.hardware.custdisplay.IDtvCustDisplayDevice;
import dtv.hardware.micr.TimeoutException;
import dtv.pos.common.CommonHelper;
import dtv.pos.common.OpChainKey;
import dtv.pos.common.TransactionScopeKeys;
import dtv.pos.common.TransactionType;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.op.OpState;
import dtv.pos.framework.op.Operation;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.IBusyState;
import dtv.pos.iframework.action.IXstAction;
import dtv.pos.iframework.action.IXstActionKey;
import dtv.pos.iframework.action.IXstDataAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.event.IXstEventObserver;
import dtv.pos.iframework.event.IXstEventType;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IOpState;
import dtv.pos.iframework.op.IReversibleOp;
import dtv.pos.iframework.security.StationState;
import dtv.pos.register.ItemLocator;
import dtv.pos.register.returns.ReturnManager;
import dtv.pos.tender.TenderHelper;
import dtv.pos.tender.validation.TenderAmountData;
import dtv.util.NumberUtils;
import dtv.xst.cleandto.tnd.Tender;
import dtv.xst.dao.trl.IRetailTransaction;
import dtv.xst.dao.ttr.IAuthorizableTenderLineItem;
import dtv.xst.dao.ttr.ICreditDebitTenderLineItem;
import dtv.xst.dao.ttr.ITenderLineItem;
import mto.pos.common.MtoConfigurationMgr;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import mto.pos.tender.MtoCDServConstants;
import mto.tenderauth.cdserv.CDServMessage;
import mto.tenderauth.cdserv.ICDServMessageResponse;
import mto.tenderauth.cdserv.ICDServMessageResponse.TenderType;
import mto.tenderauth.cdserv.MtoCDServAuthorizeTransferRequest;
import mto.tenderauth.cdserv.MtoCDServAuthorizeTransferResponse;
import mto.tenderauth.cdserv.MtoCDServConnectionHelper;
import mto.tenderauth.cdserv.MtoCDServMessageException;

/**
 * US#95644 Integration - Xstore - CDServ
 * @author kameswari.srishtu
 *
 */

public class MtoInitiateCDServPipeRequestOp extends Operation implements IXstEventObserver, IReversibleOp
{
	private static final Logger LOG = LogManager.getLogger(MtoInitiateCDServPipeRequestOp.class);
	
	protected final IOpState CDSERV_PROCESSING_START = new OpState("CDSERV_PROCESSING_START");
	protected final IOpState ERROR_MESSAGE_PROMPT = new OpState("ERROR_MESSAGE_PROMPT");
	protected final IOpState ERROR_TIMEOUT_MESSAGE_PROMPT = new OpState("ERROR_TIMEOUT_MESSAGE_PROMPT");
	protected final IOpState SHOWING_CDSERV_MESSAGE = new OpState("SHOWING_CDSERV_MESSAGE");
	protected final IOpState POST_PROMPT = new OpState("POST_PROMPT");
	protected final IOpState POST_ERROR_PROMPT = new OpState("POST_ERROR_PROMPT");
	protected final IOpState CDSERV_OFFLINE = new OpState("CDSERV_OFFLINE");
	protected final IOpState CDSERV_DECLINED = new OpState("CDSERV_DECLINED");
	MtoCDServAuthorizeTransferRequest request;
	public ICDServMessageResponse response;
	
	@Inject
	public StationState _systemUser;
	
	@Inject
	private CommonHelper _commonHelper;
	
	@Inject
	private ReturnManager _returnMgr;
	
	@Inject
	private TenderHelper _tenderHelper;
	
	@Inject
	private TransactionScope _transactionScope;
	
	@Inject
	private IBusyState _uiBusyState;
	
	MtoOrderList selectedOrder = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public IOpResponse handleOpExec(IXstEvent var1) {
		this.request = buildAuthRequest();
		if(var1 != null && POST_ERROR_PROMPT.equals(getOpState()))
		{
			return this.handlePromptResponse((IXstAction)var1);
		}
		CDServMessage msg = new CDServMessage(MtoCDServConstants.CDSERV_TYPE_SALE,request);
		try
		{
		_uiBusyState.start("_cdservProcessing");
		response = (MtoCDServAuthorizeTransferResponse) MtoCDServConnectionHelper.sendMessage(msg,request);
		LOG.debug("The response in Op Class"+response);
		_transactionScope.setValue(MtoValueKeys.CURRENT_CDSERV_RESPONSE, (MtoCDServAuthorizeTransferResponse)response);
		_uiBusyState.end();
		return handleCDServResponse(response);
		
		}
		catch(MtoCDServMessageException me) {
			LOG.error("Exception caught while calling the CDServ Pipe Request", me);
			this.setOpState(POST_ERROR_PROMPT);
			 return (IOpResponse)this.HELPER.getPromptResponse("CDSERV_ERROR_DISPLAY");	
		}
		catch(TimeoutException te) {
			LOG.error("Timeout Exception caught while calling the CDServ Pipe Request", te);
			this.setOpState(POST_ERROR_PROMPT);
			return (IOpResponse)this.HELPER.getPromptResponse("CDSERV_TIMEOUT_ERROR_DISPLAY");	
			
		}
		catch(Exception e)
		{
			LOG.error("Exception caught while calling the CDServ Pipe Request", e);
			this.setOpState(POST_ERROR_PROMPT);
			 return (IOpResponse)this.HELPER.getPromptResponse("CDSERV_ERROR_DISPLAY");	
			
		}
		finally {
			_uiBusyState.end();
		}
	}
	
 	public MtoCDServAuthorizeTransferRequest getRequest() {
		return request;
	}

	public void setRequest(MtoCDServAuthorizeTransferRequest request) {
		this.request = request;
	}

	@Override
	public IOpResponse handleOpReverse(IXstEvent var1) {
		
		return HELPER.getCompleteStackChainResponse(OpChainKey.valueOf(getAfterCancelResetChain()));
	}

	@Override
	public IXstEventType[] getObservedEvents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Handling CDServ Messages
	 * @param argEvent
	 * @return
	 */
	protected IOpResponse handleCDServMessages(MtoCDServAuthorizeTransferResponse response) {
     EntryMessage m = LOG.traceEntry();
     LOG.debug("Inside handleCDSERVMessages() method");
          ICDServMessageResponse.ResponseCode errorCode =response.getResponseCode();
			switch(errorCode)
			{
			case FormatError:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_FORMAT_ERROR"));
			case MissingMandatoryData:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_MISSING_DATA"));
			case UnsupportedType:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_UNSUPPOTED_TYPE"));
			case UnsupportedVersion:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_UNSUPPOTED_VERSION"));
			case InvalidData:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_INVALID_DATA"));
			case TerminalBusy:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_TERMINAL_BUSY"));
			case InValidOthers:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_INVALID_OTH"));
			case TransactionNotAccepted:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_TXN_NOT_ACCEPTED"));
			case TransactionNotCompleted:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_TXN_NOT_COMPLETE"));
			case TransactionNotCompletedOthers:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_TXN_NOT_COMPLETE_OTH"));
			case TransactionReversed:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_TXN_REVERSED"));
			case TransactionReversedMAC:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_TXN_REVERSED_MAC"));
			case RequestRejected:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_REQ_REJECTED"));
			case RequiredAdditionalInput:		
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_REQ_INPUT"));
			case Timeout:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_TIMEOUT_ERROR_DISPLAY"));
			case Declined:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_DECLINED"));
			case RequiredAdditionalInputInvlid:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_REQ_INPUT_INVALID"));
			default:
				return (IOpResponse)LOG.traceExit(m, this.HELPER.getPromptResponse("CDSERV_OFFLINE"));

			}
	  }

	/**
	 * Building CDSERV Request object
	 * @return
	 */
	 public MtoCDServAuthorizeTransferRequest buildAuthRequest() {
		 
		 MtoCDServAuthorizeTransferRequest request = new MtoCDServAuthorizeTransferRequest();
		 TenderAmountData amountData = (TenderAmountData)this.getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
		 boolean isCustomer = _transactionScope.getValue(MtoValueKeys.IS_CUSTOMER_PRESENT);
		 if(isCustomer) {
		 request.setCustomerAval(String.valueOf(isCustomer));
		 }
		 else { request.setCustomerAval("0");
		 }
		 request.setBaseAmount(amountData.getEnteredAmount());
		 request.setDescription(selectedOrder.getId());
		 request.setOperatorId(String.valueOf(_stationState.getSystemUser().getOperatorParty().getEmployeeId()));
		 
		 return request;
	 }
	 /**
	  * Handling Error Scenarios
	  * Showing Prompt Messages
	  * Received from CDSERV
	  * @param argEvent
	  * @return
	  */
	 protected IOpResponse handleShowingFailedResponse(IXstEvent argEvent) {
		   if (argEvent instanceof IXstDataAction) {
		      IXstDataAction action = (IXstDataAction)argEvent;
		      IXstActionKey actionKey = action.getActionKey();
		      if (XstDataActionKey.CANCEL == actionKey) {
		         this.handleAbort();
		         return this.handleVoid();
		      }      }
		   
		   return null;

		  
		}
	 
	 protected IOpResponse handleAbort() {
		       return (IOpResponse)LOG.traceExit(this.HELPER.waitResponse());
	    }
	 
	 protected IOpResponse handleVoid() {
	       EntryMessage m = LOG.traceEntry();
	       ITenderLineItem tenderLine = (ITenderLineItem)this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
	       tenderLine.setVoid(true);
	       return (IOpResponse)LOG.traceExit(m, this.HELPER.silentErrorResponse());
	    }
	 
		
		protected OpChainKey getVerifiedRefundTenderOpChainKey() {
			      return OpChainKey.valueOf("VERIFIED_RETURN_PRE_TENDERING");
		}
		
		 protected OpChainKey getSaleTenderOpChainKey() {
		       return OpChainKey.valueOf("SALE_TENDER");
		  }
		 
		 protected OpChainKey getRefundTenderOpChainKey() {
			      return OpChainKey.valueOf("REFUND_TENDER");
		 }
		 
		 protected boolean shouldRunVerifiedReturnChain() {
	       IRetailTransaction transaction = (IRetailTransaction)this._transactionScope.getTransaction(TransactionType.RETAIL_SALE);
	 
	       if (!ItemLocator.getLocator().checkForAllVerifiedReturn(transaction)) {
	          return false;
	 
	 
	 
	       } else if (Boolean.TRUE.equals(this._transactionScope.getValue(TransactionScopeKeys.ORIGINAL_CREDITCARD_SELECTION_SKIPPED))) {
	 
	          return false;
	 
	 
	       } else {
	          Map<ICreditDebitTenderLineItem, ICreditDebitTenderLineItem> refMap = (Map)this._transactionScope.getValue(TransactionScopeKeys.ORIGINAL_CREDITCARD_MAPPING);
	 
	 
	          return !this._tenderHelper.getUsableTendersFromOriginalTransactions(transaction, this._returnMgr.getAllOrigTransaction(), refMap).isEmpty();
	       }
		}
			 /**
			  * Building Tender line item from response
			  * Setting encrypted Card Number
			  * Auth Method Code
			  * Trance Number
			  * @param response2
			  */
			public IOpResponse handleCDServResponse(ICDServMessageResponse response2) {
				
				LOG.debug("The handleresponse method in Op Class"+response2);
				MtoCDServAuthorizeTransferResponse response = (MtoCDServAuthorizeTransferResponse) response2;
				LOG.debug("The handleresponse method in Op Class"+response.getResponseCode());
				EntryMessage m = LOG.traceEntry();
				if(response.getResponseCode().equals(ICDServMessageResponse.ResponseCode.Approved)){
					 LOG.debug("CDServ Request has been approved ");
				      ITenderLineItem tenderLine = (ITenderLineItem)this.getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
				      TenderAmountData amountData = getScopedValue(ValueKeys.CURRENT_TENDER_AMOUNT_DATA);
				      
				      if(tenderLine instanceof ITenderLineItem) {
				    	  Tender _tender = this._tenderHelper.getTender(response.getCardType(), (long)this._stationState.getWorkstationId(), this.getSourceDescription());
				    	  // Adding Card specific features to existing tender lineitem
				    	  if(_tender != null) {
				    	  tenderLine.setTenderId(_tender.getTenderId());
				    	  tenderLine.setTenderDescription(_tender.getDescription());
				    	  
				    	  }
				    	  else {
				    		  String tndrType = response.getTenderType().toString();
				    		  if(tndrType.equals(TenderType.DEBIT.toString())) {
				    			  tndrType = MtoCDServConstants.CDSERV_DEBIT_CARD;
				    		  
				    		  Tender _tender1 = this._tenderHelper.getTender(tndrType, (long)this._stationState.getWorkstationId(), this.getSourceDescription());
				    		  tenderLine.setTenderId(_tender1.getTenderId());
					    	  tenderLine.setTenderDescription(_tender1.getDescription());
				    		  }
				    	  }
				    	  
				      }		     
				      if (tenderLine instanceof IAuthorizableTenderLineItem) {
				         IAuthorizableTenderLineItem atl = (IAuthorizableTenderLineItem)tenderLine;
				         atl.setAuthorizationCode(response.getAuthorizationCode().trim());
				         atl.setAuthorizationMethodCode(response.getAuthorizationResponseCode().trim());
				         
				      }
				      if(tenderLine instanceof ICreditDebitTenderLineItem) {
				    	  ICreditDebitTenderLineItem ctl = (ICreditDebitTenderLineItem)tenderLine;
				    	  
				         	((ICreditDebitTenderLineItem)ctl).setAccountNumber(response.getMaskedAccountNumber());
				         	((ICreditDebitTenderLineItem)ctl).setBankReferenceNumber(response.getReferenceCode().trim());
				           ((ICreditDebitTenderLineItem)ctl).setMaskAccountNumberDao(response.getMaskedAccountNumber().trim());
				            ((ICreditDebitTenderLineItem)ctl).setExpirationDateString(response.getCardExpiryMM()+response.getCardExpiryYY());
				            ((ICreditDebitTenderLineItem)ctl).setAmount(amountData.getEnteredAmount());
				            ((ICreditDebitTenderLineItem)ctl).setTraceNumber(response.getTraceNumber().trim());
				            ((ICreditDebitTenderLineItem)ctl).setMediaIssuerId(response.getPospadId().trim());;
				            ((ICreditDebitTenderLineItem)ctl).setBinNumber(response.getBankValueDate().trim());
				            ((ICreditDebitTenderLineItem)ctl).setPosAdditionalData(response.getDataEntry().trim());
				            ((ICreditDebitTenderLineItem)ctl).setTransactionReferenceData(response.getTrnLpsCode().trim());
				            
				      } 
				      boolean nnpResponse = validateNNPOrders(response);
					  if(nnpResponse) {
						  
						  return HELPER.getStartChainResponse(OpChainKey.valueOf("EFTLINK_VOID_TENDER"));
						  
					  }
					  
					}
				else {
					LOG.debug("Handling the Error codes");
					setOpState(POST_ERROR_PROMPT);
					return handleCDServMessages(response);
				}
				
				return HELPER.completeResponse();
				
				
			}
			/**
			 * Handling Error Scenarios
			 * setting tender to void
			 * @param argAction
			 * @return
			 */
		public IOpResponse handlePromptResponse(IXstAction argAction) {
		    IXstActionKey key = argAction.getActionKey();

		   if (key == XstDataActionKey.ACCEPT) {
			   ITenderLineItem tender = getScopedValue(ValueKeys.CURRENT_TENDER_LINE);
			   	tender.setVoid(true);
		        return this.handleNoResponse();

		       } 
		          LOG.error(key);
		          return this.HELPER.errorNotifyResponse();
		 }
			 
		/**
		 * Handling Error Scenarios
		 * setting tender to void
		 * @return
		 */
		protected IOpResponse handleNoResponse() {
		    IRetailTransaction transaction = (IRetailTransaction)this._transactionScope.getTransaction(TransactionType.RETAIL_SALE);
		    BigDecimal tranTotal = this._commonHelper.roundCurrency(transaction.getTotal());
		
		    if (tranTotal != null && tranTotal.compareTo(NumberUtils.ZERO) < 0) {
		       if (this.shouldRunVerifiedReturnChain()) {
		          return this.HELPER.getStartChainResponse(this.getVerifiedRefundTenderOpChainKey());
		
		
		       } else {
		          (new DefaultEventor(IDtvCustDisplayDevice.TENDER_CANCELLED_EVENT_DESCRIPTOR)).post(IDtvCustDisplayDevice.TENDER_CANCELLED_EVENT);
		          return this.HELPER.getStartChainResponse(this.getRefundTenderOpChainKey());
		
		       }
		    } else {
		       return this.HELPER.getStartChainResponse(this.getSaleTenderOpChainKey());
		    }
		}
			
	/**
	 * Setting Long Running
	 * Message
	 */
				
	  public String getLongRunningMessage() {
		      return super.getLongRunningMessage() == null ? "_cdServProcessing" : super.getLongRunningMessage();
		      }
	  
	  /**
	   * Validating NNP Orders and Credit Card Payment
	   * It is restricted
	   * @param response
	   * @return
	   */
	 protected boolean validateNNPOrders(MtoCDServAuthorizeTransferResponse response) {
		  String nnpval=getNnpOrderTransactionType();
		  String txnType= selectedOrder.getTransactionType();
		  TenderType cardType = response.getTenderType();
			 if (selectedOrder != null && txnType != null
					 &&(txnType.equalsIgnoreCase(nnpval))
					 && cardType.equals(ICDServMessageResponse.TenderType.CREDIT))
			{
				 return true;
				 
			}
		  return false;
		  
	  }
	 /**
	  * Retrieving Order Type
	  * @return
	  */
	 public String getNnpOrderTransactionType() {
		   String value=MtoConfigurationMgr.getNnpOrderTransactionType();
	      return (value);
	    }
		  
 
}