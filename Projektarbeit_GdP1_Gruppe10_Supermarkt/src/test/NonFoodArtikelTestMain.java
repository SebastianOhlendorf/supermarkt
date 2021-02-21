package test;
import java.time.LocalDate;

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
		
		NonFoodArtikel nonfood = new NonFoodArtikel("Jacke" + 0, 2.98, LocalDate.now(), 0, "Jacke zum anziehen", 5);
		NonFoodArtikel.addNonFoodArtikel(nonfood);
		nonfood.nachbestellen(5);
		nonfood.herausgeben(5);
		nonfood.nachbestellen(200);
		nonfood.herausgeben(200);
		NonFoodArtikel lebensmittel2 = new NonFoodArtikel("Musik" + 0, 2.98, LocalDate.now(), 0, "Musik CD", 6);
		NonFoodArtikel.addNonFoodArtikel(lebensmittel2);
						
		for(int i = 0; i < 40; i++) {
			NonFoodArtikel lebensmittel5 = new NonFoodArtikel("Shampoo" + i, 2.98, LocalDate.now(), 0, "Zum waschen von Haaren", 7);
			NonFoodArtikel.addNonFoodArtikel(lebensmittel5);
			
		}
		NonFoodArtikel.gebenNFArtikelAus();
		
		//---------------------------Kleidung-----------------------------------------
		/*
		 * String name, double preis, LocalDate seitWannImBestand, int anzahl, 
		 * String beschreibung, int unterGruppe, int jahreszeit, String koerperteil, String stofftyp
		 */
		
		Kleidung keidung = new Kleidung("Jacke" + 0, 2.98, LocalDate.now(), 0, "Jacke zum anziehen", 5, 1, "Oberkörper", "polyester");
		Kleidung.addKleidungWinter(keidung);
		keidung.nachbestellen(5);
		keidung.herausgeben(5);
		keidung.nachbestellen(200);
		keidung.herausgeben(200);
		Kleidung keidung2 = new Kleidung("Hose" + 0, 2.98, LocalDate.now(), 0, "Hose zum anziehen", 5, 2, "Beine", "Baumwolle");
		Kleidung.addKleidungFruehling(keidung2);
		Kleidung keidung3 = new Kleidung("Mütze" + 0, 2.98, LocalDate.now(), 0, "Mütze zum anziehen", 5, 3, "Kopf", "Baumwolle");
		Kleidung.addKleidungSommer(keidung3);
						
		for(int i = 0; i < 40; i++) {
			Kleidung keidung5 = new Kleidung("Handschuhe" + i, 2.98, LocalDate.now(), 0, "Handschuhe zum anziehen", 5, 4, "Hand", "Baumwolle");
			Kleidung.addKleidungHerbst(keidung5);
			
		}
		
		
		Kleidung.gibKleidungJahreszeitAus(1);
		Kleidung.gibKleidungJahreszeitAus(2);
		Kleidung.gibKleidungJahreszeitAus(3);
		Kleidung.gibKleidungJahreszeitAus(4);
		
		Kleidung.gibKleidungStofftypAus("Baumwolle");
		Kleidung.gibKleidungStofftypAus("polyester");
		
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
		
		Medien medien = new Medien("CD" + 0, 2.98, LocalDate.now(), 0, "Musik", 6, true, 1, 2020);
		Medien.addMedienHorror(medien);
		medien.nachbestellen(5);
		medien.herausgeben(5);
		medien.nachbestellen(200);
		medien.herausgeben(200);
		Medien medien2 = new Medien("CD" + 1, 2.98, LocalDate.now(), 0, "Musik", 6, true, 2, 2020);
		Medien.addMedienAction(medien2);
		Medien medien3 = new Medien("CD" + 2, 2.98, LocalDate.now(), 0, "Musik", 6, true, 3, 2020);
		Medien.addMedienThriller(medien3);
		Medien medien4 = new Medien("CD" + 3, 2.98, LocalDate.now(), 0, "Musik", 6, true, 4, 2020);
		Medien.addMedienHumor(medien4);
		Medien medien5 = new Medien("CD" + 4, 2.98, LocalDate.now(), 0, "Musik", 6, true, 5, 2020);
		Medien.addMedienDrama(medien5);
		Medien medien6 = new Medien("CD" + 5, 2.98, LocalDate.now(), 0, "Musik", 6, true, 6, 2020);
		Medien.addMedienKrieg(medien6);
		Medien medien7 = new Medien("CD" + 6, 2.98, LocalDate.now(), 0, "Musik", 6, true, 7, 2020);
		Medien.addMedienLiebe(medien7);
						
		for(int i = 0; i < 40; i++) {
			Medien medien8 = new Medien("CD" + 7, 2.98, LocalDate.now(), 0, "Musik", 6, true, 8, 2020);
			Medien.addMedienWestern(medien8);
			
		}
		Medien.gebenMedienrtikelAus();
		
		//---------------------------DrogerieArtikel-----------------------------------------
		/*
		 * String name, double preis, LocalDate seitWannImBestand, int anzahl, String beschreibung,
		 * int unterGruppe, String nutzung, double stiftungwarentest, String allergene
		 */
		
		DrogerieArtikel drogerie = new DrogerieArtikel("Kerze" + 0, 2.98, LocalDate.now(), 0, "Macht Licht", 7, "Anzünden", 1.00, "Keine Allergene");
		DrogerieArtikel.addDrogerieArtikel(drogerie);
		drogerie.nachbestellen(5);
		drogerie.herausgeben(5);
		drogerie.nachbestellen(200);
		drogerie.herausgeben(200);
		DrogerieArtikel drogerie2 = new DrogerieArtikel("Foto" + 0, 2.98, LocalDate.now(), 0, "Bild zum ansehen", 7, "Visualisierung", 1.53, "Keine Allergene");
		DrogerieArtikel.addDrogerieArtikel(drogerie2);
						
		for(int i = 0; i < 40; i++) {
			DrogerieArtikel drogerie3 = new DrogerieArtikel("Batterien" + i, 2.98, LocalDate.now(), 0, "Energieträger", 7, "Für Geräte mit Batterien", 1.53, "Zink");
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
		Filme film = new Filme("Horror" + 0, 2.98, LocalDate.now(), 0, "Horrorfilm", 8, true, 1, 2020, 1.56, 18, 1);
		Filme.addFilm(film);
		film.nachbestellen(5);
		film.herausgeben(5);
		film.nachbestellen(200);
		film.herausgeben(200);
		Filme film2 = new Filme("Action" + 0, 2.98, LocalDate.now(), 0, "Action", 8, true, 2, 2020, 1.56, 16, 2);
		Filme.addFilm(film2);
		Filme film3 = new Filme("Thriller" + 0, 2.98, LocalDate.now(), 0, "Thriller", 8, true, 3, 2020, 1.56, 12, 3);
		Filme.addFilm(film3);
		Filme film4 = new Filme("Humor" + 0, 2.98, LocalDate.now(), 0, "Humor", 8, true, 4, 2020, 1.56, 6, 4);
		Filme.addFilm(film4);
		Filme film5 = new Filme("Drama" + 0, 2.98, LocalDate.now(), 0, "Drama", 8, true, 5, 2020, 1.56, 0, 5);
		Filme.addFilm(film5);
		Filme film6 = new Filme("Krieg" + 0, 2.98, LocalDate.now(), 0, "Krieg", 8, true, 6, 2020, 1.56, 18, 6);
		Filme.addFilm(film6);
		Filme film7 = new Filme("Liebe" + 0, 2.98, LocalDate.now(), 0, "Liebe", 8, true, 7, 2020, 1.56, 16, 7);
		Filme.addFilm(film7);
		Filme film8 = new Filme("Western" + 0, 2.98, LocalDate.now(), 0, "Western", 8, true, 8, 2020, 1.56, 12, 8);
		Filme.addFilm(film8);
		Filme film9 = new Filme("Horror" + 0, 2.98, LocalDate.now(), 0, "Horror", 8, true, 1, 2020, 1.56, 6, 9);
		Filme.addFilm(film9);
		Filme film10 = new Filme("Action" + 0, 2.98, LocalDate.now(), 0, "Action", 8, true, 2, 2020, 1.56, 0, 10);
		Filme.addFilm(film10);
		Filme film11 = new Filme("Humor" + 0, 2.98, LocalDate.now(), 0, "Humor", 8, true, 4, 2020, 1.56, 18, 11);
		Filme.addFilm(film11);
		Filme film12 = new Filme("Drama" + 0, 2.98, LocalDate.now(), 0, "Drama", 8, true, 5, 2020, 1.56, 16, 12);
		Filme.addFilm(film12);
		Filme film13 = new Filme("Krieg" + 0, 2.98, LocalDate.now(), 0, "Krieg", 8, true, 6, 2020, 1.56, 12, 13);
		Filme.addFilm(film13);
		Filme film15 = new Filme("Liebe" + 0, 2.98, LocalDate.now(), 0, "Liebe", 8, true, 7, 2020, 1.56, 6, 14);
		Filme.addFilm(film15);
						
		for(int i = 0; i < 40; i++) {
			Filme film14 = new Filme("Western" + i, 2.98, LocalDate.now(), 0, "Western", 8, true, 8, 2020, 1.56, 0, 1);
			Filme.addFilm(film14);
			
		}
		Filme.gibFilmeAus();
		
		
		
	}

}
