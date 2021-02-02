package waren;

import java.time.LocalDate;

import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Lebensmittelobjekten
 * @author 
 * @version
 * @date
 *
 */
public class Lebensmittel extends Ware {
	
	//Variablen anlegen
	protected double gewicht;
	protected int haltbarkeit; //Die Haltbarkeit wird in Tagen gemessen
	protected boolean bedarfKuehlung;
	
	/**
	 * Konstruktor der Klasse Lebensmittel um ein neues Lebensmittel-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 01.02.2020
	 * @param name Die Bezeichnung des Lebensmitels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl
	 * @param seitWannImBestand
	 * @param gewicht
	 * @param haltbarkeit
	 * @param bedarfKuehlung 
	 * @throws SupermarktExceptions 
	 */
	public Lebensmittel(String name, double preis, int anzahl, LocalDate seitWannImBestand, double gewicht, int haltbarkeit, boolean bedarfKuehlung) throws SupermarktExceptions {
		
		super(name, preis, anzahl, seitWannImBestand);
		this.gewicht = gewicht;
		this.bedarfKuehlung = bedarfKuehlung;
		

		if(haltbarkeit > 0) {
			this.haltbarkeit = haltbarkeit;
		}else {
			throw new SupermarktExceptions("Fehler: Die Haltbarkeit keinen positiven Wert!");
		}
		
		
		//Prüfung einbauen, ob die Anzahl möglicher verschiedener Waren (30) nicht bereits überschritten wurde.
		int anzahlWare = 0;
		
		if(anzahlWare < 30) {
			
			this.anzahl = 100;
			this.seitWannImBestand = LocalDate.now();
			
			
		}else {
			System.out.println("Die Anzahl (30) verschiedeneser Waren wurde überschritten. Es kann keine neue Ware angelegt werden.");
		}
		
		
	}
	
	

	@Override
	public boolean nachbestellen(int menge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean herausgeben(int menge) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return null;
	}
	
	public String haltbarBis() {
		return null;
	}
	
	public int istHaltbar() {
		return 0;
	}
	
	public static Lebensmittel[] kurzesMHD() {
		return null;
	}
	
	public static void gebeLebensmittelAus() {
		
	}

}
