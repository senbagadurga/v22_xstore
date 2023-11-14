package mto.pos.order.voidorder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.QueryKey;
import dtv.i18n.FormatterFactory;
import dtv.i18n.IFormattable;
import dtv.i18n.OutputContextType;
import dtv.pos.framework.op.AbstractPromptOp;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.action.IXstDataAction;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.security.StationState;
import dtv.util.NumberUtils;
import dtv.util.StringUtils;
import dtv.util.crypto.DtvDecrypter;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import mto.xst.query.results.MtoVoidOrdertTenderListResult;
/**
 * US#90370 Void Orders
 * @author afreenfathima.m
 *
 */
public class MtoPromptVoidOrderTenderListOp extends AbstractPromptOp{
	@Inject
	protected TransactionScope _transactionScope;	
	@Inject
	private FormatterFactory _formatterFactory;
	
	@Inject
	protected StationState _stationState;
	
	private final IQueryKey<MtoVoidOrdertTenderListResult> MTO_VOID_ORDER_TENDER_LIST = new QueryKey<MtoVoidOrdertTenderListResult>("MTO_VOID_ORDER_TENDER_LIST",MtoVoidOrdertTenderListResult.class);	
	@Override
	public String getDefaultPromptKey() {
		return "MTO_VOIDORDER_TENDER_PROMPT";
	}

	@Override
	public IOpResponse handlePromptResponse(IXstEvent arg0) {
		
		return this.HELPER.completeResponse();
	}
	protected IFormattable[] getPromptArgs(IXstEvent argEvent) {
		MtoOrderList currentOrder = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);				 	
		String refNum = currentOrder.getMtoPaymentRefNumber();
		long refNumStore = Long.valueOf(refNum.substring(0, 5));
		long refNumReg = Long.valueOf(refNum.substring(5, 8));			
		long refNumTrans = Long.valueOf(refNum.substring(8));
		Date cdate = this._stationState.getCurrentBusinessDate();	
		Map<String, Object> params = new HashMap<>();
		params.put("argRetailLocationId", refNumStore);
		params.put("argWorkstationId", refNumReg);
		params.put("argBusinessDate", cdate);
		params.put("argTransactionSeq", refNumTrans);
		List<MtoVoidOrdertTenderListResult> resultList = DataFactory.getObjectByQueryNoThrow(MTO_VOID_ORDER_TENDER_LIST,params);		
		StringBuilder values = new StringBuilder();
		int size = resultList.size();BigDecimal amount = null;
		if(resultList != null && !resultList.isEmpty())
    	{
			for (int index = 0; index<size; index++) {
				MtoVoidOrdertTenderListResult voidTenderList = resultList.get(index);
				if(voidTenderList.getTender()!=null && !voidTenderList.getTender().isEmpty()) {
					if(voidTenderList.getTender().equalsIgnoreCase("CAD_CURRENCY")&&voidTenderList.getStatus().equalsIgnoreCase("Tender")) {
						if(index == size-2 && resultList.get(size-1).getStatus().equalsIgnoreCase("Change")) {
							amount = NumberUtils.add( voidTenderList.getAmount(), resultList.get(size-1).getAmount());
						}else amount=voidTenderList.getAmount();							
						String formattedAmount = this._formatterFactory.getMoneyFormatter().format(amount, OutputContextType.VIEW);
						StringUtils.appendLine(values,"Cash: CAD"+" "+formattedAmount.substring(1));
					}else if(voidTenderList.getTender().equalsIgnoreCase("CHECK") &&voidTenderList.getStatus().equalsIgnoreCase("Tender")) {
						if(index == size-2 && resultList.get(size-1).getStatus().equalsIgnoreCase("Change")) {
							amount = NumberUtils.add( voidTenderList.getAmount(), resultList.get(size-1).getAmount());
						}else amount=voidTenderList.getAmount();	
						String formattedAmount = this._formatterFactory.getMoneyFormatter().format(amount, OutputContextType.VIEW);
						StringUtils.appendLine(values,"Cheque #"+voidTenderList.getNum()+" - CAD "+formattedAmount.substring(1));
					}else if(voidTenderList.getTender().equalsIgnoreCase("CERTIFIED_FUND") &&voidTenderList.getStatus().equalsIgnoreCase("Tender")) {
						if(index == size-2 && resultList.get(size-1).getStatus().equalsIgnoreCase("Change")) {
							amount = NumberUtils.add( voidTenderList.getAmount(), resultList.get(size-1).getAmount());
						}else amount=voidTenderList.getAmount();	
						String formattedAmount = this._formatterFactory.getMoneyFormatter().format(amount, OutputContextType.VIEW);
						StringUtils.appendLine(values,"Certified Fund #:"+voidTenderList.getNum()+" - CAD "+formattedAmount.substring(1));
					}else if(voidTenderList.getTender().equalsIgnoreCase("STORED_CREDIT") &&voidTenderList.getStatus().equalsIgnoreCase("Tender")) {
						if(index == size-2 && resultList.get(size-1).getStatus().equalsIgnoreCase("Change")) {
							amount = NumberUtils.add( voidTenderList.getAmount(), resultList.get(size-1).getAmount());							
						}else amount=voidTenderList.getAmount();							
						String formattedAmount = this._formatterFactory.getMoneyFormatter().format(amount, OutputContextType.VIEW);
						StringUtils.appendLine(values,"Stored Credit: CAD "+formattedAmount.substring(1)+" is adjusted in customer's Stored Credit Account");
					}else if(voidTenderList.getTender().equalsIgnoreCase("PREPAID_PAYMENT") &&voidTenderList.getStatus().equalsIgnoreCase("Tender")) {
						if(index == size-2 && resultList.get(size-1).getStatus().equalsIgnoreCase("Change")) {
							amount = NumberUtils.add( voidTenderList.getAmount(), resultList.get(size-1).getAmount());
						}else amount=voidTenderList.getAmount();	
						String formattedAmount = this._formatterFactory.getMoneyFormatter().format(amount, OutputContextType.VIEW);
						StringUtils.appendLine(values,"Prepaid Payment: CAD "+formattedAmount.substring(1));
					}else if((voidTenderList.getTender().equalsIgnoreCase("CREDIT_CARD") || 
								voidTenderList.getTender().equalsIgnoreCase("DEBIT_CARD") ||
									voidTenderList.getTender().equalsIgnoreCase("AMEX") ||
										voidTenderList.getTender().equalsIgnoreCase("VISA") ||
											voidTenderList.getTender().equalsIgnoreCase("MASTER_CARD") ) 
												&&voidTenderList.getStatus().equalsIgnoreCase("Tender")) {
						if(index == size-2 && resultList.get(size-1).getStatus().equalsIgnoreCase("Change")) {
							amount = NumberUtils.add( voidTenderList.getAmount(), resultList.get(size-1).getAmount());
						}else amount=voidTenderList.getAmount();						
						String cardNum=DtvDecrypter.getInstance("ccenc").decrypt(voidTenderList.getNum()).substring(10);
						//String cardNum="452001******7331";						
						String formattedAmount = this._formatterFactory.getMoneyFormatter().format(amount, OutputContextType.VIEW);
						StringUtils.appendLine(values,"Credit/Debit Card# "+cardNum+" - CAD "+formattedAmount.substring(1));
					}
				}
				
			}
    	}
		IFormattable[] args = new IFormattable[]{this._formattables.getLiteral(values.toString())};		
		return args;		
	}
	
	protected IOpResponse handleDataAction(IXstDataAction argEvent) {
		return this.HELPER.completeResponse();	
	}
	
}