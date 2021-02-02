package waren;

import java.time.LocalDate;

/**
 * Eine Abstrakte Klasse mit der neue Warenobjekte angelegt, Waren nachbestellt oder herausgegeben werden können.
 * @author 
 * @version
 * @date
 *
 */
public abstract class Ware {
	
	//Variablen anlegen
	protected String name;
	protected double preis;
	protected int anzahl;
	protected LocalDate seitWannImBestand;
	
	/**
	 * Konstruktor der Klasse Ware um ein neues Warenobjekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 01.02.2020
	 * @param name Die Bezeichnung der Ware oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 */
	public Ware(String name, double preis, int anzahl, LocalDate seitWannImBestand) {
		
		this.name = name;
		this.preis = preis;
		this.anzahl = anzahl;
		this.seitWannImBestand = seitWannImBestand;
	}
	
	/**
	 * Abstakte Methode zum nachbestellen von Waren.
	 * Die Methode wird durch die Subklassen instanziert.
	 * @param menge Gibt die Menge an, welche bestellt werden soll als Integer
	 * @return Gibt ein True oder False zurück ob waren bestellt werden können
	 */
	public abstract boolean nachbestellen(int menge);
	
	/**
	 * Abstakte Methode zum nachbestellen von Waren.
	 * Die Methode wird durch die Subklassen instanziert.
	 * @param menge Gibt die Menge an, welche herausgegeben werden kann als Integer
	 * @return Gibt ein True oder False zurück ob Waren herausgegeben werden können
	 */
	public abstract boolean herausgeben(int menge);
}
