package waren;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


/**
 * Kinderklasse der Klasse Ware zum anlegen von Lebensmittelobjekten
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 14.02.2021
 *
 */
public class Lebensmittel extends Ware {
	
	//Objektattribute für das Lebensmittelobjekt
	protected double gewicht;
	//protected int haltbarkeit; //Die Haltbarkeit wird in Tagen gemessen
	protected boolean bedarfKuehlung;
	
	//Klassenattribute zum zaehlen der Lebensmittel und Backwaren 
	private static int zaehler_lebensmittel = 0;

	
	
	

	
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
	 * @param bedarfKuehlung Legt mit einem True oder False fest ob eine Ware gekühlt werden muss
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
	 * @throws SupermarktExceptions Eigene Exceptionmeldung wenn die Haltbarkeit keinen positiven Wert enthält
	 */
	public static void addLebensmittel(Lebensmittel lebensmittel) {
		
		ArrayList<Ware> neuesLebensmittel = new ArrayList<Ware>();
		
		if(lebensmittel.haltbarkeit <= 0) {
			System.out.println(
					String.format(
							"Fehler: Die übergebene Haltbarkeit <%s> beinhaltet keinen positiven Wert!", 
							lebensmittel.haltbarkeit));

		}else if(zaehler_lebensmittel < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neuesLebensmittel.add(lebensmittel);
					lebensmittel.seitWannImBestand = LocalDate.now();
					lebensmittel.setKennung(LEBENSMITTEL);
				}
		
				zaehler_lebensmittel++;
				alleWaren.add(neuesLebensmittel);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Lebensmittelarten wurde überschritten! Das Lebensmittel %s konnte nicht hinzugefügt werden", 
								lebensmittel.name));
		}
	}
	
	

	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein Lebensmittel-Objekt eine Nachbestellung zu tätigen.
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
		String name = this.name;
		double preis = this.preis;
		double gewicht = this.gewicht;
		int haltbarkeit = this.haltbarkeit;
		boolean bedarfKuehlung = this.bedarfKuehlung;
		
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == LEBENSMITTEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
				//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Das Lebensmittel %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;
					
					Lebensmittel lebensmittel = new Lebensmittel(name, preis, 0, LocalDate.now(), gewicht, haltbarkeit, bedarfKuehlung);
					
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
						
						alleWaren.get(i).add(lebensmittel);
						lebensmittel.setKennung(LEBENSMITTEL);
						
					}
					
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
									diffMenge));
					
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					Lebensmittel lebensmittel = new Lebensmittel(name, preis, 0, LocalDate.now(), gewicht, haltbarkeit, bedarfKuehlung);
					
					for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
						
						alleWaren.get(i).add(lebensmittel);
						lebensmittel.setKennung(LEBENSMITTEL);
						
					}
					
					System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
					
					nachbestellung = true;
				}
			}
		}
		return nachbestellung;
	}

	/**
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Lebensmitteln verwendet wird.
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
		String name = this.name;
		boolean herausgeben = false;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == LEBENSMITTEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Prüfung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
					
					System.out.println(
							String.format(
									"Für das Lebensmittel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"Für das Lebensmittel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
									+ "Daher wird eine Nachbestellung getätigt.", 
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
	 * toString Methode der Klasse Lebensmittel um eine Ausgabe
	 * zu dem Lebensmittel zu tätigen
	 */
	@Override
	public String toString() {
		return "Neuer Lebensmittel Artikel [ Name: "+ this.name + " Preis: "+ this.preis + " Seit wann im Bestand: " + this.seitWannImBestand + " Gewicht: " + this.gewicht +
				" Haltbarkeit in Tagen: "+ this.haltbarkeit + " Benötigt Kühlung: "+ this.bedarfKuehlung +"]";
	}
	
	
	/**
	 * Mit dieser Methode wird das MHD ermittelt.
	 * Ist das Lebensittel-Objekt noch nicht abgelaufen, wird das MHD herausgegeben
	 * Ist das MHD abgelaufen wird eine Meldung herausgegeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @return Gibt das MHD als Zeichenkette zurück
	 */
	public String haltbarBis() {
		
		String name = this.name;
		String haltbarBis = null;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == LEBENSMITTEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				for(int j = 0; j < alleWaren.get(i).size(); j++) {
					
					if(alleWaren.get(i).get(j).seitWannImBestand.plusDays(alleWaren.get(i).get(j).haltbarkeit).isAfter(LocalDate.now())) {

						haltbarBis = "Das Lebensmittel ist haltbar bis " + alleWaren.get(i).get(j).seitWannImBestand.plusDays(alleWaren.get(i).get(j).haltbarkeit);
			
					}else {

						haltbarBis = String.format(
										"Das Mindesthaltbatkeitsdatum der Lebensmittels %s (%s) ist abgelaufen.",
										this.name,
										j);
				
					}
				}
			}
		}
		
		return haltbarBis;	
	}
	
	
	/**
	 * Mit der Methode wird die Haltbarkeit in Tagen ermittelt.
	 * Wenn der ermittelte Wert gößer 0 ist, dann werden die Tage als Int ausgegeben,
	 * ist der ermittelte Wert gleich 0 wird eine 0 zurückgegeben
	 * Trifft keiner der Prüfungen zu, dann ist das MHD überschritten und es wird eine -1 zurückgegeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @return Gibt die Haltbarkeit in Tagen als Integer zurück
	 */
	public int istHaltbar() {

		String name = this.name;
		int istHaltbar = 0;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == LEBENSMITTEL && alleWaren.get(i).get(0).name.equals(name)) {
				
				for(int j = 0; j < alleWaren.get(i).size(); j++) {
					
					long haltbarInTagen = ChronoUnit.DAYS.between(LocalDate.now(), alleWaren.get(i).get(j).seitWannImBestand.plusDays(alleWaren.get(i).get(j).haltbarkeit));
					
					if(haltbarInTagen > 0) {
						
						istHaltbar = (int)haltbarInTagen;
					
					} else if (haltbarInTagen == 0){
						istHaltbar = 0;
					} else {
						istHaltbar = -1;
					}
				}
			}
		}
		return istHaltbar;
	}
	
	
	/**
	 * Eine Methode von Typ ArrayList welche alle Lebensmittel zurückliefert welche eine haltbarkeit von 0-2 haben.
	 * Hat ein Lebensmittel eine Haltbarkeit kleiner 0, dann wird dieses aus der ArrayList gelöscht
	 * 
	 * @return ArrayListe mit allen Lebensmitteln welche eine Halbarkeit von 0 bis 2 haben
	 */
	public static ArrayList<String> kurzesMHD() {
		
		ArrayList<String> kurzesMHD = new ArrayList<String>();
		
		for(int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == LEBENSMITTEL) {
				
				for(int j = 0; j < alleWaren.get(i).size(); j++) {
					
					int haltbarInTagen = (int)ChronoUnit.DAYS.between(LocalDate.now(), alleWaren.get(i).get(j).seitWannImBestand.plusDays(alleWaren.get(i).get(j).haltbarkeit));
					
					if(haltbarInTagen <= 2 && haltbarInTagen >= 0) {

						kurzesMHD.add("Lebensmittel: " + alleWaren.get(i).get(j).name + "\n");

					} else if(haltbarInTagen < 0){
						
						alleWaren.get(i).remove(j);
					}
				}
			}
		}
		return kurzesMHD;
		
	}	
	
	/**
	 * Methode welche alle Lebensmittel ausgibt welche sich im Lager befinden.
	 */
	public static void gebeLebensmittelAus() {
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == LEBENSMITTEL) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
		
		/*
		System.out.println("\n\n");
		
		for (int i = 0; i < alleWaren.size(); i++) { 
            for (int j = 0; j < alleWaren.get(i).size(); j++) { 
                System.out.println("(" + j + ") " + alleWaren.get(i).get(j)); 
            } 
            System.out.println(); 
        } */

	}


}


