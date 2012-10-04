package com.fallstudie.simulation.client.simulation;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.fallstudie.simulation.client.home.*;

public class Simulation implements EntryPoint{
	
	AbsolutePanel absolutePanelSimulation = new AbsolutePanel();
	Label labelHome = new Label("Home");
	Label lblSimulation = new Label(">  Simulation");
	Button btnLogout = new Button("Logout");
	HorizontalPanel horizontalPanel = new HorizontalPanel();
	AbsolutePanel absolutePanelEigenesUN = new AbsolutePanel();
	AbsolutePanel [] absolutePanelUnternehmen = new AbsolutePanel[3];	
	AbsolutePanel[] absolutePanelJahre = new AbsolutePanel[100];
	Label labelEigenesUnternehmen = new Label("Eigenes Unternehmen");
	Label labelUmsatz = new Label("Umsatz:");
	Label labelGewinn = new Label("Gewinn:");
	Label labelMarktanteil = new Label("Marktanteil:");
	Label labelNachfrageTendenz = new Label("Nachfragetendenz:");
	Label labelUmsatzEUN = new Label("0.00\u20AC");
	Label labelGewinnEUN = new Label("0.00\u20AC");
	Label labelMarktanteilEUN = new Label("0%");
	Label labelNachfrageEUN = new Label("steigend");
	Label [] labelUnternehmen = new Label[3];
	Label [] labelUmsatzUnternehmen = new Label  [3];
	Label [] labelUmsatzUnternehmenWert = new Label [3];
	Label [] labelGewinnUnternehmen = new Label[3];
	Label [] labelGewinnUnternehmenWert = new Label[3];
	Label [] labelMarktanteilUnternehmen = new Label[3];
	Label [] labelMarktanteilUnternehmenWert = new Label[3];
	Label [] labelNachfrageTendenzUnternehmen = new Label [3];
	Label [] labelNachfrageTendenzUnternehmenWert = new Label [3];
	AbsolutePanel absolutePanelInvestitionen = new AbsolutePanel();
	Label labelInvestitionen = new Label("Investitionen Eigenes Unternehmen");
	IntegerBox integerBoxMarketing = new IntegerBox();
	IntegerBox integerBoxMaschinen = new IntegerBox();
	IntegerBox integerBoxPersonal = new IntegerBox();
	Label labelMarketing = new Label("Marketing:");
	Label labelMaschinen = new Label("Maschinen:");
	Label labelPersonal = new Label("Personal:");
	Button buttonSimulation = new Button("Simulation starten");
	Button buttonFolgejahr = new Button("Folgejahr");
	AbsolutePanel absolutePanelJahrEins = new AbsolutePanel();
	TabPanel tabPanelJahre = new TabPanel();
	int jahr = 2;
	
