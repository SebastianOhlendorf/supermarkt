package test;

import java.time.LocalDate;
import java.util.Scanner;

import supermarkt.SupermarktExceptions;
import waren.Backwaren;
import waren.Lebensmittel;
import waren.Ware;

public class LebensmittelTest {

	public static void main(String[] args) throws SupermarktExceptions {

			System.out.println("Was möchten sie tun?\n"
					+ "(0) Neues Lebensmittel\n"
					+ "(1) nachbestellen\n"
					+ "(2) ausgeben\n"
					+ "(3) haltbarBis\n"
					+ "(4) istHalbar\n"
					+ "(5) kurzesMHD\n"
					+ "(6) liste\n"
					+ "(7) beenden\n");
			
					Lebensmittel lebensmittel = new Lebensmittel("Kekse_" + 0, 2.98, 5, LocalDate.now(), 0.5, 25, false);
					Lebensmittel.addLebensmittel(lebensmittel);
					lebensmittel.nachbestellen(5);
					lebensmittel.herausgeben(5);
					lebensmittel.nachbestellen(200);
					lebensmittel.herausgeben(200);
					lebensmittel.haltbarBis();
					lebensmittel.istHaltbar();
					lebensmittel.kurzesMHD();
					Lebensmittel lebensmittel1 = new Lebensmittel("Kekse_" + 1, 2.98, 5, LocalDate.now(), 0.5, 25, false);
					Lebensmittel.addLebensmittel(lebensmittel1);
					Lebensmittel lebensmittel2 = new Lebensmittel("Kekse_" + 2, 2.98, 5, LocalDate.now(), 0.5, 25, false);
					Lebensmittel.addLebensmittel(lebensmittel2);
					Backwaren lebensmittel3 = new Backwaren("Kekse_" + 3, 2.98, 5, LocalDate.now(), 0.5, 25, false);
					Backwaren.addBackwaren(lebensmittel3);
					Lebensmittel.gebeLebensmittelAus();
					lebensmittel3.backeWare();			
					Backwaren.gebeBackwareAus();
									
					for(int i = 0; i < 40; i++) {
						Lebensmittel lebensmittel5 = new Lebensmittel("Käse_" + i, 2.98, 5, LocalDate.now(), 0.5, 25, false);
						Lebensmittel.addLebensmittel(lebensmittel5);
						
					}	
					Lebensmittel.gebeLebensmittelAus();

					for(int i = 0; i < 40; i++) {
						Backwaren lebensmittel4 = new Backwaren("Kuchen_" + i, 2.98, 5, LocalDate.now(), 0.5, 25, false);
						Backwaren.addBackwaren(lebensmittel4);
						
					}
					Backwaren.gebeBackwareAus();
					
					
	}
}
