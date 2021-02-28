package test;

import hilfsklassen.ErzeugeObjekt;
import hilfsklassen.FindeObjekt;

/**
 * Testklasse um für warentyp ein Objekt erzeugen zu lasen
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 22.02.20201
 *
 */
public class ErzeugeObjektTest {

	/**
     * Main-Method zum testen der Klasse ErzeugeObjekt. Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen.
     * 
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kann
     */
	public static void main(String[] args) {
		
		ErzeugeObjekt.erzeugeLebensmittel();
		System.out.println("Lebensmittel erzeugt\n");
		
		FindeObjekt.ermittelLebensmittelObjekt();
		
		ErzeugeObjekt.erzeugeBackware();
		System.out.println("Backware erzeugt\n");
		
		ErzeugeObjekt.erzeugeGetraenk();
		System.out.println("Getränk erzeugt\n");
		
		ErzeugeObjekt.erzeugeNonFoodArtikel();
		System.out.println("NonFoodArtikel erzeugt\n");
		
		ErzeugeObjekt.erzeugeKleidung();
		System.out.println("Kleidung erzeugt\n");
		
		ErzeugeObjekt.erzeugeMedien();
		System.out.println("Medien erzeugt\n");
		
		ErzeugeObjekt.erzeugeDrogerieArtikel();
		System.out.println("DrogerieArtikel erzeugt\n");
		
		ErzeugeObjekt.erzeugeFilm();
		System.out.println("Film erzeugt\n");
		
		
		FindeObjekt.ermittelBackwarenObjekt();
		FindeObjekt.ermittelGetraenkeObjekt();
		FindeObjekt.ermittelNonFoodArtikelObjekt();
		FindeObjekt.ermittelKleidungObjekt();
		FindeObjekt.ermittelMedienObjekt();
		FindeObjekt.ermittelDrogerieArtikelObjekt();
		FindeObjekt.ermittelFilmObjekt();
		

	}

}
