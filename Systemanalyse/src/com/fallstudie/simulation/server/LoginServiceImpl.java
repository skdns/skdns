package com.fallstudie.simulation.server;


import java.net.UnknownHostException;

import com.fallstudie.simulation.client.login.LoginSimulation;
import com.fallstudie.simulation.client.login.LoginService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
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
		
		
		String kennwort = LoginSimulation.user1.getKennwort();
		String username = LoginSimulation.user1.getUsername();
		
//			Mongo mongo = new Mongo("localhost", 27017);
		
		DB db = getMongo().getDB("skdns");
		DBCollection collection = db.getCollection("login");
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", username);
		searchQuery.put("password", kennwort);
		
		DBCursor cursor = collection.find(searchQuery);
		DBObject dbObject = cursor.next();
		
		String dbusername = (String) dbObject.get("name");
		String dbkennwort = (String) dbObject.get("password");
					
		if((dbusername==username)&&(dbkennwort==kennwort)){
			return true;
		}else return false;
		
		
		//return true;
		
	}

	@Override
	public String loginServer(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	private static Mongo getMongo() {
        Mongo m = null;
	 
        try {
            m = new Mongo("localhost", 27017);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return m;
	}
}

