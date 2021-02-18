package waren;
import java.time.LocalDate;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Film-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class Filme extends Medien {

	
		//Objektattribute speziell für die Filme
		protected double dauer;
		protected int FSK;
		protected String sprache;
		
		//Klassenattribute
		private static int zaehler_medien = 0;
		
		public Filme(
				 String name, double preis, LocalDate seitWannImBestand, int anzahl, 
				 String beschreibung, int unterGruppe, boolean isDigital, String genre, int erscheinungsjahr,
				 double dauer, int FSK, String sprache) {
		super( name,  preis,  seitWannImBestand,  anzahl, 
			  beschreibung,  unterGruppe,  isDigital,  genre, erscheinungsjahr);
			
			this.dauer = dauer;
			this.FSK = FSK;
			this.sprache = sprache;
			// TODO Auto-generated constructor stub
		}
		
		public static void gibFilmeAus() {
			
}

		@Override
		// toString Methode um alles Daten leserlich als String auszugeben
		public String toString() {
		return "neuer Film Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
		" anzahl= " + anzahl +  " beschreibung= " + beschreibung + " unterGruppe = "+ unterGruppe + 
		" isDigital= " + isDigital + " genre= " + genre + " erscheinungsjahr= " + erscheinungsjahr + 
		" dauer= " + dauer + " FSK= " + FSK + " sprache= " + sprache + "]";
}
}	