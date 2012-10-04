package com.fallstudie.simulation.shared;

public class Produkt {
	
	private int menge;
	private double preis;
	private double qualitaet;
	// Konstruktor
	Produkt(int menge, double preis, double qualitaet){
		this.menge = menge;
		this.preis = preis;
		this.qualitaet = qualitaet;
	}
	
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
	public double getQualitaet() {
		return qualitaet;
	}
	public void setQualitaet(double qualitaet) {
		this.qualitaet = qualitaet;
	}
	
	

}
