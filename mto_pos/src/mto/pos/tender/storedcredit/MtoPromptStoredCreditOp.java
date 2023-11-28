package mto.pos.tender.storedcredit;


import java.math.BigDecimal;
import java.util.Currency;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dtv.i18n.FormatterFactory;
import dtv.i18n.IFormattable;
import dtv.pos.common.OpChainKey;
import dtv.pos.framework.action.type.XstDataActionKey;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.framework.op.req.SecurityResponse;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.action.IXstAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.tender.TenderHelper;
import dtv.util.Money;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;


/**
 * US#89136 Tender Type Stored Credit
 * @author kameswari.srishtu
 *
 */

public class MtoPromptStoredCreditOp extends AbstractPromptOp {
	private static final Logger _logger = LogManager.getLogger(MtoPromptStoredCreditOp.class);

	@Inject
	protected TransactionScope _transactionScope;
	
	@Inject
	public TenderHelper _tenderHelper;
	
	@Inject
    private FormatterFactory _formatterFactory;
	
	  @Override 
	  public boolean isOperationApplicable() 
	  { 
		  MtoOrderList orders = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
	      BigDecimal storedCreditBalance = orders.getMtoAccountSCBalance();
		// BigDecimal storedCreditBalance= new BigDecimal(50);
		  if(storedCreditBalance !=null && storedCreditBalance.intValue() > 0) {
			  return true;
			}
	  
		  return false;
	  
	  }
	
    @Override
	public String getDefaultPromptKey() {
		return "MTO_STORED_CREDIT";
	} 
    
   
	protected IOpResponse handleSecurityFailure(IXstEvent argEvent, SecurityResponse argResponse) {
		return this.HELPER.silentErrorResponse();
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent argEvent) {
		IOpResponse response;
		if(argEvent instanceof IXstAction && ((IXstAction)argEvent).getActionKey().equals(XstDataActionKey.YES)) {
			setScopedValue(MtoValueKeys.MTO_IS_REDEEM_STORED_CREDIT, true);
			response = HELPER.getStartChainResponse(OpChainKey.valueOf("MTO_ADD_STORED_CREDIT_TENDER"));
		}
		else {
			setScopedValue(MtoValueKeys.MTO_IS_REDEEM_STORED_CREDIT, false);
			response = HELPER.completeResponse();
		}
		
		return response;
	}
	
	@Override
	protected IFormattable[] getPromptArgs(final IXstEvent argEvent) {
		MtoOrderList selectedOrder = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);
		 BigDecimal storedCreditBalance = selectedOrder.getMtoAccountSCBalance();
		  Money money = new Money(storedCreditBalance, Currency.getInstance(this._tenderHelper.getLocalCurrency().getCurrencyId()));
			return money != null ? new IFormattable[]{this._formattables.getSimpleFormattable(money, this._formatterFactory.getMoneyFormatter())} : super.getPromptArgs(argEvent);
	}

	
}