package waren;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Kinderklasse der Klasse Kleidung zum anlegen von Kleidung-Objekten
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 13.02.2021
 *
 */
public class Kleidung  extends NonFoodArtikel {
	
	protected String koerperteil;
	
	//Konstanten für die Jahreszeiten
	protected static final int WINTER = 1;
	protected static final int FRUEHLING = 2;
	protected static final int SOMMER = 3;
	protected static final int HERBST = 4;
	
	//Klassenvariablen zum zählen der Kleidungsartikel
	private static int zaehler_kleidung = 0;
	
	
	/**
	 * Konstruktor der Klasse Kleidung um ein neues Kleidung-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 14.02.2020
	 * 
	 * @param name
	 * @param preis
	 * @param seitWannImBestand
	 * @param anzahl
	 * @param beschreibung
	 * @param unterGruppe
	 * @param jahreszeit
	 * @param koerperteil
	 * @param stofftyp
	 */
	public Kleidung(String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			String beschreibung, int unterGruppe, int jahreszeit, String koerperteil, String stofftyp) {
		super(name, preis, seitWannImBestand, anzahl, beschreibung, unterGruppe);
		
		this.jahreszeit = jahreszeit;
		this.koerperteil = koerperteil;
		this.stofftyp = stofftyp;
	}
	
	/**
	 * Fuegt dem Array alleWaren eine neue Kleidung hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und die
	 * Kleidung (Name) nicht hinugefuegt werden konnte
	 * Es handelt sich hierbei um ein Kleidungsstück welches der Jahreszeit Winter zugeordnet ist
	 * @author Sebastian Ohlendorf
	 * 
	 * @param kleidung das hinzuzufuegende eines neuen Kleingund-Objektes
	 */
	public static void addKleidungWinter(Kleidung kleidung) {
		
		ArrayList<Ware> neueKleidung = new ArrayList<Ware>();
		
		if(zaehler_kleidung < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueKleidung.add(kleidung);
					kleidung.seitWannImBestand = LocalDate.now();
					kleidung.setKennung(KLEIDUNG);
					kleidung.unterGruppe = KLEIDUNG;
					kleidung.jahreszeit = WINTER;
					
				}
		
				zaehler_kleidung++;
				alleWaren.add(neueKleidung);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Kleidung-Artikelarten wurde überschritten! Der Kleidung-Artikel %s konnte nicht hinzugefügt werden", 
								kleidung.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren eine neue Kleidung hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und die
	 * Kleidung (Name) nicht hinugefuegt werden konnte.
	 * Es handelt sich hierbei um ein Kleidungsstück welches der Jahreszeit Frühling zugeordnet ist
	 * @author Sebastian Ohlendorf
	 * 
	 * @param kleidung das hinzuzufuegende eines neuen Kleingund-Objektes
	 */
	public static void addKleidungFruehling(Kleidung kleidung) {
		
		ArrayList<Ware> neueKleidung = new ArrayList<Ware>();
		
		if(zaehler_kleidung < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueKleidung.add(kleidung);
					kleidung.seitWannImBestand = LocalDate.now();
					kleidung.setKennung(KLEIDUNG);
					kleidung.unterGruppe = KLEIDUNG;
					kleidung.jahreszeit = FRUEHLING;
					
				}
		
				zaehler_kleidung++;
				alleWaren.add(neueKleidung);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Kleidung-Artikelarten wurde überschritten! Der Kleidung-Artikel %s konnte nicht hinzugefügt werden", 
								kleidung.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren eine neue Kleidung hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und die
	 * Kleidung (Name) nicht hinugefuegt werden konnte.
	 * Es handelt sich hierbei um ein Kleidungsstück welches der Jahreszeit Sommer zugeordnet ist
	 * @author Sebastian Ohlendorf
	 * 
	 * @param kleidung das hinzuzufuegende eines neuen Kleingund-Objektes
	 */
	public static void addKleidungSommer(Kleidung kleidung) {
		
		ArrayList<Ware> neueKleidung = new ArrayList<Ware>();
		
		if(zaehler_kleidung < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueKleidung.add(kleidung);
					kleidung.seitWannImBestand = LocalDate.now();
					kleidung.setKennung(KLEIDUNG);
					kleidung.unterGruppe = KLEIDUNG;
					kleidung.jahreszeit = SOMMER;
					
				}
		
				zaehler_kleidung++;
				alleWaren.add(neueKleidung);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Kleidung-Artikelarten wurde überschritten! Der Kleidung-Artikel %s konnte nicht hinzugefügt werden", 
								kleidung.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren eine neue Kleidung hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und die
	 * Kleidung (Name) nicht hinugefuegt werden konnte.
	 * Es handelt sich hierbei um ein Kleidungsstück welches der Jahreszeit Herbst zugeordnet ist
	 * @author Sebastian Ohlendorf
	 * 
	 * @param kleidung das hinzuzufuegende eines neuen Kleingund-Objektes
	 */
	public static void addKleidungHerbst(Kleidung kleidung) {
		
		ArrayList<Ware> neueKleidung = new ArrayList<Ware>();
		
		if(zaehler_kleidung < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueKleidung.add(kleidung);
					kleidung.seitWannImBestand = LocalDate.now();
					kleidung.setKennung(KLEIDUNG);
					kleidung.unterGruppe = KLEIDUNG;
					kleidung.jahreszeit = HERBST;
					
				}
		
				zaehler_kleidung++;
				alleWaren.add(neueKleidung);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Kleidung-Artikelarten wurde überschritten! Der Kleidung-Artikel %s konnte nicht hinzugefügt werden", 
								kleidung.name));
		}
	}
	
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein Kleidung-Objekt eine Nachbestellung zu tätigen.
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
		int untergruppe = this.unterGruppe;
		int jahreszeit = this.jahreszeit;
		String koerperteil = this.koerperteil;
		String stofftyp = this.stofftyp;
		
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == KLEIDUNG && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
				//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Der Kleidungsartikel %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;

