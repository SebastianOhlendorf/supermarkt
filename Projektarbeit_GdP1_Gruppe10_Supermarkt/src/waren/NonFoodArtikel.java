package waren;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Kinderklasse von Ware um Non-Food Artikel Objekte erstellen zu k�nnen
 * @author 
 * @version
 * @date
 *
 */
public class NonFoodArtikel extends Ware {
	
	//Objektattribute
	protected  String beschreibung;
	protected int unterGruppe;
	
	
	//Klassenattribut. Z�hlt die NonFood Artikel
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
			default: System.out.println("Es wurde keine korrekte Untergruppe �bergeben");		
			}
			
		}else {
			System.out.println("Die Anzahl 30 verschiedener Waren wurde �berschritten."
					+  "Das Produkt konnte nicht hinzugef�gt werden :"  + nonFoodArtikel.name);
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
							"Der NonFoodArtikel hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
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
							"F�r das Getr�nk %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} 
		//Keine herausgabe der Waren und es werden neue Waren nachbestellt
		else {
			
			System.out.println(
					String.format(
							"F�r das Getr�nk %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
		}
		
		// Besprechen: M�sste mit in Ware als Vererbung	obImBestand = true;!!
		//this.obImBestand = true; ( Ben�tigen im Hauptprogramm if abfrage 
		// if this.anzahl = 0  this.obImBestand= false)
		
		// Die Ware soll ins Lager gepackt werden Klasse Lager
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

	