/** Copyright (c) Ministry of Transportation, Ontario. All rights reserved. 
 * 
 * 	Rev 1.0   Oct 01 2015 CharlesNa1
 * 	Enum variables for Credit Request
 * 
 *  Rev 1.1   Oct 01 2015 CharlesNa1
 *  Enum variable for CDServe Admin
 * 
 */
package mto.tenderauth.cdserv;



public enum MTOCDServeCodes {

	CD_SERVE_REQUEST_ADM("CD_SERVE_REQUEST_ADM","ADM"),
	CD_SERVE_REQUEST_FIN("CD_SERVE_REQUEST_FIN","FIN"), 
	CD_SERVE_REQUEST_TXT("CD_SERVE_REQUEST_TXT","TXT"), 
	CD_SERVE_REQUEST_OPID("CD_SERVE_REQUEST_OPID","2"), 
	CD_SERVE_REQUEST_PRID("CD_SERVE_REQUEST_PRID","0251"), 
	CD_SERVE_REQUEST_AUTH("CD_SERVE_REQUEST_AUTH","54"), 
	CD_SERVE_REQUEST_REVERSAL("CD_SERVE_REQUEST_REVERSAL","59"), 
	CD_SERVE_REQUEST_CUST("CD_SERVE_REQUEST_CUST","1"), 
	CD_SERVE_REQUEST_VOID("CD_SERVE_REQUEST_VOID","58"), 
	CD_SERVE_RSP_RESPONSE_CODE("CD_SERVE_RSP_RESPONSE_CODE","0"), 
	CD_SERVE_RSP_CODE("CD_SERVE_RSP_CODE","000"), 
	CD_SERVE_MTO_RESPONSE_CODE("CD_SERVE_MTO_RESPONSE_CODE","AA"), 
	CD_SERVE_CARD_TYPE_CREDIT("CD_SERVE_CARD_TYPE_CREDIT","C"), 
	CD_SERVE_CARD_TYPE_DEBIT("CD_SERVE_CARD_TYPE_DEBIT","D");
	
	  private String value = null;
	  private String defaultValue = null;
	  
	  private MTOCDServeCodes(String key)
	  {
	    this.value = System.getProperty(key, "CDServeCodes.properties");
	  }
	  
	  private MTOCDServeCodes(String key, String defaultValue)
	  {
	  //  this.value = Sys.getProperty(key, defaultValue, "CDServeCodes.properties");
		this.value = System.getProperty(key, defaultValue);
	    this.defaultValue = defaultValue;
	  }
	  
	  public String getValue()
	  {
	    return this.value;
	  }
	  
	  public String getDefaultValue()
	  {
	    return this.defaultValue;
	  }	
	}