package test;

import java.time.LocalDate;
import waren.Getraenke;

/**
 * Testklasse für die Klassen Getränke.
 * Hier werden alle Funktionalitäten der Klasse ausgetestet 
 */
public class GetraenkeTest {

	public static void main(String[] args){


		Getraenke lebensmittel = new Getraenke("Bier_" + 0, 2.98, LocalDate.now(), 5.31);
		Getraenke.addGetraenke(lebensmittel);
		lebensmittel.nachbestellen(5);
		lebensmittel.herausgeben(5);
		lebensmittel.nachbestellen(200);
		lebensmittel.herausgeben(200);
		lebensmittel.istAlkoholhaltig();
		Getraenke lebensmittel2 = new Getraenke("Cola_" + 0, 2.98, LocalDate.now(), 0.00);
		Getraenke.addGetraenke(lebensmittel2);
						
		for(int i = 0; i < 40; i++) {
			Getraenke lebensmittel5 = new Getraenke("Fanta_" + i, 2.98, LocalDate.now(), 0.00);
			Getraenke.addGetraenke(lebensmittel5);
			
		}
		
		lebensmittel2.istAlkoholhaltig();
		System.out.println("Alle Getränke");
		Getraenke.gebeGetraenkeAus();
		System.out.println("NonAlkohol Getränke");
		Getraenke.gebeNonAlkGetraenkeAus();
 

	}

}
