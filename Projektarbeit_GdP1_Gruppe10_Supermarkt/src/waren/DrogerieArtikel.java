package waren;

import java.time.LocalDate;
import java.util.ArrayList;
import enums.Allergene;
import enums.Kennungen;
import enums.Nutzung;
import enums.Untergruppen;

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
	
	//Klassenvariable zum Z�hlen der Drogerieartikeltypen
	//Klassenvariable zum Z�hlen der Drogerieartikeltypen
	private static int DrogerieArtikel_zaehler = 0;
	
	/**
	 * Konstruktor der Klasse DrogerieArtikel um ein neues Drogerieartikel als Objekt zu erzeugen.
	 * 
	 * @param name Name des Drogerieartikels als String
	 * @param preis	Preis des Drogerieartikels als Double	
	 * @param seitWannImBestand Zeitstempel von wann das Drogerieartikel hinzugef�gt wurde.
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param beschreibung Beschreibung vom Drogerieartikel
	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel geh�rt bspw. Kleidung als Integer
	 * @param nutzung Gibt den Nutzen des Artikels als String an
	 * @param stiftungwarentest Gibt die Bewertung des Stiftungwarentestes als Double an
	 * @param allergene Gibt an ob bei dem Artikel Allergene enthalten sind als String
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	public DrogerieArtikel(String name, double preis, int anzahl, LocalDate seitWannImBestand, String beschreibung, String nutzung, double stiftungwarentest, String allergene) {
		super(name, preis, anzahl, seitWannImBestand, beschreibung);
							
=======
	public DrogerieArtikel(String name, double preis, LocalDate seitWannImBestand, int anzahl, String beschreibung,
			int unterGruppe, String nutzung, double stiftungwarentest, String allergene) {
		super(name, preis, seitWannImBestand, anzahl, beschreibung, unterGruppe);
=======
	public DrogerieArtikel(String name, double preis, LocalDate seitWannImBestand, String beschreibung,
			Untergruppen unterGruppe, Nutzung nutzung, double stiftungwarentest, Allergene allergene) {
		super(name, preis, seitWannImBestand, beschreibung, unterGruppe);
>>>>>>> 40745afacf3e9bc379fb866d41db92721022616b
		
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
		this.nutzung = nutzung;
		this.stiftungwarentest = stiftungwarentest;
		this.allergene = allergene;
	}

	
	/**
	 * Fuegt dem Array alleWaren ein neues DrogerieArikel-Objekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * DrogerieArikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das �bergebene Genre verwendet
	 * @author Sebastian Ohlendorf
	 * 
	 * @param drogerieArtikel das hinzuzufuegende eines neuen DrogerieArikel-Objektes
	 */
	public static void addDrogerieArtikel(DrogerieArtikel drogerieArtikel)  {
		
		ArrayList<Ware> neuerDrogeriArtikel = new ArrayList<Ware>();
		
		if(DrogerieArtikel_zaehler < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neuerDrogeriArtikel.add(drogerieArtikel);
					drogerieArtikel.seitWannImBestand = LocalDate.now();
					drogerieArtikel.setKennung(Kennungen.DROGERIEARTIKEL);
					drogerieArtikel.unterGruppe = Untergruppen.DROGERIEARTIKEL;
					
				}
		
				DrogerieArtikel_zaehler++;
				alleWaren.add(neuerDrogeriArtikel);
				
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
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								drogerieArtikel.name));
		}
	}

	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird f�r ein DrogerieArikel-Objekt eine Nachbestellung zu t�tigen.
	 * Ist die Maximale Lagermenge bereits gegeben wird dar�ber Informiert
	 * Ist die Bestellemenge plus die auf Lager liegende Menge gr��er als die Maximale Lagermenge, 
	 * wird nur die differenz zur Maximalen Lagermenge bestellt und der Anwender dar�ber Infomiert
	 * Wenn die Maximal Menge nicht �berschritten wird, dann wird die �bergebene Menge bestellt
	 * Bei den Aktualisierungen der Lagermenge wird auch das Bestandsdatum aktualisiert
	 * @author Sebastian Ohlendorf
	 * 
	 * @param menge Gibt die Anzahl der zu bestellenden Menge als Integer dar
	 * @return Gibt ein Boolean (True = es wurde bestellt, False = wurde nicht bestellt) zur�ck ob eine Bestellung get�tigt wurde 
	 */
	@Override
	public boolean nachbestellen(int menge) {
		
		//Methodenvariablen
		String name = this.name;
		double preis = this.preis;
		String beschreibung = this.beschreibung;
		Untergruppen untergruppe = this.unterGruppe;
		Nutzung nutzung = this.nutzung;
		double stiftungwarentest = this.stiftungwarentest;
		Allergene allergene = this.allergene;
		
<<<<<<< HEAD
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(String.format("Fuer das Drogerieartikel %s wurden %s Einheiten herausgegeben.", this.name, menge));
=======
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.DROGERIEARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
<<<<<<< HEAD
			System.out.println(
					String.format("Fuer die Drogerieartikel %s gibt es nur noch %s Einheiten auf Lager.", this.name, this.anzahl));
=======
				//Pr�fung ob Lagermene einer Ware gleich der Lagergroe�e ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Der Drogerieartikel %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Pr�fung b die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;

					DrogerieArtikel drogerieArtikel = new DrogerieArtikel(name, preis, LocalDate.now(), beschreibung, untergruppe, nutzung, stiftungwarentest, allergene);
							
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
						alleWaren.get(i).add(drogerieArtikel);
						drogerieArtikel.setKennung(Kennungen.DROGERIEARTIKEL);
								
					}
							
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazit�t (100) zu erreichen.", 
									diffMenge));
							
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					DrogerieArtikel drogerieArtikel = new DrogerieArtikel(name, preis, LocalDate.now(), beschreibung, untergruppe, nutzung, stiftungwarentest, allergene);
					
					for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
						
						alleWaren.get(i).add(drogerieArtikel);
						drogerieArtikel.setKennung(Kennungen.DROGERIEARTIKEL);
						
					}
					
					System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
					
					nachbestellung = true;
				}
			}
		}
		return nachbestellung;
	}



	/**
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Drogerieartikel verwendet wird.
	 * Ist die angegebene Menge zum herausgeben m�glich wird der Mengenbestand aktualisiert.
	 * Sind nicht mehr genug Einheiten auf Lager wird eine Meldung ausgegeben und die Methode nachbestellen aufgerufen.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param menge Gibt die Anzahl der zu herausgebende Menge als Integer an
	 * @return Gibt ein Boolean (True = es wurde herausgegeben, False = wurde nicht nicht herausgegeben) zur�ck ob eine Ausgabe get�tigt wurde 
	 * 
	 */
	@Override
	public boolean herausgeben(int menge) {
		
		//Methodenvariablen
		String name = this.name;
		boolean herausgeben = false;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.DROGERIEARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Pr�fung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
							
					System.out.println(
							String.format(
									"F�r den Drogerieartikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"F�r den Drogerieartikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
									+ "Daher wird eine Nachbestellung get�tigt.", 
									this.name,
									alleWaren.get(i).size(),
									menge));
					
					nachbestellen(MAXMENGE);
					
					herausgeben = false;
					
				}
			}
		}
	return herausgeben;
	}
