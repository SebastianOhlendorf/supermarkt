package waren;

import java.time.LocalDate;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Getränke-Objekten
 * @author 
 * @version
 * @date
 *
 */
public class Getraenke extends Ware {

	/**
	 * 
	 * @param name
	 * @param preis
	 * @param seitWannImBestand
	 * @param anzahl
	 */
	public Getraenke(String name, double preis, LocalDate seitWannImBestand, int anzahl) {
		super(name, preis, anzahl, seitWannImBestand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean nachbestellen(int menge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean herausgeben(int menge) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return null;
	}
	
	public boolean istAlkoholhaltig() {
		return false;
	}
	
	public static void gebeGetraenkeAus() {
		
	}
	
	public static void gebeNonAlkGetraenkeAus() {
		
	}

}
