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
			lebensmittelObjekt = Lebensmittel.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte kein Lebensmittel ermittelt werden!");
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
			backwarenObjekt = Backwaren.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte keine Backware ermittelt werden!");
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
			getraenkeObjekt = Getraenke.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte kein Getränk ermittelt werden!");
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
			nonFoodArtikelObjekt = NonFoodArtikel.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte kein NonFood-Artikel ermittelt werden!");
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
			medienObjekt = Medien.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte kein Medienartikel ermittelt werden!");
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
			kleidungObjekt = Kleidung.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte keine Kleidung ermittelt werden!");
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
			drogerieArtikelObjekt = DrogerieArtikel.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte kein Drogerieartikel ermittelt werden!");
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
			filmobjektObjekt = Filme.erhalteObjekt(objektID);
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte keine Backware ermittelt werden!");
		}
		
		
		return filmobjektObjekt;
	}

}
