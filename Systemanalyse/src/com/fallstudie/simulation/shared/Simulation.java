package com.fallstudie.simulation.shared;

public class Simulation {

	private int simulationsJahr;
	private int version;
	private Unternehmen unternehmen;
	private int gewinn;
	private int umsatz;
	private double marktAnteil;
	private double nachfrageTendenz;
	
	//Konstruktor
	Simulation(int simulationsjahr, int version, Unternehmen unternehmen, int gewinn, int umsatz, double marktAnteil, double nachfrageTendenz){
	
		this.simulationsJahr = simulationsjahr;
		this.version = version;
		this.unternehmen = unternehmen;
		this.gewinn = gewinn;
		this.umsatz = umsatz;
		this.marktAnteil = marktAnteil;
		this.nachfrageTendenz = nachfrageTendenz;
	}
	
	// Getter-Methoden
	public int getSimulationsJahr() {
		return simulationsJahr;
	}
	public int getVersion() {
		return version;
	}
	public Unternehmen getUnternehmen() {
		return unternehmen;
	}
	public int getGewinn() {
		return gewinn;
	}
	public int getUmsatz() {
		return umsatz;
	}
	public double getMarktAnteil() {
		return marktAnteil;
	}
	public double getNachfrageTendenz() {
		return nachfrageTendenz;
	}	
}
