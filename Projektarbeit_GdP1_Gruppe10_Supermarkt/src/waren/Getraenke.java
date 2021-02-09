package waren;

import java.time.LocalDate;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Getr�nke-Objekten
 * @author Lennart Sparbier
 * @version 1.0
 * @date 09.02.2021
 *
 */
public class Getraenke extends Ware {

	protected double alcProzente;
	
	
	/**
	 * 
	 * @param name
	 * @param preis
	 * @param seitWannImBestand
	 * @param anzahl
	 */
	public Getraenke(String name, double preis, LocalDate seitWannImBestand, int anzahl, 
			boolean obImBestand, int alcProzente)  {
		super(name, preis, anzahl, seitWannImBestand);
		// TODO Auto-generated constructor stub
		
		this.alcProzente = alcProzente;
		
		// Pr�fung ob bei Anlegung Getr�nk bereits 30 verschiedene Getr�nke vorhanden sind
		int anzahlGetraenke = 0;
		this.anzahl = 0;
		
		if(anzahlGetraenke <=30) {
			
			this.anzahl = 100;
			this.seitWannImBestand = LocalDate.now();
		} else {
			System.out.println("Es sind bereits 30 Getr�nke im System vermerkt. Es ist nicht m�glich weitere Getr�nke anzulegen.");
		}
		
		
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
	
	public boolean istAlkoholhaltig(boolean alkoholhaltig) {
		
		if ( this.alcProzente > 0) {
			alkoholhaltig = true;
		} else {
			System.out.println("Diese Getr�nk enth�lt keinen Alkohol");
		}
		
		return alkoholhaltig;
	}
	
	public static void gebeGetraenkeAus() {
		
	}
	
	public static void gebeNonAlkGetraenkeAus() {
		
	}

}
