package waren;
import java.time.LocalDate;
import java.util.Scanner;

import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Getr�nke-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 09.02.2021
 *
 */
public class Getraenke extends Ware {

	//Objektattribute
	protected double alcProzente;
	
	//Klassenattribut zum z�hlen der Getr�nke
	private static int zaehler_getraenke = 0;
	
	/**
	 * Konstruktor der Klasse Getraenke um ein neues Getr�nke-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 14.02.2020
	 * 
	 * @param name Die Bezeichnung des Getr�nks oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Die Anzahl der Waren (Lagermenge) als Integer
	 * @param seitWannImBestand Datum seit wann die Ware im Bestand ist als LocalDate
	 * @param alcProzente Gibt den alkoholgehalt des Getr�nks in Double an
	 */
	public Getraenke(String name, double preis, int anzahl, LocalDate seitWannImBestand, double alcProzente)  {
		super(name, preis, anzahl, seitWannImBestand);
		this.alcProzente = alcProzente;			
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neue Getr�nk hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und das
	 * Getr�nk (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param backware das hinzuzufuegende eines neuen Backwaren-Objektes
	 * @throws SupermarktExceptions Eigene Exceptionmeldung wenn die Haltbarkeit keinen positiven Wert enth�lt
	 */
	public static void addGetraenke(Getraenke getraenk) throws SupermarktExceptions {
			
		if(zaehler_getraenke < MAXANZAHLWAREN) {
			alleWaren.add(getraenk);
			getraenk.anzahl = MAXMENGE;
			getraenk.seitWannImBestand = LocalDate.now();
			getraenk.setKennung(GETRAENKE);
			
			if(getraenk.alcProzente < 0.00) {
				throw new SupermarktExceptions("Fehler: Der Alkoholgehalt kann nicht kleiner 0 sein!");
			}

			zaehler_getraenke++;
				
		}else {
			System.out.println(
					String.format(
							"Die Anzahl (30) verschiedeneser Waren wurde �berschritten.! Das Getr�nk %s konnte nicht hinzugef�gt werden", 
							getraenk.name));
		}
	}

	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird f�r ein Getr�nke-Objekt eine Nachbestellung zu t�tigen.
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
							"Das Getr�nk %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
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
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Getr�nken verwendet wird.
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
							"F�r das Getr�nk %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} 
		//Keine herausgabe der Waren und es werden neue Waren nachbestellt
		else {
			
			System.out.println(
					String.format(
							"F�r das Getr�nk %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			
			herausgeben = false;
			
		}
		return herausgeben;
	}
	
	/**
	 * toString Methode der Klasse Getraenk um eine Ausgabe
	 * zu dem Getr�nk zu t�tigen
	 */
	@Override
	public String toString() {
		
		String ausgabe =String.format(
							"Das Getr�nk %s ist aktuell auf Lager!", 
							this.name);
		
		return	ausgabe; 
	}
	
	
	/**
	 * Objektmethode zur Pr�fung ob ein Getr�nk Alkoholhaltig ist oder nicht
	 * @author Sebastian Ohlendorf
	 * 
	 * @return Gibt ein Boolean zur�ck der True ist wenn das Getr�nk alkoholisch ist, andernfalls False
	 */
	public boolean istAlkoholhaltig() {
		
		//Methodenvariable
		boolean istAlkoholhaltig = false;
		
		if ( this.alcProzente > 0) {
			istAlkoholhaltig = true;
		}
		
		return istAlkoholhaltig;
	}
	
	
	/**
	 * Klassenmethode, welche alle Getr�nke ausgibt
	 */
	public static void gebeGetraenkeAus() {
		
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == GETRAENKE) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			
		}
	}
	
	
	/**
	 * Klassenmethode, welche alle Getr�nke ausgibt, welche nicht alkoholisch sind
	 */
	public static void gebeNonAlkGetraenkeAus() {

		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == GETRAENKE && !alleWaren.get(i).istAlkoholhaltig() ) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			
		}
	}

	@Override
	protected int istHaltbar() {
		// TODO Auto-generated method stub
		return 0;
	}



}
