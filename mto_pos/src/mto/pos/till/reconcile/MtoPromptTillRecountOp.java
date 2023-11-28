package mto.pos.till.reconcile;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.ObjectNotFoundException;
import dtv.data2.access.QueryKey;
import dtv.pos.common.ConfigurationMgr;
import dtv.pos.common.ValueKeys;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.till.count.CountSummaryItem;
import dtv.pos.till.count.PromptTillCountOp;
import dtv.pos.till.count.TillCountModel;
import dtv.xst.dao.tsn.ISession;
import dtv.xst.dao.tsn.ISessionTender;
import dtv.xst.dao.tsn.ISessionTenderProperty;

public class MtoPromptTillRecountOp extends PromptTillCountOp {
	private static final Logger logger_ = LogManager.getLogger(MtoPromptTillRecountOp.class);
	private static final IQueryKey<ISessionTenderProperty> MTO_RECOUNT_SESSION = new QueryKey<ISessionTenderProperty>("MTO_RECOUNT_SESSION",
			ISessionTenderProperty.class);
	@Override
	protected IOpResponse handleInitialState(IXstEvent arg0) {
		ISession currentSession = (ISession)getScopedValue(ValueKeys.CURRENT_SESSION);
		List<ISessionTender> sestender = currentSession.getSessionTenders();
		for (ISessionTender sessionTender : currentSession.getSessionTenders()) {
			if(sessionTender.getTenderId().equalsIgnoreCase("CAD_CURRENCY")
					|| sessionTender.getTenderId().equalsIgnoreCase("CERTIFIED_FUND")
					|| sessionTender.getTenderId().equalsIgnoreCase("CHECK"))
			{
				long id =sessionTender.getSessionId();
				List<ISessionTenderProperty> sessionTenderProperty =getAllRecountSession(id);
				for (ISessionTenderProperty prop : sessionTenderProperty)		{
					if(prop.getTenderId().equalsIgnoreCase("CAD_CURRENCY")&& sessionTender.getTenderId().equalsIgnoreCase("CAD_CURRENCY")) {
						
						if (prop.getPropertyCode().equalsIgnoreCase("MEDIA_AMOUNT")) {
							sessionTender.setMediaAmount(prop.getDecimalValue()); }
							if (prop.getPropertyCode().equalsIgnoreCase("MEDIA_COUNT")) {
							sessionTender.setMediaCount(prop.getDecimalValue().intValue());}
					}
					else if(prop.getTenderId().equalsIgnoreCase("CERTIFIED_FUND")&& sessionTender.getTenderId().equalsIgnoreCase("CERTIFIED_FUND")) {
				
						if (prop.getPropertyCode().equalsIgnoreCase("MEDIA_AMOUNT")) {
							sessionTender.setMediaAmount(prop.getDecimalValue()); }
							if (prop.getPropertyCode().equalsIgnoreCase("MEDIA_COUNT")) {
							sessionTender.setMediaCount(prop.getDecimalValue().intValue());}
					}
					else if(prop.getTenderId().equalsIgnoreCase("CHECK")&& sessionTender.getTenderId().equalsIgnoreCase("CHECK")) {
						if (prop.getPropertyCode().equalsIgnoreCase("MEDIA_AMOUNT")) {
						sessionTender.setMediaAmount(prop.getDecimalValue()); }
						if (prop.getPropertyCode().equalsIgnoreCase("MEDIA_COUNT")) {
						sessionTender.setMediaCount(prop.getDecimalValue().intValue());}
					}
				}
				
			
			}
		}
		setScopedValue(ValueKeys.CURRENT_SESSION, currentSession);
		return super.handleInitialState(arg0);
	}
	@Override
	protected IOpResponse displaySummary(TillCountModel model) {
		logger_.error("MtoPromptTillCountOp.displaySummary starts");
		List<CountSummaryItem> list = model.getCountSummaryList();
		for (Iterator<CountSummaryItem> iterator = list.iterator(); iterator.hasNext();) {
			CountSummaryItem countSummaryItem = (CountSummaryItem) iterator.next();			
			logger_.error("total system amount [" + countSummaryItem.getTotalSystemAmount() + "]");
			logger_.error("total system count [" + countSummaryItem.getTotalSystemCount() + "]");
		}
		ISession currentSession = (ISession)getScopedValue(ValueKeys.CURRENT_SESSION);
		for (ISessionTender sessionTender : currentSession.getSessionTenders()) {
			logger_.error("tender part2 [" + sessionTender.getTenderId() + "]");
			logger_.error("session amount part 2[" + sessionTender.getMediaAmount() + "]");
			logger_.error("session count part 2[" + sessionTender.getMediaCount() + "]");
		}
		return super.displaySummary(model);
	}



	  @SuppressWarnings("unchecked")
	public List<ISessionTenderProperty> getAllRecountSession(Long argSessionId) {
	    List<ISessionTenderProperty> allRecountSession = Collections.emptyList();
	    try {
	      Map<String, Object> params = new HashMap<String, Object>();
	      params.put("argOrganizationId", ConfigurationMgr.getOrganizationId());
		  params.put("argRetailLocationId", this._stationState.getRetailLocationId());
		  params.put("argSessionId", argSessionId);
		 // params.put("argPropertyCode", "MEDIA_AMOUNT");
		  String[] includeTypeCodes = new String[] {"MEDIA_AMOUNT" ,"MEDIA_COUNT"};
			params.put("@argPropertyCode", Arrays.asList(includeTypeCodes));
	      allRecountSession = DataFactory.getObjectByQuery(MTO_RECOUNT_SESSION, params);
	    }
	    catch (ObjectNotFoundException ex) {
	      logger_.debug(ex);
	    }
	    catch (Exception ex) {
	      logger_.error("CAUGHT EXCEPTION", ex);
	    }
	    return allRecountSession;
	  }
}
