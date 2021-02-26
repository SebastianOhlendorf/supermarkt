package supermarkt;

import waren.Backwaren;
import waren.DrogerieArtikel;
import waren.Filme;
import waren.Getraenke;
import waren.Kleidung;
import waren
import hilfsklassen.Ausgaben;
import hilfsklassen.Eingaben;
import hilfsklassen.ErzeugeObjekt;
import waren.Lebensmittel;
import waren.Medien;
import waren.NonFoodArtikel;

public class Supermarkt {

	private static boolean home;
	private static int instanz;
	private static boolean zurueck1;
	private static int auswahl2;
	private static int auswahl3;
	private static boolean zurueck2;
	private static boolean ende;
	private int verkaufsmenge;
	private int bestellmenge;

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
		
		Ausgaben.begruessung();
		A
		do { // geben sie ihre Auswahl ein.
			//instanz = einAusgabe.auswahl();
			zurueck1 = false;
			home = false;
			auswahlmenu(1);
			switch (instanz) {
				case 1: // Gesamtarray
				case 2: // Menue Warrengruppen
						while (zurueck1 == false || home == false) {
							// Ausgabe des Warrengruppenmenu
							auswahlmenu(2);
							//auswahl2 = einAusgabe.auswahl();
							switch (auswahl2) {
								case 1: // Lebensmittel 
										zurueck2 = false;
										while (zurueck2 == false || home == false ) {
											// Erstellung + Ausgabe Array Lebenmittel
											auswahlmenu(3);
											// Ausgabe Handlungsoptionen
											//auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: ErzeugeObjekt.erzeugeLebensmittel();
												case 2: System.out.println("Bitte geben sie die Menge ein die sie herausgeben wollen: ");
														//verkaufsmenge = Eingaben.eingabeInteger();
														//Lebensmittel.herausgeben(verkaufsmenge);
												case 3: Lebensmittel.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
										}
								case 2: // Backwaren 
										zurueck2 = false;
										while (zurueck2 == false || home == false) {
											// Erstellung + Ausgabe Array Backwaren
											auswahlmenu(4);
											// Ausgabe Handlungsoptionen
											//auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Backwaren.addBackwaren(backwaren);
												case 2:// Backwaren.herausgeben();
												case 3:// Backwaren.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
								case 3: // Getraenke
										zurueck2 = false;
										while (zurueck2 == false || home == false) {
											// Erstellung + Ausgabe Array Getraenke
											auswahlmenu(5);
											// Ausgabe Handlungsoptionen
											//auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Getraenke.addGetraenke(getraenk);
												case 2:// Getraenke.herausgeben();
												case 3: Getraenke.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
										}
								case 4: // NonFoodArtikel
										zurueck2 = false;
										while (zurueck2 == false || home == false) {
											// Erstellung + Ausgabe Array NonFoodArtikel
											auswahlmenu(6);
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: NonFoodArtikel.addNonFoodArtikel();
												case 2: NonFoodArtikel.herausgeben();
												case 3: NonFoodArtikel.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
										}
								case 5: // Kleidung
										zurueck2 = false;
										while (zurueck2 == false || home == false) {
											// Erstellung + Ausgabe Array Kleidung
											auswahlmenu(7);
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Kleidung.addKleidung();
												case 2: Kleidung.herausgeben();
												case 3: Kleidung.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
										}
								case 6: // DrogerieArtikel
										zurueck2 = false;
										while (zurueck2 == false || home == false) {
											// Erstellung + Ausgabe Array Drogerie
											auswahlmenu(8);
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: DrogerieArtikel.addDrogerieArtikel();
												case 2: DrogerieArtikel.herausgeben();
												case 3: DrogerieArtikel.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
										}
								case 7: // Medien
										zurueck2 = false;
										while (zurueck2 == false || home == false) {
											// Erstellung + Ausgabe Array medién
											auswahlmenu(9);
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Medien.addMedien();
												case 2: Medien.herausgeben();
												case 3: Medien.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
										}
								case 8: // Filme
										zurueck2 = false;
										while (zurueck2 == false || home == false) {
											// Erstellung + Ausgabe Array Filme
											auswahlmenu(10)
											// Ausgabe Handlungsoptionen
											auswahl3 = einAusgabe.auswahl();
											switch (auswahl3) {
												case 1: Filme.addFilme();
												case 2: Filme.herausgeben();
												case 3: Filme.nachbestellen();
												case 4: // zurueckoption 
														zurueck2 = true;
												case 5: //Home
														home = true;
											}
										}
								case 9: // Zurueckfunktion
										zurueck1 = true;
								case 10: //Home
										home = true;
							}
						}
				case 3: ende = true;
			}

		} while (ende == false) 
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
	 * Methode soll die jeweilige Ausgabe des jeweiligen Menus übernehmen.
	 */
	public static int auswahlmenu (int auswahl) {	
		
		switch (auswahl) {
			case 1: Ausgaben.supermaktLogo();
					Ausgaben.gruppeZehn();
					System.out.println("Hauptmenü"+ "/n" + "Ausgabe vom Gesamten Lager: 1"+ "/n"+ "Auswahl der Warengruppen: 2" + "/n" + "Anwendung schliessen: 3");					
			
			case 2:	System.out.println("Warengruppenmenü" + "/n" + "Bitte wählen sie eine Warengruppe aus" + "/n" + "Lebensmittel: 1"+ "/n" + "Backwaren: 2" + "/n" + "Getränke: 3"
					+ "/n" + "NonFoodArtikel: 4" + "/n" + "Kleidung: 5" + "/n" + "Drogerieartikel: 6" + "/n" + "Medien: 7" + "/n" + "Filme: 8" + "/n" + "Zurück zum Hauptmenü: 9");				
			
			case 3: Ausgaben.untermenueLebensmittel();
					System.out.println("Auswahlmenü Lebensmittel" + "/n" + "Neues Lebensmittel hinzufügen: 1" + "/n" + "Lebensmittel herausgeben: 2" + "/n" + "Lebensmittel nachbestellen: 3" + "/n" +
					"Zurück zum Warengruppenmenü: 4" + "/n" + "Zurück zum Hauptmenü: 5");
					Lebensmittel.gebeLebensmittelAus();
			case 4: Ausgaben.untermenueBackwaren();
					System.out.println("Auswahlmenü Backwaren" + "/n" + "Neue Backware hinzufügen: 1" + "/n" + "Backware backen: 2" + "/n" + "Backwaren herausgeben: 3" + "/n" + "Backwaren nachbestellen: 4"
					 + "/n" + "Zurück zum Warengruppenmenü: 5" + "/n" + "Zurück zum Hauptmenü: 6");
					Backwaren.gebeBackwareAus();
			case 5: Ausgaben.untermenueGetraenke();
					System.out.println("Auswahlmenü Getränke" + "/n" + "Neues Getränk hinzufügen: 1" + "/n" + "Backware backen: 2" + "/n" + "Backwaren herausgeben: 3" + "/n" + "Backwaren nachbestellen: 4"
					+ "/n" + "Zurück zum Warengruppenmenü: 5" + "/n" + "Zurück zum Hauptmenü: 6");
	   				Getraenke.gebeGetraenkeAus();
			case 6: Ausgaben.untermenueKleidung();
					System.out.println("Auswahlmenü Kleidung" + "/n" + "Neue Kleidung hinzufügen: 1" + "/n" + "Kleidung herausgeben: 2" + "/n" + "Kleidung nachbestellen: 3"
					+ "/n" + "Zurück zum Warengruppenmenü: 4" + "/n" + "Zurück zum Hauptmenü: 5");
					Kleidung.gebeKleidungAus();
			case 7: Ausgaben.untermenueNonFood();
					System.out.println("Auswahlmenü NonFoodArtikel" + "/n" + "Neue NonFoodArtikel hinzufügen: 1" + "/n" + "NonFoodArtikel herausgeben: 2" + "/n" + "NonFoodArtikel nachbestellen: 3"
					+ "/n" + "Zurück zum Warengruppenmenü: 4" + "/n" + "Zurück zum Hauptmenü: 5");
					NonFoodArtikel.gebenNFArtikelAus();
			case 8: Ausgaben.untermenueDrogerieArtikel();
					System.out.println("Auswahlmenü DrogerieArtikel" + "/n" + "Neue DrogerieArtikel hinzufügen: 1" + "/n" + "DrogerieArtikel herausgeben: 2" + "/n" + "DrogerieArtikel nachbestellen: 3"
					+ "/n" + "Zurück zum Warengruppenmenü: 4" + "/n" + "Zurück zum Hauptmenü: 5");
					DrogerieArtikel.gebeDrogerieArtikelAus();
			case 9: Ausgaben.untermenueMedien();
					System.out.println("Auswahlmenü Medien" + "/n" + "Neue Medien hinzufügen: 1" + "/n" + "Medien herausgeben: 2" + "/n" + "Medien nachbestellen: 3"
					+ "/n" + "Zurück zum Warengruppenmenü: 4" + "/n" + "Zurück zum Hauptmenü: 5"); 
					Medien.gebenMedienArtikelAus();
			case 10: Ausgaben.untermenueFilme();
					 System.out.println("Auswahlmenü Filme" + "/n" + "Neue Filme hinzufügen: 1" + "/n" + "Filme herausgeben: 2" + "/n" + "Filme nachbestellen: 3"
					 + "/n" + "Zurück zum Warengruppenmenü: 4" + "/n" + "Zurück zum Hauptmenü: 5"); 
					 Filme.gibFilmeAus();
		   		
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
 