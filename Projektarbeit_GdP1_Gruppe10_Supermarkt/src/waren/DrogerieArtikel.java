package waren;

import java.time.LocalDate;
import java.util.ArrayList;

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
	
	//Klassenvariable zum Zählen der Drogerieartikeltypen
	private static int DrogerieArtikel_zaehler = 0;
	
	/**
	 * Konstruktor der Klasse DrogerieArtikel um ein neues Drogerieartikel als Objekt zu erzeugen.
	 * 
	 * @param name Name des Drogerieartikels als String
	 * @param preis	Preis des Drogerieartikels als Double	
	 * @param seitWannImBestand Zeitstempel von wann das Drogerieartikel hinzugefügt wurde.
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param beschreibung Beschreibung vom Drogerieartikel
	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel gehört bspw. Kleidung als Integer
	 * @param nutzung Gibt den Nutzen des Artikels als String an
	 * @param stiftungwarentest Gibt die Bewertung des Stiftungwarentestes als Double an
	 * @param allergene Gibt an ob bei dem Artikel Allergene enthalten sind als String
	 */
<<<<<<< HEAD
	public DrogerieArtikel(String name, double preis, int anzahl, LocalDate seitWannImBestand, String beschreibung, String nutzung, double stiftungwarentest, String allergene) {
		super(name, preis, anzahl, seitWannImBestand, beschreibung);
							
=======
	public DrogerieArtikel(String name, double preis, LocalDate seitWannImBestand, int anzahl, String beschreibung,
			int unterGruppe, String nutzung, double stiftungwarentest, String allergene) {
		super(name, preis, seitWannImBestand, anzahl, beschreibung, unterGruppe);
		
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
		this.nutzung = nutzung;
		this.stiftungwarentest = stiftungwarentest;
		this. allergene = allergene;
	}

	
	/**
	 * Fuegt dem Array alleWaren ein neues DrogerieArikel-Objekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * DrogerieArikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das übergebene Genre verwendet
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
					drogerieArtikel.setKennung(DROGERIEARTIKEL);
					drogerieArtikel.unterGruppe = DROGERIEARTIKEL;
					
				}
		
				DrogerieArtikel_zaehler++;
				alleWaren.add(neuerDrogeriArtikel);
				
		}else {
<<<<<<< HEAD
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
		
			System.out.println(String.format("Der NonFoodArtikel hat bereits die maximale Lagerkapazitï¿½t, daher wird keine Nachbestellung durchgefuehrt!", this.name));
		
			nachbestellung = false;	
		}
		//Prï¿½fung ob die zu bestellende Megen mit der Lagermenge gï¿½ï¿½er ist als die Lagerroeï¿½e
		else if(mengeLager > MAXMENGE) {
			diffMenge = MAXMENGE - this.anzahl;
			this.anzahl = this.anzahl + diffMenge;
		
			System.out.println(String.format("Die Maximale Lagermenge (100) wurde ï¿½berschritten! Es wurden daher %s Einheiten nachbestellt", diffMenge));
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
=======
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde überschritten! Der Medien-Artikel %s konnte nicht hinzugefügt werden", 
								drogerieArtikel.name));
		}
	}

	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein DrogerieArikel-Objekt eine Nachbestellung zu tätigen.
	 * Ist die Maximale Lagermenge bereits gegeben wird darüber Informiert
	 * Ist die Bestellemenge plus die auf Lager liegende Menge größer als die Maximale Lagermenge, 
	 * wird nur die differenz zur Maximalen Lagermenge bestellt und der Anwender darüber Infomiert
	 * Wenn die Maximal Menge nicht überschritten wird, dann wird die übergebene Menge bestellt
	 * Bei den Aktualisierungen der Lagermenge wird auch das Bestandsdatum aktualisiert
	 * @author Sebastian Ohlendorf
	 * 
	 * @param menge Gibt die Anzahl der zu bestellenden Menge als Integer dar
	 * @return Gibt ein Boolean (True = es wurde bestellt, False = wurde nicht bestellt) zurück ob eine Bestellung getätigt wurde 
	 */
	@Override
	public boolean nachbestellen(int menge) {
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
		
		//Methodenvariablen
		String name = this.name;
		double preis = this.preis;
		String beschreibung = this.beschreibung;
		int untergruppe = this.unterGruppe;
		String nutzung = this.nutzung;
		double stiftungwarentest = this.stiftungwarentest;
		String allergene = this.allergene;
		
<<<<<<< HEAD
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(String.format("Fuer das Drogerieartikel %s wurden %s Einheiten herausgegeben.", this.name, menge));
=======
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
			
			if(alleWaren.get(i).get(0).getKennung() == DROGERIEARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
<<<<<<< HEAD
			System.out.println(
					String.format("Fuer die Drogerieartikel %s gibt es nur noch %s Einheiten auf Lager.", this.name, this.anzahl));
=======
				//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Der Drogerieartikel %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;

					DrogerieArtikel drogerieArtikel = new DrogerieArtikel(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, nutzung, stiftungwarentest, allergene);
							
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
						alleWaren.get(i).add(drogerieArtikel);
						drogerieArtikel.setKennung(DROGERIEARTIKEL);
								
					}
							
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
									diffMenge));
							
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					DrogerieArtikel drogerieArtikel = new DrogerieArtikel(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, nutzung, stiftungwarentest, allergene);
					
					for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
						
						alleWaren.get(i).add(drogerieArtikel);
						drogerieArtikel.setKennung(DROGERIEARTIKEL);
						
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
	 * Ist die angegebene Menge zum herausgeben möglich wird der Mengenbestand aktualisiert.
	 * Sind nicht mehr genug Einheiten auf Lager wird eine Meldung ausgegeben und die Methode nachbestellen aufgerufen.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param menge Gibt die Anzahl der zu herausgebende Menge als Integer an
	 * @return Gibt ein Boolean (True = es wurde herausgegeben, False = wurde nicht nicht herausgegeben) zurück ob eine Ausgabe getätigt wurde 
	 * 
	 */
	@Override
	public boolean herausgeben(int menge) {
		
		//Methodenvariablen
		String name = this.name;
		boolean herausgeben = false;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
			
			if(alleWaren.get(i).get(0).getKennung() == DROGERIEARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Prüfung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
							
					System.out.println(
							String.format(
									"Für den Drogerieartikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"Für den Drogerieartikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
									+ "Daher wird eine Nachbestellung getätigt.", 
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
	 * zu dem Medien zu tätigen
	 */
>>>>>>> 4efd2070ba7e4f3f2ba861c093ba613a3e31a6ae
	@Override
	public String toString() {
		
		return"Neuer Kleidung Artikel [Name= "+ name + " Preis= "+ preis + " Seit wann im Bestand= " + seitWannImBestand +  
				" Beschreibung= " + beschreibung + " Nutzung = "+ nutzung + 
				" Stiftungwarentest= " + stiftungwarentest + " Allergene= " + allergene + "]";
			
	}
	

	/**
	 * Klassenmethode, welche alle Filme-Artikel ausgibt
	 */
	public static void gibDrogerieArtikelAus() {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == DROGERIEARTIKEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}


}
