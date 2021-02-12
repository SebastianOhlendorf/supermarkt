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
		
		//speziell für NonFoodArtikel
		String beschreibung;
		String unterGruppe;
		
		/**
		 * Eingaben vom Benutzer
		 */
		
		name= einAusgabe.eingabeName("Bitte geben Sie einen Namen für das Non Food Produkt ein: ");
		preis= einAusgabe.eingabePreis("Bitte geben Sie einen Preis für den Non Food Artikel ein: ");
		anzahl= einAusgabe.eingabeAnzahl("Die Anzahl im Lager beträgt 100");
		seitWannImBestand= einAusgabe.eingabeSeitWannImBestand("Der Artikel ist seit " + seitWannImBestand + " im Bestand");
		
		
		//speziell für NonFoodArtikel
		beschreibung= einAusgabe.eingabeBeschreibung("Bitte geben Sie eine ausführliche Beschreibung zu dem Non Food Produkt ein");
		unterGruppe = einAusgabe.eingabeUnterGruppe("zu welcher Untergruppe gehört das Produkt?");
		
		
		/**
		 * Erzeugung eines neuen NonFood Artikels
		 */
		
		NonFoodArtikel neueErstellung = new NonFoodArtikel(name,preis,seitWannImBestand,anzahl,
				obImBestand,beschreibung,unterGruppe);
		
		System.out.println("der neue NonFoodArtikel im Überblick" + neueErstellung);
	}

}
