package waren;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Kinderklasse von Ware um Non-Food Artikel Objekte erstellen zu können
 * @author Lennart Sparbier
 * @version 1.0
 * @date 16.02.2021
 *
 */
public class NonFoodArtikel extends Ware {
	
	//Objektattribute
	protected  String beschreibung;
	protected int unterGruppe;
	
	
	//Klassenattribut. Zählt die NonFood Artikel
	private static int nonFoodArtikel_zaehler = 0;
	

	/**
	 * Konstruktor der Klasse NonFoodArtikel um ein neues NonFoodArtikel-Objekt zu erzeugen.
	 * @author Lennart Sparbier / 16.02.2021
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * 
	 */
	public NonFoodArtikel(String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			 String beschreibung, int unterGruppe)  {
			super(name, preis, anzahl, seitWannImBestand);
			
			this.beschreibung = beschreibung;
			this.unterGruppe = unterGruppe;
	}
		
		// TODO Auto-generated constructor stub
		
	public static void addNonFoodArtikel(NonFoodArtikel nonFoodArtikel )  {
		
		
		
		if(nonFoodArtikel_zaehler < MAXANZAHLWAREN) {
			alleWaren.add(nonFoodArtikel);
			nonFoodArtikel.anzahl = MAXMENGE;
			nonFoodArtikel.seitWannImBestand = LocalDate.now();
			nonFoodArtikel.setKennung(NONFOODARTIKEL);
			nonFoodArtikel.beschreibung = "Die genaue Beschreibung des Produktes :" + nonFoodArtikel.beschreibung;
			
			switch(nonFoodArtikel.unterGruppe) {
			case 1: nonFoodArtikel.setUnterGruppe (KLEIDUNG);
					break;
			case 2: nonFoodArtikel.setUnterGruppe(MEDIEN);
					break;
			case 3: nonFoodArtikel.setUnterGruppe(DROGERIEARTIKEL);	
					break;
			default: System.out.println("Es wurde keine korrekte Untergruppe übergeben");		
			}
			
		}else {
			System.out.println("Die Anzahl 30 verschiedener Waren wurde überschritten."
					+  "Das Produkt konnte nicht hinzugefügt werden :"  + nonFoodArtikel.name);
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
							"Der NonFoodArtikel hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
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
							"Für das Getränk %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} 
		//Keine herausgabe der Waren und es werden neue Waren nachbestellt
		else {
			
			System.out.println(
					String.format(
							"Für das Getränk %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			
			herausgeben = false;
			 
		}
		return herausgeben;
	}
	
	@Override
	public String toString() {
		
		return "neuer NonFood Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
				" anzahl= " + anzahl +  " beschreibung= " + beschreibung +
				" unterGruppe = "+ unterGruppe + "]";
			
	}
	
	/**
	 * 
	 */
	public static void gebenNFArtikelAus() {
	for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == NONFOODARTIKEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			
		}
	}
	
	
	
}

	