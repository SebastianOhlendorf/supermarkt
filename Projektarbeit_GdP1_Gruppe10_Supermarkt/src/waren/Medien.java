package waren;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Filmgenre;
import enums.Kennungen;
import enums.Untergruppen;

//import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Medien-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class Medien extends NonFoodArtikel {
	
	
	
	//Objektattribute
	protected boolean isDigital;
	protected Filmgenre genre;
	protected int erscheinungsjahr;
	
	//Klassenattribute
	private static int zaehler_medien = 0;
	
	
	/**
	 * Konstruktor der Klasse Medien um ein neues Medien-Objekt zu erzeugen.
	 * @author Lennart Sparbier / 18.02.2020
	 * 
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * @param beschreibung Enth�lt zus�tzliche Informationen zum Artikel als String
	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel geh�rt bspw. Kleidung als Integer
 	 * @param isDigital Gibt an ob es sich um ein Digitales Medium handelt als Boolean
 	 * @param genre Gibt an zu welchen Genre der Medienartikel geh�rt als Integer
 	 * @param erscheinungsjahr Gibt das Erscheinungsjahr als Integer an
	 */
	public Medien(String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			 String beschreibung, Untergruppen unterGruppe, boolean isDigital, Filmgenre genre, int erscheinungsjahr) {
		
		super( name,  preis,  seitWannImBestand,  anzahl, 
				  beschreibung,  unterGruppe);
		
		this.isDigital = isDigital;
		this.genre = genre;
		this.erscheinungsjahr = erscheinungsjahr;
		
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das �bergebene Genre verwendet
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
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Horror mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienHorror(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.HORROR;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Action mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienAction(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.ACTION;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Thriller mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienThriller(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.THRILLER;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Humor mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienHumor(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.HUMOR;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Drama mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienDrama(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.DRAMA;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Krieg mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienKrieg(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.KRIEG;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Liebe mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienLiebe(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.LIEBE;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}
	
	/**
	 * Fuegt dem Array alleWaren ein neues Medienobjekt hinzu, solange dieses nicht
	 * voll ist. Ansonsten wird ausgegeben, dass das Lager voll ist und der
	 * Medien-Artikel (Name) nicht hinugefuegt werden konnte.
	 * Hier wird das Genre Western mit �bergeben
	 * @author Sebastian Ohlendorf
	 * 
	 * @param medien das hinzuzufuegende eines neuen Medien-Objektes
	 */
	public static void addMedienWestern(Medien medien)  {
		
		ArrayList<Ware> neueMedien = new ArrayList<Ware>();
		
		if(zaehler_medien < MAXANZAHLWAREN) {
			
				for(int i = 0; i < MAXMENGE; i++) {
			
					neueMedien.add(medien);
					medien.seitWannImBestand = LocalDate.now();
					medien.setKennung(Kennungen.MEDIEN);
					medien.unterGruppe = Untergruppen.MEDIEN;
					medien.genre = Filmgenre.WESTERN;
					
				}
		
				zaehler_medien++;
				alleWaren.add(neueMedien);
				
		}else {
				System.out.println(
						String.format(
								"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde �berschritten! Der Medien-Artikel %s konnte nicht hinzugef�gt werden", 
								medien.name));
		}
	}

	
	/**
	 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird f�r ein Medien-Objekt eine Nachbestellung zu t�tigen.
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
		String beschreibung = this.beschreibung;
		Untergruppen untergruppe = this.unterGruppe;
		boolean isDigital = this.isDigital;
		Filmgenre genre = this.genre;
		int erscheinungsjahr = this.erscheinungsjahr;
		
		boolean nachbestellung = false;
		
		for (int i = 0; i < alleWaren.size(); i++) {
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge + menge;
				int diffMenge = 0;
			
				//Pr�fung ob Lagermene einer Ware gleich der Lagergroe�e ist
				if (alleWaren.get(i).size() == MAXMENGE) {
					
					System.out.println(
							String.format(
									"Der Medien-Artikel %s hat bereits die maximale Lagerkapazit�t, daher wird keine Nachbestellung durchgef�hrt!", 
									this.name));
					
					nachbestellung = false;
					
				}
				//Pr�fung b die zu bestellende Megen mit der Lagermenge g��er ist als die Lagerroe�e
				else if(neueLegermenge > MAXMENGE) {
					
					diffMenge = MAXMENGE - aktuellLagermenge;

					Medien medien = new Medien(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr);
							
					for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
								
						alleWaren.get(i).add(medien);
						medien.setKennung(Kennungen.MEDIEN);
								
					}
							
					System.out.println(
							String.format(
									"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazit�t (100) zu erreichen.", 
									diffMenge));
							
					nachbestellung = true;	
				}
				//Nachbestellung der Ware
				else {
					
					Medien medien = new Medien(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr);
					
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
			
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN && alleWaren.get(i).get(0).name.equals(name)) {
				
				int aktuellLagermenge = alleWaren.get(i).size();
				int neueLegermenge = aktuellLagermenge - menge;
				
				
				//Pr�fung ob noch genug im Lager ist zum herausgeben
				if(neueLegermenge > 0) {
					
					for(int j = 0; j < menge; j++) {
						
						alleWaren.get(i).remove(j);
					}
							
					System.out.println(
							String.format(
									"F�r den Medien-Artikel %s wurden %s Einheiten herausgegeben.", 
									this.name,
									menge));
					
					herausgeben = true;
				} 
				//Keine herausgabe der Waren und es werden neue Waren nachbestellt
				else {
					
					System.out.println(
							String.format(
									"F�r den Medien-Artikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
	 * toString Methode der Klasse Medien um eine Ausgabe
	 * zu dem Medien zu t�tigen
	 */
	@Override
	public String toString() {
		
		return"neuer Medien Artikel [ name= "+ this.name + " preis= "+ this.preis + " seitWannImBestand= " + this.seitWannImBestand +  
				" anzahl= " + this.anzahl +  " beschreibung= " + this.beschreibung + " unterGruppe = "+ this.unterGruppe + 
				" isDigital= " + this.isDigital + " genre= " + this.genre + " erscheinungsjahr= " + this.erscheinungsjahr + "]";
			
	}
	
	/**
	 * Klassenmethode, welche alle Medien-Artikel ausgibt
	 */
	public static void gebenMedienrtikelAus() {
		for (int i = 0; i < alleWaren.size(); i++) { 
			if(alleWaren.get(i).get(0).getKennung() == Kennungen.MEDIEN) {
				System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
			}
		}
	}
}
 