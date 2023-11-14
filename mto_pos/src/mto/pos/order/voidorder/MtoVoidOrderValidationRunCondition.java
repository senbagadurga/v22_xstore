package mto.pos.order.voidorder;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.QueryKey;
import dtv.pos.framework.op.AbstractRunCondition;
import dtv.pos.framework.scope.TransactionScope;
import dtv.pos.iframework.security.StationState;
import dtv.util.DateUtils;
import mto.pos.common.MtoValueKeys;
import mto.pos.order.MtoOrderList;
import mto.xst.query.results.MtoVoidOrderValidationResult;
/**
 * US#90370 Void Orders
 * @author afreenfathima.m
 *
 */
public class MtoVoidOrderValidationRunCondition extends AbstractRunCondition {
	@Inject
	protected TransactionScope _transactionScope;
	@Inject
	protected StationState _stationState;
	private final IQueryKey<MtoVoidOrderValidationResult> MTO_VOID_ORDER_VALIDATION = new QueryKey<MtoVoidOrderValidationResult>("MTO_VOID_ORDER_VALIDATION",MtoVoidOrderValidationResult.class);	
	
	protected boolean shouldRunImpl()  {
		MtoOrderList currentOrder = _transactionScope.getValue(MtoValueKeys.SELECTED_SIEBEL_ORDER);		
		if (currentOrder.getMtoPaymentRefNumber()!=null && !currentOrder.getMtoPaymentRefNumber().isEmpty())
	    { 	
    		String refNum = currentOrder.getMtoPaymentRefNumber();
			long refNumStore = Long.valueOf(refNum.substring(0, 5));
			long refNumReg = Long.valueOf(refNum.substring(5, 8));			
			long refNumTrans = Long.valueOf(refNum.substring(8));
			Date cdate = this._stationState.getCurrentBusinessDate();
			if((refNumStore==this._stationState.getRetailLocationId()) &&
						(refNumReg == this._stationState.getWorkstationId()))
			{
				Map<String, Object> params = new HashMap<>();
				params.put("argRetailLocationId", refNumStore);
				params.put("argWorkstationId", refNumReg);
				params.put("argBusinessDate", cdate);
				params.put("argTransactionSeq", refNumTrans);
				List<MtoVoidOrderValidationResult> validationFlag = DataFactory.getObjectByQueryNoThrow(MTO_VOID_ORDER_VALIDATION,params);
				if (validationFlag.get(0).getStatus()==1) 
				return false;
				else return true;
			}					
	    }
		return true;	
	}
}