<<<<<<< HEAD
	public static void gebeDrogerieArtikelAus() {
		
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == DROGERIEARTIKEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			
		}
		 
	}
=======
	
	/**
	 * toString Methode der Klasse Medien um eine Ausgabe
	 * zu dem Medien zu t�tigen
	 */
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
	@Override
	public String toString() {
		
		return"Neuer Kleidung Artikel [Name= "+ this.name + " Preis= "+ this.preis + " Seit wann im Bestand= " + this.seitWannImBestand +  
				" Beschreibung= " + this.beschreibung + " Nutzung = "+ this.nutzung + 
				" Stiftungwarentest= " + this.stiftungwarentest + " Allergene= " + this.allergene + "]";
			
	}
	

	/**
	 * Klassenmethode, welche alle Drogerie-Artikel ausgibt
	 */
	public static void gibDrogerieArtikelAus() {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.DROGERIEARTIKEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	/**
	 * Klassenmethode, welche alle Drogerie-Artikel aus sortiert nach Note
	 */
	public static void gibBestnoteAus() {

		for(int j = 0; j <= 600; j++) {
			
			for (int i = 0; i < alleWaren.size(); i++) {
				
				int noteWarentest = (int)(alleWaren.get(i).get(0).stiftungwarentest * 100.00);
								
				if(noteWarentest == j && alleWaren.get(i).get(0).getKennung() == Kennungen.DROGERIEARTIKEL) {
				
					System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Benotung Stiftungwarentest: " + alleWaren.get(i).get(0).stiftungwarentest);
				}
			}

		}
	}
	
	/**
	 * Klassenmethode, welche alle Drogerie-Artikel ausgibt die ein bestimmtes Allergen haben
	 */
	public static void gibAllergeneAus(Allergene allergen) {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.DROGERIEARTIKEL && alleWaren.get(i).get(0).allergene == allergen) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Allergen: " + alleWaren.get(i).get(0).allergene);
			}
		}
	}

	/**
	 * Klassenmethode um ein Bestimmtes Objekt zu erhalten
	 * @param objektId ID des Objektes aus dem Array alleWaren
	 * @return Gibt ein DrogerieArtikel-Objekt zur�ck
	 */
	public static DrogerieArtikel erhalteObjekt(int objektId) {
		
		return (DrogerieArtikel) alleWaren.get(objektId).get(0);
		
	}

}
