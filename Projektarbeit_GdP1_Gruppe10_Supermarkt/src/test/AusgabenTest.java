package test;

import hilfsklassen.Ausgaben;

/**
 * Testklasse der Klasse Ausgaben um diese zu testen und um die Ergebnisse auf der Konsole zu sehen
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 23.02.20201
 *
 */
public class AusgabenTest {

	/**
     * Main-Method zum testen der Klasse Ausgaben. Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen.
     * 
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kann
     */
	public static void main(String[] args) {
		
		
		Ausgaben.supermaktLogo();
		Ausgaben.gruppeZehn();
		Ausgaben.hauptmenue();
		Ausgaben.untermenue();
		Ausgaben.untermenueLebensmittel();
		Ausgaben.untermenueBackwaren();
		Ausgaben.untermenueGetraenke();
		Ausgaben.untermenueNonFood();
		Ausgaben.untermenueMedien();
		Ausgaben.untermenueKleidung();
		Ausgaben.untermenueDrogerieArtikel();
		Ausgaben.untermenueFilme();
		Ausgaben.begruessung();
		Ausgaben.beendigung();

	}

}
