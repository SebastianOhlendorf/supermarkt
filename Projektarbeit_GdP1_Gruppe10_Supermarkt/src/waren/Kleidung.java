package waren;

import java.time.LocalDate;

import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Kleidung-Objekten
 * @author 
 * @version
 * @date
 *
 */
public class Kleidung  extends NonFoodArtikel {
	
	private static int zaehler_kleidung = 0;
	
	protected String koerperteil;
	
	protected static final int WINTER = 1;
	protected static final int FRUEHLING = 2;
	protected static final int SOMMER = 3;
	protected static final int HERBST = 4;
	
	
	/**
	 * Konstruktor der Klasse Kleidung um ein neues Kleidung-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 14.02.2020
	 * 
	 * @param name
	 * @param preis
	 * @param seitWannImBestand
	 * @param anzahl
	 * @param beschreibung
	 * @param unterGruppe
	 * @param jahreszeit
	 * @param koerperteil
	 * @param stofftyp
	 */
	public Kleidung(String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			String beschreibung, String unterGruppe, int jahreszeit, String koerperteil, String stofftyp) {
		super(name, preis, seitWannImBestand, anzahl, beschreibung, unterGruppe);
		
		this.jahreszeit = jahreszeit;
		this.koerperteil = koerperteil;
		this.stofftyp = stofftyp;
	}
	
	/**
	 * Fuegt dem Array alleWaren eine neue Kleidung hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und die
	 * Kleidung (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param kleidung das hinzuzufuegende eines neuen Kleingund-Objektes
	 */
	public static void addKleidung(Kleidung kleidung) {
			
		if(zaehler_kleidung < MAXANZAHLWAREN) {
			alleWaren.add(kleidung);
			kleidung.anzahl = MAXMENGE;
			kleidung.seitWannImBestand = LocalDate.now();
			kleidung.setKennung(KLEIDUNG);

			switch(kleidung.jahreszeit) {
			case 1: kleidung.setJahreszeit(WINTER);
					break;	
			case 2: kleidung.setJahreszeit(FRUEHLING);
					break;
			case 3: kleidung.setJahreszeit(SOMMER);
					break;
			case 4: kleidung.setJahreszeit(HERBST);
					break;
			default: System.out.println("Es wurde keine korrekte Jahreszeit �bergeben!");
			}
			
			zaehler_kleidung++;
				
		}else {
			System.out.println(
					String.format(
							"Die Anzahl (30) verschiedeneser Waren wurde �berschritten.! Die Kleidung %s konnte nicht hinzugef�gt werden", 
							kleidung.name));
		}
	}
	
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird f�r ein Kleidungs-Objekt eine Nachbestellung zu t�tigen.
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
							"Das Kleidungsst�ck %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
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
							"F�r das Kleidungsst�ck %s wurden %s Einheiten herausgegeben.", 
							this.name,
							menge));
			
			herausgeben = true;
		} 
		//Keine herausgabe der Waren und es werden neue Waren nachbestellt
		else {
			
			System.out.println(
					String.format(
							"F�r das Kleidungsst�ck %s gibt es nur noch %s Einheiten auf Lager.", 
							this.name,
							this.anzahl));
			
			nachbestellen(MAXMENGE);
			
			herausgeben = false;
			
		}
		return herausgeben;
	}

	
	/**
	 * toString Methode der Klasse Kleidung um eine Ausgabe
	 * zu der Kleidung zu t�tigen
	 */
	@Override
	public String toString() {

		String ausgabe =String.format(
				"Die Kleidung %s ist aktuell auf Lager!", 
				this.name);

		return	ausgabe; 
	}
	

	/**
	 * Klassenmethode zur Ermittlung der Kleidungsst�cke welche zur �bergebenen Jahreszeit passen und gibt diese auf der Konsole aus.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param jahreszeit �bergebene Jahreszeit als Integer (Winter = 1, Fr�hling = 2, Sommer = 3 und Herbst = 4)
	 */
	public static void gibKleidungJahreszeitAus(int jahreszeit) {
		
		String jahreszeitText = null;
		
		switch(jahreszeit) {
		
		case 1: jahreszeitText = "Winter";
				break;
		case 2: jahreszeitText = "Fr�hling";
				break;
		case 3: jahreszeitText = "Sommer";
				break;
		case 4: jahreszeitText = "Herbst";
				break;
		default: System.out.println("Die angegebene Zahl entspricht keiner Jahreszeit, bitte w�hle Sie eine Zahl von 1-4.");
		
		}
		
		//Durl�uft alle Waren im Lager und pr�ft ob es sich um ein Kleidungsst�ck handelt und ob es den �bergebenen Stofftyp besitzt
		int zaehler = 0;
		
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == KLEIDUNG && alleWaren.get(i).getJahreszeit() == jahreszeit) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			zaehler++;
		}
		
		
		//Pr�fung ob Kleidungsst�cke gefunden wurden zur angegebenen Jahreszeit
		if(zaehler > 0) {
			System.out.println(
					String.format(
							"Das ausgew�hlte Kleidungsst�ck ist ein %skleidungsst�ck.", 
							jahreszeitText));
			
		} else {
			System.out.println(
					String.format(
							"Beim angegebenen Jahreszeir <%s>, handelt es sich um keine g�ltige Jahreszeit, es konnte daher kein Kleidungsst�ck ermittelt werden!", 
							jahreszeit));
		}			
	}
	
	
	/**
	 * Klassenmethode zum ermitteln der Kleidungsst�cke zu angegebenen Stofftyps und gibt diesen in der Konsole aus
	 * @author Sebastian Ohlendorf
	 * 
	 * @param stofftyp �bergabe des zu pr�fenden Stofftyps der Kleidungsst�cke als String
	 */
	public static void gibKleidungStofftypAus(String stofftyp) {
			
		String stofftypUebergabe = stofftyp.toLowerCase();
		int zaehler = 0;
		
		//Durl�uft alle Waren im Lager und pr�ft ob es sich um ein Kleidungsst�ck handelt und ob es den �bergebenen Stofftyp besitzt
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).getKennung() == KLEIDUNG && alleWaren.get(i).getStofftyp().toLowerCase().equals(stofftypUebergabe) ) {
				System.out.println("(" + i + ") " + alleWaren.get(i));
			}
			zaehler++;	
		}
		
		//Pr�fung ob Kleidungsst�cke gefunden wurden zum angegebenen Stofftyp
		if(zaehler > 0) {
			
			System.out.println(
					String.format(
							"Die Kleidungsst�cke bestehen aus %s.", 
							stofftypUebergabe));
			
		} else {
			System.out.println(
					String.format(
							"Beim angegebenen Stofftyp <%s>, handelt es sich um einen Stofftyp, welches keines der Kleidungst�cke im Lager besitzt!", 
							stofftypUebergabe));
		}	
	}
}
