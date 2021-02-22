package test;

import java.time.LocalDate;

import hilfsklassen.FindeObjekt;
import waren.Lebensmittel;

public class FindeObjektTest {

	public static void main(String[] args) {
		
		Lebensmittel objekt;
		
		Lebensmittel lebensmittel = new Lebensmittel("Tee", 2.98, LocalDate.now(), 0.5, 25, false);
		Lebensmittel.addLebensmittel(new Lebensmittel("Kekse", 2.98, LocalDate.now(), 0.5, 0, false));
		Lebensmittel.addLebensmittel(new Lebensmittel("Käse", 2.98, LocalDate.now(), 0.5, 2, false));
		Lebensmittel.addLebensmittel(lebensmittel);
		
		
		objekt = FindeObjekt.ermittelLebensmittelObjekt();
		
		objekt.herausgeben(25);
		objekt.toString();
		objekt.nachbestellen(15);
		objekt.toString();

	}

}
