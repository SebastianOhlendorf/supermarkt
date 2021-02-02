package waren;

import java.time.LocalDate;
import supermarkt.SupermarktExceptions;

/**
 * Kinderklasse der Klasse Lebensmittel zum anlegen von Backwaren-Objekten
 * @author SebastianOhlendorf
 *
 */
public class Backwaren extends Lebensmittel{

	public Backwaren(String name, double preis, int anzahl, LocalDate seitWannImBestand, double gewicht, int haltbarkeit, boolean bedarfKuehlung) throws SupermarktExceptions {
		super(name, preis, anzahl, seitWannImBestand, gewicht, haltbarkeit, bedarfKuehlung);
		// TODO Auto-generated constructor stub
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
	
	public boolean backeWare() {
		return bedarfKuehlung;
	}
	
	public static void gebeBackwarenAus() {
		
	}
	
	
}
