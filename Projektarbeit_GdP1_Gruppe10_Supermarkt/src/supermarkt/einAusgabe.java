package supermarkt;
import java.time.LocalDate;
import java.util.Scanner;
public class einAusgabe {

	
	//static Scanner in = new Scanner(System.in);
	
	public static int auswahl() {

		static Scanner in = new Scanner(System.in);

		System.out.println("auswahl");
		int auswahl = in.nextInt();
		return auswahl;

		in.close();
	}
    public static String eingabeName(String eingabeString) {

		static Scanner in = new Scanner(System.in);

        System.out.println(eingabeString);
        String name = in.next();
        return name;

		in.close();
    }
	
	public static double eingabePreis(String eingabeString) {

		static Scanner in = new Scanner(System.in);

		System.out.println(eingabeString);
		double preis = in.nextDouble();
		return preis;

		in.close();
	}
	
	public static LocalDate eingabeSeitWannImBestand (String eingabeString) {
		
		static Scanner in = new Scanner(System.in);
		
		LocalDate seitWannImBestand = LocalDate.now();
		System.out.println(eingabeString );
		return seitWannImBestand;

		in.close();
	}
	
	public static int eingabeAnzahl (String eingabeString) {

		static Scanner in = new Scanner(System.in);

		 System.out.println(eingabeString);
		int anzahl = 100;
		return anzahl;

		in.close();
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
	
	public static String eingabeBeschreibung (String eingabeString) {
	
		static Scanner in = new Scanner(System.in);

		 System.out.println(eingabeString);
		String beschreibung = in.next();
		return beschreibung;

		in.close();
	}
	
	public static String eingabeUnterGruppe (String eingabeString) {

		static Scanner in = new Scanner(System.in);

		 System.out.println(eingabeString);
		String unterGruppe = in.next();
		return unterGruppe;

		in.close();
	}

	
	public static void schliesseScanner() {
		in.close();
	}
	
	
	
	
	
	
	
	
	

	
}
