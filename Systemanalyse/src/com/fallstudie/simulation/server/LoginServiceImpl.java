package com.fallstudie.simulation.server;


import com.fallstudie.simulation.client.login.LoginSimulation;
import com.fallstudie.simulation.client.login.LoginService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {
	
	boolean kontrolle = false;

	public boolean getKennDaten(){
		
		// TODO: Datenbank 
//		String username = LoginSimulation.user1.getUsername();
//		String kennwort = LoginSimulation.user1.getKennwort();
		
		return true;
		
	}

	@Override
	public String loginServer(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
}
