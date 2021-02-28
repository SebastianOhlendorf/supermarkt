package test;

import java.time.LocalDate;

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
 * Testklasse um zu jedem Warentyp ein entsprechendes Objekt zu ermitteln
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 22.02.2021
 *
 */
public class FindeObjektTest {

	/**
     * Main-Method zum testen der Klasse FindeObjekt. Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen.
     * 
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kann
     */
	public static void main(String[] args) {
		
		//Objektvariablen
		Lebensmittel objekt;
		Backwaren objekt1;
		Getraenke objekt2;
		NonFoodArtikel objekt3;
		Medien objekt4;
		Kleidung objekt5;
		DrogerieArtikel objekt6;
		Filme objekt7;
		
		//------------Lebensmittel------------
		
		//Erzeuge Lebensmittel-Objekte
		Lebensmittel lebensmittel = new Lebensmittel("Tee", 2.98, LocalDate.now(), 0.5, 25, false);
		Lebensmittel.addLebensmittel(new Lebensmittel("Kekse", 2.98, LocalDate.now(), 0.5, 0, false));
		Lebensmittel.addLebensmittel(new Lebensmittel("Käse", 2.98, LocalDate.now(), 0.5, 2, false));
		Lebensmittel.addLebensmittel(lebensmittel);
		
		// Ermittle lebensmittelobjekt
		objekt = FindeObjekt.ermittelLebensmittelObjekt();
		
		// Wende Methoden auf das gefundene Objekt an
		objekt.herausgeben(25);
		objekt.toString();
		objekt.nachbestellen(15);
		objekt.toString();
		
		//------------Backwaren------------
		
		//Erzeuge Backwaren Objekte
		Backwaren backwaren = new Backwaren("Semmel", 2.98, LocalDate.now(), 0.5, 25, false);
		Backwaren.addBackwaren(new Backwaren("Laugenstange", 2.98, LocalDate.now(), 0.5, 0, false));
		Backwaren.addBackwaren(new Backwaren("Mehrkornbrötchen", 2.98, LocalDate.now(), 0.5, 25, false));
		Backwaren.addBackwaren(backwaren);
		
		// Ermittle Backwarenobjekt
		objekt1 = FindeObjekt.ermittelBackwarenObjekt();
				
		// Wende Methoden auf das gefundene Objekt an
		objekt1.herausgeben(25);
		objekt1.toString();
		objekt1.nachbestellen(15);
		objekt1.toString();

		//------------Getraenke------------
		
		//Erzeuge Getraenke Objekte
		Getraenke getraenk = new Getraenke("Bier_" + 0, 2.98, LocalDate.now(), 5.31);
		Getraenke.addGetraenke(getraenk);
		Getraenke getraenk2 = new Getraenke("Cola_" + 0, 2.98, LocalDate.now(), 0.00);
		Getraenke.addGetraenke(getraenk2);
		
		// Ermittle Getränke Objekt
		objekt2 = FindeObjekt.ermittelGetraenkeObjekt();
						
		// Wende Methoden auf das gefundene Objekt an
		objekt2.herausgeben(25);
		objekt2.toString();
		objekt2.nachbestellen(15);
		objekt2.toString();
		
		//------------NonFood------------
		
		NonFoodArtikel nonfood = new NonFoodArtikel("Jacke" + 0, 2.98, LocalDate.now(), "Jacke zum anziehen", Untergruppen.KLEIDUNG);
		NonFoodArtikel.addNonFoodArtikel(nonfood);
		NonFoodArtikel lebensmittel2 = new NonFoodArtikel("Musik" + 0, 2.98, LocalDate.now(), "Musik CD", Untergruppen.MEDIEN);
		NonFoodArtikel.addNonFoodArtikel(lebensmittel2);
		
		// Ermittle NonFood-Objekt
		objekt3 = FindeObjekt.ermittelNonFoodArtikelObjekt();
						
		// Wende Methoden auf das gefundene Objekt an
		objekt3.herausgeben(25);
		objekt3.toString();
		objekt3.nachbestellen(15);
		objekt3.toString();
		
		
		//------------Medien------------
		
		Medien medien = new Medien("CD" + 0, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Genre.KEINE, 2020);
		Medien medien2 = new Medien("CD" + 1, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Genre.KEINE, 2020);
		Medien.addMedien(medien2);
		Medien medien3 = new Medien("CD" + 2, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Genre.KEINE, 2020);
		Medien.addMedien(medien3);
		Medien medien4 = new Medien("CD" + 3, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Genre.KEINE, 2020);
		Medien.addMedien(medien4);
		Medien medien5 = new Medien("CD" + 4, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Genre.KEINE, 2020);
		Medien.addMedien(medien5);
		Medien medien6 = new Medien("CD" + 5, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Genre.KEINE, 2020);
		Medien.addMedien(medien6);
		Medien medien7 = new Medien("CD" + 6, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Genre.KEINE, 2020);
		Medien.addMedien(medien7);
		Medien.addMedien(medien);
		
		// Ermittle Medien
		objekt4 = FindeObjekt.ermittelMedienObjekt();
						
		// Wende Methoden auf das gefundene Objekt an
		objekt4.herausgeben(25);
		objekt4.toString();
		objekt4.nachbestellen(15);
		objekt4.toString();
		
		//------------Kleidung------------
		
		Kleidung keidung = new Kleidung("Jacke" + 0, 2.98, LocalDate.now(), "Jacke zum anziehen", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.OBERKOERPER, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(keidung);
		Kleidung keidung2 = new Kleidung("Hose" + 0, 2.98, LocalDate.now(), "Hose zum anziehen", Untergruppen.KLEIDUNG, Jahreszeit.FRUEHLING, Koerperteile.BEINE, Stofftypen.WOLLE);
		Kleidung.addKleidung(keidung2);
		Kleidung keidung3 = new Kleidung("Mütze" + 0, 2.98, LocalDate.now(), "Mütze zum anziehen", Untergruppen.KLEIDUNG, Jahreszeit.SOMMER, Koerperteile.KOPF, Stofftypen.SEIDE);
		Kleidung.addKleidung(keidung3);
		
		// Ermittle Kleidung
		objekt5 = FindeObjekt.ermittelKleidungObjekt();
						
		// Wende Methoden auf das gefundene Objekt an
		objekt5.herausgeben(25);
		objekt5.toString();
		objekt5.nachbestellen(15);
		objekt5.toString();
		
		//------------DrogerieArtikel------------
		
		DrogerieArtikel drogerie = new DrogerieArtikel("Kerze" + 0, 2.98, LocalDate.now(), "Macht Licht", Untergruppen.DROGERIEARTIKEL, Nutzung.WELLNESS, 1.00, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(drogerie);
		DrogerieArtikel drogerie2 = new DrogerieArtikel("Foto" + 0, 2.98, LocalDate.now(), "Bild zum ansehen", Untergruppen.DROGERIEARTIKEL, Nutzung.WELLNESS, 1.53, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(drogerie2);
		
		// Ermittle DrogerieArtikel
		objekt6 = FindeObjekt.ermittelDrogerieArtikelObjekt();
						
		// Wende Methoden auf das gefundene Objekt an
		objekt6.herausgeben(25);
		objekt6.toString();
		objekt6.nachbestellen(15);
		objekt6.toString();
		
		//------------Filme------------
		
		Filme film = new Filme("Horror" + 0, 2.98, LocalDate.now(), "Horrorfilm", Untergruppen.FILME, true, Filmgenre.HORROR, 2020, 1.56, Fsk.FSK18, Sprachen.CHINESISCH);
		Filme.addFilm(film);
		Filme film2 = new Filme("Action" + 0, 2.98, LocalDate.now(), "Action", Untergruppen.FILME, true, Filmgenre.ACTION, 2020, 1.56, Fsk.FSK16, Sprachen.DEUTSCH);
		Filme.addFilm(film2);
		Filme film3 = new Filme("Thriller" + 0, 2.98, LocalDate.now(), "Thriller", Untergruppen.FILME, true, Filmgenre.THRILLER, 2020, 1.56, Fsk.FSK12, Sprachen.ENGLISCH);
		Filme.addFilm(film3);
		Filme film4 = new Filme("Humor" + 0, 2.98, LocalDate.now(), "Humor", Untergruppen.FILME, true, Filmgenre.HUMOR, 2020, 1.56, Fsk.FSK6, Sprachen.FRANZÖSISCH);
		Filme.addFilm(film4);
		Filme film5 = new Filme("Drama" + 0, 2.98, LocalDate.now(), "Drama", Untergruppen.FILME, true, Filmgenre.DRAMA, 2020, 1.56, Fsk.FSK0, Sprachen.GRIECHISCH);
		Filme.addFilm(film5);
		Filme film6 = new Filme("Krieg" + 0, 2.98, LocalDate.now(), "Krieg", Untergruppen.FILME, true, Filmgenre.KRIEG, 2020, 1.56, Fsk.FSK18, Sprachen.INDISCH);
		Filme.addFilm(film6);
		Filme film7 = new Filme("Liebe" + 0, 2.98, LocalDate.now(), "Liebe", Untergruppen.FILME, true, Filmgenre.LIEBE, 2020, 1.56, Fsk.FSK16, Sprachen.ITALIENISCH);
		Filme.addFilm(film7);
		Filme film8 = new Filme("Western" + 0, 2.98, LocalDate.now(), "Western", Untergruppen.FILME, true, Filmgenre.WESTERN, 2020, 1.56, Fsk.FSK12, Sprachen.JAPANISCH);
		Filme.addFilm(film8);
		Filme film9 = new Filme("Horror" + 0, 2.98, LocalDate.now(), "Horror", Untergruppen.FILME, true, Filmgenre.HORROR, 2020, 1.56, Fsk.FSK6, Sprachen.NIEDERLÄNDISCH);
		Filme.addFilm(film9);
		Filme film10 = new Filme("Action" + 0, 2.98, LocalDate.now(), "Action", Untergruppen.FILME, true, Filmgenre.ACTION, 2020, 1.56, Fsk.FSK0, Sprachen.POLNISCH);
		Filme.addFilm(film10);
		Filme film11 = new Filme("Humor" + 0, 2.98, LocalDate.now(), "Humor", Untergruppen.FILME, true, Filmgenre.HUMOR, 2020, 1.56, Fsk.FSK18, Sprachen.RUSSISCH);
		Filme.addFilm(film11);
		Filme film12 = new Filme("Drama" + 0, 2.98, LocalDate.now(), "Drama", Untergruppen.FILME, true, Filmgenre.DRAMA, 2020, 1.56, Fsk.FSK16, Sprachen.SPANISCH);
		Filme.addFilm(film12);
		Filme film13 = new Filme("Krieg" + 0, 2.98, LocalDate.now(), "Krieg", Untergruppen.FILME, true, Filmgenre.KRIEG, 2020, 1.56, Fsk.FSK12, Sprachen.TÜRKISCH);
		Filme.addFilm(film13);
		Filme film15 = new Filme("Liebe" + 0, 2.98, LocalDate.now(), "Liebe", Untergruppen.FILME, true, Filmgenre.LIEBE, 2020, 1.56, Fsk.FSK6, Sprachen.VIETNAMESISCH);
		Filme.addFilm(film15);
		
		// Ermittle Medien
		objekt7 = FindeObjekt.ermittelFilmObjekt();
						
		// Wende Methoden auf das gefundene Objekt an
		objekt7.herausgeben(25);
		objekt7.toString();
		objekt7.nachbestellen(15);
		objekt7.toString();
		
	}

}
