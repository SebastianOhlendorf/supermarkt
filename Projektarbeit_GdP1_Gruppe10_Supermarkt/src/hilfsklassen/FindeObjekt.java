package hilfsklassen;

import java.util.InputMismatchException;

import waren.Backwaren;
import waren.DrogerieArtikel;
import waren.Filme;
import waren.Getraenke;
import waren.Kleidung;
import waren.Lebensmittel;
import waren.Medien;
import waren.NonFoodArtikel;

/**
 * Hilfsklasse um ein entsprechendes Objekt aus dem Supermarkt zu finden und um dieses zurückzugeben
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 22.02.2021
 *
 */
public class FindeObjekt {
	
	/**
	 * Diese Methode ermittelt ein Lebensmittel-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten Lebensmittelobjektes
	 */
	public static Lebensmittel ermittelLebensmittelObjekt() {
		
		int objektID;
		Lebensmittel lebensmittelObjekt = null;
		
		Lebensmittel.gebeLebensmittelAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");

			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= Lebensmittel.erhalteObjektMinID() && objektID <= Lebensmittel.erhalteObjektMaxID()) {
				lebensmittelObjekt = Lebensmittel.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
		
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return lebensmittelObjekt;
	}
	
	/**
	 * Diese Methode ermittelt ein Backwaren-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten Backwaren-Objekt
	 */
	public static Backwaren ermittelBackwarenObjekt() {
		
		int objektID;
		Backwaren backwarenObjekt = null;
		
		Backwaren.gebeBackwareAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
			
			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= Backwaren.erhalteObjektMinID() && objektID <= Backwaren.erhalteObjektMaxID()) {
				backwarenObjekt = Backwaren.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
			
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return backwarenObjekt;
	}
	
	/**
	 * Diese Methode ermittelt ein Getraenke-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten Getraenke-Objekt
	 */
	public static Getraenke ermittelGetraenkeObjekt() {
		
		int objektID;
		Getraenke getraenkeObjekt = null;
		
		Getraenke.gebeGetraenkeAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
			
			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= Getraenke.erhalteObjektMinID() && objektID <= Getraenke.erhalteObjektMaxID()) {
				getraenkeObjekt = Getraenke.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
				
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return getraenkeObjekt;
	}
	
	/**
	 * Diese Methode ermittelt ein NonFoodArtikel-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten NonFoodArtikel-Objekt
	 */
	public static NonFoodArtikel ermittelNonFoodArtikelObjekt() {
		
		int objektID;
		NonFoodArtikel nonFoodArtikelObjekt = null;
		
		NonFoodArtikel.gebenNFArtikelAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
			
			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= NonFoodArtikel.erhalteObjektMinID() && objektID <= NonFoodArtikel.erhalteObjektMaxID()) {
				nonFoodArtikelObjekt = NonFoodArtikel.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
			
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return nonFoodArtikelObjekt;
	}
	
	/**
	 * Diese Methode ermittelt ein Medien-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten Medien-Objekt
	 */
	public static Medien ermittelMedienObjekt() {
		
		int objektID;
		Medien medienObjekt = null;
		
		Medien.gebenMedienArtikelAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
			
			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= Medien.erhalteObjektMinID() && objektID <= Medien.erhalteObjektMaxID()) {
				medienObjekt = Medien.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
			
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return medienObjekt;
	}
	
	/**
	 * Diese Methode ermittelt ein Kleidung-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten Kleidung-Objekt
	 */
	public static Kleidung ermittelKleidungObjekt() {
		
		int objektID;
		Kleidung kleidungObjekt = null;
		
		Kleidung.gebeKleidungAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
			
			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= Kleidung.erhalteObjektMinID() && objektID <= Kleidung.erhalteObjektMaxID()) {
				kleidungObjekt = Kleidung.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
			
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return kleidungObjekt;
	}
	
	/**
	 * Diese Methode ermittelt ein DrogerieArtikel-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten DrogerieArtikel-Objekt
	 */
	public static DrogerieArtikel ermittelDrogerieArtikelObjekt() {
		
		int objektID;
		DrogerieArtikel drogerieArtikelObjekt = null;
		
		DrogerieArtikel.gibDrogerieArtikelAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
			
			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= DrogerieArtikel.erhalteObjektMinID() && objektID <= DrogerieArtikel.erhalteObjektMaxID()) {
				drogerieArtikelObjekt = DrogerieArtikel.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
			
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return drogerieArtikelObjekt;
	}
	
	/**
	 * Diese Methode ermittelt ein Filme-Objekt aus dem Warenlager (Array) alleWaren
	 * Hierzu kann der Benutzer durch eine Benutzerausgabe (Zahlen eingabe) sich das gewünschte Objekt auswählen
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * 
	 * @return Rückgabe des ausgewählten Filme-Objekt
	 */
	public static Filme ermittelFilmObjekt() {
		
		int objektID;
		Filme filmobjektObjekt = null;
		
		Filme.gibFilmeAus();
		
		try {
			objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
			
			//Prüfung ob die übergebene objektID in der richtigen Array Range liegt
			if(objektID >= Filme.erhalteObjektMinID() && objektID <= Filme.erhalteObjektMaxID()) {
				filmobjektObjekt = Filme.erhalteObjekt(objektID);
			}else {
				
				throw new InputMismatchException("Es wurde ein falscher Datentyp oder eine ungültige Objekt ID übergeben.\n "
						+ "Es konnte keine Ware ermittelt werden, daher werden sie zum Hauptmenü zurückgeleitet.");
			}
			
		}catch (InputMismatchException e) {
			System.out.println(e + "\n\n");
		}
		return filmobjektObjekt;
	}
}
