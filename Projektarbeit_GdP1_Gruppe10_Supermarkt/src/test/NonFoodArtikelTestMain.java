package test;
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
import waren.DrogerieArtikel;
import waren.Filme;
import waren.Kleidung;
import waren.Medien;
import waren.NonFoodArtikel;


public class NonFoodArtikelTestMain {

	public static void main(String[] args) {

		/*
		 * protected static final int KLEIDUNG = 5;
		 * protected static final int MEDIEN = 6; 
		 * protected static final int DROGERIEARTIKEL = 7;
		 * protected static final int FILME = 8; 
		 * 
		 * String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			 String beschreibung, int unterGruppe
		 * 
		 */
		
		//---------------------------NonFoodArtikel-----------------------------------------
		
		NonFoodArtikel nonfood = new NonFoodArtikel("Jacke" + 0, 2.98, LocalDate.now(), "Jacke zum anziehen", Untergruppen.KLEIDUNG);
		NonFoodArtikel.addNonFoodArtikel(nonfood);
		nonfood.nachbestellen(5);
		nonfood.herausgeben(5);
		nonfood.nachbestellen(200);
		nonfood.herausgeben(200);
		NonFoodArtikel lebensmittel2 = new NonFoodArtikel("Musik" + 0, 2.98, LocalDate.now(), "Musik CD", Untergruppen.MEDIEN);
		NonFoodArtikel.addNonFoodArtikel(lebensmittel2);
						
		for(int i = 0; i < 40; i++) {
			NonFoodArtikel lebensmittel5 = new NonFoodArtikel("Shampoo" + i, 2.98, LocalDate.now(), "Zum waschen von Haaren", Untergruppen.DROGERIEARTIKEL);
			NonFoodArtikel.addNonFoodArtikel(lebensmittel5);
			
		}
		NonFoodArtikel.gebenNFArtikelAus();
		
		//---------------------------Kleidung-----------------------------------------
		/*
		 * String name, double preis, LocalDate seitWannImBestand, int anzahl, 
		 * String beschreibung, int unterGruppe, int jahreszeit, String koerperteil, String stofftyp
		 */
		
		Kleidung keidung = new Kleidung("Jacke" + 0, 2.98, LocalDate.now(), "Jacke zum anziehen", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.OBERKOERPER, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidungWinter(keidung);
		keidung.nachbestellen(5);
		keidung.herausgeben(5);
		keidung.nachbestellen(200);
		keidung.herausgeben(200);
		Kleidung keidung2 = new Kleidung("Hose" + 0, 2.98, LocalDate.now(), "Hose zum anziehen", Untergruppen.KLEIDUNG, Jahreszeit.FRUEHLING, Koerperteile.BEINE, Stofftypen.WOLLE);
		Kleidung.addKleidungFruehling(keidung2);
		Kleidung keidung3 = new Kleidung("Mütze" + 0, 2.98, LocalDate.now(), "Mütze zum anziehen", Untergruppen.KLEIDUNG, Jahreszeit.SOMMER, Koerperteile.KOPF, Stofftypen.SEIDE);
		Kleidung.addKleidungSommer(keidung3);
						
		for(int i = 0; i < 40; i++) {
			Kleidung keidung5 = new Kleidung("Handschuhe" + i, 2.98, LocalDate.now(), "Handschuhe zum anziehen", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.HAENDE, Stofftypen.CHEMIEFASER);
			Kleidung.addKleidungHerbst(keidung5);
			
		}
		
		
		Kleidung.gibKleidungJahreszeitAus(Jahreszeit.WINTER);
		Kleidung.gibKleidungJahreszeitAus(Jahreszeit.FRUEHLING);
		Kleidung.gibKleidungJahreszeitAus(Jahreszeit.SOMMER);
		Kleidung.gibKleidungJahreszeitAus(Jahreszeit.HERBST);
		
		Kleidung.gibKleidungStofftypAus(Stofftypen.BAUMWOLLE);
		Kleidung.gibKleidungStofftypAus(Stofftypen.CHEMIEFASER);
		
		//---------------------------Medien-----------------------------------------
		/*String name, double preis, LocalDate seitWannImBestand, int anzahl, 
		 * String beschreibung, int unterGruppe, boolean isDigital, int genre, int erscheinungsjahr
		 * 
		 * protected static final int HORROR =1;
		 * protected static final int ACTION = 2;
		 * protected static final int THRILLER =3;
		 * protected static final int HUMOR =4;
		 * protected static final int DRAMA =5;
		 * protected static final int KRIEG =6;
		 * protected static final int LIEBE =7;
		 * protected static final int WESTERN =8;
		 */
		
		Medien medien = new Medien("CD" + 0, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.HORROR, 2020);
		Medien.addMedienHorror(medien);
		medien.nachbestellen(5);
		medien.herausgeben(5);
		medien.nachbestellen(200);
		medien.herausgeben(200);
		Medien medien2 = new Medien("CD" + 1, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.ACTION, 2020);
		Medien.addMedienAction(medien2);
		Medien medien3 = new Medien("CD" + 2, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.THRILLER, 2020);
		Medien.addMedienThriller(medien3);
		Medien medien4 = new Medien("CD" + 3, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.HUMOR, 2020);
		Medien.addMedienHumor(medien4);
		Medien medien5 = new Medien("CD" + 4, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.DRAMA, 2020);
		Medien.addMedienDrama(medien5);
		Medien medien6 = new Medien("CD" + 5, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.KRIEG, 2020);
		Medien.addMedienKrieg(medien6);
		Medien medien7 = new Medien("CD" + 6, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.LIEBE, 2020);
		Medien.addMedienLiebe(medien7);
						
		for(int i = 0; i < 40; i++) {
			Medien medien8 = new Medien("CD" + 7, 2.98, LocalDate.now(), "Musik", Untergruppen.MEDIEN, true, Filmgenre.WESTERN, 2020);
			Medien.addMedienWestern(medien8);
			
		}
		Medien.gebenMedienrtikelAus();
		
		//---------------------------DrogerieArtikel-----------------------------------------
		/*
		 * String name, double preis, LocalDate seitWannImBestand, int anzahl, String beschreibung,
		 * int unterGruppe, String nutzung, double stiftungwarentest, String allergene
		 */
		
		DrogerieArtikel drogerie = new DrogerieArtikel("Kerze" + 0, 2.98, LocalDate.now(), "Macht Licht", Untergruppen.DROGERIEARTIKEL, Nutzung.WELLNESS, 1.00, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(drogerie);
		drogerie.nachbestellen(5);
		drogerie.herausgeben(5);
		drogerie.nachbestellen(200);
		drogerie.herausgeben(200);
		DrogerieArtikel drogerie2 = new DrogerieArtikel("Foto" + 0, 2.98, LocalDate.now(), "Bild zum ansehen", Untergruppen.DROGERIEARTIKEL, Nutzung.WELLNESS, 1.53, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(drogerie2);
						
		for(int i = 0; i < 40; i++) {
			DrogerieArtikel drogerie3 = new DrogerieArtikel("Batterien" + i, 2.98, LocalDate.now(), "Energieträger", Untergruppen.DROGERIEARTIKEL, Nutzung.ELEKTRONIK, 1.53,  Allergene.GLUTEN);
			DrogerieArtikel.addDrogerieArtikel(drogerie3);
			
		}
		DrogerieArtikel.gibDrogerieArtikelAus();
		
		//---------------------------Filme-----------------------------------------
		/*
		 * String name, double preis, LocalDate seitWannImBestand, int anzahl, String beschreibung,
		 * int unterGruppe, boolean isDigital, int genre, int erscheinungsjahr, double dauer, int fsk, int sprache
		 * 
		 * protected static final int HORROR =1;
		 * protected static final int ACTION = 2;
		 * protected static final int THRILLER =3;
		 * protected static final int HUMOR =4;
		 * protected static final int DRAMA =5;
		 * protected static final int KRIEG =6;
		 * protected static final int LIEBE =7;
		 * protected static final int WESTERN =8;
		 * 
		 * protected static final int CHINESISCH = 1;
		 * protected static final int DEUTSCH = 2;
		 * protected static final int ENGLISCH = 3;
		 * protected static final int FRANZÖSISCH = 4;
		 * protected static final int GRIECHISCH = 5;
		 * protected static final int INDISCH = 6;
		 * protected static final int ITALIENISCH = 7;
		 * protected static final int JAPANISCH = 8;
		 * protected static final int NIEDERLÄNDISCH = 9;
		 * protected static final int POLNISCH = 10;
		 * protected static final int RUSSISCH = 11;
		 * protected static final int SPANISCH = 12;
		 * protected static final int TÜRKISCH = 13;
		 * protected static final int VIETNAMESISCH = 14;
		 * 
		 * protected static final int FSK18 = 18;
		 * protected static final int FSK16 = 16;
		 * protected static final int FSK12 = 12;
		 * protected static final int FSK6 =  6;
		 * protected static final int FSK0 =  0;
		 * 
		 */ 
		Filme film = new Filme("Horror" + 0, 2.98, LocalDate.now(), "Horrorfilm", Untergruppen.FILME, true, Filmgenre.HORROR, 2020, 1.56, Fsk.FSK18, Sprachen.CHINESISCH);
		Filme.addFilm(film);
		film.nachbestellen(5);
		film.herausgeben(5);
		film.nachbestellen(200);
		film.herausgeben(200);
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
						
		for(int i = 0; i < 40; i++) {
			Filme film14 = new Filme("Western" + i, 2.98, LocalDate.now(), "Western", Untergruppen.FILME, true, Filmgenre.WESTERN, 2020, 1.56, Fsk.FSK0, Sprachen.CHINESISCH);
			Filme.addFilm(film14);
			
		}
		Filme.gibFilmeAus();	
	}

}
