package com.fallstudie.simulation.shared;

public class User {
	
	private String username  = new String();
	private String kennwort = new String();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKennwort() {
		return kennwort;
	}
	public void setKennwort(String kennwort) {
		this.kennwort = kennwort;
	}

//	public User(String kennwort, String username){
//		this.kennwort = kennwort;
//		this.username = username;
//	}
}
