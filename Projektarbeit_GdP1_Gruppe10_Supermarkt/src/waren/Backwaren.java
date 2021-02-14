package waren;

import java.time.LocalDate;

/**
 * Kinderklasse der Klasse Lebensmittel zum anlegen von Backwaren-Objekten
 * @author SebastianOhlendorf
 *
 */
public class Backwaren extends Lebensmittel{	
	
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
	public Backwaren(String name, double preis, int anzahl, LocalDate seitWannImBestand, double gewicht, int haltbarkeit, boolean bedarfKuehlung) {
		super(name, preis, anzahl, seitWannImBestand, gewicht, haltbarkeit, bedarfKuehlung);
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
		
		int mengeLager = this.anzahl - menge;
		boolean herausgeben;
		
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(
					String.format(
							"Für das Lebensmittel %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} else {
			
			System.out.println(
					String.format(
							"Für das Lebensmittel %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			
			herausgeben = false;
			
		}
		
		return herausgeben;
	}
	
	/**
	 * toString Methode der Klasse Backwaren um eine Ausgabe
	 * zu der Backware und des Lagerbestand zu tätigen
	 */
	@Override
	public String toString() {
		
		String ausgabe =String.format(
							"Die Backware %s ist mit %s Einheiten aktuell auf Lager!", 
							this.name,
							this.anzahl);
		
		return	ausgabe; 
	}
	
	/**
	 * Methode zum aufbacken von Waren. 
	 * Handelt es sich um eine Backware wird diese aufgebacken und der Wert True zurückgegeben
	 * Handelt es ich um keine Backware wird der Wert False zurückgegeben 
	 * @return Bollean gibt True oder False zurück, wenn die Ware aufbackbar ist
	 */
	public boolean backeWare() {
		
		boolean backWare = false;
		
		for(int i = 0; i < alleWaren.size(); i++)
		{
		  if(alleWaren.get(i).getKennung() == BACKWAREN){
			    
			  	System.out.println("Waren wird aufgebacken!");
			  	
			  	backWare = true;
			  
			}else {
				
				System.out.println("Ist keine Backware!");
				
				backWare =  false;
			}

		}
		return backWare;

	}
	
	
	/**
	 * Methode welche alle Backwaren ausgibt welche sich im Lager befinden.
	 */
	public static void gebeBackwareAus() {
		
		for(int i = 0; i < alleWaren.size(); i++){
			
			if(alleWaren.get(i).getKennung() == BACKWAREN){
			  System.out.println("(" + i + ") " + alleWaren.get(i));
			}

		}
		
	}
	
	
}
