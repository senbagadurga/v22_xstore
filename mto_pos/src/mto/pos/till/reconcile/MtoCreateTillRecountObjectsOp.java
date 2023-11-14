package mto.pos.till.reconcile;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import dtv.pos.common.TransactionType;
import dtv.pos.common.ValueKeys;
import dtv.pos.iframework.ILocationFactory;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.tender.TenderHelper;
import dtv.pos.till.TillHelper;
import dtv.pos.till.count.AbstractCreateTillCountObjectsOp;
import dtv.pos.till.types.SessionStatusCode;
import dtv.util.IDateProvider;
import dtv.util.NumberUtils;
import dtv.xst.cleandto.tnd.Tender;
import dtv.xst.dao.tnd.TenderCategory;
import dtv.xst.dao.tsn.ISession;
import dtv.xst.dao.tsn.ISessionTender;
import dtv.xst.dao.tsn.ISessionWorkstation;
import dtv.xst.dao.tsn.ITenderControlTransaction;
import dtv.xst.dao.tsn.ITenderCount;
import dtv.xst.dao.tsn.ITenderTypeCount;
import mto.pos.common.MtoValueKeys;

public class MtoCreateTillRecountObjectsOp extends AbstractCreateTillCountObjectsOp {
	
	private static final Logger logger_ = LogManager.getLogger(MtoCreateTillRecountObjectsOp.class);
    @Inject
    private TenderHelper _tenderHelper;
    @Inject
    private TillHelper _tillHelper;
    @Inject
    private ILocationFactory _locationFactory;
 
    public IOpResponse handleOpExec(IXstEvent argEvent) {
       IOpResponse response = super.handleOpExec(argEvent);
 
 
       ITenderControlTransaction transaction = (ITenderControlTransaction)this._transactionScope.getTransaction(TransactionType.TENDER_CONTROL);
       ISession storeSafeSession = this._tillHelper.getStoreSafeSession((long)this._stationState.getRetailLocationId());
       ISession outboundSession = (ISession)this.getScopedValue(ValueKeys.CURRENT_SESSION);
 
       transaction.setInboundSession(storeSafeSession);
       transaction.setOutboundSession(outboundSession);
       transaction.setInboundTenderRepository(storeSafeSession.getTenderRepository());
       transaction.setOutboundTenderRepository(outboundSession.getTenderRepository());
 
       if (!this._locationFactory.getStoreById((long)this._stationState.getRetailLocationId()).getUseTillAccountability()) {
          outboundSession.getTenderRepository().getTenderRepositoryStatus().setIssued(false);
          outboundSession.getTenderRepository().getTenderRepositoryStatus().clearActiveSessionId();
 
       }
 
       Iterator var6 = outboundSession.getSessionTenders().iterator();     
       while(var6.hasNext()) 
       {        
    	   ISessionTender sessionTender = (ISessionTender)var6.next();
	    	  if(sessionTender.getTenderId().equalsIgnoreCase("CAD_CURRENCY") ||
	 				 sessionTender.getTenderId().equalsIgnoreCase("CERTIFIED_FUND") ||
	 				  sessionTender.getTenderId().equalsIgnoreCase("CHECK")) 
	 				 {
	 				 sessionTender.setDecimalProperty("Media_Amount",sessionTender.getMediaAmount()); 
	 				 sessionTender.setDecimalProperty("Media_Count", new BigDecimal(sessionTender.getMediaCount()));
	 				 }
	 				 sessionTender.setMediaAmount(NumberUtils.ZERO);
	                sessionTender.setMediaCount(0);
 
       }
 
       var6 = transaction.getTenderTypeCounts().iterator();      while(true) {         while(var6.hasNext()) {            ITenderTypeCount tenderTypeCount = (ITenderTypeCount)var6.next();
             List<ITenderCount> tenderCountList = tenderTypeCount.getTenderCounts();
 
             if (!tenderCountList.isEmpty()) {
                BigDecimal total = NumberUtils.ZERO;
                int totalCount = 0;
 
                Iterator var11 = tenderCountList.iterator();               while(var11.hasNext()) {                  ITenderCount tenderCount = (ITenderCount)var11.next();
                   total = total.add(tenderCount.getAmount());
                   totalCount += tenderCount.getMediaCount();
                   ISessionTender sessionTender = this._tillHelper.getSessionTender(storeSafeSession, tenderCount.getTenderId(), Long.valueOf((long)this._stationState.getWorkstationId()), this.getSourceDescription());
 
 
                   sessionTender.setMediaAmount(NumberUtils.nonNull(sessionTender.getMediaAmount()).add(NumberUtils.nonNull(tenderCount.getAmount())));
 
                   sessionTender.setMediaCount(sessionTender.getMediaCount() + tenderCount.getMediaCount());
                }
 
                if (total.compareTo(tenderTypeCount.getAmount()) < 0) {
                   total = tenderTypeCount.getAmount().subtract(total);
                   totalCount = tenderTypeCount.getMediaCount() - totalCount;
 
                   List<Tender> tenders = this._tenderHelper.getAvailableIncludeInTypeCountTendersForCategory(this._transDateProvider, TenderCategory.forName(tenderTypeCount.getTenderTypeCode()), (long)this._stationState.getWorkstationId());
 
 
 
                   if (tenders != null && tenders.size() > 0) {
                      ISessionTender sessionTender = this._tillHelper.getSessionTender(storeSafeSession, ((Tender)tenders.get(0)).getTenderId(), Long.valueOf((long)this._stationState.getWorkstationId()), this.getSourceDescription());
 
 
                      sessionTender.setMediaAmount(NumberUtils.nonNull(sessionTender.getMediaAmount()).add(NumberUtils.nonNull(total)));
 
                      sessionTender.setMediaCount(sessionTender.getMediaCount() + tenderTypeCount.getMediaCount());
 
 
                   }
                }
             } else {
                List<Tender> tenders = this._tenderHelper.getAvailableIncludeInTypeCountTendersForCategory(this._transDateProvider, TenderCategory.forName(tenderTypeCount.getTenderTypeCode()), (long)this._stationState.getWorkstationId());
 
 
 
                if (tenders != null && tenders.size() > 0) {
                   ISessionTender sessionTender = this._tillHelper.getSessionTender(storeSafeSession, ((Tender)tenders.get(0)).getTenderId(), Long.valueOf((long)this._stationState.getWorkstationId()), this.getSourceDescription());
 
 
                   sessionTender.setMediaAmount(NumberUtils.nonNull(sessionTender.getMediaAmount()).add(NumberUtils.nonNull(tenderTypeCount.getAmount())));
 
                   sessionTender.setMediaCount(sessionTender.getMediaCount() + tenderTypeCount.getMediaCount());
                }
             }
          }
 
          if (logger_.isDebugEnabled()) {
             logger_.debug(storeSafeSession);
             logger_.debug(outboundSession);
          }
 
          return response;
       }
    }
 
 
    protected SessionStatusCode getSessionStatusCode() {
       return this._locationFactory.getStoreById((long)this._stationState.getRetailLocationId()).getUseTillAccountability() ? SessionStatusCode.ENDCOUNT : SessionStatusCode.RECONCILED;
    }
}