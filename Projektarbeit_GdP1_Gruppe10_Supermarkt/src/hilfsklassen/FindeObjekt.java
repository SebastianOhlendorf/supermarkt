package hilfsklassen;

import enums.Kennungen;
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
	
	public static Lebensmittel ermittelLebensmittelObjekt() {
		
		int objektID;
		Lebensmittel lebensmittelObjekt;
		
		Lebensmittel.gebeLebensmittelAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		lebensmittelObjekt = Lebensmittel.erhalteObjekt(objektID);
		
		return lebensmittelObjekt;
	}
	
	public static Backwaren ermittelBackwarenObjekt() {
		
		int objektID;
		Backwaren backwarenObjekt;
		
		Backwaren.gebeBackwareAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		backwarenObjekt = Backwaren.erhalteObjekt(objektID);
		
		return backwarenObjekt;
	}
	
	public static Getraenke ermittelGetraenkeObjekt() {
		
		int objektID;
		Getraenke getraenkeObjekt;
		
		Getraenke.gebeGetraenkeAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		getraenkeObjekt = Getraenke.erhalteObjekt(objektID);
		
		return getraenkeObjekt;
	}
	
	public static NonFoodArtikel ermittelNonFoodArtikelObjekt() {
		
		int objektID;
		NonFoodArtikel nonFoodArtikelObjekt;
		
		NonFoodArtikel.gebenNFArtikelAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		nonFoodArtikelObjekt = NonFoodArtikel.erhalteObjekt(objektID);
		
		return nonFoodArtikelObjekt;
	}
	
	public static Medien ermittelMedienObjekt() {
		
		int objektID;
		Medien medienObjekt;
		
		Medien.gebenMedienArtikelAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		medienObjekt = Medien.erhalteObjekt(objektID);
		
		return medienObjekt;
	}
	
	public static Kleidung ermittelKleidungObjekt() {
		
		int objektID;
		Kleidung kleidungObjekt;
		
		Kleidung.gebeKleidungAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		kleidungObjekt = Kleidung.erhalteObjekt(objektID);
		
		return kleidungObjekt;
	}
	
	public static DrogerieArtikel ermittelDrogerieArtikelObjekt() {
		
		int objektID;
		DrogerieArtikel drogerieArtikelObjekt;
		
		DrogerieArtikel.gibDrogerieArtikelAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		drogerieArtikelObjekt = DrogerieArtikel.erhalteObjekt(objektID);
		
		return drogerieArtikelObjekt;
	}
	
	public static Filme ermittelFilmObjekt() {
		
		int objektID;
		Filme filmobjektObjekt;
		
		Filme.gibFilmeAus();
		
		objektID = Eingaben.eingabeInteger("Bitte geben sie die gewünschte Nummer der Ware ein:");
		
		filmobjektObjekt = Filme.erhalteObjekt(objektID);
		
		return filmobjektObjekt;
	}

}
