package waren;

import java.time.LocalDate;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von DrogerieArtkiel-Objekten
 * @author
 * @version
 * @date
 *
 */
public class DrogerieArtikel extends NonFoodArtikel {

	public DrogerieArtikel(String name, double preis, int anzahl, LocalDate seitWannImBestand, String beschreibung, String unterGruppe) {
		super(name, preis, anzahl, seitWannImBestand, beschreibung, unterGruppe);
		
		protected String nutzung;
		protected double stiftungwarentest;
		protected String allergene;				
	}

	public boolean herausgeben(int menge) {
		
		//Bestimmiung ob die Menge im Lager nach der herausgabe groesser gleich 0 ist
		int mengeLager = this.anzahl - menge;
		boolean herausgeben;
		
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(String.format("Fuer Die Drogerieartikel %s wurden %s Einheiten herausgegeben.", this.name,menge));
			
			herausgeben = true;
		} else {
			
			System.out.println(
					String.format("Fuer die Drogerieartikel %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			herausgeben = false;
		}
		return herausgeben;
	}
	@Override
	public String toString() {
		return null;
	}


}
