package waren;

import java.time.LocalDate;
import java.util.ArrayList;
import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Lebensmittelobjekten
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 14.02.2021
 *
 */
public class Lebensmittel extends Ware {
	
	//Objektattribute f�r das Lebensmittelobjekt
	protected double gewicht;
	protected int haltbarkeit; //Die Haltbarkeit wird in Tagen gemessen
	protected boolean bedarfKuehlung;
	
	//Klassenattribute zum zaehlen der Lebensmittel und Backwaren 
	private static int zaehler_lebensmittel = 0;
	private static int zaehler_backwaren = 0;

	
	/**
	 * Konstruktor der Klasse Lebensmittel um ein neues Lebensmittel-Objekt zu erzeugen.
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
	public Lebensmittel(String name, double preis, int anzahl, LocalDate seitWannImBestand, double gewicht, int haltbarkeit, boolean bedarfKuehlung) {
		
		super(name, preis, anzahl, seitWannImBestand);
		this.gewicht = gewicht;
		this.haltbarkeit = haltbarkeit;
		this.bedarfKuehlung = bedarfKuehlung;

	}
	
	
	/**
	 * Fuegt dem Array alleWaren ein neues Lebensmittel hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und das
	 * Lebensmittel (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param lebensmittel das hinzuzufuegende neue Lebensmittel
	 * @throws SupermarktExceptions Eigene Exceptionmeldung wenn die Haltbarkeit keinen positiven Wert enth�lt
	 */
	public static void addLebensmittel(Lebensmittel lebensmittel) throws SupermarktExceptions {
			
		if(zaehler_lebensmittel < MAXANZAHLWAREN) {
			alleWaren.add(lebensmittel);
			lebensmittel.anzahl = MAXMENGE;
			lebensmittel.seitWannImBestand = LocalDate.now();
			lebensmittel.setKennung(LEBENSMITTEL);
			
			if(lebensmittel.haltbarkeit <= 0) {
				throw new SupermarktExceptions("Fehler: Die Haltbarkeit keinen positiven Wert!");
			}
					
			zaehler_lebensmittel++;
					
		}else {
			System.out.println(
					String.format(
							"Die Anzahl (30) verschiedeneser Waren wurde �berschritten.! Das Lebensmittel %s konnte nicht hinzugef�gt werden", 
							lebensmittel.name));
		}
	}
	
	
	/**
	 * Fuegt dem Array alleWaren ein neue Backware hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und das
	 * Backware (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param backware das hinzuzufuegende eines neuen Backwaren-Objektes
	 * @throws SupermarktExceptions Eigene Exceptionmeldung wenn die Haltbarkeit keinen positiven Wert enth�lt
	 */
	public static void addBackwaren(Backwaren backwaren) throws SupermarktExceptions {
			
		if(zaehler_backwaren < MAXANZAHLWAREN) {
			alleWaren.add(backwaren);
			backwaren.anzahl = MAXMENGE;
			backwaren.seitWannImBestand = LocalDate.now();
			backwaren.setKennung(BACKWAREN);
			
			if(backwaren.haltbarkeit <= 0) {
				throw new SupermarktExceptions("Fehler: Die Haltbarkeit keinen positiven Wert!");
			}
				
			zaehler_backwaren++;
				
		}else {
			System.out.println(
					String.format(
							"Die Anzahl (30) verschiedeneser Waren wurde �berschritten.! Die Backware %s konnte nicht hinzugef�gt werden", 
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
		int mengeLager = this.anzahl + menge;
		int diffMenge;
		boolean nachbestellung;
		
		//Pr�fung ob Lagermene einer Ware gleich der Lagergroe�e ist
		if (this.anzahl == MAXMENGE) {
			
			System.out.println(
					String.format(
							"Das Lebensmittel %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
							this.name));
			
			nachbestellung = false;
			
		}
		//Pr�fung b die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
		else if(mengeLager > MAXMENGE) {
			diffMenge = MAXMENGE - this.anzahl;
			this.anzahl = this.anzahl + diffMenge;
			
			System.out.println(
					String.format(
							"Die Maximale Lagermenge (100) wurde �berschritten! Es wurden daher %s Einheiten nachbestellt", 
							diffMenge));
			this.seitWannImBestand = LocalDate.now();
			
			nachbestellung = true;	
		}
		//Nachbestellung der Ware
		else {
			
			this.anzahl = this.anzahl + menge;
			this.seitWannImBestand = LocalDate.now();
			
			nachbestellung = true;
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
		int mengeLager = this.anzahl - menge;
		boolean herausgeben;
		
		//Pr�fung ob noch genug im Lager ist zum herausgeben
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
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
							"F�r das Lebensmittel %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			
			herausgeben = false;
			
		}
		return herausgeben;
	}
	
	
	/**
	 * toString Methode der Klasse Lebensmittel um eine Ausgabe
	 * zu dem Lebensmittel zu t�tigen
	 */
	@Override
	public String toString() {
		
		String ausgabe =String.format(
							"Das Lebensmittel %s ist aktuell auf Lager!", 
							this.name);
		
		return	ausgabe; 
	}
	
	
	/**
	 * Mit dieser Methode wird das MHD ermittelt.
	 * Ist das Lebensittel-Objekt noch nicht abgelaufen, wird das MHD herausgegeben
	 * Ist das MHD abgelaufen wird eine Meldung herausgegeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @return Gibt das MHD als Zeichenkette zur�ck
	 */
	public String haltbarBis() {
		
		String haltbarBis = null;
		
		if(LocalDate.now().compareTo(this.seitWannImBestand.plusDays(this.haltbarkeit)) >= 0) {
			
			haltbarBis = this.seitWannImBestand.plusDays(this.haltbarkeit).toString();
		
		}else {
			
			System.out.println(
					String.format(
							"Das Mindesthaltbatkeitsdatum ist abgelaufen. Das Lebensmittel %s sollte aus den Bestand genommen werden",
							this.name));
			
		}
		
		return haltbarBis;
	}
	
	
	/**
	 * Mit der Methode wird die Haltbarkeit in Tagen ermittelt.
	 * Wenn der ermittelte Wert g��er 0 ist, dann werden die Tage als Int ausgegeben,
	 * ist der ermittelte Wert gleich 0 wird eine 0 zur�ckgegeben
	 * Trifft keiner der Pr�fungen zu, dann ist das MHD �berschritten und es wird eine -1 zur�ckgegeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @return Gibt die Haltbarkeit in Tagen als Integer zur�ck
	 */
	public int istHaltbar() {
		
		int istHaltbar = LocalDate.now().compareTo(this.seitWannImBestand.plusDays(this.haltbarkeit));
		
		if(istHaltbar > 0) {
			
			return istHaltbar;
		
		} else if (istHaltbar == 0){
			return 0;
		} else {
			return -1;
		}
	}
	
	
	/**
	 * Eine Methode von Typ ArrayList welche alle Lebensmittel zur�ckliefert welche eine haltbarkeit von 0-2 haben.
	 * Hat ein Lebensmittel eine Haltbarkeit kleiner 0, dann wird dieses aus der ArrayList gel�scht
	 * 
	 * @return ArrayListe mit allen Lebensmitteln welche eine Halbarkeit von 0 bis 2 haben
	 */
	public ArrayList<String> kurzesMHD() {
		
		ArrayList<String> kurzesMHD = new ArrayList<String>();
		
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).istHaltbar() <= 2 && alleWaren.get(i).istHaltbar() >= 0) {

				kurzesMHD.add("Lebensmittel: " + alleWaren.get(i).name + ", Bestandsmenge: " + alleWaren.get(i).anzahl);

			} else if(alleWaren.get(i).istHaltbar() < 0){
				
				alleWaren.remove(i);
				zaehler_lebensmittel--;
			}
		}
		return kurzesMHD;
	}
	
	
	/**
	 * Methode welche alle Lebensmittel ausgibt welche sich im Lager befinden.
	 */
	public static void gebeLebensmittelAus() {
		
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == LEBENSMITTEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			
		}
		
	}


	@Override
	protected boolean istAlkoholhaltig() {
		// TODO Auto-generated method stub
		return false;
	}

}


