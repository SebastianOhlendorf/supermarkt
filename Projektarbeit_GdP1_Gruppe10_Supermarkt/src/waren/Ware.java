package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Allergene;
import enums.Filmgenre;
import enums.Jahreszeit;
import enums.Kennungen;
import enums.Nutzung;
import enums.Stofftypen;

/**
 * Eine Abstrakte Klasse mit der neue Warenobjekte angelegt, Waren nachbestellt oder herausgegeben werden k�nnen.
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
	protected Stofftypen stofftyp;
	protected Jahreszeit jahreszeit;
	protected boolean isDigital;
	protected Filmgenre genre;
	protected int erscheinungsjahr;
	protected Nutzung nutzung;
	protected double stiftungwarentest;
	protected Allergene allergene;
	
	//Konstante f�e Maximale Lagermenge, der Maximalen Warentypen und der jeweiligen Warentypkennungen
	protected static final int MAXMENGE = 100;
	protected static final int MAXANZAHLWAREN = 30;
	
	//ArrayList f�r alle Warentypen
	protected static ArrayList<ArrayList<Ware>> alleWaren = new ArrayList<ArrayList<Ware>>();
	
	/**
	 * Konstruktor der Klasse Ware um ein neues Warenobjekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 01.02.2020
	 * @param name Die Bezeichnung der Ware oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 */
	public Ware(String name, double preis,LocalDate seitWannImBestand) {
		
		this.name = name;
		this.preis = preis;
		this.seitWannImBestand = seitWannImBestand;
	}
	
	/**
	 * Abstakte Methode zum nachbestellen von Waren.
	 * Die Methode wird durch die Subklassen instanziert.
	 * @param menge Gibt die Menge an, welche bestellt werden soll als Integer
	 * @return Gibt ein True oder False zur�ck ob waren bestellt werden k�nnen
	 */
	public abstract boolean nachbestellen(int menge);
	
	/**
	 * Abstakte Methode zum nachbestellen von Waren.
	 * Die Methode wird durch die Subklassen instanziert.
	 * @param menge Gibt die Menge an, welche herausgegeben werden kann als Integer
	 * @return Gibt ein True oder False zur�ck ob Waren herausgegeben werden k�nnen
	 */
	public abstract boolean herausgeben(int menge);

	
	//--------------- GETTER und SETTER -------------------------

	public Kennungen getKennung() {
		return kennung;
	}

	public void setKennung(Kennungen kleidung) {
		this.kennung = kleidung;
	}

	public Stofftypen getStofftyp() {
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
