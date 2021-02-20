package test;
import java.time.LocalDate;
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
		
	}

}
