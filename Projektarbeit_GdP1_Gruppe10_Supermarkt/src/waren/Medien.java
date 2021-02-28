package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Genre;
import enums.Kennungen;
import enums.Untergruppen;



/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Medien-Objekten und weiterer Methodenaufrufe
 * rund um Medien
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class Medien extends NonFoodArtikel {
	
	//Klassenattribute
	private static int zaehler_medien = 0;
	
	
	/**
	 * Konstruktor der Klasse Medien um ein neues Medien-Objekt zu erzeugen.
	 * @author Lennart Sparbier / 18.02.2020
	 * 
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * @param beschreibung Enthält zusätzliche Informationen zum Artikel als String
	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel gehört bspw. Kleidung als Integer
 	 * @param isDigital Gibt an ob es sich um ein Digitales Medium handelt als Boolean
 	 * @param genre Gibt an zu welchen Genre der Medienartikel gehört als Integer
 	 * @param erscheinungsjahr Gibt das Erscheinungsjahr als Integer an
	 */
	public Medien(String name, double preis, LocalDate seitWannImBestand, 
			 String beschreibung, Untergruppen unterGruppe, boolean isDigital, Genre genre, int erscheinungsjahr) {
		
		super(name, preis, seitWannImBestand, beschreibung, unterGruppe);
		
		this.isDigital = isDigital;
		this.genre = genre;
		this.erscheinungsjahr = erscheinungsjahr;
		
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das übergebene Genre verwendet
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedien(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde überschritten! Der Medien-Artikel %s konnte nicht hinzugefügt werden", 
								medien.name));
		}
	}
	
	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein Medien-Objekt eine Nachbestellung zu tätigen.
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
		String beschreibung = this.beschreibung;
		Untergruppen untergruppe = this.unterGruppe;
		boolean isDigital = this.isDigital;
		Genre genre = this.genre;
		int erscheinungsjahr = this.erscheinungsjahr;
		
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
				//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Der Medien-Artikel %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;

					Medien medien = new Medien(name, preis, LocalDate.now(), beschreibung, untergruppe, isDigital, genre, erscheinungsjahr);
							
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
						alleWaren.get(i).add(medien);
						medien.setKennung(Kennungen.MEDIEN);
								
					}
							
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
									diffMenge));
							
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					Medien medien = new Medien(name, preis, LocalDate.now(), beschreibung, untergruppe, isDigital, genre, erscheinungsjahr);
					
					for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
						
						alleWaren.get(i).add(medien);
						medien.setKennung(Kennungen.MEDIEN);
						
					}
					
					System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
					
					nachbestellung = true;
				}
			}
		}
		return nachbestellung;
	}



	/**
	 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Medien-Artikel verwendet wird.
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
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Prüfung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(0);
					}
							
					System.out.println(
							String.format(
									"Für den Medien-Artikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"Für den Medien-Artikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	 * toString Methode der Klasse Medien um eine Ausgabe
	 * zu dem Medien zu tätigen
	 * 
	 * @return Rückgabe des Objektes und seiner Attribute als String
	 */
	@Override
	public String toString() {
		
		return"Neuer Medien Artikel [Name: "+ this.name + ", Preis: "+ this.preis + ", SeitWannImBestand: " + this.seitWannImBestand +  
				", Anzahl: " + this.anzahl +  ", Beschreibung: " + this.beschreibung + ", Untergruppe: "+ this.unterGruppe + 
				", ist Digital: " + this.isDigital + ", Genre: " + this.genre + ", Erscheinungsjahr: " + this.erscheinungsjahr + "]";
			
	}
	
	/**
	 * Klassenmethode, welche alle Medien-Artikel ausgibt
	 */
	public static void gebenMedienArtikelAus() {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	/**
	 * Klassenmethode, welche alle Medien-Artikel ausgibt welche Digital sind
	 */
	public static void gebenMedienArtikelDigitalAus() {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN && alleWaren.get(i).get(0).isDigital == true) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	/**
	 * Klassenmethode, welche alle Medien-Artikel ausgibt welche Analog sind
	 */
	public static void gebenMedienArtikelAnalogAus() {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN && alleWaren.get(i).get(0).isDigital == false) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
	
	/**
	 * Klassenmethode, welche alle Medien-Artikel mit Genre ausgibt
	 */
	public static void gebenGenreAus(Genre genre) {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN && alleWaren.get(i).get(0).genre == genre) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Genre: " + alleWaren.get(i).get(0).genre);
			}
		}
	}
	
	/**
	 * Klassenmethode um ein Bestimmtes Objekt zu erhalten
	 * 
	 * @param objektId ID des Objektes aus dem Array alleWaren
	 * @return Gibt ein Medien-Objekt zurück
	 */
	public static Medien erhalteObjekt(int objektId) {
		
		return (Medien) alleWaren.get(objektId).get(0);
		
	}
	
	/**
	 * Klassenmethode um die Maximale ID zu erhalten für den Bereich Medien im Array alleWaren
	 * 
	 * @return Gibt die höchste ID des Arrays für Medien aus Integer aus
	 */
	public static int erhalteObjektMaxID() {
		
		int maxID = 0;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN) {
				maxID = i;
			}
		}
		return maxID;
	}
	
	/**
	 * Klassenmethode um die Minimale ID zu erhalten für den Bereich Medien im Array alleWaren
	 * 
	 * @return Gibt die niedrigste ID des Arrays für Medien aus Integer aus
	 */
	public static int erhalteObjektMinID() {
		
		int minID = 6000;
		
		for (int i = 0; i < alleWaren.size(); i++) { 
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN) {
				
				if(minID > i) {
					
					minID = i;
				}
			}
		}
		return minID;
	}
}
 