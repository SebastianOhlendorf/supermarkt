package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Jahreszeit;
import enums.Kennungen;
import enums.Koerperteile;
import enums.Stofftypen;
import enums.Untergruppen;

/**
 * Kinderklasse der Klasse Kleidung zum anlegen von Kleidung-Objekten
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 13.02.2021
 *
 */
public class Kleidung  extends NonFoodArtikel {
	
	protected Koerperteile koerperteil;
	
	//Klassenvariablen zum z�hlen der Kleidungsartikel
	private static int zaehler_kleidung = 0;
	
	
	/**
	 * Konstruktor der Klasse Kleidung um ein neues Kleidung-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 14.02.2020
	 * 
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * @param beschreibung Enth�lt zus�tzliche Informationen zum Artikel als String
	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel geh�rt bspw. Kleidung als Enum
	 * @param jahreszeit gibt die Jahreszeit an zu welcher der Artikel geh�rt als Enum
	 * @param koerperteil gibt den K�rperteil an ao der Artikel getragern werden kann als Enum
	 * @param stofftyp gibt den Stofftyp des Kleidungst�cks an als Enum
	 */
	public Kleidung(String name, double preis, LocalDate seitWannImBestand, 
			String beschreibung, Untergruppen unterGruppe, Jahreszeit jahreszeit, Koerperteile koerperteil, Stofftypen stofftyp) {
		super(name, preis, seitWannImBestand, beschreibung, unterGruppe);
		
		this.jahreszeit = jahreszeit;
		this.koerperteil = koerperteil;
		this.stofftyp = stofftyp;
	}
	
	/**
	 * Fuegt dem Array alleWaren eine neue Kleidung hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und die
	 * Kleidung (Name) nicht hinugefuegt werden konnte
	 * Es handelt sich hierbei um ein Kleidungsst�ck welches der Jahreszeit Winter zugeordnet ist
	 * @author Sebastian Ohlendorf
	 * 
	 * @param kleidung das hinzuzufuegende eines neuen Kleingund-Objektes
	 */
	public static void addKleidung(Kleidung kleidung) {
		
		ArrayList<Ware> neueKleidung = new ArrayList<Ware>();
		
		if(zaehler_kleidung < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueKleidung.add(kleidung);
					kleidung.seitWannImBestand = LocalDate.now();
					kleidung.setKennung(Kennungen.KLEIDUNG);
					kleidung.unterGruppe = Untergruppen.KLEIDUNG;
					
				}
		
				zaehler_kleidung++;
				alleWaren.add(neueKleidung);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Kleidung-Artikelarten wurde �berschritten! Der Kleidung-Artikel %s konnte nicht hinzugef�gt werden", 
								kleidung.name));
		}
	}
		
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird f�r ein Kleidung-Objekt eine Nachbestellung zu t�tigen.
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
		Jahreszeit jahreszeit = this.jahreszeit;
		Koerperteile koerperteil = this.koerperteil;
		Stofftypen stofftyp = this.stofftyp;
		
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.KLEIDUNG && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
				//Pr�fung ob Lagermene einer Ware gleich der Lagergroe�e ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Der Kleidungsartikel %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Pr�fung b die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;

					Kleidung kleidung = new Kleidung(name, preis, LocalDate.now(), beschreibung, untergruppe, jahreszeit, koerperteil, stofftyp);
							
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
						alleWaren.get(i).add(kleidung);
						kleidung.setKennung(Kennungen.KLEIDUNG);
								
					}
							
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazit�t (100) zu erreichen.", 
									diffMenge));
							
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					Kleidung kleidung = new Kleidung(name, preis, LocalDate.now(), beschreibung, untergruppe, jahreszeit, koerperteil, stofftyp);
					
					for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
						
						alleWaren.get(i).add(kleidung);
						kleidung.setKennung(Kennungen.KLEIDUNG);
						
					}
					
					System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
					
					nachbestellung = true;
				}
			}
		}
		return nachbestellung;
	}



	/**
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Kleidung-Artikel verwendet wird.
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
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.KLEIDUNG && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Pr�fung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
							
					System.out.println(
							String.format(
									"F�r den Kleidungs-Artikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"F�r den Kleidungs-Artikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	 * toString Methode der Klasse Medien um eine Ausgabe
	 * zu dem Medien zu t�tigen
	 */
	@Override
	public String toString() {
		
		return"neuer Kleidung Artikel [ name= "+ this.name + " preis= "+ this.preis + " seitWannImBestand= " + this.seitWannImBestand +  
				" anzahl= " + this.anzahl +  " beschreibung= " + this.beschreibung + " unterGruppe = "+ this.unterGruppe + 
				" Jaherszeit= " + this.jahreszeit + " K�rperteil= " + this.koerperteil + " Stofftyp= " + this.stofftyp + "]";
			
	}
	

	/**
	 * Klassenmethode zur Ermittlung der Kleidungsst�cke welche zur �bergebenen Jahreszeit passen und gibt diese auf der Konsole aus.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param jahreszeit �bergebene Jahreszeit als Integer (Winter = 1, Fr�hling = 2, Sommer = 3 und Herbst = 4)
	 */
	public static void gibKleidungJahreszeitAus(Jahreszeit jahreszeit) {
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.KLEIDUNG && alleWaren.get(i).get(0).jahreszeit == jahreszeit) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size() + " f�r die Jahreszeit: " + alleWaren.get(i).get(0).jahreszeit);
			}
		}		
	}
	
	
	/**
	 * Klassenmethode zum ermitteln der Kleidungsst�cke zu angegebenen Stofftyps und gibt diesen in der Konsole aus
	 * @author Sebastian Ohlendorf
	 * 
	 * @param stofftyp �bergabe des zu pr�fenden Stofftyps der Kleidungsst�cke als String
	 */
	public static void gibKleidungStofftypAus(Stofftypen stofftyp) {
			
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.KLEIDUNG && alleWaren.get(i).get(0).stofftyp == stofftyp) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size() + " vom Stofftyp: " + alleWaren.get(i).get(0).stofftyp);
			}
		}	
	}
}
