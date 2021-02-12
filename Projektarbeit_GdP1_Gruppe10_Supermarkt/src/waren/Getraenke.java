package waren;
import java.time.LocalDate;
import java.util.Scanner;

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
		
		Scanner in = new Scanner(System.in);
		
		// Pr�fung ob bei Anlegung Getr�nk bereits 30 verschiedene Getr�nke vorhanden sind
		int getraenkeInsgesamt = 0;
		this.anzahl = 0;
		boolean enthaeltAlc = true;
		
		
		String [][] getraenkeArray;
		getraenkeArray = new String [31][6];
		
		if(getraenkeInsgesamt <=30) {
			
		for (int i = 0; i < getraenkeArray.length; i++) {
			for(int j = 0; j<getraenkeArray.length; j++) {
			
			System.out.println("Bitte geben Sie einen Namen f�r das Getr�nk ein ");
			getraenkeArray[i][j] = in.next();
			
			System.out.println("Bitte geben Sie einen Preis f�r das Getr�nk ein");
			getraenkeArray[i][j] = in.next();
			
			System.out.println("Bitte geben Sie einen Alkoholgehalt f�r das Getr�nk an");
			//this.alcProzente = this.alcProzente.parseDouble(in.next());
			//this.alcProzente.parseDouble
			//istAlkoholhaltig(enthaeltAlc);
			
			
			
			this.anzahl = 100;
			this.seitWannImBestand = LocalDate.now();
			//this.ObImBestand = true;
			

			
			getraenkeInsgesamt ++;
			
		} 
		} 
		}
		else {
			System.out.println("Es wurden bereits 30 Getraenke erstellt");
			
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
	
	public boolean istAlkoholhaltig(boolean alkoholhaltig) {
		
		
		if ( this.alcProzente > 0) {
			alkoholhaltig = true;
		} else {
			System.out.println("Dieses Getr�nk enth�lt keinen Alkohol");
		}
		
		return alkoholhaltig;
	}
	
	//public static void gebeGetraenkeAus(getraenkeArray[]) {
		
		//for (int i = 1; i < getraenkeArray.length; i++) {
		//    System.out.println(getraenkeArray[i]);
	//	}
		//Gibt eine Liste aller vorhandener Lebensmittel (ihrer Namen) nummeriert aus. (Dies soll dem Nutzer sp�ter als Auswahl dienen, zB:
		//	(1) Schokolade
		//	(2) Nudeln
		//	(3) Gurke
		//	� )
	//}
	
	public static void gebeNonAlkGetraenkeAus() {
		//f�r nicht alkoholische Getr�nke
	}

}
