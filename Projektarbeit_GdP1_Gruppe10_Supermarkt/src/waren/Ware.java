package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Allergene;
import enums.Filmgenre;
import enums.Fsk;
import enums.Genre;
import enums.Jahreszeit;
import enums.Kennungen;
import enums.Koerperteile;
import enums.Nutzung;
import enums.Sprachen;
import enums.Stofftypen;
import enums.Untergruppen;

/**
 * Eine Abstrakte Klasse mit der neue Warenobjekte angelegt, Waren nachbestellt oder herausgegeben werden können.
 * Alle Attribute zu allen Warentypen sind in der Klasse Ware abgelegt.
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 15.02.2021
 *
 */
public abstract class Ware {
	
	//Objekt Attribute
	protected String name;
	protected double preis;
	protected int anzahl;
	protected LocalDate seitWannImBestand;
	protected int haltbarkeit;
	protected boolean aufgebacken;
	protected double alcProzente;
	private Kennungen kennung;
	protected Stofftypen stofftyp;
	protected Jahreszeit jahreszeit;
	protected Koerperteile koerperteil;
	protected boolean isDigital;
	protected Filmgenre filmgenre;
	protected Genre genre;
	protected int erscheinungsjahr;
	protected Nutzung nutzung;
	protected double stiftungwarentest;
	protected Allergene allergene;
	protected  String beschreibung;
	protected Untergruppen unterGruppe;
	protected double dauer;
	protected Fsk fsk;
	protected Sprachen sprache;
	
	//Konstante füe Maximale Lagermenge, der Maximalen Warentypen und der jeweiligen Warentypkennungen
	protected static final int MAXMENGE = 100;
	protected static final int MAXANZAHLWAREN = 30;
	
	//ArrayList für alle Warentypen
	protected static ArrayList<ArrayList<Ware>> alleWaren = new ArrayList<ArrayList<Ware>>();
	
	/**
	 * Konstruktor der Klasse Ware um ein neues Warenobjekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 01.02.2020
	 * 
	 * @param name Die Bezeichnung der Ware oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param seitWannImBestand Gibt an seit wnn die Ware im bestand ist als LocalDate
	 */
	public Ware(String name, double preis,LocalDate seitWannImBestand) {
		
		this.name = name;
		this.preis = preis;
		this.seitWannImBestand = seitWannImBestand;
	}
	
	/**
	 * Abstakte Methode zum nachbestellen von Waren.
	 * Die Methode wird durch die Subklassen instanziert.
	 * 
	 * @param menge Gibt die Menge an, welche bestellt werden soll als Integer
	 * @return Gibt ein True oder False zurück ob waren bestellt werden können
	 */
	public abstract boolean nachbestellen(int menge);
	
	/**
	 * Abstakte Methode zum nachbestellen von Waren.
	 * Die Methode wird durch die Subklassen instanziert.
	 * 
	 * @param menge Gibt die Menge an, welche herausgegeben werden kann als Integer
	 * @return Gibt ein True oder False zurück ob Waren herausgegeben werden können
	 */
	public abstract boolean herausgeben(int menge);
	
	/**
	 * Klassenmethode welche alle Waren ausgibt welche sich im Lager befinden
	 * Diese werden auf der Konsole ausgegeben.
	 */
	public static void gebAlleWarenAus() {
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
		}
	}

	
	//--------------- GETTER und SETTER -------------------------

	public Kennungen getKennung() {
		return kennung;
	}

	public void setKennung(Kennungen kleidung) {
		this.kennung = kleidung;
	}
}
