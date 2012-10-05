package com.fallstudie.simulation.shared;

public class Unternehmen {
	
	private int umsatz;
	private int gewinn;
	private double marktAnteil;
	private String nachfrageTendenz;
	private Produkt produkt;
	 
	
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
	public String getNachfrageTendenz() {
		return nachfrageTendenz;
	}
	public void setNachfrageTendenz(String nachfrageTendenz) {
		this.nachfrageTendenz = nachfrageTendenz;
	}
	public Produkt getProdukt() {
		return produkt;
	}
	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	
	

}
