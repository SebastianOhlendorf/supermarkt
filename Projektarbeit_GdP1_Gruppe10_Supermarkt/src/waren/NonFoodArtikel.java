package waren;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Kinderklasse von Ware um Non-Food Artikel Objekte erstellen zu k�nnen
 * @author 
 * @version
 * @date
 *
 */
public class NonFoodArtikel extends Ware{
	
	
	protected double alcProzente;
	protected String beschreibung;
	protected String unterGruppe;
	/**
	 * Konstruktor der Klasse NonFoodArtikel um ein neues NonFoodArtikel-Objekt zu erzeugen.
	 * @author Sebastian Ohlendorf / 01.02.2020
	 * @param name Die Bezeichnung des Non-Food-Artikels oder des Produkts als String
	 * @param preis Der Preis der Ware als Double
	 * @param anzahl Stellt die Menge einer Ware als Integer dar
	 * @param seitWannImBestand Gibt das Datum an seit wann der Die Ware im Bestand ist
	 * 
	 */
	public NonFoodArtikel(String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			boolean obImBestand, String beschreibung, String unterGruppe)  {
			super(name, preis, anzahl, seitWannImBestand);
			
		this.beschreibung = beschreibung;
		this.unterGruppe = unterGruppe;
		
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		
		
		
		// Pr�fung ob bei Anlegung Getr�nk bereits 30 verschiedene Getr�nke vorhanden sind
		int nonFoodArtikelInsgesamt = 0;
		this.anzahl = 0;
		
		
		String [] nonFoodArray;
		nonFoodArray = new String [30];
		
		if(nonFoodArtikelInsgesamt <=30) {
			
		for (int i = 0; i <= nonFoodArray.length; i++) {
			
			System.out.println("Bitte geben Sie einen Namen f�r den Non Food Artikel ein ");
			getraenkeArray[i] = in.next();
			
			System.out.println("Bitte geben Sie einen Preis f�r den Non Food Artikel ein");
			getraenkeArray[i] = in.nextDouble();
			
			System.out.println("Bitte geben Sie eine genaue Beschreibung f�r den Non Food Artikel an");
			
			System.out.println("Bitte geben Sie eine Untergruppe f�r den Non Food Artikeln an");
			
			this.anzahl = 100;
			this.seitWannImBestand = LocalDate.now();
			//this.ObImBestand = true;
			

			i++;
			nonFoodArtikelInsgesamt ++;
			
		} 
		
		} else {
			System.out.println("Es wurden bereits 30 Non Food Artikel erstellt");
			
			in.close();
		}
		
		// Besprechen: M�sste mit in Ware als Vererbung	obImBestand = true;!!
		//this.obImBestand = true; ( Ben�tigen im Hauptprogramm if abfrage 
		// if this.anzahl = 0  this.obImBestand= false)
		
		// Die Ware soll ins Lager gepackt werden Klasse Lager
			
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
