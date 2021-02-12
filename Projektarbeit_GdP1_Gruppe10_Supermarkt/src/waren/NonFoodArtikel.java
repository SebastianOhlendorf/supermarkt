package waren;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Kinderklasse von Ware um Non-Food Artikel Objekte erstellen zu können
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
			String obImBestand, String beschreibung, String unterGruppe)  {
			super(name, preis, anzahl, seitWannImBestand, obImBestand);
			
		this.beschreibung = beschreibung;
		this.unterGruppe = unterGruppe;
		
		// TODO Auto-generated constructor stub
		
		
		
		
		// Prüfung ob bei Anlegung Getränk bereits 30 verschiedene Getränke vorhanden sind
		int nonFoodArtikelInsgesamt = 0;
		this.anzahl = 0;
		
		
		String [] nonFoodArray;
		nonFoodArray = new String [30];
		
		if(nonFoodArtikelInsgesamt <30) {
			
		for (int i = 0; i < nonFoodArray.length -1; i++) {
			
			nonFoodArray[i] = this.name;
	
			nonFoodArray[i] = String.valueOf(this.preis);
			
			
			nonFoodArray[i] = this.beschreibung;
			
			nonFoodArray[i] = this.unterGruppe;
			
			this.anzahl = 100;
			this.seitWannImBestand = LocalDate.now();
			//this.ObImBestand = true;
			

			
			nonFoodArtikelInsgesamt ++;
			
		} 
		
		} else {
			System.out.println("Es wurden bereits 30 Non Food Artikel erstellt");
			
			
		}
		
		// Besprechen: Müsste mit in Ware als Vererbung	obImBestand = true;!!
		//this.obImBestand = true; ( Benötigen im Hauptprogramm if abfrage 
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
		
		return "neuer NonFood Artikel [ name= "+ name + " preis= "+ preis + " seitWannImBestand= " + seitWannImBestand +  
				" anzahl= " + anzahl + " obImBestand= "+ obImBestand + " beschreibung= " + beschreibung +
				" unterGruppe = "+ unterGruppe + "]";
			
	}
	
	/**
	 * 
	 */
	public static void gebenNFArtikelAus() {
		
	}

}
