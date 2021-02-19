package supermarkt;

import waren.Backwaren;
import waren.Getraenke;
import waren.Kleidung;
import waren.Lebensmittel;
import waren.NonFoodArtikel;

public class Supermarkt {

	private static int instanz;
	private static boolean zurueck1;
	private static int auswahl2;
	private static int auswahl3;
	private static boolean zurueck2;
	private static boolean ende;

	/**
	 * Diese erste Version des Benutzermenus funktioniert auf 3 Runden von Entscheidungen 
	 * wobei man in der 1. Ebene zwischen der Gesamten Liste, beenden des Programms oder der weiteren Einsicht der Warengruppen 
	 * auswählen muss. Die 2. Ebene bietet die Auswahl der Warengruppen an, wo man dann die jeweiligen Anwendungen in der 
	 * 3. Ebene benutzen kann. Dies läuft so lange in einer Schleife bis man die Zurüeckoption waehlt die einem zurueck zur 
	 * 2. Ebene, der Warengruppenauswahl wo man auch wieder zurueck waehlen kann, was einem aus dieser Schleife schlieslich
	 * ins Haptmenu Programm bringt wo man Supermarkt schliessen waehlen kann was das Programm beendet.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		
		begruessung();
      
		do { // geben sie ihre Auswahl ein.
			instanz = einAusgabe.auswahl();
			zurueck1 = false;
			switch (instanz) {
				case 1: // Gesamtarray
				case 2: // Menue Warrengruppen
						while (zurueck1 == false) {
							// Ausgabe des Warrengruppenmenu
							
							auswahl2 = einAusgabe.auswahl();
							switch (auswahl2) {
								case 1: // Lebensmittel 
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Lebenmittel
											Lebensmittel.gebeLebensmittelAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Lebensmittel.addLebensmittel(lebensmittel);
												case 2: Lebensmittel.herausgeben();
												case 3: Lebensmittel.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
										}
								case 2: // Backwaren 
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Backwaren
											Backwaren.gebeBackwareAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Backwaren.addBackwaren(backwaren);
												case 2: Backwaren.herausgeben();
												case 3: Backwaren.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
								case 3: // Getraenke
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Getraenke
											Getraenke.gebeGetraenkeAus();
											Getraenke.gebeNonAlkGetraenkeAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Getraenke.addGetraenke(getraenk);
												case 2: Getraenke.herausgeben();
												case 3: Getraenke.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
										}
								case 4: // NonFoodArtikel
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Getraenke
											NonFoodArtikel.gebenNFArtikelAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: NonFoodArtikel.addNonFoodArtikel();
												case 2: NonFoodArtikel.herausgeben();
												case 3: NonFoodArtikel.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
										}
								case 5: // Kleidung
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Getraenke
											Kleidung.gebeKleidungAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Kleidung.addKleidung();
												case 2: Kleidung.herausgeben();
												case 3: Kleidung.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
										}
								case 6: // DrogerieArtikel
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Getraenke
											DrogerieArtikel.gebeDrogerieArtikelAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: DrogerieArtikel.addDrogerieArtikel();
												case 2: DrogerieArtikel.herausgeben();
												case 3: DrogerieArtikel.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
										}
								case 7: // Medien
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Getraenke
											Medien.gebeMedienAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Medien.addMedien();
												case 2: Medien.herausgeben();
												case 3: Medien.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
										}
								case 8: // Filme
										zurueck2 = false;
										while (zurueck2 == false) {
											// Erstellung + Ausgabe Array Getraenke
											Filme.gebeFilmeAus();
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Filme.addFilme();
												case 2: Filme.herausgeben();
												case 3: Filme.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
											}
										}
								case 9: // Zurueckfunktion
										zurueck1 = true;
							}
						}
				case 3: ende = true;
			}

		} while (ende = false) 
		schliessung();
	}
	/**
	 * Methode Die Eine Begruessung und die Bedienungsanleitung für die erste Instanz des Anwendermenus ausgibt.
	 * 
	 */
	public static void begruessung() {

		System.out.println("text");
	}
	/**
	 * Methode soll vielleicht die wiederholte Ausgabe des jeweiligen Menus übernehmen.
	 */
	public static void auswahlmenu () {
	
		System.out.println("Auswahlmenu");
	}
	public static void auswahlOption(int aktion) {

		public int aktion;

		if (aktion < 3)
			switch (aktion) {
				case 1:	System.out.println("Wie viel?");
						einAusgabe.eingabeAnzahl();						
						Ware.nachbestellen();

			}
	}
	/**
	 * Methode beendet das Programm.
	 */
	public static void schliessung () {

		Supermarkt.close();
	}
public class Supermarkt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 