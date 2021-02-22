package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Kennungen;

/**
 * Kinderklasse der Klasse Lebensmittel zum anlegen von Backwaren-Objekten
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 12.02.2021
 *
 */
public class Backwaren extends Lebensmittel{	
	
	private static int zaehler_backwaren = 0;
	
	/**
	 * Konstruktor der Klasse Backwaren um ein Backwaren-Objekt zu erzeugen
	 * @author Sebastian Ohlendorf / 01.02.2020
	 * 
	 * @param name Die Bezeichnung des Lebensmitels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Die Anzahl der Waren (Lagermenge) als Integer
	 * @param seitWannImBestand Datum seit wann die Ware im Bestand ist als LocalDate
	 * @param gewicht Gewicht der Ware als Double
	 * @param haltbarkeit Die Haltbarkeit in Tagen gemessen als Integer
	 * @param bedarfKuehlung Legt mit einem True oder False fest ob eine Ware gekühlt werden muss
	 */
	public Backwaren(String name, double preis, LocalDate seitWannImBestand, double gewicht, int haltbarkeit, boolean bedarfKuehlung) {
		super(name, preis, seitWannImBestand, gewicht, haltbarkeit, bedarfKuehlung);
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neue Backware hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und das
	 * Backware (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param backware das hinzuzufuegende eines neuen Backwaren-Objektes
	 */
	public static void addBackwaren(Backwaren backwaren){
			
		ArrayList<Ware> neueBackwaren = new ArrayList<Ware>();
		
		if(zaehler_backwaren < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueBackwaren.add(backwaren);
					backwaren.seitWannImBestand = LocalDate.now();
					backwaren.setAufgebacken(false);
					backwaren.setKennung(Kennungen.BACKWAREN);
				}
		
				zaehler_backwaren++;
				alleWaren.add(neueBackwaren);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Backwarenarten wurde überschritten! Das Lebensmittel %s konnte nicht hinzugefügt werden", 
								backwaren.name));
		}
	}
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein Lebensmittel-Objekt eine Nachbestellung zu tätigen.
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
		double gewicht = this.gewicht;
		int haltbarkeit = this.haltbarkeit;
		boolean bedarfKuehlung = this.bedarfKuehlung;
		
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.BACKWAREN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
				//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Die Backware %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;
					
					Backwaren backware = new Backwaren(name, preis, LocalDate.now(), gewicht, haltbarkeit, bedarfKuehlung);
					
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
						
						alleWaren.get(i).add(backware);
						backware.setKennung(Kennungen.BACKWAREN);
						
					}
					
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
									diffMenge));
					
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					Backwaren backware = new Backwaren(name, preis, LocalDate.now(), gewicht, haltbarkeit, bedarfKuehlung);
					
					for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
						
						alleWaren.get(i).add(backware);
						backware.setKennung(Kennungen.BACKWAREN);
						
					}
					
					System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
					
					nachbestellung = true;
				}
			}
		}
		return nachbestellung;
	}
	
	
	/**
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Lebensmitteln verwendet wird.
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
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.BACKWAREN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Prüfung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
					
					System.out.println(
							String.format(
									"Für das Lebensmittel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"Für das Lebensmittel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	 * toString Methode der Klasse Backwaren um eine Ausgabe
	 * zu der Backware und des Lagerbestand zu tätigen
	 */
	@Override
	public String toString() {
		return "Neuer Lebensmittel Artikel [ Name: "+ this.name + " Preis: "+ this.preis + " Seit wann im Bestand: " + this.seitWannImBestand + " Gewicht: " + this.gewicht +
				" Haltbarkeit in Tagen: "+ this.haltbarkeit + " Benötigt Kühlung: "+ this.bedarfKuehlung +"]";
	} 
	
	/**
	 * Methode zum aufbacken von Waren. 
	 * Handelt es sich um eine Backware wird diese aufgebacken und der Wert True zurückgegeben
	 * Handelt es ich um keine Backware wird der Wert False zurückgegeben 
	 * @return Bollean gibt True oder False zurück, wenn die Ware aufbackbar ist
	 */
	public boolean backeWare() {
		
		//Methodenvariable ob eine Ware aufebacken werden muss
		boolean backWare = false;
		String name = this.name;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.BACKWAREN && alleWaren.get(i).get(0).name.equals(name)) {
					
				if(alleWaren.get(i).get(0).isAufgebacken() == false) {
						
					System.out.println(
							String.format("Die Backware %s wurde aufgebacken.",
									alleWaren.get(i).get(0).name));
					
					alleWaren.get(i).get(0).setAufgebacken(true);
					
					//"Waren wird aufgebacken!"
				  	backWare = true;
				}else {
					
					System.out.println(
							String.format("Die Backware %s wurde bereits aufgebacken.",
									alleWaren.get(i).get(0).name));
					//Ware wird nicht aufgebacken
					backWare =  false;
				}	
			}
		}
	return backWare;
	}
	
	
	/**
	 * Methode welche alle Backwaren ausgibt welche sich im Lager befinden.
	 */
	public static void gebeBackwareAus() {
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.BACKWAREN) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	/**
	 * Klassenmethode um ein Bestimmtes Objekt zu erhalten
	 * @param objektId ID des Objektes aus dem Array alleWaren
	 * @return Gibt ein Backwarenobjekt zurück
	 */
	public static Backwaren erhalteObjekt(int objektId) {
		
		return (Backwaren) alleWaren.get(objektId).get(0);
		
	}
}
