package com.fallstudie.simulation.server;



import java.util.List;
import com.fallstudie.simulation.client.simulation.SimulationService;
import com.fallstudie.simulation.shared.*;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class SimulationServiceImpl extends RemoteServiceServlet implements
		SimulationService {

	@Override
	public List<Unternehmen> getUnternehmen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EigenesUnternehmen getEigenesUnternehmen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Simulationsversion getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
	}

