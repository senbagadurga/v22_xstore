package mto.pos.common;

import dtv.pos.common.ConfigurationMgr;


public class MtoConfigurationMgr extends ConfigurationMgr{
	 private static MtoSysConfigSettingFactory _settingsFactory;
	  
	  static void setConfigSettingFactory(MtoSysConfigSettingFactory argFactory) {
	    _settingsFactory = argFactory;
	  }

	public static String getSiebelServiceEndPointURL() {
	    return _settingsFactory.getString(new String[] {"Order---SiebelOrderServiceEndPointURL"});
	}

	  public static String getSiebelServiceConnectTimeout() {
	    return _settingsFactory.getString(new String[] {"Order---SiebelServiceConnectTimeout"});
	  }

	  public static String getSiebelServiceRequestTimeout() {
	    return _settingsFactory.getString(new String[] {"Order---SiebelServiceRequestTimeout"});
	  }
	  
	  public static String getSiebelServiceOrderType() {
		    return _settingsFactory.getString(new String[] {"Order---SiebelServiceOrderType"});
		  }
	  
	  public static String getSiebelServiceOrderStatus() {
		    return _settingsFactory.getString(new String[] {"Order---SiebelServiceOrderStatus"});
		  }
	  public static String getSiebelServicePageSize() {
		    return _settingsFactory.getString(new String[] {"Order---SiebelServicePageSize"});
		  }
	  
	  public static String getSiebelServiceOrderDetailPageSize() {
		    return _settingsFactory.getString(new String[] {"Order---SiebelServiceOrderDetailPageSize"});
		  }
	  
	  public static String getOrderUpdateStatus() {
		    return _settingsFactory.getString(new String[] {"Order---SiebelOrderUpdateStatus"});
		  }
	
	  public static String getOrderUpdateVoidStatus() {
		    return _settingsFactory.getString(new String[] {"Order---SiebelOrderUpdateVoidStatus"});
		  }
	  
			/* START US# 89999 Disable Tender Type for NNP TY */
	  public static String getNnpOrderTransactionType() {
		    return _settingsFactory.getString(new String[] {"Order---NnpTransactionType"});
		  }
		/* END US# 89999 Disable Tender Type for NNP TY */
	  public static String getDefaultItemNotOnFile() {
		    return _settingsFactory.getString(new String[] {"Order---DefaultItemNotOnFile"});
		  }
}
