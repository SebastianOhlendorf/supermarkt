package waren;

import java.time.LocalDate;

//import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Medien-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class Medien extends NonFoodArtikel {
	
	// Dient zum setzen der Genres im Switch Case
	
	//Objektattribute
	protected boolean isDigital;
	protected int genre;
	protected int erscheinungsjahr;
	protected static final int HORROR =1;
	protected static final int ACTION = 2;
	protected static final int THRILLER =3;
	protected static final int HUMOR =4;
	protected static final int DRAMA =5; 
	protected static final int KRIEG =6;
	protected static final int LIEBE =7;
	protected static final int WESTERN =8;
	
	
	//Klassenattribute
	private static int zaehler_medien = 0;
	
	
	public Medien(
			 String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			 String beschreibung, int unterGruppe, boolean isDigital, int genre, int erscheinungsjahr) {
		super( name,  preis,  seitWannImBestand,  anzahl, beschreibung,  unterGruppe);
		
		this.isDigital = isDigital;
		this.genre = genre;
		this.erscheinungsjahr = erscheinungsjahr;
		
	}
	
	public static void addMedien(Medien medien)  {
		//Variablen um mit isDigital festzustellen ob ein Medium analog oder digital ist
		boolean digitalAnalog =true;
		
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			alleWaren.add(medien);
			medien.anzahl = MAXMENGE;
			medien.seitWannImBestand = LocalDate.now();
			medien.setKennung(MEDIEN);
			
			
			switch(medien.genre) {
			case 1: medien.setGenre(HORROR);
					System.out.println("Horrorfilm");
					break;	
			case 2: medien.setGenre(ACTION);
					System.out.println("Actionfilm");
					break;
			case 3: medien.setGenre(THRILLER);
					System.out.println("Thriller");
					break;
			case 4: medien.setGenre(HUMOR);
					System.out.println("Humor");
					break;
			case 5: medien.setGenre(DRAMA);
					System.out.println("Kriegsfilm");
				break;	
			case 6: medien.setGenre(KRIEG);
					System.out.println("Liebesfilm");
				break;
			case 7: medien.setGenre(LIEBE);
					System.out.println("Western");
				break;
			case 8: medien.setGenre(WESTERN);
					System.out.println("Sportfilm");
				break;		
			
			default: System.out.println("Es wurde kein Genre ausgew�hlt");
			}
			

			// gibt true zur�ck( ist dann Digital) wenn digitanAnalog auch true ist
			if(digitalAnalog) {
				medien.isDigital = true;
						System.out.println( "digital");
				}else {
					medien.isDigital = false;
					  	System.out.println("analog");
				}
			
			
		
		}else {
			System.out.println("Die Anzahl 30 verschiedener Medien Artikel wurde �berschritten."
					+ "Das Produkt konnte nicht hinzugef�gt werden :" + medien.name);
	}
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
	

	
	@Override
public boolean nachbestellen(int menge) {
		
		//Methodenvariablen
		int mengeLager = this.anzahl + menge;
		int diffMenge;
		boolean nachbestellung;
		
		//Pr�fung ob Lagermenge einer Ware gleich der Lagergroe�e ist
		if (this.anzahl == MAXMENGE) {
			
			System.out.println(
					String.format(
							"Die Medien Artikel haben bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
							this.name));
			
			nachbestellung = false;
			
		}
		//Pr�fung ob die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
		else if(mengeLager > MAXMENGE) {
			diffMenge = MAXMENGE - this.anzahl;
			this.anzahl = this.anzahl + diffMenge;
			
			System.out.println(
					String.format(
							"Die Maximale Lagermenge (100) wurde �berschritten! Es wurden daher %s Einheiten nachbestellt", 
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
		
		//Pr�fung ob noch genug im Lager ist zum herausgeben
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(
					String.format(
							"F�r den Medien Artikel %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} 
		//Keine herausgabe der Waren und es werden neue Waren nachbestellt
		else {
			
			System.out.println(
					String.format(
							"F�r den Medien Artikel %s gibt es nur noch %s Einheiten auf Lager.", 
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
	


}
 