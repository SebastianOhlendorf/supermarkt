package supermarkt;

import java.util.InputMismatchException;

import hilfsklassen.Ausgaben;
import hilfsklassen.Eingaben;
import menu.Hauptmenu;

/**
 * Das Programm ist eine Abschlussprojektaufgabe wo alle Elemente des Moduls GDP1 eingearbeitet wurden.
 * Das Programm ist f�r den Warenbestand eines Supermarktes und bietet eine Reihe von Funktionen
 * Funktionen:
 * Alle Waren oder einzelne Warentypen AusAusgeben
 * Eine neue Ware im Warensystem anlegen
 * F�r eine Ware eine nachbestellung t�tigen
 * F�r eine Ware eine herausgabe t�tigen
 * Weitere Funktionen zu den jeweiligen Warentypen
 * @author Ethan Stapff
 * @version 1.0
 * @date 26.02.2021
 *
 */
public class Supermarkt {

    /**
     * Main-Method zum Starten des Programms Supermarkt. Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen.
     * 
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kann
     */
	public static void main(String[] args) {
		
		int auswahlHauptmen� = 6;
		
		Ausgaben.supermaktLogo();
		Ausgaben.gruppeZehn();
		Ausgaben.begruessung();
		
		Lager.erstelleLager();
      
		do { 
			
			Ausgaben.hauptmenue();
			
			//Auswahl Hauptmen�
			try {
				auswahlHauptmen� = Eingaben.eingabeAuswahlHauptmenu("Welchen Men�punk m�chten sie w�hlen?");
				
				switch(auswahlHauptmen�) {
				
				case 0: // Alle Waren anzeigen
					Hauptmenu.alleWarenAusgeben();
					break;
				case 1: // Neue Ware anlegen
					Hauptmenu.neueWareAnlegen();
					break;
				case 2: // Waren nachbestellen
					Hauptmenu.warenNachbestellen();
					break;
				case 3: // Waren herausgeben
					Hauptmenu.warenHerausgeben();
					break;
				case 4: // Methoden Warentypen
					Hauptmenu.funktionenWaretypen();
					break;
				case 5: //ende loop;
					break;
				default: System.out.println("Bitte versuchen sie es erneut!\n");
					break;
				}
				
			}catch (InputMismatchException e) {
				System.out.println("Es wurde ein falscher Datentyp eingegeben. Die Aktion konnte nicht durchgef�hrt werden!");
				Eingaben.eingabeString("");
			}	
			
		}while (auswahlHauptmen� != 5);
		
		Ausgaben.beendigung();
	}	
}

