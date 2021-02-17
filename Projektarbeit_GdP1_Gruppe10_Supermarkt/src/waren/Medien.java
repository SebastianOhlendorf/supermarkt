package waren;

import java.time.LocalDate;

//import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Medien-Objekten
 * @author 
 * @version
 * @date
 *
 */
public class Medien extends NonFoodArtikel {

	//Objektattribute
	protected boolean isDigital;
	protected String genre;
	protected int erscheinungsjahr;
	
	//Klassenattribute
	private static int zaehler_medien = 0;
	public Medien(
			 String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			 String beschreibung, int unterGruppe, boolean isDigital, String genre, int erscheinungsjahr) {
		super( name,  preis,  seitWannImBestand,  anzahl, beschreibung,  unterGruppe);
		
		this.isDigital = isDigital;
		this.genre = genre;
		this.erscheinungsjahr = erscheinungsjahr;
		// TODO Auto-generated constructor stub
	}
	
	public static void addMedien(Medien medien)  {
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			alleWaren.add(medien);
			medien.anzahl = MAXMENGE;
			medien.seitWannImBestand = LocalDate.now();
			medien.setKennung(MEDIEN);
			medien.beschreibung = "Die genaue Beschreibung des Produktes :" + medien.beschreibung;
	
			
		}else {
			System.out.println("Die Anzahl 30 verschiedener Medien Artikel wurde überschritten."
					+ "Das Produkt konnte nicht hinzugefügt werden :" + medien.name);
	}
	}
	
	@Override
public boolean nachbestellen(int menge) {
		
		//Methodenvariablen
		int mengeLager = this.anzahl + menge;
		int diffMenge;
		boolean nachbestellung;
		
		//Prüfung ob Lagermenge einer Ware gleich der Lagergroeße ist
		if (this.anzahl == MAXMENGE) {
			
			System.out.println(
					String.format(
							"Die Medien Artikel haben bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
							this.name));
			
			nachbestellung = false;
			
		}
		//Prüfung ob die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
		else if(mengeLager > MAXMENGE) {
			diffMenge = MAXMENGE - this.anzahl;
			this.anzahl = this.anzahl + diffMenge;
			
			System.out.println(
					String.format(
							"Die Maximale Lagermenge (100) wurde überschritten! Es wurden daher %s Einheiten nachbestellt", 
							diffMenge));
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


	@Override
	public boolean herausgeben(int menge) {

		//Methodenvariablen
		int mengeLager = this.anzahl - menge;
		boolean herausgeben;
		
		//Prüfung ob noch genug im Lager ist zum herausgeben
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(
					String.format(
							"Für den Medien Artikel %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} 
		//Keine herausgabe der Waren und es werden neue Waren nachbestellt
		else {
			
			System.out.println(
					String.format(
							"Für den Medien Artikel %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			
			herausgeben = false;
			 
		}
		return herausgeben;
	}
	
	@Override
	public String toString() {
		
		return "neuer Medien Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
				" anzahl= " + anzahl +  " beschreibung= " + beschreibung + " unterGruppe = "+ unterGruppe + 
				" isDigital= " + isDigital + " genre= " + genre + " erscheinungsjahr= " + erscheinungsjahr + "]";
			
	}
	/**
	 * 
	 */
	public static void gebenMedienrtikelAus() {
	for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == MEDIEN) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			
		}
	}
	

	public static void gibListeDigitalAus() {
		if(medien.)
	}
	
	public static void gibGenreAus() {
		
	}
	
	


}
 