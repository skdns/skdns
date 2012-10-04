package com.fallstudie.simulation.shared;

public class EigenesUnternehmen extends Unternehmen{
	
	
	private double fixkosten;
	private Maschinen maschinen;
	private Maﬂnahmen maﬂnahmen;
	private int mitarbeiterGehalt;
	private int mitarbeiterAnzahl;
	// Konstruktor
	EigenesUnternehmen(int umsatz, int gewinn, double marktAnteil,
			double nachfrageTendenz, Produkt produkt, double fixkosten, 
			Maschinen maschinen, Maﬂnahmen maﬂnahmen, int mitarbeiterGehalt, int mitarbeiterAnzahl) {
		super(umsatz, gewinn, marktAnteil, nachfrageTendenz, produkt);
		this.fixkosten = fixkosten;
		this.maschinen = maschinen;
		this.maﬂnahmen = maﬂnahmen;
		this.mitarbeiterGehalt = mitarbeiterGehalt;
		this.mitarbeiterAnzahl = mitarbeiterAnzahl;
	}
	
	// Getter-Setter-Methoden
	public double getFixkosten() {
		return fixkosten;
	}
	public void setFixkosten(double fixkosten) {
		this.fixkosten = fixkosten;
	}
	public Maschinen getMaschinen() {
		return maschinen;
	}
	public void setMaschinen(Maschinen maschinen) {
		this.maschinen = maschinen;
	}
	public Maﬂnahmen getMaﬂnahmen() {
		return maﬂnahmen;
	}
	public void setMaﬂnahmen(Maﬂnahmen maﬂnahmen) {
		this.maﬂnahmen = maﬂnahmen;
	}
	public int getMitarbeiterGehalt() {
		return mitarbeiterGehalt;
	}
	public void setMitarbeiterGehalt(int mitarbeiterGehalt) {
		this.mitarbeiterGehalt = mitarbeiterGehalt;
	}
	public int getMitarbeiterAnzahl() {
		return mitarbeiterAnzahl;
	}
	public void setMitarbeiterAnzahl(int mitarbeiterAnzahl) {
		this.mitarbeiterAnzahl = mitarbeiterAnzahl;
	}

}
