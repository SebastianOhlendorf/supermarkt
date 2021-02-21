package waren;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Kinderklasse der Klasse Ware zum anlegen von NonFoodArtikel-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
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
	 * 
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * @param beschreibung Enth�lt zus�tzliche Informationen zum Artikel als String
	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel geh�rt bspw. Kleidung als Integer
	 * 
	 */
	public NonFoodArtikel(String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			 String beschreibung, int unterGruppe)  {
			super(name, preis, anzahl, seitWannImBestand);
			
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
					nonFoodArtikel.setKennung(NONFOODARTIKEL);
					
					switch(nonFoodArtikel.unterGruppe) {
					case 5: nonFoodArtikel.unterGruppe = KLEIDUNG;
							break;
					case 6: nonFoodArtikel.unterGruppe = MEDIEN;
							break;
					case 7: nonFoodArtikel.unterGruppe = DROGERIEARTIKEL;	
							break;
					default: System.out.println("Es wurde keine korrekte Untergruppe uebergeben");		
					}
				}
		
				nonFoodArtikel_zaehler++;
				alleWaren.add(neuerNonFoodArtikel);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser NonFood-Artikelarten wurde �berschritten! Der NonFood-Artikel %s konnte nicht hinzugef�gt werden", 
								nonFoodArtikel.name));
		}	
	}
	
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird f�r ein NonFoodArtikel-Objekt eine Nachbestellung zu t�tigen.
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
				int untergruppe = this.unterGruppe;
				
				boolean nachbestellung = false;
				
				for (int i = 0; i < alleWaren.size(); i++) {
					
					if(alleWaren.get(i).get(0).getKennung() == NONFOODARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
						
						int aktuellLagermenge = alleWaren.get(i).size();
						int neueLegermenge = aktuellLagermenge + menge;
						int diffMenge = 0;
					
						//Pr�fung ob Lagermene einer Ware gleich der Lagergroe�e ist
						if (alleWaren.get(i).size() == MAXMENGE) {
							
							System.out.println(
									String.format(
											"Der NonFood-Artikel %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
											this.name));
							
							nachbestellung = false;
							
						}
						//Pr�fung b die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
						else if(neueLegermenge > MAXMENGE) {
							
							diffMenge = MAXMENGE - aktuellLagermenge;
							
							NonFoodArtikel nonFoodArtikel = new NonFoodArtikel(name, preis, LocalDate.now(), 0, beschreibung, untergruppe);
							
							for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
								alleWaren.get(i).add(nonFoodArtikel);
								nonFoodArtikel.setKennung(NONFOODARTIKEL);
								
							}
							
							System.out.println(
									String.format(
											"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazit�t (100) zu erreichen.", 
											diffMenge));
							
							nachbestellung = true;	
						}
						//Nachbestellung der Ware
						else {
							
							NonFoodArtikel nonFoodArtikel = new NonFoodArtikel(name, preis, LocalDate.now(), 0, beschreibung, untergruppe);
							
							for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
								
								alleWaren.get(i).add(nonFoodArtikel);
								nonFoodArtikel.setKennung(NONFOODARTIKEL);
								
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
			
			if(alleWaren.get(i).get(0).getKennung() == NONFOODARTIKEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Pr�fung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
							
					System.out.println(
							String.format(
									"F�r den NonFood-Artikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"F�r den NonFood-Artikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	
	/**
	 * toString Methode der Klasse NonFooDArtikel um eine Ausgabe
	 * zu dem NonFooDArtikel zu t�tigen
	 */
	@Override
	public String toString() {
		
		return "neuer NonFood Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
				" anzahl= " + anzahl +  " beschreibung= " + beschreibung +
				" unterGruppe = "+ unterGruppe + "]";
			
	}
	
	/**
	 * Klassenmethode, welche alle NonFood-Artikel ausgibt
	 */
	public static void gebenNFArtikelAus() {
	
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == NONFOODARTIKEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
}

	