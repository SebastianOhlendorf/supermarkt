package hilfsklassen;

import java.time.LocalDate;
import java.util.InputMismatchException;

import enums.Allergene;
import enums.Filmgenre;
import enums.Fsk;
import enums.Genre;
import enums.Jahreszeit;
import enums.Koerperteile;
import enums.Nutzung;
import enums.Sprachen;
import enums.Stofftypen;
import enums.Untergruppen;
import waren.Backwaren;
import waren.DrogerieArtikel;
import waren.Filme;
import waren.Getraenke;
import waren.Kleidung;
import waren.Lebensmittel;
import waren.Medien;
import waren.NonFoodArtikel;

/**
 * Methode zum erzeugen der verschiedenen Warentypenobjekte
 * Folgende Objekte können erzeugt werden:
 * Lebensmittel
 * Backwaren
 * Getraenke
 * NonFoodArtikel
 * Kleidung
 * Drogerieartikel
 * Filme
 * Medien
 * Medien
 * 
 * @author SebastianOhlendorf
 *
 */
public class ErzeugeObjekt {
	
	/**
	 * Erzeugt ein Lebensmittel Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeLebensmittel() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		double gewicht;
		int haltbarkeit;
		boolean bedarfKuehlung;
		
		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			gewicht = Eingaben.eingabeDouble("Bitte geben Sie das Gewicht des Artikels in X,XX an:");
			haltbarkeit = Eingaben.eingabeInteger("Bitte geben Sie die Haltbarkeit des Artikels als Zahl in Tagen an:");
			bedarfKuehlung = Eingaben.eingabeBoolean("Bitte geben Sie an ob der Artikel Kuehlung benötigt (true/false):");
			
			Lebensmittel lebensmittel = new Lebensmittel(name, preis, seitWannImBestand, gewicht, haltbarkeit, bedarfKuehlung);
			Lebensmittel.addLebensmittel(lebensmittel);
			
			System.out.println(lebensmittel + "\n");
			
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Das Lebensmittel konnte nicht angelegt werden!");
		}
	}
	
	/**
	 * Erzeugt ein Backwaren Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeBackware() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		double gewicht;
		int haltbarkeit;
		boolean bedarfKuehlung;

		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			gewicht = Eingaben.eingabeDouble("Bitte geben Sie das Gewicht des Artikels in X,XX an:");
			haltbarkeit = Eingaben.eingabeInteger("Bitte geben Sie die Haltbarkeit des Artikels als Zahl in Tagen an:");
			bedarfKuehlung = Eingaben.eingabeBoolean("Bitte geben Sie an ob der Artikel Kuehlung benötigt (true/false):");
			
			Backwaren backware = new Backwaren(name, preis, seitWannImBestand, gewicht, haltbarkeit, bedarfKuehlung);
			Backwaren.addBackwaren(backware);
			
			System.out.println(backware + "\n");
			
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Backware konnte nicht angelegt werden!");
		}
	}
	
	/**
	 * Erzeugt ein Getränke Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeGetraenk() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		double alcProzente;
		
		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			alcProzente = Eingaben.eingabeDouble("Bitte geben Sie den Alkoholgehalt des Artikels in X,XX an:");
			
			Getraenke getraenk = new Getraenke(name, preis, seitWannImBestand, alcProzente);
			Getraenke.addGetraenke(getraenk);
			
			System.out.println(getraenk + "\n");
			
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Das Getränk konnte nicht angelegt werden!");
		}
	}
	
	/**
	 * Erzeugt ein NonFoodArtikel Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeNonFoodArtikel() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		String beschreibung;
		Untergruppen untergruppe;
		
		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			beschreibung = Eingaben.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
			untergruppe = Eingaben.eingabeUntergruppe("Bitte geben Sie die Untergruppe des Artikels als Zahl an:");
			
			NonFoodArtikel nonFoodArtikel = new NonFoodArtikel(name, preis, seitWannImBestand, beschreibung, untergruppe);
			NonFoodArtikel.addNonFoodArtikel(nonFoodArtikel);
			
			System.out.println(nonFoodArtikel + "\n");
			
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Der NonFood-Artikel konnte nicht angelegt werden!");
		}
	}
	
	/**
	 * Erzeugt ein Kleidung Objekt für die Jahreszeit Winter und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeKleidung() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		String beschreibung;
		Untergruppen untergruppe;
		Jahreszeit jahreszeit;
		Koerperteile koerperteil;
		Stofftypen stofftyp;
		
		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			beschreibung = Eingaben.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
			untergruppe = Untergruppen.KLEIDUNG;
			jahreszeit = Eingaben.eingabeJahreszeit("Bitte geben Sie die Jahreszeit des Artikels als Zahl an:");
			koerperteil = Eingaben.eingabeKoerperteil("Bitte geben Sie den Körperteil des Artikels als Zahl an:");
			stofftyp = Eingaben.eingabeStofftyp("Bitte geben Sie den Stofftyp des Artikels als Zahl an:");
	
			Kleidung kleidung = new Kleidung(name, preis, seitWannImBestand, beschreibung, untergruppe, jahreszeit, koerperteil, stofftyp);
			Kleidung.addKleidung(kleidung);
			
			System.out.println(kleidung + "\n");
		
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Die Kleidung konnte nicht angelegt werden!");
		}
		
	}
	
	/**
	 * Erzeugt ein DrogerieArtikel Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeDrogerieArtikel() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		String beschreibung;
		Untergruppen untergruppe;
		Nutzung nutzung;
		double stiftungwarentest;
		Allergene allergene;
		
		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			beschreibung = Eingaben.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
			untergruppe = Untergruppen.DROGERIEARTIKEL;
			nutzung = Eingaben.eingabeNutzung("Bitte geben Sie die Nutzung des Artikels als Zahl an:");
			stiftungwarentest = Eingaben.eingabeDouble("Bitte geben Sie die Stiftungwarentest Bewertung des Artikels X,XX an:");
			allergene = Eingaben.eingabeAllergene("Bitte geben Sie das Allergen des Artikels als Zahl an:");
			
			DrogerieArtikel drogerieArtikel = new DrogerieArtikel(name, preis, seitWannImBestand, beschreibung, untergruppe, nutzung, stiftungwarentest, allergene);
			DrogerieArtikel.addDrogerieArtikel(drogerieArtikel);
			
			System.out.println(drogerieArtikel + "\n");
			
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Der Drogerieartikel konnte nicht angelegt werden!");
		}
		
	}
	
	/**
	 * Erzeugt ein Film Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeFilm() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		String beschreibung;
		Untergruppen untergruppe;
		boolean isDigital;
		Filmgenre genre;
		int erscheinungsjahr;
		double dauer;
		Fsk fsk;
		Sprachen sprachen;
		
		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			beschreibung = Eingaben.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
			untergruppe = Untergruppen.FILME;
			isDigital = Eingaben.eingabeBoolean("Bitte geben Sie an ob der Artikel Digital (true) oder Analog (false) ist:");
			genre = Eingaben.eingabeFilmgenre("Bitte geben Sie das Genre des Artikels als Zahl an:");
			erscheinungsjahr = Eingaben.eingabeInteger("Bitte geben Sie das Erscheinungsjahr des Artikels in XXXX an:");
			dauer = Eingaben.eingabeDouble("Bitte geben Sie die Dauer des Artikels in X,XX Stunden an:");
			fsk= Eingaben.eingabeFsk("Bitte geben Sie das FSK des Artikels als Zahl an:");
			sprachen = Eingaben.eingabeSprache("Bitte geben Sie die Sprache des Artikels als Zahl an:");
			
			Filme film = new Filme(name, preis, seitWannImBestand, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr, dauer, fsk, sprachen);
			Filme.addFilm(film);
			
			System.out.println(film + "\n");
		
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Der Film konnte nicht angelegt werden!");
		}
		
	}
	
	/**
	 * Erzeugt ein Medien Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * Wird ein Fehler in der Eingabe getätigt wird die Verabeitung beendet und die Operation muss von vorne begonnen werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeMedien() {

		String name;
		double preis;
		LocalDate seitWannImBestand;
		String beschreibung;
		Untergruppen untergruppe;
		boolean isDigital;
		Genre genre;
		int erscheinungsjahr;
		
		try {
			name = Eingaben.eingabeString("Bitte geben Sie den Namen des Artikels an:");
			preis = Eingaben.eingabeDouble("Bitte geben Sie den Preis des Artikels X,XX an:");
			seitWannImBestand = LocalDate.now();
			beschreibung = Eingaben.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
			untergruppe = Untergruppen.MEDIEN;
			isDigital = Eingaben.eingabeBoolean("Bitte geben Sie an ob der Artikel Digital (true) oder Analog (false) ist:");
			genre = Eingaben.eingabeGenre("Bitte geben Sie das Genre des Artikels als Zahl an:");
			erscheinungsjahr = Eingaben.eingabeInteger("Bitte geben Sie das Erscheinungsjahr des Artikels in XXXX an:");
			
			Medien medien = new Medien(name, preis, seitWannImBestand, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr);
			Medien.addMedien(medien);
			
			System.out.println(medien + "\n");
		
		}catch (InputMismatchException  e) {
			Eingaben.eingabeString("Es wurde ein falscher Datentyp eingegeben. Der Medienartikel konnte nicht angelegt werden!");
		}
		
	}
}
