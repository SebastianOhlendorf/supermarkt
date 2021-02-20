package waren;
import java.time.LocalDate;

import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Film-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class Filme extends Medien {

	
		//Objektattribute speziell für die Klasse Filme
		protected double dauer;
		protected int FSK;
		protected int sprache;
		
		//Klassenattribute
		private static int zaehler_filme = 0;
		
		// Dient zum setzen der FSK im Switch Case
		protected static final int FSK18 = 5;
		protected static final int FSK16 = 4;
		protected static final int FSK12 = 3;
		protected static final int FSK6 =  2;
		protected static final int FSK0 =  1;
		
		
		// Dient zum setzen der Sprache im Switch Case
		protected static final int CHINESISCH = 1;
		protected static final int DEUTSCH = 2;
		protected static final int ENGLISCH = 3;
		protected static final int FRANZÖSISCH = 4;
		protected static final int GRIECHISCH = 5;
		protected static final int INDISCH = 6;
		protected static final int ITALIENISCH = 7;
		protected static final int JAPANISCH = 8;
		protected static final int NIEDERLÄNDISCH = 9;
		protected static final int POLNISCH = 10;
		protected static final int RUSSISCH = 11;
		protected static final int SPANISCH = 12;
		protected static final int TÜRKISCH = 13;
		protected static final int VIETNAMESISCH = 14;
		
		/**
		Konstruktor der Klasse Filme um ein neues Film-Objekt zu erzeugen.
		* @author Lennart Sparbier / 18.02.2020
	 * 
	 * @param name
	 * @param preis
	 * @param seitWannImBestand
	 * @param anzahl
	 * @param beschreibung
	 * @param unterGruppe
	 * @param isDigital
	 * @param genre
	 * @param erscheinungsjahr
	 * @param dauer
	 * @param FSK
	 * @param sprache
	 */
		 
		public Filme(
				 String name, double preis, LocalDate seitWannImBestand, int anzahl, 
				 String beschreibung, int unterGruppe, boolean isDigital, int genre, int erscheinungsjahr,
				 double dauer, int FSK, int sprache) {
		super( name,  preis,  seitWannImBestand,  anzahl, beschreibung,  unterGruppe, isDigital, genre, erscheinungsjahr);
			
			this.dauer = dauer;
			this.FSK = FSK;
			this.sprache = sprache;
			// TODO Auto-generated constructor stub
			
		
		}
		
		
		/**
		 * Fuegt dem Array alleWaren ein neues Lebensmittel hinzu, solange dieses nicht
		 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und das
		 * Lebensmittel (Name) nicht hinugefuegt werden konnte.
		 * @author Sebastian Ohlendorf
		 * 
		 * @param lebensmittel das hinzuzufuegende neue Lebensmittel
		 * @throws SupermarktExceptions Eigene Exceptionmeldung wenn die Haltbarkeit keinen positiven Wert enthält
		 */
		public static void addFilm(Filme film) throws SupermarktExceptions {
				
			if(zaehler_filme < MAXANZAHLWAREN) {
				alleWaren.add(film);
				film.anzahl = MAXMENGE;
				film.seitWannImBestand = LocalDate.now();
				film.setKennung(FILM);
				
				switch(film.FSK) {
				case 1: film.setFSK(FSK0);
						System.out.println("Der Film ist ab 0 Jahren freigegeben");
						break;	
				case 2: film.setFSK(FSK6);
						System.out.println("Der Film ist ab 6 Jahren freigegeben");
						break;
				case 3: film.setFSK(FSK12);
						System.out.println("Der Film ist ab 12 Jahren freigegeben");
						break;
				case 4: film.setFSK(FSK16);
						System.out.println("Der Film ist ab 16 Jahren freigegeben");
						break;
				case 5: film.setFSK(FSK18);
						System.out.println("Der Film ist ab 18 Jahren freigegeben");
					break;	
				
				
				default: System.out.println("Es wurde keine FSK ausgewählt");
				}
				
				
				switch(film.sprache) {
				case 1: film.setSprache(CHINESISCH);
						System.out.println("Der Film enthält die Chinesische Tonspur");
						break;	
				case 2: film.setSprache(DEUTSCH);
						System.out.println("Der Film enthält die Chinesische Tonspur");
						break;
				case 3: film.setSprache(ENGLISCH);
						System.out.println("Der Film ist ab 12 Jahren freigegeben");
						break;
				case 4: film.setSprache(FRANZÖSISCH);
						System.out.println("Der Film ist ab 16 Jahren freigegeben");
						break;
				case 5: film.setSprache(GRIECHISCH);
						System.out.println("Der Film ist ab 18 Jahren freigegeben");
						break;	
				case 6: film.setSprache(INDISCH);
						System.out.println("Der Film ist ab 0 Jahren freigegeben");
						break;	
				case 7: film.setSprache(ITALIENISCH);
						System.out.println("Der Film ist ab 6 Jahren freigegeben");
						break;
				case 8: film.setSprache(JAPANISCH);
						System.out.println("Der Film ist ab 12 Jahren freigegeben");
						break;
				case 9: film.setSprache(NIEDERLÄNDISCH);
						System.out.println("Der Film ist ab 16 Jahren freigegeben");
						break;
				case 10: film.setSprache(POLNISCH);
						System.out.println("Der Film ist ab 18 Jahren freigegeben");
						break;	
				case 11: film.setSprache(RUSSISCH);
						System.out.println("Der Film ist ab 0 Jahren freigegeben");
						break;	
				case 12: film.setSprache(SPANISCH);
						System.out.println("Der Film ist ab 6 Jahren freigegeben");
						break;
				case 13: film.setSprache(TÜRKISCH);
						System.out.println("Der Film ist ab 12 Jahren freigegeben");
						break;
				case 14: film.setSprache(VIETNAMESISCH);
						System.out.println("Der Film ist ab 16 Jahren freigegeben");
						break;
				
				default: System.out.println("Es wurde keine gültige Sprache ausgewählt");
				}
				
				
				
				
				if(lebensmittel.haltbarkeit <= 0) {
					throw new SupermarktExceptions("Fehler: Die Haltbarkeit keinen positiven Wert!");
				}
						
				zaehler_lebensmittel++;
						
			}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Waren wurde überschritten.! Das Lebensmittel %s konnte nicht hinzugefügt werden", 
								lebensmittel.name));
			}
		}
		
		public static void gibFilmeAus() {
			
}

		@Override
		// toString Methode um alle Daten leserlich als String auszugeben
		public String toString() {
		return "neuer Film Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
		" anzahl= " + anzahl +  " beschreibung= " + beschreibung + " unterGruppe = "+ unterGruppe + 
		" isDigital= " + isDigital + " genre= " + genre + " erscheinungsjahr= " + erscheinungsjahr + 
		" dauer= " + dauer + " FSK= " + FSK + " sprache= " + sprache + "]";
}
}	