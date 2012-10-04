package com.fallstudie.simulation.shared;

public class Maschinen {
	
	private int kapazitaet;
	private int nutzungsDauer;
	private int noetigeMitarbeiter;
	private double buchwert;
	//Konstruktor
	Maschinen(int kapazitaet, int nutzungsDauer, int noetigeMitarbeiter, double buchwert){
		this.kapazitaet = kapazitaet;
		this.nutzungsDauer = nutzungsDauer;
		this.noetigeMitarbeiter = noetigeMitarbeiter;
		this.buchwert = buchwert;
	}
	
	// Getter-Setter-Methoden
	public int getKapazitaet() {
		return kapazitaet;
	}
	public int getNutzungsDauer() {
		return nutzungsDauer;
	}
	public int getNoetigeMitarbeiter() {
		return noetigeMitarbeiter;
	}
	public double getBuchwert() {
		return buchwert;
	}
	public void setBuchwert(double buchwert) {
		this.buchwert = buchwert;
	}
	

}
