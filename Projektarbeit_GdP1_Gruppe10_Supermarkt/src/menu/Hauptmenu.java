package menu;

import java.util.InputMismatchException;

import enums.Kennungen;
import hilfsklassen.Ausgaben;
import hilfsklassen.Eingaben;
import hilfsklassen.ErzeugeObjekt;
import hilfsklassen.FindeObjekt;
import waren.Backwaren;
import waren.DrogerieArtikel;
import waren.Filme;
import waren.Getraenke;
import waren.Kleidung;
import waren.Lebensmittel;
import waren.Medien;
import waren.NonFoodArtikel;
import waren.Ware;

/**
 * Klasse welche das Menü der Supermarkt Main Klasse unterstützt 
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 24.02.2021
 *
 */
public class Hauptmenu {
	
	/**
	 * Klassenmethode welche alle Waren aus dem Lager zurückgibt auf der Konsole
	 */
	public static void alleWarenAusgeben() {
		
		Ware.gebAlleWarenAus();
		Ausgaben.leereZeile(); //Leerzeile für eine bessere Konsolenausgabe
	}
	
	/**
	 * Klassenmethode zum Anlegen von neuen Waren jeden Warentyps
	 */
	public static void neueWareAnlegen() {
		
		Kennungen warentyp = null;
	
		try {
			warentyp = Eingaben.eingabeWarentyp("Für welchen Warentyp möchten sie eine neue Ware anlegen?");
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Ware konnte nicht angelegt werden!");
		}
		
		//Je nach Warentyp das ausgewählt wurde wird eine Methode zum erzeugen eines neuen Objektes aufgerufen
		switch(warentyp) {
		
		case LEBENSMITTEL: ErzeugeObjekt.erzeugeLebensmittel();
			break;
		case BACKWAREN: ErzeugeObjekt.erzeugeBackware();
			break;
		case GETRAENKE: ErzeugeObjekt.erzeugeGetraenk();
			break;
		case NONFOODARTIKEL: ErzeugeObjekt.erzeugeNonFoodArtikel();
			break;
		case MEDIEN: ErzeugeObjekt.erzeugeMedien();
			break;
		case KLEIDUNG: ErzeugeObjekt.erzeugeKleidung();
			break;
		case DROGERIEARTIKEL: ErzeugeObjekt.erzeugeDrogerieArtikel();
			break;
		case FILME: ErzeugeObjekt.erzeugeFilm();
			break;
		case ENDE:
			break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Hauptmenu.neueWareAnlegen();
		}
		
	}
	