					Kleidung kleidung = new Kleidung(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, jahreszeit, koerperteil, stofftyp);
							
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
						alleWaren.get(i).add(kleidung);
						kleidung.setKennung(KLEIDUNG);
								
					}
							
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
									diffMenge));
							
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					Kleidung kleidung = new Kleidung(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, jahreszeit, koerperteil, stofftyp);
					
					for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
						
						alleWaren.get(i).add(kleidung);
						kleidung.setKennung(KLEIDUNG);
						
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
			
			if(alleWaren.get(i).get(0).getKennung() == KLEIDUNG && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Prüfung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
							
					System.out.println(
							String.format(
									"Für den Kleidungs-Artikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"Für den Kleidungs-Artikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	 * toString Methode der Klasse Medien um eine Ausgabe
	 * zu dem Medien zu tätigen
	 */
	@Override
	public String toString() {
		
		return"neuer Kleidung Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
				" anzahl= " + anzahl +  " beschreibung= " + beschreibung + " unterGruppe = "+ unterGruppe + 
				" Jaherszeit= " + jahreszeit + " Körperteil= " + koerperteil + " Stofftyp= " + stofftyp + "]";
			
	}
	

	/**
	 * Klassenmethode zur Ermittlung der Kleidungsstücke welche zur übergebenen Jahreszeit passen und gibt diese auf der Konsole aus.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param jahreszeit übergebene Jahreszeit als Integer (Winter = 1, Frühling = 2, Sommer = 3 und Herbst = 4)
	 */
	public static void gibKleidungJahreszeitAus(int jahreszeit) {
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == KLEIDUNG && alleWaren.get(i).get(0).jahreszeit == jahreszeit) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size() + " für die Jahreszeit: " + alleWaren.get(i).get(0).jahreszeit);
			}
		}		
	}
	
	
	/**
	 * Klassenmethode zum ermitteln der Kleidungsstücke zu angegebenen Stofftyps und gibt diesen in der Konsole aus
	 * @author Sebastian Ohlendorf
	 * 
	 * @param stofftyp Übergabe des zu prüfenden Stofftyps der Kleidungsstücke als String
	 */
	public static void gibKleidungStofftypAus(String stofftyp) {
			
		String stofftypUebergabe = stofftyp.toLowerCase();
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == KLEIDUNG && alleWaren.get(i).get(0).stofftyp.toLowerCase() == stofftypUebergabe) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size() + " vom Stofftyp: " + alleWaren.get(i).get(0).stofftyp);
			}
		}	
	}
}
