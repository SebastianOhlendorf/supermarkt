package waren;

import java.time.LocalDate;

/**
 * Kinderklasse von Ware um Non-Food Artikel Objekte erstellen zu können
 * @author 
 * @version
 * @date
 *
 */
public class NonFoodArtikel extends Ware{
	
	/**
	 * Konstruktor der Klasse NonFoodArtikel um ein neues NonFoodArtikel-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 01.02.2020
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * 
	 */
	public NonFoodArtikel(String name, double preis, int anzahl, LocalDate seitWannImBestand) {
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
	
	/**
	 * 
	 */
	public static void gebenNFArtikelAus() {
		
	}

}
