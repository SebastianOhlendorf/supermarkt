package waren;

import java.time.LocalDate;
import java.util.ArrayList;

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
	private int kennung;
	protected String stofftyp;
	protected int jahreszeit;
	
	//Konstante füe Maximale Lagermenge, der Maximalen Warentypen und der jeweiligen Warentypkennungen
	protected static final int MAXMENGE = 100;
	protected static final int MAXANZAHLWAREN = 30;
	protected static final int LEBENSMITTEL = 1;
	protected static final int GETRAENKE = 2;
	protected static final int NONFOODARTIKEL = 3;
	protected static final int BACKWAREN = 4;
	protected static final int KLEIDUNG = 5;
	protected static final int MEDIEN = 6; 
	protected static final int DROGERIEARTIKEL = 7;
	protected static final int FILME = 8;
	
	//ArrayList für alle Warentypen
	protected static ArrayList<Ware> alleWaren = new ArrayList<Ware>();
	
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
	
	/**
	 * Abstrakte Methode zum feststellen der Haltbarkeit einer Ware
	 * @return Gibt die Dauer der Haltbarkeit als Integer zurück
	 */
	protected abstract int istHaltbar();
	
	/**
	 * Abstrakte Methode zum feststellen ob ein Getränk alokolhaltig ist
	 * @return Gibt ein True zurück wenn das Getränk akloholhaltig ist, andernfalls False
	 */
	protected abstract boolean istAlkoholhaltig();

	
	//--------------- GETTER und SETTER -------------------------

	public int getKennung() {
		return kennung;
	}

	public void setKennung(int kennung) {
		this.kennung = kennung;
	}

	public String getStofftyp() {
		return stofftyp;
	}

	public int getJahreszeit() {
		return jahreszeit;
	}

	public void setJahreszeit(int jahreszeit) {
		this.jahreszeit = jahreszeit;
	}

	

	
}
