package supermarkt;
import java.time.LocalDate;
import java.util.Scanner;
public class einAusgabe {

	
	static Scanner in = new Scanner(System.in);
	
	
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
	
	// Ab nun an nicht mehr allgemeine Variablen. In dem Fall für Non Food Artikel
	
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

	
	public static void schliesseScanner() {
		in.close();
	}
	
	
	
	
	
	
	
	
	

	
}
