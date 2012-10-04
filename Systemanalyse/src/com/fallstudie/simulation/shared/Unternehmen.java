package com.fallstudie.simulation.shared;

public class Unternehmen {
	
	private int umsatz;
	private int gewinn;
	private double marktAnteil;
	private double nachfrageTendenz;
	private Produkt produkt;
	// Konstruktor
	Unternehmen (int umsatz, int gewinn, double marktAnteil, double nachfrageTendenz, Produkt produkt){
		
		this.umsatz = umsatz;
		this.gewinn = gewinn;
		this.marktAnteil = marktAnteil;
		this.nachfrageTendenz = nachfrageTendenz;
		this.produkt = produkt;
	}
	
	// Getter-Setter-Methoden
	public int getUmsatz() {
		return umsatz;
	}
	public void setUmsatz(int umsatz) {
		this.umsatz = umsatz;
	}
	public double getMarktAnteil() {
		return marktAnteil;
	}
	public void setMarktAnteil(double marktAnteil) {
		this.marktAnteil = marktAnteil;
	}
	public int getGewinn() {
		return gewinn;
	}
	public void setGewinn(int gewinn) {
		this.gewinn = gewinn;
	}
	public double getNachfrageTendenz() {
		return nachfrageTendenz;
	}
	public void setNachfrageTendenz(double nachfrageTendenz) {
		this.nachfrageTendenz = nachfrageTendenz;
	}
	public Produkt getProdukt() {
		return produkt;
	}
	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	
	

}
