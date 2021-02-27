package menu;

import java.util.Arrays;
import java.util.InputMismatchException;

import enums.Allergene;
import enums.Genre;
import enums.Jahreszeit;
import enums.Stofftypen;
import hilfsklassen.Ausgaben;
import hilfsklassen.Eingaben;
import hilfsklassen.FindeObjekt;
import waren.Backwaren;
import waren.DrogerieArtikel;
import waren.Filme;
import waren.Getraenke;
import waren.Kleidung;
import waren.Lebensmittel;
import waren.Medien;
import waren.NonFoodArtikel;

/**
 * Klasse welche die untermen�punkte des Hauptmen�s beinhaltet
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 25.02.2021
 *
 */
public class Untermenu {

	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps Lebensmittel ausf�hrt
	 */
	public static void untermenuLebensmittel() {
		
		int auswahl = 0;
		
		do {	
			
			Ausgaben.untermenueLebensmittel();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenLebensmittel("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Pr�fung bis wann ein Lebensmittel haltbar ist
				case 0: 
					Lebensmittel lebensmittelObjekt = FindeObjekt.ermittelLebensmittelObjekt();
					if(lebensmittelObjekt != null) {
						System.out.println(lebensmittelObjekt.haltbarBis());
					}
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Pr�fung wie lange ein Lebensmittel haltbar ist in Tagen	
				case 1: 
					Lebensmittel lebensmittelObjekt2 = FindeObjekt.ermittelLebensmittelObjekt();
					if(lebensmittelObjekt2 != null) {
					System.out.println("Das ausgew�hlte Lebensmittel ist noch " + lebensmittelObjekt2.istHaltbar() + " Tage haltbar.");
					}
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Lebensmittel in einem Array aus, welche ein Kurzes MHD haben
				case 2: System.out.println(Arrays.deepToString(Lebensmittel.kurzesMHD().toArray()));
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Lebensmittel aus die sich im Lager befinden
				case 3: 
					Lebensmittel.gebeLebensmittelAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
					//Ende Loop	
				case 4: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Untermenu.untermenuLebensmittel();
				}
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
			}
			
		}while(auswahl != 4);
		
	}
	
	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps Backwaren ausf�hrt
	 */
	public static void untermenuBackwaren() {
		
		int auswahl = 0;
		
		do {	
			
			Ausgaben.untermenueBackwaren();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenBackwaren("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Aufbacken einer Backware
				case 0: 
					Backwaren backwarenObjekt = FindeObjekt.ermittelBackwarenObjekt();
					if(backwarenObjekt != null) {
					System.out.println(backwarenObjekt.backeWare());
					}
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Backwaren aus die sich im Lager befinden
				case 1: 
					Backwaren.gebeBackwareAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Ende Loop
				case 2: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Untermenu.untermenuBackwaren();
				}
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
			}
			
		}while(auswahl != 2);
			
	}
	
	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps Getr�nke ausf�hrt
	 */
	public static void untermenuGetraenke() {
		
		int auswahl = 0;
		
		do {	
			
			Ausgaben.untermenueGetraenke();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenGetraenke("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Pr�ft ob ein Getr�nk alkoholisch ist
				case 0: 
					Getraenke getraenkeObjekt = FindeObjekt.ermittelGetraenkeObjekt();
					if(getraenkeObjekt != null) {
					System.out.println(getraenkeObjekt.istAlkoholhaltig());
					}
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Getr�nke aus die sich im Lager befinden	
				case 1: 
					Getraenke.gebeGetraenkeAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Non-Alkoholischen Getr�nke aus die sich im Lager befinden	
				case 2: 
					Getraenke.gebeNonAlkGetraenkeAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Ende Loop	
				case 3: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					Untermenu.untermenuGetraenke();
				}
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
				Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
			}
				
		}while(auswahl != 3);
		
	}
	
	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps NonFoodArtikel ausf�hrt
	 */
	public static void untermenuNonFoodArtikel() {
			
		int auswahl = 0;
		
		do {	
			
			Ausgaben.untermenueNonFood();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenNonFood("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Gibt alle NonFood-Artikel aus die sich im Lager befidnen
				case 0: 
					NonFoodArtikel.gebenNFArtikelAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Ende Loop	
				case 1: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Untermenu.untermenuNonFoodArtikel();
				}
				
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
			}
	
		}while(auswahl != 1);	
	}
	
	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps Medien ausf�hrt
	 */
	public static void untermenuMedien() {
				
		int auswahl = 0;
		Genre genre = null;
		
		do {
			
			Ausgaben.untermenueMedien();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenMedien("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Gibt alle Digitalen Medien die sich im Lager befinden aus
				case 0: 
					Medien.gebenMedienArtikelDigitalAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Analogen Medien die sich im Lager befinden aus	
				case 1: 
					Medien.gebenMedienArtikelAnalogAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Medien die sich im Lager befinden aus mit dem vom Benutzer ausgew�hlten Genre
				case 2: 
					
					try {
						genre = Eingaben.eingabeGenre("Welches Genre m�chten sie ausw�hlen?");
					}catch(InputMismatchException e) {
						Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
					}
					
					Medien.gebenGenreAus(genre);
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle  Medien die sich im Lager befinden aus	
				case 3: 
					Medien.gebenMedienArtikelAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Ende Loop
				case 4: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Untermenu.untermenuMedien();
				}
				
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
			}
			
		}while(auswahl != 4);
		
	}
	
	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps Kleidung ausf�hrt
	 */
	public static void untermenuKleidung() {
		
		int auswahl = 0;
		Jahreszeit jahreszeit = null;
		Stofftypen stofftyp = null;
		
		do {	
			
			Ausgaben.untermenueKleidung();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenKleidung("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Gibt alle Kleidungen aus welche sich im Lager befinden, die zur angegeben Jahreszeit passen
				case 0: 
					
					try {
						jahreszeit = Eingaben.eingabeJahreszeit("Welche Jahreszeit m�chten sie ausw�hlen?");
					}catch(InputMismatchException e) {
						Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
					}
					
					Kleidung.gibKleidungJahreszeitAus(jahreszeit);
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Kleidungen aus welche sich im Lager befinden, die zum angegeben Stofftyp passen
				case 1: 
					
					try {
						stofftyp = Eingaben.eingabeStofftyp("Welchen Stofftyp m�chten sie ausw�hlen?");
					}catch(InputMismatchException e) {
						Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
					}
					
					Kleidung.gibKleidungStofftypAus(stofftyp);
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Kleidungen aus welche sich im Lager befinden	
				case 2: 
					Kleidung.gebeKleidungAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Ende Loop	
				case 3: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Untermenu.untermenuKleidung();
				}
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
			}
			
			
		}while(auswahl != 3);
		
	}
	
	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps DrogerieArtikel ausf�hrt
	 */
	public static void untermenuDrogerieArtikel() {
		
		int auswahl = 0;
		Allergene allergen = null;
		
		do {	
			
			Ausgaben.untermenueDrogerieArtikel();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenDrogerie("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Gibt alle Drogerie-Artikel aus welche sich im Lager befinden und gibt diese aufsteigend aus nach Bestnote aus
				case 0: 
					DrogerieArtikel.gibBestnoteAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Drogerie-Artikel aus welche sich im Lager befinden, die zum, vom Benutzer eingegebenen Allergen passen	
				case 1: 
					
					try {
						allergen = Eingaben.eingabeAllergene("Welches Allergen m�chten sie ausw�hlen?");
					}catch(InputMismatchException e) {
						Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
					}
					
					DrogerieArtikel.gibAllergeneAus(allergen);
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Gibt alle Drogerie-Artikel aus welche sich im Lager befinden	
				case 2: 
					DrogerieArtikel.gibDrogerieArtikelAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Ende Loop	
				case 3: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Untermenu.untermenuDrogerieArtikel();
				}
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
			}
			
			
		}while(auswahl != 3);
		
	}
	
	/**
	 * Klassenmethode welche nach einer Auswahl des Benutzers weitere Funktionen des Warentyps Filme ausf�hrt
	 */
	public static void untermenuFilme() {
		
		int auswahl = 0;
		
		do {	
			
			Ausgaben.untermenueFilme();
			
			try {
				auswahl = Eingaben.eingabeAuswahlFunktionenFilme("Welche Aktion m�chten sie gerne ausf�hren?");
				
				/*
				 * Je nach Benutzereingabe wird zur jeweiligen Methode entweder ein Objekt gesucht und die entsprechende 
				 * Objektmethode angewendet oder es wird eine Klassenmethode ausgef�hrt
				 */
				switch(auswahl) {
				//Gibt alle Filme aus die sich im Lager befinden
				case 0: 
					Filme.gibFilmeAus();
					Ausgaben.leereZeile(); //Leerzeile f�r eine bessere Konsolenausgabe
					break;
				//Ende Loop	
				case 1: 
					break;
				default: System.out.println("Es wurde kein g�ltiger Wert �bergeben. Probieren Sie es erneut");
					Untermenu.untermenuFilme();
				}
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
			}
			
		}while(auswahl != 1);
	}
}
