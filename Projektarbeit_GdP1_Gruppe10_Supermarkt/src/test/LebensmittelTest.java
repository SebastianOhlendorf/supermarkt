package test;

import java.time.LocalDate;

import waren.Backwaren;
import waren.Lebensmittel;

public class LebensmittelTest {

	public static void main(String[] args) {

					//---------------Lebensmittel---------------------------
					Lebensmittel lebensmittel = new Lebensmittel("Tee", 2.98, 0, LocalDate.now(), 0.5, 25, false);
					Lebensmittel.addLebensmittel(new Lebensmittel("Kekse", 2.98, 0, LocalDate.now(), 0.5, 0, false));
					Lebensmittel.addLebensmittel(new Lebensmittel("Käse", 2.98, 0, LocalDate.now(), 0.5, 2, false));
					Lebensmittel.addLebensmittel(lebensmittel);
					Lebensmittel.gebeLebensmittelAus();
					
					LocalDate date = LocalDate.parse("2021-01-17");
					Lebensmittel lebensmittel2 = new Lebensmittel("Suppe", 2.98, 0, date, 0.5, 1, false);
					Lebensmittel.addLebensmittel(lebensmittel2);
					
					for(int i = 0; i < 40; i++) {

						Lebensmittel.addLebensmittel(new Lebensmittel("Gemüse" + i, 2.98, 5, LocalDate.now(), 0.5, 25, false));
						
					}	
					System.out.println("Start herausgabe:");
					//Von Tee werden 50 herausgegeben, neue Lagermenge 50
					lebensmittel.herausgeben(50);
					System.out.println("Start Ausgabe:");
					Lebensmittel.gebeLebensmittelAus();
					
					System.out.println("Start Nachbestellung 1:");
					//Von Tee werden 20 nachbestellt, neue Lagermenge 70
					lebensmittel.nachbestellen(20);
					System.out.println("Start Ausgabe 2:");
					Lebensmittel.gebeLebensmittelAus();
					
					System.out.println("Start Nachbestellung 2:");
					//Von Tee werden 40 nachbestellt, neue Lagermenge 100, Meldung das die Lagerkapazität erreicht wurde
					lebensmittel.nachbestellen(40);
					System.out.println("Start Ausgabe 3:");
					Lebensmittel.gebeLebensmittelAus();
					
					System.out.println("Start Nachbestellung 3:");
					//Von Tee werden 10 nachbestellt, Meldung das keine Bestellung getätigt wurde, weil bereits 100 auf Lager sind
					lebensmittel.nachbestellen(10);
					System.out.println("Start Ausgabe 4:");
					Lebensmittel.gebeLebensmittelAus();
					
					System.out.println("Start herausgabe 2:");
					//Von Tee werden 50 herausgegeben, neue Lagermenge 50
					lebensmittel.herausgeben(50);
					System.out.println("Start Ausgabe 5:");
					Lebensmittel.gebeLebensmittelAus();
					
					System.out.println("Start herausgabe 3:");
					//Von Tee werden 70 herausgegeben, Maximalmenge wird bestellt
					lebensmittel.herausgeben(70);
					System.out.println("Start Ausgabe 6:");
					Lebensmittel.gebeLebensmittelAus();
					
					System.out.println("Start haltbarBis:");
					//Von Tee werden 50 herausgegeben, neue Lagermenge 50
					System.out.println(lebensmittel.haltbarBis());
					
					System.out.println("Start haltbarBis 2:");
					System.out.println(lebensmittel2.haltbarBis());
					
					System.out.println("Start istHaltbar 1:");
					System.out.println(lebensmittel.istHaltbar());
					
					System.out.println("Start istHaltbar 1:");
					System.out.println(lebensmittel2.istHaltbar());
					
					System.out.println("Start kurzesMHD 1:");
					System.out.println(Lebensmittel.kurzesMHD());
										
					
					
					//---------------Backwaren---------------------------
					
					Backwaren backwaren = new Backwaren("Semmel", 2.98, 0, LocalDate.now(), 0.5, 25, false);
					Backwaren.addBackwaren(new Backwaren("Laugenstange", 2.98, 0, LocalDate.now(), 0.5, 0, false));
					Backwaren.addBackwaren(new Backwaren("Mehrkornbrötchen", 2.98, 0, LocalDate.now(), 0.5, 25, false));
					Backwaren.addBackwaren(backwaren);
					Backwaren.gebeBackwareAus();
					
					for(int i = 0; i < 40; i++) {

						Backwaren.addBackwaren(new Backwaren("Breze" + i, 2.98, 5, LocalDate.now(), 0.5, 25, false));
						
					}	
					
					Backwaren.gebeBackwareAus();
					
					System.out.println("Start herausgabe:");
					//Von Tee werden 50 herausgegeben, neue Lagermenge 50
					backwaren.herausgeben(50);
					System.out.println("Start Ausgabe:");
					Backwaren.gebeBackwareAus();
					
					System.out.println("Start Nachbestellung 1:");
					//Von Tee werden 20 nachbestellt, neue Lagermenge 70
					backwaren.nachbestellen(20);
					System.out.println("Start Ausgabe 2:");
					Backwaren.gebeBackwareAus();
					
					System.out.println("Start Nachbestellung 2:");
					//Von Tee werden 40 nachbestellt, neue Lagermenge 100, Meldung das die Lagerkapazität erreicht wurde
					backwaren.nachbestellen(40);
					System.out.println("Start Ausgabe 3:");
					Backwaren.gebeBackwareAus();
					
					System.out.println("Start Nachbestellung 3:");
					//Von Tee werden 10 nachbestellt, Meldung das keine Bestellung getätigt wurde, weil bereits 100 auf Lager sind
					backwaren.nachbestellen(10);
					System.out.println("Start Ausgabe 4:");
					Backwaren.gebeBackwareAus();
					
					System.out.println("Start herausgabe 2:");
					//Von Tee werden 50 herausgegeben, neue Lagermenge 50
					backwaren.herausgeben(50);
					System.out.println("Start Ausgabe 5:");
					Backwaren.gebeBackwareAus();
					
					System.out.println("Start herausgabe 3:");
					//Von Tee werden 50 herausgegeben, neue Lagermenge 50
					backwaren.herausgeben(70);
					System.out.println("Start Ausgabe 6:");
					Backwaren.gebeBackwareAus();
					
					
					System.out.println("Start backWare 1:");
					System.out.println(backwaren.backeWare());
					System.out.println("---------------------------------------------");
					System.out.println("Start backWare 2:");
					System.out.println(backwaren.backeWare());
	
	
					
	}
}
