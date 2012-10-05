package com.fallstudie.simulation.client.simulation;

import java.util.List;

import com.fallstudie.simulation.shared.EigenesUnternehmen;
import com.fallstudie.simulation.shared.Simulationsversion;
import com.fallstudie.simulation.shared.Unternehmen;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SimulationServiceAsync {

	void getUnternehmen(AsyncCallback<List<Unternehmen>> callback);

	void getEigenesUnternehmen(AsyncCallback<EigenesUnternehmen> callback);

	void getVersion(AsyncCallback<Simulationsversion> callback);
	
	

}
