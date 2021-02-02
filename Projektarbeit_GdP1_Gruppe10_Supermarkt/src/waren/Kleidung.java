package waren;

import java.time.LocalDate;

/**
 * Kinderklasse der Klasse NonFoodArtikel zum anlegen von Kleidung-Objekten
 * @author 
 * @version
 * @date
 *
 */
public class Kleidung  extends NonFoodArtikel {

	public Kleidung(String name, double preis, int anzahl, LocalDate seitWannImBestand) {
		super(name, preis, anzahl, seitWannImBestand);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return null;
	}

}
