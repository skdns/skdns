package com.fallstudie.simulation.client.simulation;

import java.util.List;

import com.fallstudie.simulation.shared.*;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("simulation")
public interface SimulationService extends RemoteService{

	List<Unternehmen> getUnternehmen();
	
	EigenesUnternehmen getEigenesUnternehmen();

	Simulationsversion getVersion();

	
}
