package mto.pos.systemcycle.businessdate;

import java.util.Date;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import dtv.pos.common.ValueKeys;
import dtv.pos.framework.op.Operation;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.storecalendar.DateOutOfRangeException;
import dtv.pos.storecalendar.IStoreCalendar;
import dtv.util.DtvDate;
import mto.pos.common.MtoValueKeys;

/**
 * Prompting for Valid Business date
 * While Store Open
 * Bug#102275
 * @author kameswari.srishtu
 *
 */

public class MtoGetCurrentBusinessDateOp extends Operation{
	protected static Logger logger = Logger.getLogger(MtoGetCurrentBusinessDateOp.class);

	
	@Inject
	private IStoreCalendar _storeCalendar;
	

	private String businessDate_ = null;
	Date nextValidParsedDate;

	
	
	@Override
	 public IOpResponse handleOpExec(IXstEvent argEvent) {
		   DtvDate currentBusinessDate = this._stationState.getCurrentBusinessDate();  
		   logger.error("The last opened businessDate is"+currentBusinessDate);
		   logger.error("Parameter businessDate is"+businessDate_);
		   Date result;
		   if (this.businessDate_ != null) {


		      result = currentBusinessDate;



		   } else {
		      result = this.getDateToOpen(currentBusinessDate);
		   }

		   //this.setScopedValue(ValueKeys.PROPOSED_BUSINESS_DATE, result);
		   this.setScopedValue(ValueKeys.PROPOSED_BUSINESS_DATE, result);
		   setScopedValue(MtoValueKeys.ACTUAL_PROPOSED_BUSINESS_DATE,result);
		   
		   return this.HELPER.completeResponse();
		}

	
	public Date getDateToOpen(DtvDate currentBusinessDate) {
		 Date today = currentBusinessDate;
		 Date nextValidOpenDate = currentBusinessDate ;
		 
		try {
			nextValidOpenDate =  _storeCalendar.getNextOpenDate(today, this._stationState.getRetailLocationId());
		} catch (DateOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (Date) (!this._storeCalendar.preferOpenOnCurrentSystemDate()
				&& currentBusinessDate.compareTo(today) == 0
						 ? nextValidOpenDate : nextValidOpenDate);
		
	}

		@Override
		public boolean isOperationApplicable() {
		   //Date currentDate = (Date)this.getScopedValue(ValueKeys.PROPOSED_BUSINESS_DATE);

		   return true;
		}






		public void setParameter(String argName, String argValue) {
		   if ("BUSINESSDATE".equalsIgnoreCase(argName)) {
		      this.businessDate_ = argValue;

		   } else {
		      super.setParameter(argName, argValue);
		   }
		}
}