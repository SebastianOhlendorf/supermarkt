package supermarkt;
import java.time.LocalDate;
import java.util.Scanner;
public class einAusgabe {

	
	static Scanner in = new Scanner(System.in);
	
	public static int eingabeAuswahl(String eingabeString) {

		System.out.println(eingabeString);
		int auswahl = in.nextInt();
		return auswahl;
	}

    public static String eingabeName(String eingabeString) {

        System.out.println(eingabeString);
        String name = in.next();
        return name;
    }
	
	public static double eingabePreis(String eingabeString) {
		
		System.out.println(eingabeString);
		double preis = in.nextDouble();
		return preis; 
	}
	
	public static LocalDate eingabeSeitWannImBestand (String eingabeString) {
		LocalDate seitWannImBestand = LocalDate.now();
		System.out.println(eingabeString );
		return seitWannImBestand;
	}
	
	public static int eingabeAnzahl (String eingabeString) {
		System.out.println(eingabeString);
		int anzahl = 100;
		return anzahl;
	}
	
	//public static String eingabeObImBestand(String eingabeString, int anzahl) {
		// System.out.println(eingabeString);
		//boolean obImBestand;
		//String obImBestandAntwort;
		//if(anzahl >0) {
		//	obImBestand = true;
		//	obImBestandAntwort = "ist im Bestand";
	//	} else {
	//		obImBestand = false;
	//		obImBestandAntwort = "ist derzeit nicht im Bestand";
	//	}
	//	return obImBestandAntwort;
		
	//}
	
	// Ab nun an nicht mehr allgemeine Variablen. In dem Fall f�r Non Food Artikel
	
	
	
	//explizite Eingabe f�r NonFood Artikel
	public static String eingabeBeschreibung (String eingabeString) {
		 System.out.println(eingabeString);
		String beschreibung = in.next();
		return beschreibung;
	}
	
	public static String eingabeUnterGruppe (String eingabeString) {
		 System.out.println(eingabeString);
		String unterGruppe = in.next();
		return unterGruppe;
	}

	
	//explizite Eingaben f�r Lebensmittel
	
	public static Double eingabeGewicht (String eingabeString) {
		 System.out.println(eingabeString);
		double gewicht = in.nextDouble();
		return gewicht;
	}
	
	public static int eingabeHaltbarkeit (String eingabeString) {
		boolean gr��erNull;
		System.out.println(eingabeString);
		int haltbarkeit = in.nextInt();
		
		if (haltbarkeit <=0) {
			gr��erNull = false;
			System.out.println("Die Haltbarkeit des Produkts darf nicht unter 0 Tagen liegen ");
		} else {
			gr��erNull = true;
			
		}
		return haltbarkeit;
	}
	
	//public static eingabeBedarfK�hlung (String eingabeString) {
	//	System.out.println(eingabeString);
		
	//}
	
	//explizite Eingaben f�r Getr�nke
	
	public static Double eingabeAlkoholGehalt (String eingabeString) {
		System.out.println(eingabeString);
		double alkoholGehalt = in.nextDouble();
		return alkoholGehalt;
	}
	
	
	//explizite Eingaben f�r Backwaren
	
	public static Boolean �berpr�fungAufgebacken (String eingabeString) {
		System.out.println(eingabeString);
		boolean istAufgebacken = true;
		if(istAufgebacken == false) {
			System.out.println("Das Produkt ist nicht aufgebacken");
		}
		return istAufgebacken;
	}
	
	public static void schliesseScanner() {
		in.close();
	}
	
	
	
	// explizite Eingaben f�r Medien
	
	
	
	
	
	
	

	
}
