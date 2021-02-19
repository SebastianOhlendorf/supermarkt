package waren;

import java.time.LocalDate;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von DrogerieArtkiel-Objekten
 * @author Ethan Stapff
 * @version 1.02
 * @date 19.02.2021
 *
 */
public class DrogerieArtikel extends NonFoodArtikel {
	
	protected String nutzung;
	protected double stiftungwarentest;
	protected String allergene;	
	private static int DrogerieArtikel_zaehler = 0;

	/** 
	 * Konstruktor der Klasse DrogerieArtikel um ein neues Drogerieartikel als Objekt zu erzeugen.
	 * 
	 * @param name Name des Drogerieartikels als String
	 * @param preis	Preis des Drogerieartikels als Double	
	 * @param seitWannImBestand Zeitstempel von wann das Drogerieartikel hinzugefügt wurde.
	 * @param beschreibung	Beschreibung vom Drogerieartikel.
	 */
	public DrogerieArtikel(String name, double preis, int anzahl, LocalDate seitWannImBestand, String beschreibung, String nutzung, double stiftungwarentest, String allergene) {
		super(name, preis, anzahl, seitWannImBestand, beschreibung);
							
		this.nutzung = nutzung;
		this.stiftungwarentest = stiftungwarentest;
		this. allergene = allergene;
	}
	public static void addDrogerieArtikel(DrogerieArtikel drogerieArtikel )  {
		
		if(DrogerieArtikel_zaehler <= MAXANZAHLWAREN) {
			alleWaren.add(drogerieArtikel);
			DrogerieArtikel.anzahl = MAXMENGE;
			DrogerieArtikel.seitWannImBestand = LocalDate.now();
			DrogerieArtikel.setKennung(DROGERIEARTIKEL);
			DrogerieArtikel.beschreibung = "Die genaue Beschreibung des Produktes :" + drogerieArtikel.beschreibung;
			DrogerieArtikel.nutzung = "Die Funtion des Produktes: " + drogerieArtikel.nutzung;
			DrogerieArtikel.stiftungwarentest = "Wertung von Stiftung Warentest: " + drogerieArtikel.stiftungwarentest;
			DrogerieArtikel.allergene = "Dieses Produkt enthält folgendes Allergen: " + drogerieArtikel.allergene; 
			
		}else {
			System.out.println(("Die Anzahl 30 verschiedener Waren wurde ueberschritten. Das Produkt konnte nicht hinzugefuegt werden. : %s ")  drogerieArtikel.name );
}	
 }
 	public boolean nachbestellen(int menge) {
		
		//Methodenvariablen
		int mengeLager = this.anzahl + menge;
		int diffMenge;
		boolean nachbestellung;
	
		//Pruefung ob Lagermenge einer Ware gleich der Lagergroesse ist
		if (this.anzahl == MAXMENGE) {
		
			System.out.println(String.format("Der NonFoodArtikel hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgefuehrt!", this.name));
		
			nachbestellung = false;	
		}
		//Pr�fung ob die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
		else if(mengeLager > MAXMENGE) {
			diffMenge = MAXMENGE - this.anzahl;
			this.anzahl = this.anzahl + diffMenge;
		
			System.out.println(String.format("Die Maximale Lagermenge (100) wurde �berschritten! Es wurden daher %s Einheiten nachbestellt", diffMenge));
			this.seitWannImBestand = LocalDate.now();
		
			nachbestellung = true;	
		}
		//Nachbestellung der Ware
		else {
		
			this.anzahl = this.anzahl + menge;
			this.seitWannImBestand = LocalDate.now();
		
			nachbestellung = true;
		}
			return nachbestellung;
}


	public boolean herausgeben(int menge) {
		
		//Bestimmiung ob die Menge im Lager nach der herausgabe groesser gleich 0 ist
		int mengeLager = this.anzahl - menge;
		boolean herausgeben;
		
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(String.format("Fuer das Drogerieartikel %s wurden %s Einheiten herausgegeben.", this.name, menge));
			
			herausgeben = true;
		} else {
			
			System.out.println(
					String.format("Fuer die Drogerieartikel %s gibt es nur noch %s Einheiten auf Lager.", this.name, this.anzahl));
			
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
