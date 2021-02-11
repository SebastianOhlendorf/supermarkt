package waren;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Kinderklasse der Klasse Ware zum anlegen von Getränke-Objekten
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
		
		Scanner in = new Scanner(System.in);
		
		this.alcProzente = alcProzente;
		
		// Prüfung ob bei Anlegung Getränk bereits 30 verschiedene Getränke vorhanden sind
		int getraenkeInsgesamt = 0;
		this.anzahl = 0;
		boolean enthaeltAlc = false;
		
		String [] getraenkeArray;
		getraenkeArray = new String [30];
		
		if(getraenkeInsgesamt <=30) {
			
		for (int i = 0; i <= getraenkeArray.length; i++) {
			
			System.out.println("Bitte geben Sie einen Namen für das Getränk ein ");
			getraenkeArray[i] = in.next();
			
			System.out.println("Bitte geben Sie einen Preis für das Getränk ein");
			getraenkeArray[i] = in.nextDouble();
			
			System.out.println("Bitte geben Sie einen Alkoholgehalt an");
			this.alcProzente = in.nextDouble();
			istAlkoholhaltig(enthaeltAlc);
			
			
			
			this.anzahl = 100;
			this.seitWannImBestand = LocalDate.now();
			//this.ObImBestand = true;
			

			i++;
			getraenkeInsgesamt ++;
			
		} 
		
		} else {
			System.out.println("Es wurden bereits 30 Getraenke erstellt");
			
			in.close();
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
		return null;
	}
	
	public boolean istAlkoholhaltig(boolean alkoholhaltig) {
		
		
		if ( this.alcProzente > 0) {
			alkoholhaltig = true;
		} else {
			System.out.println("Dieses Getränk enthält keinen Alkohol");
		}
		
		return alkoholhaltig;
	}
	
	public static void gebeGetraenkeAus() {
		
		
		//Gibt eine Liste aller vorhandener Lebensmittel (ihrer Namen) nummeriert aus. (Dies soll dem Nutzer später als Auswahl dienen, zB:
		//	(1) Schokolade
		//	(2) Nudeln
		//	(3) Gurke
		//	… )
	}
	
	public static void gebeNonAlkGetraenkeAus() {
		//für nicht alkoholische Getränke
	}

}
