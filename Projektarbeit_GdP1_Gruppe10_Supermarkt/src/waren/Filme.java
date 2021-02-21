package waren;
import java.time.LocalDate;
import java.util.ArrayList;

import enums.Filmgenre;
import enums.Fsk;
import enums.Kennungen;
import enums.Sprachen;
import enums.Untergruppen;

/**
 * Kinderklasse der Klasse Medien zum anlegen von Film-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 18.02.2021
 *
 */
public class Filme extends Medien {

	
		//Objektattribute speziell für die Klasse Filme
		protected double dauer;
		protected Fsk fsk;
		protected Sprachen sprache;
		
		//Klassenattribute
		private static int zaehler_filme = 0;		
		
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
		public Filme(String name, double preis, LocalDate seitWannImBestand, String beschreibung,
				Untergruppen unterGruppe, boolean isDigital, Filmgenre genre, int erscheinungsjahr, double dauer, Fsk fsk, Sprachen sprache) {
			super(name, preis, seitWannImBestand, beschreibung, unterGruppe, isDigital, genre, erscheinungsjahr);
			
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
		 */
		public static void addFilm(Filme film){
			
			ArrayList<Ware> neuerFilm = new ArrayList<Ware>();
			
			if(zaehler_filme < MAXANZAHLWAREN) {
				
					for(int i = 0; i < MAXMENGE; i++) {
				
						neuerFilm.add(film);
						film.seitWannImBestand = LocalDate.now();
						film.setKennung(Kennungen.FILME);
						film.unterGruppe = Untergruppen.FILME;
									
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
			Untergruppen untergruppe = this.unterGruppe;
			boolean isDigital = this.isDigital;
			Filmgenre genre = this.genre;
			int erscheinungsjahr = this.erscheinungsjahr;
			double dauer = this.dauer;
			Fsk fsk = this.fsk;
			Sprachen sprache = this.sprache;

			
			boolean nachbestellung = false;
			
			for (int i = 0; i < alleWaren.size(); i++) {
				
				if(alleWaren.get(i).get(0).getKennung() == Kennungen.FILME && alleWaren.get(i).get(0).name.equals(name)) {
					
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
						
						Filme film = new Filme(name, preis, LocalDate.now(), beschreibung, untergruppe, isDigital, genre, erscheinungsjahr, dauer, fsk, sprache);
								
						for(int j = aktuellLagermenge; j < MAXMENGE; j++) {
									
							alleWaren.get(i).add(film);
							film.setKennung(Kennungen.FILME);
									
						}
								
						System.out.println(
								String.format(
										"Es wurden daher %s Einheiten nachbestellt um die maximale Lagerkapazität (100) zu erreichen.", 
										diffMenge));
								
						nachbestellung = true;	
					}
					//Nachbestellung der Ware
					else {
						
						Filme film = new Filme(name, preis, LocalDate.now(), beschreibung, untergruppe, isDigital, genre, erscheinungsjahr, dauer, fsk, sprache);
						
						for(int j = aktuellLagermenge + 1; j <= neueLegermenge; j++) {
							
							alleWaren.get(i).add(film);
							film.setKennung(Kennungen.FILME);
							
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
				
				if(alleWaren.get(i).get(0).getKennung() == Kennungen.FILME && alleWaren.get(i).get(0).name.equals(name)) {
					
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
				if(alleWaren.get(i).get(0).getKennung() == Kennungen.FILME) {
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
		return "neuer Film Artikel [ name= "+ this.name + " preis= "+ this.preis + " seitWannImBestand= " + this.seitWannImBestand +  
		" anzahl= " + this.anzahl +  " beschreibung= " + this.beschreibung + " unterGruppe = "+ this.unterGruppe + 
		" isDigital= " + this.isDigital + " genre= " + this.genre + " erscheinungsjahr= " + this.erscheinungsjahr + 
		" dauer= " + this.dauer + " FSK= " + this.fsk + " sprache= " + this.sprache + "]";
		}
}	