package supermarkt;

import java.time.LocalDate;

import enums.Allergene;
import enums.Filmgenre;
import enums.Fsk;
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
 * KleidungWinter
 * KleidungFruehling
 * KleidungSommer
 * KleidungHerbst
 * Drogerieartikel
 * Filme
 * Medien
 * MedienHorror
 * MedienAction
 * MedienThriller
 * MedienHumor
 * MedienDrame
 * MedienKrieg
 * MedienLiebe
 * MedienWestern
 * 
 * @author SebastianOhlendorf
 *
 */
public class ErzeugeObjekt {
	
	/**
	 * Erzeugt ein Lebensmittel Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
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
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		gewicht = einAusgabe.eingabeDouble("Bitte geben Sie das Gewicht des Artikels in X.XX an:");
		haltbarkeit = einAusgabe.eingabeInteger("Bitte geben Sie die Haltbarkeit des Artikels als Zahl in Tagen an:");
		bedarfKuehlung = einAusgabe.eingabeBoolean("Bitte geben Sie an ob der Artikel Kuehlung benötigt (true/false):");
		
		Lebensmittel lebensmittel = new Lebensmittel(name, preis, seitWannImBestand, gewicht, haltbarkeit, bedarfKuehlung);
		Lebensmittel.addLebensmittel(lebensmittel);
	
	}
	
	/**
	 * Erzeugt ein Backwaren Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
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
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		gewicht = einAusgabe.eingabeDouble("Bitte geben Sie das Gewicht des Artikels in X.XX an:");
		haltbarkeit = einAusgabe.eingabeInteger("Bitte geben Sie die Haltbarkeit des Artikels als Zahl in Tagen an:");
		bedarfKuehlung = einAusgabe.eingabeBoolean("Bitte geben Sie an ob der Artikel Kuehlung benötigt (true/false):");
		
		Backwaren backware = new Backwaren(name, preis, seitWannImBestand, gewicht, haltbarkeit, bedarfKuehlung);
		Backwaren.addBackwaren(backware);
	
	}
	
	/**
	 * Erzeugt ein Getränke Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeGetraenk() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		double alcProzente;
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		alcProzente = einAusgabe.eingabeDouble("Bitte geben Sie das Gewicht des Artikels in X.XX an:");
		
		Getraenke getraenk = new Getraenke(name, preis, seitWannImBestand, alcProzente);
		Getraenke.addGetraenke(getraenk);
	
	}
	
	/**
	 * Erzeugt ein NonFoodArtikel Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
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
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		beschreibung = einAusgabe.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
		untergruppe = einAusgabe.eingabeUntergruppe("Bitte geben Sie die Untergruppe des Artikels als Zahl an:");
		
		NonFoodArtikel nonFoodArtikel = new NonFoodArtikel(name, preis, seitWannImBestand, beschreibung, untergruppe);
		NonFoodArtikel.addNonFoodArtikel(nonFoodArtikel);
		
	}
	
	/**
	 * Erzeugt ein Kleidung Objekt für die Jahreszeit Winter und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeKleidungWinter() {
		
		String name;
		double preis;
		LocalDate seitWannImBestand;
		String beschreibung;
		Untergruppen untergruppe;
		Jahreszeit jahreszeit;
		Koerperteile koerperteil;
		Stofftypen stofftyp;
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		beschreibung = einAusgabe.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
		untergruppe = einAusgabe.eingabeUntergruppe("Bitte geben Sie die Untergruppe des Artikels als Zahl an:");
		jahreszeit = einAusgabe.eingabeJahreszeit("Bitte geben Sie die Jahreszeit des Artikels als Zahl an:");
		koerperteil = einAusgabe.eingabeKoerperteil("Bitte geben Sie den Körpertiel des Artikels als Zahl an:");
		stofftyp = einAusgabe.eingabeStofftyp("Bitte geben Sie den Stofftyp des Artikels als Zahl an:");
		
		Kleidung kleidung = new Kleidung(name, preis, seitWannImBestand, beschreibung, untergruppe, jahreszeit, koerperteil, stofftyp);
		Kleidung.addKleidung(kleidung);
		
	}
	
	/**
	 * Erzeugt ein DrogerieArtikel Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
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
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		beschreibung = einAusgabe.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
		untergruppe = einAusgabe.eingabeUntergruppe("Bitte geben Sie die Untergruppe des Artikels als Zahl an:");
		nutzung = einAusgabe.eingabeNutzung("Bitte geben Sie die Nutzung des Artikels als Zahl an:");
		stiftungwarentest = einAusgabe.eingabeDouble("Bitte geben Sie die Stiftungwarentest Bewertung des Artikels X.XX an:");
		allergene = einAusgabe.eingabeAllergene("Bitte geben Sie das Allergen des Artikels als Zahl an:");
		
		DrogerieArtikel drogerieArtikel = new DrogerieArtikel(name, preis, seitWannImBestand, beschreibung, untergruppe, nutzung, stiftungwarentest, allergene);
		DrogerieArtikel.addDrogerieArtikel(drogerieArtikel);
		
	}
	
	/**
	 * Erzeugt ein Film Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
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
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		beschreibung = einAusgabe.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
		untergruppe = einAusgabe.eingabeUntergruppe("Bitte geben Sie die Untergruppe des Artikels als Zahl an:");
		isDigital = einAusgabe.eingabeBoolean("Bitte geben Sie an ob der Artikel Digital (true) oder Analog (false) ist:");
		genre = einAusgabe.eingabeFilmgenre("Bitte geben Sie das Genre des Artikels als Zahl an:");
		erscheinungsjahr = einAusgabe.eingabeInteger("Bitte geben Sie das Erscheinungsjahr des Artikels in XXXX an:");
		dauer = einAusgabe.eingabeDouble("Bitte geben Sie das Erscheinungsjahr des Artikels in X.XX an:");
		fsk= einAusgabe.eingabeFsk("Bitte geben Sie das FSK des Artikels als Zahl an:");
		sprachen = einAusgabe.eingabeSprache("Bitte geben Sie die Sprache des Artikels als Zahl an:");
		
		Filme film = new Filme(name, preis, seitWannImBestand, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr, dauer, fsk, sprachen);
		Filme.addFilm(film);
		
	}
	
	/**
	 * Erzeugt ein Medien Objekt und fügt diese dem Warenlager hinzu.
	 * Hierzu werden Benutzereingaben gefordert welche für die Erstellung des Objektes benötigt werden
	 * @author Sebastian Ohlendorf
	 * @version 1.0
	 * @date 21.02.2021
	 */
	public static void erzeugeMedien() {
		//String name, double preis, LocalDate seitWannImBestand, String beschreibung, Untergruppen unterGruppe, boolean isDigital, Filmgenre genre, int erscheinungsjahr
		String name;
		double preis;
		LocalDate seitWannImBestand;
		String beschreibung;
		Untergruppen untergruppe;
		boolean isDigital;
		Filmgenre genre;
		int erscheinungsjahr;
		
		name = einAusgabe.eingabeString("Bitte geben Sie den Namen des Artikels an:");
		preis = einAusgabe.eingabeDouble("Bitte geben Sie den Preis des Artikels X.XX an:");
		seitWannImBestand = LocalDate.now();
		beschreibung = einAusgabe.eingabeString("Bitte geben Sie die Beschreibung des Artikels als Text an:");
		untergruppe = einAusgabe.eingabeUntergruppe("Bitte geben Sie die Untergruppe des Artikels als Zahl an:");
		isDigital = einAusgabe.eingabeBoolean("Bitte geben Sie an ob der Artikel Digital (true) oder Analog (false) ist:");
		genre = einAusgabe.eingabeFilmgenre("Bitte geben Sie das Genre des Artikels als Zahl an:");
		erscheinungsjahr = einAusgabe.eingabeInteger("Bitte geben Sie das Erscheinungsjahr des Artikels in XXXX an:");
		
		Medien medien = new Medien(name, preis, seitWannImBestand, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr);
		Medien.addMedien(medien);
		
	}
}
