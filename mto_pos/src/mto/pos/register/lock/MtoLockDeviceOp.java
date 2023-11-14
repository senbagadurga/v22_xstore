package mto.pos.register.lock;
import javax.inject.Inject;

import dtv.i18n.IFormattable;
import dtv.pos.common.ValueKeys;
import dtv.pos.framework.security.DefaultSystemUser;
import dtv.pos.iframework.IModeController;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.iframework.op.IOpState;
import dtv.pos.iframework.security.ISecurityMgr;
import dtv.pos.iframework.security.ISecurityRequest.AuthenticationStyle;
import dtv.pos.iframework.security.ISecurityResponse;
import dtv.pos.register.lock.LockRegisterOp;
import dtv.xst.daocommon.ISystemUser;
import dtv.ui.context.Context;

public class MtoLockDeviceOp extends LockRegisterOp {
    private IFormattable _loginDescription;
    @Inject
    private ISecurityMgr _securityMgr;
 
    public void setParameter(String argName, String argValue) {
       if ("loginDescription".equalsIgnoreCase(argName)) {
          this._loginDescription = this._formattables.getSimpleFormattable(argValue);
 
       } else {
          super.setParameter(argName, argValue);
       }
    }
 
 
    protected IOpResponse handleInitialState() {
       this.setOpState(this.LOCKED);
 
       this.setScopedValue(ValueKeys.PREVIOUS_SYSTEM_USER, this._stationState.getSystemUser());
       this.setScopedValue(ValueKeys.WORKSTATION_LOCKED, Boolean.TRUE);
 
       this._securityMgr.setSecurityPromptDescription(this._loginDescription);
       return this.HELPER.getSecurityAuthenticateResponse("UNLOCK_OTHERS_REGISTER", AuthenticationStyle.ONE_STEP);
    }
 
 
    protected IOpResponse handleUnlocked() {
       this.setScopedValue(ValueKeys.WORKSTATION_LOCKED, Boolean.FALSE);
       IOpResponse response = this.HELPER.completeResponse();
       return response;
    }
    
    @Override
    protected IOpResponse handleSecurityResponse(ISecurityResponse argSecurityResponse) {
    	   ISystemUser prevUser = (ISystemUser)this.getScopedValue(ValueKeys.PREVIOUS_SYSTEM_USER);
    	   boolean sameUser = this._securityMgr.isAuthenticatedUser(prevUser, argSecurityResponse.getSystemUser());

    	   if (!argSecurityResponse.successful() && !sameUser) { 
    		   Context context = ((IModeController)this._modeProvider.get()).getContextManager().getCurrentContext();
     	      if (!sameUser || context != null && context.getName().equals("REGISTER_LOCKED_TILL")) {
     	         this.restorePreviousUser(context != null && context.getName().equals("REGISTER_LOCKED_TILL") ? DefaultSystemUser.INSTANCE : prevUser);
     	      }

     	      super.handleUnlocked();


     	      restorePreviousUser(prevUser);
     	      this.setOpState((IOpState)null);
     	      return this.HELPER.getPromptResponse("UNLOCK_LOGIN_FAILED", new IFormattable[]{argSecurityResponse.getFailureReason()});
    	   } 
    	   
    	  
    	   return HELPER.completeResponse();
    	}
    
    protected void restorePreviousUser(ISystemUser argUser) {
    	      this._stationState.setSystemUser(argUser);
    	       this._securityMgr.notifyUserLogin(this._stationState.getSystemUser());
    	       this.clearScopedValue(ValueKeys.PREVIOUS_SYSTEM_USER);
    	  }
    
    
 }