package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Kennungen;
import enums.Untergruppen;

/**
 * Kinderklasse der Klasse Ware zum anlegen von NonFoodArtikel-Objekten und weiterer Methodenaufrufe
 * rund um NonFoodArtikel
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class NonFoodArtikel extends Ware {
	
	//Klassenattribut. Zählt die NonFood Artikel
	private static int nonFoodArtikel_zaehler = 0;
	

	/**
	 * Konstruktor der Klasse NonFoodArtikel um ein neues NonFoodArtikel-Objekt zu erzeugen.
	 * @author Lennart Sparbier / 16.02.2021
	 * 
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * @param beschreibung Enthält zusätzliche Informationen zum Artikel als String
	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel gehört bspw. Kleidung als Integer
	 * 
	 */
	public NonFoodArtikel(String name, double preis, LocalDate seitWannImBestand, 
			 String beschreibung, Untergruppen unterGruppe)  {
			super(name, preis, seitWannImBestand);
			
			this.beschreibung = beschreibung;
			this.unterGruppe = unterGruppe;
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neuen NonFoodArtikel hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * NonFoodArtikel (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param nonFoodArtikel das hinzuzufuegende eines neuen NonFoodArtikel-Objektes
	 */
	public static void addNonFoodArtikel(NonFoodArtikel nonFoodArtikel )  {
		
		ArrayList<Ware> neuerNonFoodArtikel = new ArrayList<Ware>();
		
		if(nonFoodArtikel_zaehler < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neuerNonFoodArtikel.add(nonFoodArtikel);
					nonFoodArtikel.seitWannImBestand = LocalDate.now();
					nonFoodArtikel.setKennung(Kennungen.NONFOODARTIKEL);
				}
		
				nonFoodArtikel_zaehler++;
				alleWaren.add(neuerNonFoodArtikel);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser NonFood-Artikelarten wurde überschritten! Der NonFood-Artikel %s konnte nicht hinzugefügt werden", 
								nonFoodArtikel.name));
		}	
	}
	
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein NonFoodArtikel-Objekt eine Nachbestellung zu tätigen.
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
		
		//Methodenvariablen
				String name = this.name;
				double preis = this.preis;
				String beschreibung = this.beschreibung;
				Untergruppen untergruppe = this.unterGruppe;
				
				boolean nachbestellung = false;
				
				for (int i = 0; i < alleWaren.size(); i++) {
					
					if(alleWaren.get(i).get(0).getKennung() == Kennungen.NONFOODARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
						
						int aktuellLagermenge = alleWaren.get(i).size();
						int neueLegermenge = aktuellLagermenge + menge;
						int diffMenge = 0;
					
						//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
						if (alleWaren.get(i).size() == MAXMENGE) {
							
							System.out.println(
									String.format(
											"Der NonFood-Artikel %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
											this.name));
							
							nachbestellung = false;
							
						}
						//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
						else if(neueLegermenge > MAXMENGE) {
							
							diffMenge = MAXMENGE - aktuellLagermenge;
							
							NonFoodArtikel nonFoodArtikel = new NonFoodArtikel(name, preis, LocalDate.now(), beschreibung, untergruppe);
							
							for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
								alleWaren.get(i).add(nonFoodArtikel);
								nonFoodArtikel.setKennung(Kennungen.NONFOODARTIKEL);
								
							}
							
							System.out.println(
									String.format(
											"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
											diffMenge));
							
							nachbestellung = true;	
						}
						//Nachbestellung der Ware
						else {
							
							NonFoodArtikel nonFoodArtikel = new NonFoodArtikel(name, preis, LocalDate.now(), beschreibung, untergruppe);
							
							for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
								
								alleWaren.get(i).add(nonFoodArtikel);
								nonFoodArtikel.setKennung(Kennungen.NONFOODARTIKEL);
								
							}
							
							System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
							
							nachbestellung = true;
						}
					}
				}
				return nachbestellung;
	}



	/**
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von NonFood-Artikel verwendet wird.
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
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.NONFOODARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Prüfung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(0);
					}
							
					System.out.println(
							String.format(
									"Für den NonFood-Artikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"Für den NonFood-Artikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	
	/**
	 * toString Methode der Klasse NonFooDArtikel um eine Ausgabe
	 * zu dem NonFooDArtikel zu tätigen
	 * 
	 * @return Rückgabe des Objektes und seiner Attribute als String
	 */
	@Override
	public String toString() {
		
		return "Neuer NonFood Artikel [ Name: "+ this.name + ", Preis: "+ this.preis + ", seit wann im Bestand: " + this.seitWannImBestand +  
				", Anzahl: " + this.anzahl +  ", Beschreibung: " + this.beschreibung +
				", Untergruppe: "+ this.unterGruppe + "]";
			
	}
	
	/**
	 * Klassenmethode, welche alle NonFood-Artikel ausgibt
	 */
	public static void gebenNFArtikelAus() {
	
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.NONFOODARTIKEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	/**
	 * Klassenmethode um ein Bestimmtes Objekt zu erhalten
	 * 
	 * @param objektId ID des Objektes aus dem Array alleWaren
	 * @return Gibt ein NonFoodArtikel-Objekt zurück
	 */
	public static NonFoodArtikel erhalteObjekt(int objektId) {
		
		return (NonFoodArtikel) alleWaren.get(objektId).get(0);
		
	}
	
	/**
	 * Klassenmethode um die Maximale ID zu erhalten für den Bereich NonFoodArtikel im Array alleWaren
	 * 
	 * @return Gibt die höchste ID des Arrays für NonFoodArtikel aus Integer aus
	 */
	public static int erhalteObjektMaxID() {
		
		int maxID = 0;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.NONFOODARTIKEL) {
				maxID = i;
			}
		}
		return maxID;
	}
	
	/**
	 * Klassenmethode um die Minimale ID zu erhalten für den Bereich NonFoodArtikel im Array alleWaren
	 * 
	 * @return Gibt die niedrigste ID des Arrays für NonFoodArtikel aus Integer aus
	 */
	public static int erhalteObjektMinID() {
		
		int minID = 600000;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.NONFOODARTIKEL) {
				
				if(minID > i) {
					
					minID = i;
				}
			}
		}
		return minID;
	}
}

	