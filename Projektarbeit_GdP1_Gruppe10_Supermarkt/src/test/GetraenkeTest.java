package test;

import java.time.LocalDate;

import supermarkt.SupermarktExceptions;
import waren.Getraenke;

public class GetraenkeTest {

	public static void main(String[] args) throws SupermarktExceptions {


		Getraenke lebensmittel = new Getraenke("Cola_" + 0, 2.98, 5, LocalDate.now(), 5.31);
		Getraenke.addGetraenke(lebensmittel);
		lebensmittel.nachbestellen(5);
		lebensmittel.herausgeben(5);
		lebensmittel.nachbestellen(200);
		lebensmittel.herausgeben(200);
		lebensmittel.istAlkoholhaltig();
						
		for(int i = 0; i < 40; i++) {
			Getraenke lebensmittel5 = new Getraenke("Fanta_" + i, 2.98, 5, LocalDate.now(), 0.00);
			Getraenke.addGetraenke(lebensmittel5);
			
		}
		System.out.println("Alle Getränke");
		Getraenke.gebeGetraenkeAus();
		System.out.println("NonAlkohol");
		Getraenke.gebeNonAlkGetraenkeAus();


	}

}
