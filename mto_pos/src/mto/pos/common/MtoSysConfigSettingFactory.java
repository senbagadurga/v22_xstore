//$Id$
package mto.pos.common;

import com.micros.xstore.config.ISingleElementConfigMgr;
import com.micros.xstore.config.settings.SettingType;
import com.micros.xstore.config.settings.SysConfig;

import dtv.pos.common.SysConfigSettingFactory;

/**
 
 *
 * @author Nishanthi Babu
 * 
 * @version $Revision$
 */
public class MtoSysConfigSettingFactory extends SysConfigSettingFactory  {

  /** Constructs a <code>MtoSysConfigSettingFactory</code>.
   * @param argConfigMgr
   */
  public MtoSysConfigSettingFactory(ISingleElementConfigMgr<SysConfig, SettingType> argConfigMgr) {
    super(argConfigMgr);
  }
  
  public void mtoInitializeConfigurationMgr() {
    MtoConfigurationMgr.setConfigSettingFactory(this);
  }
}
