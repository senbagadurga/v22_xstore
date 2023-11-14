package mto.pos.report.tillclose;

import dtv.data2.access.DataFactory;
import dtv.data2.access.IQueryKey;
import dtv.data2.access.QueryKey;
import dtv.pos.common.ConfigurationMgr;
import dtv.pos.iframework.reporting.IReportParamChoiceLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/*
 *  <!--NewTillReport-->
 */
public class MtoTillSummaryReportSessionIdLoader implements IReportParamChoiceLoader {	
	
   private static final IQueryKey<Object[]> MTO_TSR_SESSIONID = new QueryKey<Object[]>("MTO_TSR_SESSIONID", Object[].class);

   public List<? extends Object> getInstances() throws Exception {
      return this.getInstances(Long.toString(ConfigurationMgr.getOrganizationId()));
   }

public final List<Object> getInstances(String argOrganizationId) {		      
    
      Long orgId = argOrganizationId == null ? ConfigurationMgr.getOrganizationId() : Long.parseLong(argOrganizationId);
      Map<String, Object> params = new HashMap<String, Object>();
      params.put("argOrganizationId", orgId);
      List<Object[]> workCodes = DataFactory.getObjectByQueryNoThrow(MTO_TSR_SESSIONID, params);

      List<Object> result = new ArrayList<Object>(workCodes.size());
      Iterator<Object[]> var7 = workCodes.iterator();      
      while(var7.hasNext()) {          	  
    	  Object[] oa = (Object[])var7.next();
    	  result.add(oa[0]);
      }
      return result;
   }
}
