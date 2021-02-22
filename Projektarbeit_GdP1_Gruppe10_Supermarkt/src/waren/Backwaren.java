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
	 * @param bedarfKuehlung Legt mit einem True oder False fest ob eine Ware gek�hlt werden muss
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
								"Die Anzahl (30) verschiedeneser Backwarenarten wurde �berschritten! Das Lebensmittel %s konnte nicht hinzugef�gt werden", 
								backwaren.name));
		}
	}
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird f�r ein Lebensmittel-Objekt eine Nachbestellung zu t�tigen.
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
		double gewicht = this.gewicht;
		int haltbarkeit = this.haltbarkeit;
		boolean bedarfKuehlung = this.bedarfKuehlung;
		
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.BACKWAREN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
				//Pr�fung ob Lagermene einer Ware gleich der Lagergroe�e ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Die Backware %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Pr�fung b die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;
					
					Backwaren backware = new Backwaren(name, preis, LocalDate.now(), gewicht, haltbarkeit, bedarfKuehlung);
					
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
						
						alleWaren.get(i).add(backware);
						backware.setKennung(Kennungen.BACKWAREN);
						
					}
					
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazit�t (100) zu erreichen.", 
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
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.BACKWAREN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Pr�fung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
					
					System.out.println(
							String.format(
									"F�r das Lebensmittel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"F�r das Lebensmittel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	 * toString Methode der Klasse Backwaren um eine Ausgabe
	 * zu der Backware und des Lagerbestand zu t�tigen
	 */
	@Override
	public String toString() {
		return "Neuer Lebensmittel Artikel [ Name: "+ this.name + " Preis: "+ this.preis + " Seit wann im Bestand: " + this.seitWannImBestand + " Gewicht: " + this.gewicht +
				" Haltbarkeit in Tagen: "+ this.haltbarkeit + " Ben�tigt K�hlung: "+ this.bedarfKuehlung +"]";
	} 
	
	/**
	 * Methode zum aufbacken von Waren. 
	 * Handelt es sich um eine Backware wird diese aufgebacken und der Wert True zur�ckgegeben
	 * Handelt es ich um keine Backware wird der Wert False zur�ckgegeben 
	 * @return Bollean gibt True oder False zur�ck, wenn die Ware aufbackbar ist
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
	 * @return Gibt ein Backwarenobjekt zur�ck
	 */
	public static Backwaren erhalteObjekt(int objektId) {
		
		return (Backwaren) alleWaren.get(objektId).get(0);
		
	}
}
