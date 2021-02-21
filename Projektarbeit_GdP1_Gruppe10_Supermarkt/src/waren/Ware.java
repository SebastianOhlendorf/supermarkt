package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Jahreszeit;
import enums.Kennungen;

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
	protected int haltbarkeit;
	private boolean aufgebacken;
	protected double alcProzente;
	private Kennungen kennung;
	protected String stofftyp;
	protected Jahreszeit jahreszeit;
	
	//Konstante füe Maximale Lagermenge, der Maximalen Warentypen und der jeweiligen Warentypkennungen
	protected static final int MAXMENGE = 100;
	protected static final int MAXANZAHLWAREN = 30;
	
	//ArrayList für alle Warentypen
	protected static ArrayList<ArrayList<Ware>> alleWaren = new ArrayList<ArrayList<Ware>>();
	
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

	
	//--------------- GETTER und SETTER -------------------------

	public Kennungen getKennung() {
		return kennung;
	}

	public void setKennung(Kennungen kleidung2) {
		this.kennung = kleidung2;
	}

	public String getStofftyp() {
		return stofftyp;
	}

	public Jahreszeit getJahreszeit() {
		return jahreszeit;
	}

	public void setJahreszeit(Jahreszeit jahreszeit) {
		this.jahreszeit = jahreszeit;
	}

	public boolean isAufgebacken() {
		return aufgebacken;
	}

	public void setAufgebacken(boolean aufgebacken) {
		this.aufgebacken = aufgebacken;
	}

	

	
}