	@Override
	public void onModuleLoad() {
		// allgemeine Panels
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setSize("1024", "768");
		rootPanel.add(absolutePanelSimulation, 10, 10);
		absolutePanelSimulation.setSize("1056px", "768px");
		
		
		// Panel, auf dem die Unternehmeninformationen angezeigt werden
				absolutePanelSimulation.add(horizontalPanel, 60, 100);
				horizontalPanel.setSize("894px", "160px");
					// Eigenes Unternehmen		
					horizontalPanel.add(absolutePanelEigenesUN);
					absolutePanelEigenesUN.setHeight("159px");
						// Label
						labelEigenesUnternehmen.setStyleName("gwt-UnternehmenLabel");
						labelEigenesUnternehmen.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
						absolutePanelEigenesUN.add(labelEigenesUnternehmen, 0, 0);
						labelEigenesUnternehmen.setSize("224px", "18px");		
						absolutePanelEigenesUN.add(labelUmsatz, 10, 24);		
						absolutePanelEigenesUN.add(labelGewinn, 10, 48);		
						absolutePanelEigenesUN.add(labelMarktanteil, 10, 72);
						absolutePanelEigenesUN.add(labelNachfrageTendenz, 10, 96);
						absolutePanelEigenesUN.add(labelUmsatzEUN, 129, 24);		
						absolutePanelEigenesUN.add(labelGewinnEUN, 129, 48);
						labelGewinnEUN.setSize("32px", "18px");		
						absolutePanelEigenesUN.add(labelMarktanteilEUN, 129, 72);
						labelMarktanteilEUN.setSize("32px", "18px");		
						absolutePanelEigenesUN.add(labelNachfrageEUN, 129, 96);
						labelNachfrageEUN.setSize("49px", "18px");
					// weitere Unternehmen
						// TODO: absolutePanelUnternehmen.length durch in der db gespeicherte Anzahl der UN ersetzen
					for (int i=0; i< absolutePanelUnternehmen.length; i++){
						int j = i+1;
						// neues Panel erzeugen 
						absolutePanelUnternehmen[i] = new AbsolutePanel();
						horizontalPanel.add(absolutePanelUnternehmen[i]);
						absolutePanelUnternehmen[i].setHeight("159px");
						// "Überschrift" anbringen
						labelUnternehmen[i] = new Label("Unternehmen " + j);
						labelUnternehmen[i].setStyleName("gwt-UnternehmenLabel");
						labelUnternehmen[i].setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
						absolutePanelUnternehmen[i].add(labelUnternehmen[i],0,0);				
						labelUnternehmen[i].setSize("224px", "18px");
						// neue Labels erzeugen
						labelUmsatzUnternehmen[i] = new Label("Umsatz:");
						labelGewinnUnternehmen[i] = new Label("Gewinn: ");
						labelMarktanteilUnternehmen[i] = new Label("Marktanteil:");
						labelNachfrageTendenzUnternehmen[i] = new Label("Nachfragetendenz:");
						//TODO: Werte aus der DB übernehmen
						labelUmsatzUnternehmenWert[i] = new Label("0.00");
						labelGewinnUnternehmenWert[i] = new Label("0.00");
						labelMarktanteilUnternehmenWert[i] = new Label("0%");
						labelNachfrageTendenzUnternehmenWert[i] = new Label("steigend");				
						// Labels auf dem Panel anbringen
						absolutePanelUnternehmen[i].add(labelUmsatzUnternehmen[i], 10, 24);		
						absolutePanelUnternehmen[i].add(labelGewinnUnternehmen[i], 10, 48);		
						absolutePanelUnternehmen[i].add(labelMarktanteilUnternehmen[i], 10, 72);
						absolutePanelUnternehmen[i].add(labelNachfrageTendenzUnternehmen[i], 10, 96);				
						absolutePanelUnternehmen[i].add(labelUmsatzUnternehmenWert[i], 129, 24);		
						absolutePanelUnternehmen[i].add(labelGewinnUnternehmenWert[i], 129, 48);
						labelGewinnUnternehmenWert[i].setSize("32px", "18px");		
						absolutePanelUnternehmen[i].add(labelMarktanteilUnternehmenWert[i], 129, 72);
						labelMarktanteilUnternehmenWert[i].setSize("32px", "18px");		
						absolutePanelUnternehmen[i].add(labelNachfrageTendenzUnternehmenWert[i], 129, 96);
						labelNachfrageTendenzUnternehmenWert[i].setSize("49px", "18px");				
					}
				
		// Panel, um die Investitionen zu tätigen		
		absolutePanelSimulation.add(absolutePanelInvestitionen, 84, 298);
		absolutePanelInvestitionen.setSize("700px", "127px");		
		
		labelInvestitionen.setStyleName("gwt-UnternehmenLabel");
		absolutePanelInvestitionen.add(labelInvestitionen, 10, 10);
		labelInvestitionen.setSize("282px", "18px");
		
		// Marketing Investitionen
		absolutePanelInvestitionen.add(labelMarketing, 20, 73);
		absolutePanelInvestitionen.add(integerBoxMarketing, 87, 60);
		integerBoxMarketing.setSize("94px", "25px");
		
		// Maschinen Investitionen
		absolutePanelInvestitionen.add(labelMaschinen, 253, 73);
		absolutePanelInvestitionen.add(integerBoxMaschinen, 326, 60);
		integerBoxMaschinen.setSize("94px", "25px");
		
		// Personal Investitionen
		absolutePanelInvestitionen.add(labelPersonal, 486, 73);
		absolutePanelInvestitionen.add(integerBoxPersonal, 547, 60);
		integerBoxPersonal.setSize("94px", "25px");
		
		
		// Button, um die Simulation mit den getätigten Investitionen zu starten	
		absolutePanelSimulation.add(buttonSimulation, 844, 310);
		buttonSimulation.setSize("127px", "35px");
		buttonSimulation.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// TODO Simulation starten
			}
		});
		
		// Button, um einen weiteren Tab für ein weiteres Jahr zu tätigen	
		absolutePanelSimulation.add(buttonFolgejahr, 844, 368);
		buttonFolgejahr.setSize("127px", "35px");
		buttonFolgejahr.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// weiteren Tab hinzufügen			
				absolutePanelJahre[jahr-2] = new AbsolutePanel();
				tabPanelJahre.add(absolutePanelJahre[jahr-2], "Jahr" + jahr , false);
				absolutePanelJahre[jahr-2].setSize("100%", "238");
				// IntegerBoxen leeren
				integerBoxMarketing.setValue(null);
				integerBoxMaschinen.setValue(null);
				integerBoxPersonal.setValue(null);
				jahr++;
				
				
			}
		});
		
			
		// Label, dass zeigt, in welcher Sicht der User sich befindet
				absolutePanelSimulation.add(labelHome, 30, 30);
				labelHome.setStyleName("gwt-Home-Label");
				absolutePanelSimulation.add(lblSimulation, 70, 30);
				
				
				
				
				
				
				// Button, um auf die Home-Seite zurückzukehren
				labelHome.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						RootPanel.get().clear();
						HomeSimulation home = new HomeSimulation();
						home.onModuleLoad();
					}
				});
				
				// Logout-Button
				btnLogout.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						//TODO: Logout
					}
				});
				absolutePanelSimulation.add(btnLogout, 948, 10);
				btnLogout.setSize("100px", "35px");
				
				// TabPanel, auf dem die Ergebnisse der Simulation angezeigt werden
				absolutePanelSimulation.add(tabPanelJahre, 60, 469);
				tabPanelJahre.setSize("894px", "238px");
				// erstes Jahr				
				tabPanelJahre.add(absolutePanelJahrEins, "Jahr 1", false);
				absolutePanelJahrEins.setSize("100%", "238");
				
				
				
	}
	
	
}
