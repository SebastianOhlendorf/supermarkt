package hilfsklassen;
import java.util.Scanner;

import enums.Allergene;
import enums.Filmgenre;
import enums.Fsk;
import enums.Genre;
import enums.Jahreszeit;
import enums.Kennungen;
import enums.Koerperteile;
import enums.Nutzung;
import enums.Sprachen;
import enums.Stofftypen;
import enums.Untergruppen;

/**
 * Hilfsklasse welche dazu dient verschiedenste Eingabemöglichkeiten die im Programm verwendet werden zu sammeln
 * @author Sebastian Ohlendorf
 * @version 1.0
 * @date 22.02.2021
 *
 */
public class Eingaben {

	/** Scanner initialisiert. */
	private static Scanner in = new Scanner(System.in).useDelimiter(System.lineSeparator());
	
	
	/**
	 * Methode zum schließen des Scanners
	 */
    public static void scannerSchliessen() {
    	in.close();
    }
    
	
	/**
	 * Klassenmethode um einen Text zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe tätigen
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return text String aus der Eingabe
	 */
    public static String eingabeString(String eingabeString) {
    	
        System.out.println(eingabeString);
        String text = in.next();
        return text;
    }
    
	
	/**
	 * Klassenmethode um einen Kommazahl zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe tätigen
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return kommazahl Double aus der Eingabe
	 */
	public static double eingabeDouble(String eingabeString) {
		
		System.out.println(eingabeString);
		double kommazahl = in.nextDouble();
		return kommazahl; 
	}
	
	/**
	 * Klassenmethode um einen Ganzzahl zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe tätigen
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return ganzzahl Integer aus der Eingabe
	 */
	public static int eingabeInteger(String eingabeString) {

		System.out.println(eingabeString);
		int ganzzahl = in.nextInt();
		return ganzzahl;
	}
	
	/**
	 * Klassenmethode um einen Boolean zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe tätigen
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return isWahr True oder False aus der Eingabe
	 */
	public static boolean eingabeBoolean(String eingabeString) {
		
		System.out.println(eingabeString);
		boolean isWahr = in.nextBoolean();
		return isWahr;
	}
	
	/**
	 * Klassenmethode um die Untergruppe zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe die gewünschte Untergruppe aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return untergruppe Die ausgewählte Untergruppe aus dem Enum
	 */
	public static Untergruppen eingabeUntergruppe (String eingabeString) {
		
		Untergruppen untergruppe = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Keine\n"
				+ "(1) Kleidung\n"
				+ "(2) Medien\n"
				+ "(3) DrogerieArtikel\n"
				+ "(4) Filme");
		
		int untergruppeID = in.nextInt();

		switch(untergruppeID) {
		
		case 0: untergruppe = Untergruppen.KEINE;
				break;
		case 1: untergruppe = Untergruppen.KLEIDUNG;
				break;
		case 2: untergruppe = Untergruppen.MEDIEN;
				break;
		case 3: untergruppe = Untergruppen.DROGERIEARTIKEL;
				break;
		case 4: untergruppe = Untergruppen.FILME;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeUntergruppe("Bitte geben Sie die Untergruppe des Artikels als Zahl an:");
		}
		
