package com.fallstudie.simulation.client.login;


import java.util.List;

import com.fallstudie.simulation.shared.Unternehmen;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	
	String loginServer(String name) throws IllegalArgumentException;
	
	public boolean getKennDaten();

	
		
}
