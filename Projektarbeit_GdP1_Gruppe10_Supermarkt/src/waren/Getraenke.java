package waren;
import java.time.LocalDate;
import java.util.Scanner;

import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Getränke-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 09.02.2021
 *
 */
public class Getraenke extends Ware {

	//Objektattribute
	protected double alcProzente;
	
	//Klassenattribut zum zählen der Getränke
	private static int zaehler_getraenke = 0;
	
	/**
	 * Konstruktor der Klasse Getraenke um ein neues Getränke-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 14.02.2020
	 * 
	 * @param name Die Bezeichnung des Getränks oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Die Anzahl der Waren (Lagermenge) als Integer
	 * @param seitWannImBestand Datum seit wann die Ware im Bestand ist als LocalDate
	 * @param alcProzente Gibt den alkoholgehalt des Getränks in Double an
	 */
	public Getraenke(String name, double preis, int anzahl, LocalDate seitWannImBestand, double alcProzente)  {
		super(name, preis, anzahl, seitWannImBestand);
		this.alcProzente = alcProzente;			
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neue Getränk hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und das
	 * Getränk (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param backware das hinzuzufuegende eines neuen Backwaren-Objektes
	 * @throws SupermarktExceptions Eigene Exceptionmeldung wenn die Haltbarkeit keinen positiven Wert enthält
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
							"Die Anzahl (30) verschiedeneser Waren wurde überschritten.! Das Getränk %s konnte nicht hinzugefügt werden", 
							getraenk.name));
		}
	}

	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein Getränke-Objekt eine Nachbestellung zu tätigen.
	 * Ist die Maximale Lagermenge bereits gegeben wird darüber Informiert
	 * Ist die Bestellemenge plus die auf Lager liegende Menge größer als die Maximale Lagermenge, 
	 * wird nur die differenz zur Maximalen Lagermenge bestellt und der Anwender darüber Infomiert
	 * Wenn die Maximal Menge nicht überschritten wird, dann wird die übergebene Menge bestellt
	 * Bei den Aktualisierungen der Lagermenge wird auch das Bestandsdatum aktualisiert
	 * @author Sebastian Ohlendorf
	 * 
	 * @param menge Gibt die Anzahl der zu bestellenden Menge als Integer dar
	 * @return Gibt ein Boolean (True = es wurde bestellt, False = wurde nicht bestellt) zurück ob eine Bestellung getätigt wurde 
	 */
	@Override
	public boolean nachbestellen(int menge) {
		
		//Methodenvariablen
		int mengeLager = this.anzahl + menge;
		int diffMenge;
		boolean nachbestellung;
		
		//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
		if (this.anzahl == MAXMENGE) {
			
			System.out.println(
					String.format(
							"Das Getränk %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
							this.name));
			
			nachbestellung = false;
			
		}
		//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
		else if(mengeLager > MAXMENGE) {
			diffMenge = MAXMENGE - this.anzahl;
			this.anzahl = this.anzahl + diffMenge;
			
			System.out.println(
					String.format(
							"Die Maximale Lagermenge (100) wurde überschritten! Es wurden daher %s Einheiten nachbestellt", 
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
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Getränken verwendet wird.
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
		
		//Methodenvariablen
		int mengeLager = this.anzahl - menge;
		boolean herausgeben;
		
		//Prüfung ob noch genug im Lager ist zum herausgeben
		if(mengeLager > 0) {
			this.anzahl = this.anzahl - menge;
			
			System.out.println(
					String.format(
							"Für das Getränk %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} 
		//Keine herausgabe der Waren und es werden neue Waren nachbestellt
		else {
			
			System.out.println(
					String.format(
							"Für das Getränk %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			
			herausgeben = false;
			
		}
		return herausgeben;
	}
	
	/**
	 * toString Methode der Klasse Getraenk um eine Ausgabe
	 * zu dem Getränk zu tätigen
	 */
	@Override
	public String toString() {
		
		String ausgabe =String.format(
							"Das Getränk %s ist aktuell auf Lager!", 
							this.name);
		
		return	ausgabe; 
	}
	
	
	/**
	 * Objektmethode zur Prüfung ob ein Getränk Alkoholhaltig ist oder nicht
	 * @author Sebastian Ohlendorf
	 * 
	 * @return Gibt ein Boolean zurück der True ist wenn das Getränk alkoholisch ist, andernfalls False
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
	 * Klassenmethode, welche alle Getränke ausgibt
	 */
	public static void gebeGetraenkeAus() {
		
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == GETRAENKE) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			
		}
	}
	
	
	/**
	 * Klassenmethode, welche alle Getränke ausgibt, welche nicht alkoholisch sind
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
