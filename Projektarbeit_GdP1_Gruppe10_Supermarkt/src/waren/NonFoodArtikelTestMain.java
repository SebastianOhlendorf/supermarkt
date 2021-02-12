package waren;
import java.time.LocalDate;
import java.util.Scanner;
public class NonFoodArtikelTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * Deklaration von Variablen 
		 * 
		 */
		String name;
		double preis;
		int anzahl;
		LocalDate seitWannImBestand = LocalDate.now();
		String obImBestand = "";
		
		//speziell f�r NonFoodArtikel
		String beschreibung;
		String unterGruppe;
		
		/**
		 * Eingaben vom Benutzer
		 */
		
		name= einAusgabe.eingabeName("Bitte geben Sie einen Namen f�r das Non Food Produkt ein: ");
		preis= einAusgabe.eingabePreis("Bitte geben Sie einen Preis f�r den Non Food Artikel ein: ");
		anzahl= einAusgabe.eingabeAnzahl("Die Anzahl im Lager betr�gt 100");
		seitWannImBestand= einAusgabe.eingabeSeitWannImBestand("Der Artikel ist seit " + seitWannImBestand + " im Bestand");
		
		
		//speziell f�r NonFoodArtikel
		beschreibung= einAusgabe.eingabeBeschreibung("Bitte geben Sie eine ausf�hrliche Beschreibung zu dem Non Food Produkt ein");
		unterGruppe = einAusgabe.eingabeUnterGruppe("zu welcher Untergruppe geh�rt das Produkt?");
		
		
		/**
		 * Erzeugung eines neuen NonFood Artikels
		 */
		
		NonFoodArtikel neueErstellung = new NonFoodArtikel(name,preis,seitWannImBestand,anzahl,
				obImBestand,beschreibung,unterGruppe);
		
		System.out.println("der neue NonFoodArtikel im �berblick" + neueErstellung);
	}

}
