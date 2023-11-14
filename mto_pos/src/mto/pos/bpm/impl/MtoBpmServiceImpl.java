package mto.pos.bpm.impl;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dtv.servicex.IServiceHandler;
import dtv.servicex.IServiceHandlerFactory;
import dtv.servicex.ServiceType;
import mto.pos.bpm.MtoIBpmRequest;
import mto.pos.bpm.MtoIBpmResponse;
import mto.pos.bpm.MtoIBpmServices;

public class MtoBpmServiceImpl implements MtoIBpmServices{

	private static final Logger _logger = LogManager.getLogger(MtoBpmServiceImpl.class);
	
	@Inject
	private IServiceHandlerFactory _serviceHandler;
	
	public MtoIBpmResponse sendCreditDebitDetailsToBpm(MtoBpmRequest request)
	{
		MtoIBpmResponse response = null;
		try
		{
			IServiceHandler<MtoIBpmRequest,MtoIBpmResponse> reqHandler = this._serviceHandler.getServiceHandler(new ServiceType("BPM_LCS"));
			response	=	(MtoIBpmResponse)reqHandler.handleService(request, new ServiceType("BPM_LCS"));
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return response;
	}
}
