package com.fallstudie.simulation.shared;

import java.io.Serializable;

public class Produkt implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5316708476771163337L;
	private int menge;
	private double preis;


	// Getter-Setter-Methode
	public int getMenge() {
		return menge;
	}
	public void setMenge(int menge) {
		this.menge = menge;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	

}
