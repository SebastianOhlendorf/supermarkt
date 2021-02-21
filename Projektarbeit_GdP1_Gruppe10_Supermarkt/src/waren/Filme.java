package waren;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Film-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class Filme extends Medien {

	
		//Objektattribute speziell für die Klasse Filme
		protected double dauer;
		protected int fsk;
		protected int sprache;
		
		//Klassenattribute
		private static int zaehler_filme = 0;
		
		// Dient zum setzen der FSK im Switch Case
		protected static final int FSK18 = 18;
		protected static final int FSK16 = 16;
		protected static final int FSK12 = 12;
		protected static final int FSK6 =  6;
		protected static final int FSK0 =  0;
		
		
		// Dient zum setzen der Sprache im Switch Case
		protected static final int CHINESISCH = 1;
		protected static final int DEUTSCH = 2;
		protected static final int ENGLISCH = 3;
		protected static final int FRANZÖSISCH = 4;
		protected static final int GRIECHISCH = 5;
		protected static final int INDISCH = 6;
		protected static final int ITALIENISCH = 7;
		protected static final int JAPANISCH = 8;
		protected static final int NIEDERLÄNDISCH = 9;
		protected static final int POLNISCH = 10;
		protected static final int RUSSISCH = 11;
		protected static final int SPANISCH = 12;
		protected static final int TÜRKISCH = 13;
		protected static final int VIETNAMESISCH = 14;
		
		
		/**
		 * Konstruktor der Klasse Filme um ein neues Film-Objekt zu erzeugen.
		 * @author Lennart Sparbier / 18.02.2020
		 * 
		 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 	 * @param preis Der Preis der Ware als Double
	 	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 	 * @param beschreibung Enthält zusätzliche Informationen zum Artikel als String
	 	 * @param unterGruppe gibt an zu welcher Untergruppe der Artikel gehört bspw. Kleidung als Integer
 	 	 * @param isDigital Gibt an ob es sich um ein Digitales Medium handelt als Boolean
 	 	 * @param genre Gibt an zu welchen Genre der Medienartikel gehört als Integer
 	 	 * @param erscheinungsjahr Gibt das Erscheinungsjahr als Integer an
		 * @param dauer Gibt die Dauer des Films als Double an
		 * @param fsk Gibt die FSK des Films als Integer an
		 * @param sprache Gibt die Sprache als Integer an
		 */
		public Filme(String name, double preis, LocalDate seitWannImBestand, int anzahl, String beschreibung,
				int unterGruppe, boolean isDigital, int genre, int erscheinungsjahr, double dauer, int fsk, int sprache) {
			super(name, preis, seitWannImBestand, anzahl, beschreibung, unterGruppe, isDigital, genre, erscheinungsjahr);
			
			this.dauer = dauer;
			this.fsk = fsk;
			this.sprache = sprache;	
			
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
		public static void addFilm(Filme film){
			
			ArrayList<Ware> neuerFilm = new ArrayList<Ware>();
			
			if(zaehler_filme < MAXANZAHLWAREN) {
				
					for(int i = 0; i < MAXMENGE; i++) {
				
						neuerFilm.add(film);
						film.seitWannImBestand = LocalDate.now();
						film.setKennung(FILME);
						film.unterGruppe = FILME;
						
						switch(film.fsk) {
						case 0: film.fsk = FSK0;
								break;	
						case 6: film.fsk = FSK6;
								break;
						case 12: film.fsk = FSK12;
								break;
						case 16: film.fsk = FSK16;
								break;
						case 18: film.fsk = FSK18;
							break;	
						default: System.out.println("Es wurde keine gültige FSK ausgewählt");
						}
						
						switch(film.sprache) {
						case 1: film.sprache = CHINESISCH;
								break;	
						case 2: film.sprache = DEUTSCH;
								break;
						case 3: film.sprache = ENGLISCH;
								break;
						case 4: film.sprache = FRANZÖSISCH;
								break;
						case 5: film.sprache = GRIECHISCH;
								break;	
						case 6: film.sprache = INDISCH;
								break;	
						case 7: film.sprache = ITALIENISCH;
								break;
						case 8: film.sprache = JAPANISCH;
								break;
						case 9: film.sprache = NIEDERLÄNDISCH;
								break;
						case 10: film.sprache = POLNISCH;
								break;	
						case 11: film.sprache = RUSSISCH;
								break;	
						case 12: film.sprache = SPANISCH;
								break;
						case 13: film.sprache = TÜRKISCH;
								break;
						case 14: film.sprache = VIETNAMESISCH;
								break;
						
						default: System.out.println("Es wurde keine gültige Sprache ausgewählt");
						}
						
					}
			
					zaehler_filme++;
					alleWaren.add(neuerFilm);
					
			}else {
					System.out.println(
							String.format(
									"Die Anzahl (30) verschiedeneser Medien-Artikelarten wurde überschritten! Der Medien-Artikel %s konnte nicht hinzugefügt werden", 
									film.name));
			}
		}
		
		/**
		 * Abstrakte Methode der Klasse Ware, welche dazu verwendet wird für ein Film-Objekt eine Nachbestellung zu tätigen.
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
			int untergruppe = this.unterGruppe;
			boolean isDigital = this.isDigital;
			int genre = this.genre;
			int erscheinungsjahr = this.erscheinungsjahr;
			double dauer = this.dauer;
			int fsk = this.fsk;
			int sprache = this.sprache;

			
			boolean nachbestellung = false;
			
			for (int i = 0; i < alleWaren.size(); i++) {
				
				if(alleWaren.get(i).get(0).getKennung() == FILME && alleWaren.get(i).get(0).name.equals(name)) {
					
					int aktuellLagermenge = alleWaren.get(i).size();
					int neueLegermenge = aktuellLagermenge + menge;
					int diffMenge = 0;
				
					//Prüfung ob Lagermene einer Ware gleich der Lagergroeße ist
					if (alleWaren.get(i).size() == MAXMENGE) {
						
						System.out.println(
								String.format(
										"Der Filmartikel %s hat bereits die maximale Lagerkapazität, daher wird keine Nachbestellung durchgeführt!", 
										this.name));
						
						nachbestellung = false;
						
					}
					//Prüfung b die zu bestellende Megen mit der Lagermenge gößer ist als die Lagerroeße
					else if(neueLegermenge > MAXMENGE) {
						
						diffMenge = MAXMENGE - aktuellLagermenge;
						
						Filme film = new Filme(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr, dauer, fsk, sprache);
								
						for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
									
							alleWaren.get(i).add(film);
							film.setKennung(FILME);
									
						}
								
						System.out.println(
								String.format(
										"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
										diffMenge));
								
						nachbestellung = true;	
					}
					//Nachbestellung der Ware
					else {
						
						Filme film = new Filme(name, preis, LocalDate.now(), 0, beschreibung, untergruppe, isDigital, genre, erscheinungsjahr, dauer, fsk, sprache);
						
						for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
							
							alleWaren.get(i).add(film);
							film.setKennung(FILME);
							
						}
						
						System.out.println("Waren wurden nachbestellt! Lager hat nun die Menge " + alleWaren.get(i).size());
						
						nachbestellung = true;
					}
				}
			}
			return nachbestellung;
		}



		/**
		 * Abstrakte Methoden der Klasse Ware, welche zum herausgeben von Filmartikeln verwendet wird.
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
				
				if(alleWaren.get(i).get(0).getKennung() == FILME && alleWaren.get(i).get(0).name.equals(name)) {
					
					int aktuellLagermenge = alleWaren.get(i).size();
					int neueLegermenge = aktuellLagermenge - menge;
					
					
					//Prüfung ob noch genug im Lager ist zum herausgeben
					if(neueLegermenge > 0) {
						
						for(int j = 0; j < menge; j++) {
							
							alleWaren.get(i).remove(j);
						}
								
						System.out.println(
								String.format(
										"Für den Filmeartikel %s wurden %s Einheiten herausgegeben.", 
										this.name,
										menge));
						
						herausgeben = true;
					} 
					//Keine herausgabe der Waren und es werden neue Waren nachbestellt
					else {
						
						System.out.println(
								String.format(
										"Für den Filmartikel %s gibt es nur noch %s Einheiten auf Lager. Die Herausgabe von %s Einheiten konnte nicht erfolgen.\n"
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
		 * Klassenmethode, welche alle Filme-Artikel ausgibt
		 */
		public static void gibFilmeAus() {
			for (int i = 0; i < alleWaren.size(); i++) { 
				if(alleWaren.get(i).get(0).getKennung() == FILME) {
					System.out.println("(" + i + ") " + alleWaren.get(i).get(0).name + " Anzahl im Lager: " + alleWaren.get(i).size());
				}
			}
		}

		/**
		 * toString Methode der Klasse Filme um eine Ausgabe
		 * zu den Filmen zu tätigen
		 */
		@Override
		public String toString() {
		return "neuer Film Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
		" anzahl= " + anzahl +  " beschreibung= " + beschreibung + " unterGruppe = "+ unterGruppe + 
		" isDigital= " + isDigital + " genre= " + genre + " erscheinungsjahr= " + erscheinungsjahr + 
		" dauer= " + dauer + " FSK= " + fsk + " sprache= " + sprache + "]";
		}
}	