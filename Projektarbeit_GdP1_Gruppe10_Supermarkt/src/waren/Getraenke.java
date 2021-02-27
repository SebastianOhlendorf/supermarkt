package waren;
import java.time.LocalDate;
import java.util.ArrayList;

import enums.Kennungen;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Getr�nke-Objekten und weiterer Methodenaufrufe
 * rund um Getr�nke
 * @author Lennart Sparbier
 * @version 1.0
 * @date 09.02.2021
 *
 */
public class Getraenke extends Ware {

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
	public Getraenke(String name, double preis, LocalDate seitWannImBestand, double alcProzente)  {
		super(name, preis, seitWannImBestand);
		this.alcProzente = alcProzente;			
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neue Getr�nk hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und das
	 * Getr�nk (Name) nicht hinugefuegt werden konnte.
	 * @author Sebastian Ohlendorf
	 * 
	 * @param getraenk das hinzuzufuegende eines neuen Getr�nke-Objektes
	 */
	public static void addGetraenke(Getraenke getraenk) {
			
		ArrayList<Ware> neuesGetraenk = new ArrayList<Ware>();
		
		if(getraenk.alcProzente < 0.00) {
			System.out.println(
					String.format(
							"Fehler: Die �bergebene Alkoholgehalt <%s> beinhaltet keinen positiven Wert!", 
							getraenk.alcProzente));

		}else if(zaehler_getraenke < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neuesGetraenk.add(getraenk);
					getraenk.seitWannImBestand = LocalDate.now();
					getraenk.setKennung(Kennungen.GETRAENKE);
				}
		
				zaehler_getraenke++;
				alleWaren.add(neuesGetraenk);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Getr�nkearten wurde �berschritten! Das Getr�nk %s konnte nicht hinzugef�gt werden", 
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
				String name = this.name;
				double preis = this.preis;
				double alcProzente = this.alcProzente;
				
				boolean nachbestellung = false;
				
				for (int i = 0; i < alleWaren.size(); i++) {
					
					if(alleWaren.get(i).get(0).getKennung() == Kennungen.GETRAENKE && alleWaren.get(i).get(0).name.equals(name)) {
						
						int aktuellLagermenge = alleWaren.get(i).size();
						int neueLegermenge = aktuellLagermenge + menge;
						int diffMenge = 0;
					
						//Pr�fung ob Lagermene einer Ware gleich der Lagergroe�e ist
						if (alleWaren.get(i).size() == MAXMENGE) {
							
							System.out.println(
									String.format(
											"Das Lebensmittel %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
											this.name));
							
							nachbestellung = false;
							
						}
						//Pr�fung b die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
						else if(neueLegermenge > MAXMENGE) {
							
							diffMenge = MAXMENGE - aktuellLagermenge;
							
							Getraenke getraenk = new Getraenke(name, preis, LocalDate.now(), alcProzente);
							
							for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
								alleWaren.get(i).add(getraenk);
								getraenk.setKennung(Kennungen.GETRAENKE);
								
							}
							
							System.out.println(
									String.format(
											"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazit�t (100) zu erreichen.", 
											diffMenge));
							
							nachbestellung = true;	
						}
						//Nachbestellung der Ware
						else {
							
							Getraenke getraenk = new Getraenke(name, preis, LocalDate.now(), alcProzente);
							
							for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
								
								alleWaren.get(i).add(getraenk);
								getraenk.setKennung(Kennungen.GETRAENKE);
								
							}
							
							System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
							
							nachbestellung = true;
						}
					}
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
				String name = this.name;
				boolean herausgeben = false;
				
				for (int i = 0; i < alleWaren.size(); i++) { 
					
					if(alleWaren.get(i).get(0).getKennung() == Kennungen.GETRAENKE && alleWaren.get(i).get(0).name.equals(name)) {
						
						int aktuellLagermenge = alleWaren.get(i).size();
						int neueLegermenge = aktuellLagermenge - menge;
						
						
						//Pr�fung ob noch genug im Lager ist zum herausgeben
						if(neueLegermenge > 0) {
							
							for(int j = 0; j < menge; j++) {
								
								alleWaren.get(i).remove(0);
							}
							
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
											"F�r das Getr�nk %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
											+ "Daher wird eine Nachbestellung get�tigt.", 
											this.name,
											alleWaren.get(i).size(),
											menge));
							
							nachbestellen(MAXMENGE);
							
							herausgeben = false;
							
						}
					}
				}
				return herausgeben;
	}
	
	/**
	 * toString Methode der Klasse Getraenk um eine Ausgabe
	 * zu dem Getr�nk zu t�tigen
	 */
	@Override
	public String toString() {
		
		return "Neuer Lebensmittel Artikel [ Name: "+ this.name + " Preis: "+ this.preis + " Seit wann im Bestand: " + this.seitWannImBestand + " Alkoholgehalt: " + this.alcProzente +"]"; 
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
		String name = this.name;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.GETRAENKE && alleWaren.get(i).get(0).name.equals(name)) {
					
				if(alleWaren.get(i).get(0).alcProzente > 0.00) {
						
					System.out.println(
							String.format("Das Getr�nk %s hat einen Akolholgehalt von %s.",
									alleWaren.get(i).get(0).name,
									alleWaren.get(i).get(0).alcProzente));
					
					istAlkoholhaltig = true;
				}else {
					
					System.out.println(
							String.format("Das Getr�nk %s ist nicht alkoholisch.",
									alleWaren.get(i).get(0).name));
					//Ware wird nicht aufgebacken
					istAlkoholhaltig =  false;
				}	
			}
		}
		
		return istAlkoholhaltig;
	}
	
	
	/**
	 * Klassenmethode, welche alle Getr�nke ausgibt
	 */
	public static void gebeGetraenkeAus() {
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.GETRAENKE) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	
	/**
	 * Klassenmethode, welche alle Getr�nke ausgibt, welche nicht alkoholisch sind
	 */
	public static void gebeNonAlkGetraenkeAus() {

		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.GETRAENKE && alleWaren.get(i).get(0).alcProzente == 0.00) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	/**
	 * Klassenmethode um ein Bestimmtes Objekt zu erhalten
	 * 
	 * @param objektId ID des Objektes aus dem Array alleWaren
	 * @return Gibt ein Getraenkeobjekt zur�ck
	 */
	public static Getraenke erhalteObjekt(int objektId) {
		
		return (Getraenke) alleWaren.get(objektId).get(0);
		
	}
	
	/**
	 * Klassenmethode um die Maximale ID zu erhalten f�r den Bereich Getr�nke im Array alleWaren
	 * 
	 * @return Gibt die h�chste ID des Arrays f�r Getr�nke aus Integer aus
	 */
	public static int erhalteObjektMaxID() {
		
		int maxID = 0;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.GETRAENKE) {
				maxID = i;
			}
		}
		return maxID;
	}
	
	/**
	 * Klassenmethode um die Minimale ID zu erhalten f�r den Bereich Getr�nke im Array alleWaren
	 * 
	 * @return Gibt die niedrigste ID des Arrays f�r Getr�nke aus Integer aus
	 */
	public static int erhalteObjektMinID() {
		
		int minID = 6000;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.GETRAENKE) {
				
				if(minID > i) {
					
					minID = i;
				}
			}
		}
		return minID;
	}
}
