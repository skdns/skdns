package com.fallstudie.simulation.client.home;

import java.util.List;

import com.fallstudie.simulation.shared.Unternehmen;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HomeServiceAsync {

	void getUnternehmen(AsyncCallback<List<Unternehmen>> callback);

	void loginServer(String name, AsyncCallback<String> callback);

}