	/**
	 * Klassenmethode zum Nachbestellen von Waren jeden Warentyps
	 * Der Lagerbestand der ausgewählten Ware wird dabei aktualisiert
	 */
	public static void warenNachbestellen() {
		
		Kennungen warentyp = null;
		
		try {
			warentyp = Eingaben.eingabeWarentyp("Für welchen Warentyp möchten sie eine Nachbestellung tätigen?");
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte konnte keine Nachbestellung getätigt werden!");
		}
		
		/*
		 * Je nach Warentyp das ausgewählt wurde wird eine Methode zum finden eines Objektes aufgerufen.
		 * Zu dem gefundenen Objekt wird die Methode nachbestellen aufgerufen
		 */
		switch(warentyp) {
		
		case LEBENSMITTEL: 
			Lebensmittel lebensmittelObjekt = FindeObjekt.ermittelLebensmittelObjekt();
			if(lebensmittelObjekt != null) {
				lebensmittelObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case BACKWAREN: 
			Backwaren backwarenObjekt = FindeObjekt.ermittelBackwarenObjekt();
			if(backwarenObjekt != null) {
				backwarenObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case GETRAENKE: 
			Getraenke getraenkeObjekt = FindeObjekt.ermittelGetraenkeObjekt();
			if(getraenkeObjekt != null) {
				getraenkeObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case NONFOODARTIKEL: 
			NonFoodArtikel nonfoodObjekt = FindeObjekt.ermittelNonFoodArtikelObjekt();
			if(nonfoodObjekt != null) {
				nonfoodObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case MEDIEN: 
			Medien medienObjekt = FindeObjekt.ermittelMedienObjekt();
			if(medienObjekt != null) {
				medienObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case KLEIDUNG: 
			Kleidung kleidungObjekt = FindeObjekt.ermittelKleidungObjekt();
			if(kleidungObjekt != null) {
				kleidungObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case DROGERIEARTIKEL: 
			DrogerieArtikel drogerieObjekt = FindeObjekt.ermittelDrogerieArtikelObjekt();
			if(drogerieObjekt != null) {
				drogerieObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case FILME: 
			Filme filmObjekt = FindeObjekt.ermittelFilmObjekt();
			if(filmObjekt != null) {
				filmObjekt.nachbestellen(Hauptmenu.erhalteMenge());
			}
			break;
		case ENDE:
			break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Hauptmenu.warenNachbestellen();
		}
		
	}
	
	/**
	 * Klassenmethode zum Herausgeben von Waren jeden Warentyps
	 * Der Lagerbestand der ausgewählten Ware wird dabei aktualisiert
	 */
	public static void warenHerausgeben() {
		
		Kennungen warentyp = null;
		
		try {
			warentyp = Eingaben.eingabeWarentyp("Für welchen Warentyp möchten sie eine Herausgabe tätigen?");
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte konnte keine Herausgabe getätigt werden!");
		}
		
		/*
		 * Je nach Warentyp das ausgewählt wurde wird eine Methode zum finden eines Objektes aufgerufen.
		 * Zu dem gefundenen Objekt wird die Methode herausgeben aufgerufen
		 */
		switch(warentyp) {
		
		case LEBENSMITTEL: 
			Lebensmittel lebensmittelObjekt = FindeObjekt.ermittelLebensmittelObjekt();
			if(lebensmittelObjekt != null) {
				lebensmittelObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case BACKWAREN: 
			Backwaren backwarenObjekt = FindeObjekt.ermittelBackwarenObjekt();
			if(backwarenObjekt != null) {
				backwarenObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case GETRAENKE: 
			Getraenke getraenkeObjekt = FindeObjekt.ermittelGetraenkeObjekt();
			if(getraenkeObjekt != null) {
				getraenkeObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case NONFOODARTIKEL: 
			NonFoodArtikel nonfoodObjekt = FindeObjekt.ermittelNonFoodArtikelObjekt();
			if(nonfoodObjekt != null) {
				nonfoodObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case MEDIEN: 
			Medien medienObjekt = FindeObjekt.ermittelMedienObjekt();
			if(medienObjekt != null) {
				medienObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case KLEIDUNG: 
			Kleidung kleidungObjekt = FindeObjekt.ermittelKleidungObjekt();
			if(kleidungObjekt != null) {
				kleidungObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case DROGERIEARTIKEL: 
			DrogerieArtikel drogerieObjekt = FindeObjekt.ermittelDrogerieArtikelObjekt();
			if(drogerieObjekt != null) {
				drogerieObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case FILME: 
			Filme filmObjekt = FindeObjekt.ermittelFilmObjekt();
			if(filmObjekt != null) {
				filmObjekt.herausgeben(Hauptmenu.erhalteMenge());
			}
			break;
		case ENDE:
			break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Hauptmenu.warenNachbestellen();
		}
	}
	
	/**
	 * Klassenmethode um zu jedem Warenyp weitere Funktionen im Untermenü aufzurufen
	 */
	public static void funktionenWaretypen() {
		
		Kennungen warentyp = null;
		
		do {
			
			Ausgaben.untermenue();
			
			try {
				warentyp = Eingaben.eingabeWarentyp("Für welchen Warentyp möchten sie weitere Funktionen tätigen?");
				
			}catch (InputMismatchException e) {
				Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte konnte keine weiteren Funktionen aufgerufen werden!");
			}
			
			/*
			 * Je nach Warentyp das ausgewählt wurde wird eine Methode zum jewiligen Untermenü des Warentyps aufgerufen
			 */
			switch(warentyp) {
			
			case LEBENSMITTEL: Untermenu.untermenuLebensmittel();
				break;
			case BACKWAREN: Untermenu.untermenuBackwaren();
				break;
			case GETRAENKE: Untermenu.untermenuGetraenke();
				break;
			case NONFOODARTIKEL: Untermenu.untermenuNonFoodArtikel();
				break;
			case MEDIEN: Untermenu.untermenuMedien();
				break;
			case KLEIDUNG: Untermenu.untermenuKleidung();
				break;
			case DROGERIEARTIKEL: Untermenu.untermenuDrogerieArtikel();
				break;
			case FILME: Untermenu.untermenuFilme();
				break;
			case ENDE:
				break;
			default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
					Hauptmenu.funktionenWaretypen();
			}
			
		}while(warentyp != Kennungen.ENDE);
		
	}
	
	/**
	 * Klassenmethode, welche die Menge der Benutzereingabe zurückgibt
	 * und bei einEingabe eines Falschen Datentyps eine entsprechende Meldung zurückgibt.
	 * @return
	 */
	public static int erhalteMenge() {
		
		int menge = 0;
		
		try {
			menge = Eingaben.eingabeInteger("Welche Menge soll bestellt werden?\n"
					+ "Bitte geben sie das als Ganze Zahl X ein:");
			
		}catch (InputMismatchException e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Es konnte konnte keine Nachbestellung getätigt werden!");
		}
		
		return menge;
		
	}

}
