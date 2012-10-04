package com.fallstudie.simulation.client.login;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

	void getKennDaten(AsyncCallback<Boolean> callback);

	void loginServer(String name, AsyncCallback<String> callback);

}