		return untergruppe;
	}
	
	/**
	 * Klassenmethode um die Jahreszeit zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe die gewünschte Jahreszeit aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return jahreszeit Die ausgewählte Jahreszeit aus dem Enum
	 */
	public static Jahreszeit eingabeJahreszeit (String eingabeString) {
		
		Jahreszeit jahreszeit = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Winter\n"
				+ "(1) Frühling\n"
				+ "(2) Sommer\n"
				+ "(3) Herbst\n");
		
		int jahreszeitID = in.nextInt();
		
		switch(jahreszeitID) {
		
		case 0: jahreszeit = Jahreszeit.WINTER;
				break;
		case 1: jahreszeit = Jahreszeit.FRUEHLING;
				break;
		case 2: jahreszeit = Jahreszeit.SOMMER;
				break;
		case 3: jahreszeit = Jahreszeit.HERBST;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeJahreszeit("Bitte geben Sie die Jahreszeit des Artikels als Zahl an:");
		}
		
		return jahreszeit;
	}
	
	/**
	 * Klassenmethode um den Körperteil zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe der gewünschte Körperteil aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return koerperteil Der ausgewählte Körperteil aus dem Enum
	 */
	public static Koerperteile eingabeKoerperteil (String eingabeString) {
		
		Koerperteile koerperteil = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Kein Körperteil\n"
				+ "(1) Kopf\n"
				+ "(2) Oberkörper\n"
				+ "(3) Arme\n"
				+ "(4) Hände\n"
				+ "(5) Beine\n"
				+ "(6) Füsse\n");
		
		int koerperteileID = in.nextInt();

		switch(koerperteileID) {
		
		case 0: koerperteil = Koerperteile.KEINE;
				break;
		case 1: koerperteil = Koerperteile.KOPF;
				break;
		case 2: koerperteil = Koerperteile.OBERKOERPER;
				break;
		case 3: koerperteil = Koerperteile.ARME;
				break;
		case 4: koerperteil = Koerperteile.HAENDE;
				break;
		case 5: koerperteil = Koerperteile.BEINE;
				break;
		case 6: koerperteil = Koerperteile.FUESSE;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeKoerperteil("Bitte geben Sie den Körperteil des Artikels als Zahl an:");
		}
		
		return koerperteil;
	}
	
	/**
	 * Klassenmethode um den Stofftyp zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe des gewünschten Stofftyps aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return stofftyp Der ausgewählte Stofftyp aus dem Enum
	 */
	public static Stofftypen eingabeStofftyp (String eingabeString) {
		
		Stofftypen stofftyp = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Kein Stofftyp\n"
				+ "(1) Baumwolle\n"
				+ "(2) Wolle\n"
				+ "(3) Leine\n"
				+ "(4) Seide\n"
				+ "(5) Chemiefaser\n");
		
		int stofftypID = in.nextInt();
		
		switch(stofftypID) {
		
		case 0: stofftyp = Stofftypen.KEINE;
				break;
		case 1: stofftyp = Stofftypen.BAUMWOLLE;
				break;
		case 2: stofftyp = Stofftypen.WOLLE;
				break;
		case 3: stofftyp = Stofftypen.LEINE;
				break;
		case 4: stofftyp = Stofftypen.SEIDE;
				break;
		case 5: stofftyp = Stofftypen.CHEMIEFASER;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeStofftyp("Bitte geben Sie den Stofftyp des Artikels als Zahl an:");
		}
		
		return stofftyp;
	}
	
	/**
	 * Klassenmethode um die Nutzung des Artikels zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe die gewünschte Nutzung aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return nutzung Die ausgewählte Nutzung aus dem Enum
	 */
	public static Nutzung eingabeNutzung (String eingabeString) {
		
		Nutzung nutzung = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Kein Nutzung\n"
				+ "(1) Heilmittel\n"
				+ "(2) Reinigung\n"
				+ "(3) Wellness\n"
				+ "(4) Körperpflege\n"
				+ "(5) Parfüm\n"
				+ "(6) Öle\n"
				+ "(7) Kosmetik\n"
				+ "(8) Reformprodukt\n"
				+ "(9) Nahrungsmittel\n"
				+ "(10) Sachpflege\n"
				+ "(11) Elektronik\n");
		
		int nutzungID = in.nextInt();
		
		switch(nutzungID) {
		
		case 0: nutzung = Nutzung.KEINE;
				break;
		case 1: nutzung = Nutzung.HEILMITTEL;
				break;
		case 2: nutzung = Nutzung.REINIGUNG;
				break;
		case 3: nutzung = Nutzung.WELLNESS;
				break;
		case 4: nutzung = Nutzung.KOERPERPFLEGE;
				break;
		case 5: nutzung = Nutzung.PARFUEM;
				break;
		case 6: nutzung = Nutzung.OELE;
				break;
		case 7: nutzung = Nutzung.KOSMETIK;
				break;
		case 8: nutzung = Nutzung.REFORMPRODUKTE;
				break;
		case 9: nutzung = Nutzung.NAHRUNGSMITTEL;
				break;
		case 10: nutzung = Nutzung.SACHPFLEGE;
				break;
		case 11: nutzung = Nutzung.ELEKTRONIK;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeNutzung("Bitte geben Sie die Nutzung des Artikels als Zahl an:");
		}
		
		return nutzung;
	}
	
	/**
	 * Klassenmethode um die Allergene zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe die gewünschte Allergen aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return allergene Die ausgewählte Allergen aus dem Enum
	 */
	public static Allergene eingabeAllergene (String eingabeString) {
		
		Allergene allergene = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Kein Allergen\n"
				+ "(1) Eier\n"
				+ "(2) Erdnüsse\n"
				+ "(3) Fisch\n"
				+ "(4) Gluten\n"
				+ "(5) Krebstiere\n"
				+ "(6) Milch\n"
				+ "(7) Soja\n");
		
		int allergeneID = in.nextInt();
		
		switch(allergeneID) {
		
		case 0: allergene = Allergene.KEINE;
				break;
		case 1: allergene = Allergene.EIER;
				break;
		case 2: allergene = Allergene.ERDNUESSE;
				break;
		case 3: allergene = Allergene.FISCH;
				break;
		case 4: allergene = Allergene.GLUTEN;
				break;
		case 5: allergene = Allergene.KREBSTIERE;
				break;
		case 6: allergene = Allergene.MILCH;
				break;
		case 7: allergene = Allergene.SOJA;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeAllergene("Bitte geben Sie das Allergen des Artikels als Zahl an:");
		}
		
		return allergene;
	}
	
	/**
	 * Klassenmethode um die FSK zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe die gewünschte FSK aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return fsk Die ausgewählte FSK aus dem Enum
	 */
	public static Fsk eingabeFsk (String eingabeString) {
		
		Fsk fsk = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) FSK0\n"
				+ "(1) FSK6\n"
				+ "(2) FSK12\n"
				+ "(3) FSK16\n"
				+ "(4) FSK18\n");
		
		int fskID = in.nextInt();
		
		switch(fskID) {
		
		case 0: fsk = Fsk.FSK0;
				break;
		case 1: fsk = Fsk.FSK6;
				break;
		case 2: fsk = Fsk.FSK12;
				break;
		case 3: fsk = Fsk.FSK16;
				break;
		case 4: fsk = Fsk.FSK18;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeFsk("Bitte geben Sie das FSK des Artikels als Zahl an:");
		}
		
		return fsk;
	}
	
	/**
	 * Klassenmethode um das Filmgenre zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe das gewünschte Filmgenre aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return genre Die ausgewählte Filmgenre aus dem Enum
	 */
	public static Filmgenre eingabeFilmgenre (String eingabeString) {
		
		Filmgenre genre = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Kein Genre\n"
				+ "(1) Horror\n"
				+ "(2) Action\n"
				+ "(3) Thriller\n"
				+ "(4) Humor\n"
				+ "(5) Drama\n"
				+ "(6) Krieg\n"
				+ "(7) Liebe\n"
				+ "(8) Western\n");
		
		int genreID = in.nextInt();
		
		switch(genreID) {
		
		case 0: genre = Filmgenre.KEINE;
				break;
		case 1: genre = Filmgenre.HORROR;
				break;
		case 2: genre = Filmgenre.ACTION;
				break;
		case 3: genre = Filmgenre.THRILLER;
				break;
		case 4: genre = Filmgenre.HUMOR;
				break;
		case 5: genre = Filmgenre.DRAMA;
				break;
		case 6: genre = Filmgenre.KRIEG;
				break;
		case 7: genre = Filmgenre.LIEBE;
				break;
		case 8: genre = Filmgenre.WESTERN;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeFilmgenre("Bitte geben Sie das Genre des Artikels als Zahl an:");
		}
		
		return genre;
	}
	
	/**
	 * Klassenmethode um das Genre zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe das gewünschte Genre aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return genre Die ausgewählte Genre aus dem Enum
	 */
	public static Genre eingabeGenre (String eingabeString) {
		
		Genre genre = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Kein Genre\n"
				+ "(1) Bücher\n"
				+ "(2) Computer\n"
				+ "(3) Konsole\n"
				+ "(4) Musik\n"
				+ "(5) Hardware\n"
				+ "(6) Software\n");

		int genreID = in.nextInt();
		
		switch(genreID) {
		
		case 0: genre = Genre.KEINE;
				break;
		case 1: genre = Genre.BUECHER;
				break;
		case 2: genre = Genre.COMPUTER;
				break;
		case 3: genre = Genre.KONSOLE;
				break;
		case 4: genre = Genre.MUSIK;
				break;
		case 5: genre = Genre.HARDWARE;
				break;
		case 6: genre = Genre.SOFTWARE;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeFilmgenre("Bitte geben Sie das Genre des Artikels als Zahl an:");
		}
		
		return genre;
	}
	
	/**
	 * Klassenmethode um die Sprache zu ermitteln
	 * Hierfür muss der Benutzer über eine Eingabe die gewünschte Sprache aus einer Liste auswählen
	 * Wird eine falsche Zahleingegeben, wird der Benutzer informiert und darf die Eingabe wiederholen.
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return sprache Die ausgewählte Sprache aus dem Enum
	 */
	public static Sprachen eingabeSprache (String eingabeString) {
		
		Sprachen sprache = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Chinesisch\n"
				+ "(1) Deutsch\n"
				+ "(2) Englisch\n"
				+ "(3) Französisch\n"
				+ "(4) Griechisch\n"
				+ "(5) Indisch\n"
				+ "(6) Italienisch\n"
				+ "(7) Japanisch\n"
				+ "(8) Niederländisch\n"
				+ "(9) Polnisch\n"
				+ "(10) Russisch\n"
				+ "(11) Spanisch\n"
				+ "(12) Türkisch\n"
				+ "(13) Vietnamesisch\n");
		
		int spracheID = in.nextInt();
		
		switch(spracheID) {
		
		case 0: sprache = Sprachen.CHINESISCH;
				break;
		case 1: sprache = Sprachen.DEUTSCH;
				break;
		case 2: sprache = Sprachen.ENGLISCH;
				break;
		case 3: sprache = Sprachen.FRANZÖSISCH;
				break;
		case 4: sprache = Sprachen.GRIECHISCH;
				break;
		case 5: sprache = Sprachen.INDISCH;
				break;
		case 6: sprache = Sprachen.ITALIENISCH;
				break;
		case 7: sprache = Sprachen.JAPANISCH;
				break;
		case 8: sprache = Sprachen.NIEDERLÄNDISCH;
				break;
		case 9: sprache = Sprachen.POLNISCH;
				break;
		case 10: sprache = Sprachen.RUSSISCH;
				break;
		case 11: sprache = Sprachen.SPANISCH;
				break;
		case 12: sprache = Sprachen.TÜRKISCH;
				break;
		case 13: sprache = Sprachen.VIETNAMESISCH;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeSprache("Bitte geben Sie das Genre des Artikels als Zahl an:");
		}
		
		return sprache;
	}
	
	/**
	 * Klassenmethode zur Auswahl des Warentyps
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return warentyp Der ausgewählte Warentyp als Kennung
	 */
	public static Kennungen eingabeWarentyp(String eingabeString) {
		
		Kennungen warentyp = null;
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Lebensmittel\n"
				+ "(1) Backwaren\n"
				+ "(2) Getränke\n"
				+ "(3) NonFood-Artikel\n"
				+ "(4) Medien\n"
				+ "(5) Kleidung\n"
				+ "(6) Drogerie-Artikel\n"
				+ "(7) Filme\n"
				+ "(8) Ende\n");
		
		int auswahlWarentyp = in.nextInt();
		
		switch(auswahlWarentyp) {
		
		case 0: warentyp = Kennungen.LEBENSMITTEL;
				break;
		case 1: warentyp = Kennungen.BACKWAREN;
				break;
		case 2: warentyp = Kennungen.GETRAENKE;
				break;
		case 3: warentyp = Kennungen.NONFOODARTIKEL;
				break;
		case 4: warentyp = Kennungen.MEDIEN;
				break;
		case 5: warentyp = Kennungen.KLEIDUNG;
				break;
		case 6: warentyp = Kennungen.DROGERIEARTIKEL;
				break;
		case 7: warentyp = Kennungen.FILME;
				break;
		case 8: warentyp = Kennungen.ENDE;
				break;
		default: System.out.println("Es wurde kein gültiger Wert übergeben. Probieren Sie es erneut");
				Eingaben.eingabeWarentyp("Bitte geben Sie das Genre des Artikels als Zahl an:");
		}
	
		return warentyp;	
	}
	
	/**
	 * Klassenmethode zur Steuerung des Hauptmenüs der Supermarkt Main
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlHauptmenu(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Alle Waren im Lager ansehen\n"
				+ "(1) Neue Waren anlegen\n"
				+ "(2) Ware nachbestellen\n"
				+ "(3) Ware herausgeben\n"
				+ "(4) Weitere Funktionen zu den Waren\n"
				+ "(5) Programm beenden\n");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von Lebensmittel
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenLebensmittel(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Prüfung bis wann ein Lebensmittel haltbar ist\n"
				+ "(1) Prüfung ob ein Lebensmittel noch haltbar ist\n"
				+ "(2) Prüfung Lebensmittel mit kurzen MHD\n"
				+ "(3) Alle Lbensmittel ausgeben\n"
				+ "(4) zürück ins Untermenü\n");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von Backwaren
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenBackwaren(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Backwaren aufbacken\n"
				+ "(1) Alle Backwaren ausgeben\n"
				+ "(2) zürück ins Untermenü\n");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von Getränke
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenGetraenke(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Prüfung ob ein Getränk alkohoolisch ist\n"
				+ "(1) Alle Getränke ausgeben\n"
				+ "(2) Alle Non-Alkoholischen Getränke ausgeben\n"
				+ "(3) zürück ins Untermenü\n");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von NonFood
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenNonFood(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Alle NonFood-Artikel ausgeben\n"
				+ "(1) zürück ins Untermenü\n");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von Medien
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenMedien(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Alle Digitalen Medien ausgeben\n"
				+ "(1) Alle Analogen Medien ausgeben\n"
				+ "(2) Welche Medien haben ein bestimmtes Genre\n"
				+ "(3) Alle Medien ausgeben\n"
				+ "(4) zürück ins Untermenü");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von Kleidung
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenKleidung(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Ausgabe Kleidung nach Jahreszeit\n"
				+ "(1) Ausgabe Kleidung nach Stofftyp\n"
				+ "(2) Alle Kleidungen ausgeben\n"
				+ "(3) zürück ins Untermenü");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von Drogerie Artikeln
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenDrogerie(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Ausgabe Drogerie Artikel nach Bestnote\n"
				+ "(1) Ausgabe Drogerie Artikel nach bestimmten Allergenen\n"
				+ "(2) Alle Drogerie Artikel ausgeben\n"
				+ "(3) zürück ins Untermenü");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
	
	/**
	 * Klassenmethode zur Steuerung des Untermenüs für die Funktionen von Filme
	 * 
	 * @param eingabeString Aufforderungstext als String
	 * @return auswahl Der ausgewählte Warentyp als Integer
	 */
	public static int eingabeAuswahlFunktionenFilme(String eingabeString) {
		
		System.out.println(eingabeString);
		System.out.println("Bitte wählen sie eine der Optionen und tragen die gewünschte Zahl in die Kommandozeile ein:");
		System.out.println("(0) Alle Filme ausgeben\n"
				+ "(1) zürück ins Untermenü");
		
		int auswahl = in.nextInt();
		
		return auswahl;
	}
}
