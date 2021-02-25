package supermarkt;

import java.time.LocalDate;

import enums.Allergene;
import enums.Filmgenre;
import enums.Fsk;
import enums.Jahreszeit;
import enums.Koerperteile;
import enums.Nutzung;
import enums.Sprachen;
import enums.Stofftypen;
import enums.Untergruppen;
import waren.Backwaren;
import waren.DrogerieArtikel;
import waren.Filme;
import waren.Getraenke;
import waren.Kleidung;
import waren.NonFoodArtikel;

/**
 * Eine Klasse die zu Testzwecken des Programms von jeder Warenart 10 Objekte jeweils anlegt.
 * @author Sebastian
 * @version
 * @date
 *
 */
public class Lager {
	
	/**
	 * Methode zum anlegen eines Beispiellagers um das Programm testbar zu machen
	 * 
	 */
	public static void erstelleLager() {
		
		/**
		 * Bef�llen des Lagers mit Backwaren
		 */
		
		Backwaren franzbroetchen = new Backwaren("Franzbr�tchen", 0.70, LocalDate.now(), 100.00, 4, false);
		Backwaren.addBackwaren(franzbroetchen);
		
		Backwaren mohnbroetchen = new Backwaren("Mohnbr�tchen", 0.50, LocalDate.now(), 60.00, 4, false);
		Backwaren.addBackwaren(mohnbroetchen);
		
		Backwaren belegtesBroetchenSchinkenKaese = new Backwaren("belegtes Br�tchen mit Schinken und K�se", 2.50, LocalDate.now(), 90.00, 4, false);
		Backwaren.addBackwaren(belegtesBroetchenSchinkenKaese);
		
		Backwaren belegtesBroetchenWurstKaese = new Backwaren("belegtes Br�tchen mit Wurst und K�se", 2.30, LocalDate.now(), 90.00, 4, false);
		Backwaren.addBackwaren(belegtesBroetchenWurstKaese);
		
		Backwaren schokoBroetchen = new Backwaren("Schokobr�tchen", 1.30, LocalDate.now(), 70.00,4, false);
		Backwaren.addBackwaren(schokoBroetchen);
		
		Backwaren weltMeister = new Backwaren("Weltmeisterbr�tchen", 0.50, LocalDate.now(),60.00, 4, false);
		Backwaren.addBackwaren(weltMeister);
		
		Backwaren croissant  = new Backwaren("Croissant", 0.45, LocalDate.now(), 40.00,4, false);
		Backwaren.addBackwaren(croissant);
		
		Backwaren schokoTorte = new Backwaren("Schokotorte ganze Torte", 10.00, LocalDate.now(), 700.00, 8,true);
		Backwaren.addBackwaren(schokoTorte);
		
		Backwaren nougatHoernchen = new Backwaren("Nougat H�rnchen", 0.99, LocalDate.now(), 80.00, 4, false);
		Backwaren.addBackwaren(nougatHoernchen);
		
		Backwaren mohnSchnecke = new Backwaren("Mohnschnecke", 1.70, LocalDate.now(), 130.00, 4, false);
		Backwaren.addBackwaren(mohnSchnecke);
		
		/**
		 * Bef�llen des Lagers mit Drogerie Artikeln
		 */
		
		DrogerieArtikel giletteFusionRasierKlingen = new DrogerieArtikel("Gilette Fusion Rasierklingen" , 13.95, LocalDate.now(), "Gilette Pflegeprodukt", Untergruppen.DROGERIEARTIKEL, Nutzung.KOERPERPFLEGE, 2.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(giletteFusionRasierKlingen);
		
		DrogerieArtikel sagrotanHanddesinfektionsgelAloeVera = new DrogerieArtikel("Sagrotan Handdesinfektionsgel Aloe Vera" , 1.95, LocalDate.now(), "Sagrotan Handdesinfektionsgel", Untergruppen.DROGERIEARTIKEL, Nutzung.KOERPERPFLEGE, 1.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(sagrotanHanddesinfektionsgelAloeVera);
		
		DrogerieArtikel lindtBonbonRotMilch = new DrogerieArtikel("Lindt Schokobonbon Lindor Beutel " , 3.99, LocalDate.now(), "Lindt S��waren", Untergruppen.DROGERIEARTIKEL, Nutzung.NAHRUNGSMITTEL, 1.0, Allergene.MILCH);
		DrogerieArtikel.addDrogerieArtikel(lindtBonbonRotMilch);
		
		DrogerieArtikel alnaturaOlivenoelNativ = new DrogerieArtikel("Alnatura Oliven�l nativ" , 3.49, LocalDate.now(), "Alnatura Kochprodukt", Untergruppen.DROGERIEARTIKEL, Nutzung.NAHRUNGSMITTEL, 3.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(alnaturaOlivenoelNativ);
		
		DrogerieArtikel ueltjeErdnuesse = new DrogerieArtikel("�ltje Erdn�sse ger�stet und gesalzen" , 1.89, LocalDate.now(), "�ltje Erdn�sse 200 Gramm", Untergruppen.DROGERIEARTIKEL, Nutzung.NAHRUNGSMITTEL, 3.0, Allergene.ERDNUESSE);
		DrogerieArtikel.addDrogerieArtikel(ueltjeErdnuesse);
		
		DrogerieArtikel darkestBlackMascara = new DrogerieArtikel("Darkest Black MASCARA" , 34.50, LocalDate.now(), "Kosmetik Mascara Tierversuchsfrei", Untergruppen.DROGERIEARTIKEL, Nutzung.KOSMETIK, 1.8, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(darkestBlackMascara);
		
		DrogerieArtikel calvinKleinUnisex = new DrogerieArtikel("Calvin Klein CK One Eaude Toilette 200 ml Unisex" , 22.90, LocalDate.now(), "Calvin Klein Parfuem ", Untergruppen.DROGERIEARTIKEL, Nutzung.PARFUEM, 2.2, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(calvinKleinUnisex);
		
		DrogerieArtikel meisteProperAllesreinigerCitrus = new DrogerieArtikel("Meister-Proper Allesreiniger Professional Allzweckreiniger" , 12.77, LocalDate.now(), "Reinigungsprodukt Meister-Proper 5l", Untergruppen.DROGERIEARTIKEL, Nutzung.REINIGUNG, 3.7, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(meisteProperAllesreinigerCitrus);
		
		DrogerieArtikel niveaReichhaltigesBodyOil = new DrogerieArtikel("NIVEA Reichhaltiges Body Oil im (200 ml), K�rper�l mit innovativer Trocken�l" , 5.95, LocalDate.now(), "K�rperpflege mit Mandel�l", Untergruppen.DROGERIEARTIKEL, Nutzung.OELE, 1.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(niveaReichhaltigesBodyOil);
		
		DrogerieArtikel niveaVitalSojaAntiAge = new DrogerieArtikel("NIVEA VITAL Soja Anti-Age Straffende Nachtpflege (50 ml)" , 9.29, LocalDate.now(), "Nivea Pflegeprodukt mit nat�rlichem Soja Extrakt", Untergruppen.DROGERIEARTIKEL, Nutzung.KOSMETIK, 1.3, Allergene.SOJA);
		DrogerieArtikel.addDrogerieArtikel(niveaVitalSojaAntiAge);
		
		/**
		 * Bef�llen des Lagers mit Film Artikeln
		 */
		
		Filme saw5 = new Filme("Saw 5" , 9.99, LocalDate.now(), "verst�render Horror mit Tobin Bell ", Untergruppen.FILME, true, Filmgenre.HORROR, 2014, 1.45, Fsk.FSK18, Sprachen.DEUTSCH);
		Filme.addFilm(saw5);
		
		Filme shangHighNoon = new Filme("Shang High Noon" , 5.99, LocalDate.now(), "lustige Actionkom�die mit Jackie Chan", Untergruppen.FILME, true, Filmgenre.ACTION, 2011, 2.00, Fsk.FSK12, Sprachen.CHINESISCH);
		Filme.addFilm(shangHighNoon);
		
		Filme getOut = new Filme("Get Out" , 7.99, LocalDate.now(), "spannender Thriller mit Daniel Kaluuya ", Untergruppen.FILME, true, Filmgenre.THRILLER, 2017, 1.35, Fsk.FSK16, Sprachen.DEUTSCH);
		Filme.addFilm(getOut);
		
		Filme kindskoepfe = new Filme("Kindsk�pfe" , 6.99, LocalDate.now(), "Comedy Film mit Kevin James und Adam Sandler ", Untergruppen.FILME, true, Filmgenre.HUMOR, 2012, 1.30, Fsk.FSK6, Sprachen.ENGLISCH);
		Filme.addFilm(kindskoepfe);
		
		Filme titanic = new Filme("Titanic" , 2.99, LocalDate.now(), "packendes Drama mit Leonardo D.Caprio ", Untergruppen.FILME, false, Filmgenre.DRAMA, 1997, 3.30, Fsk.FSK12, Sprachen.ENGLISCH);
		Filme.addFilm(titanic);
		
		Filme derSoldatJamesRyan = new Filme("Der Soldat James Ryan" , 2.99, LocalDate.now(), "packendes Kriegsdrama ", Untergruppen.FILME, false, Filmgenre.KRIEG, 1998, 2.50, Fsk.FSK18, Sprachen.FRANZ�SISCH);
		Filme.addFilm(derSoldatJamesRyan);
		
		Filme vomWindeVerweht = new Filme("vom Winde verweht" , 2.99, LocalDate.now(), "Romanze  ", Untergruppen.FILME, false, Filmgenre.LIEBE, 1939, 4.00, Fsk.FSK12, Sprachen.GRIECHISCH);
		Filme.addFilm(vomWindeVerweht);
		
		Filme spielMirDasLiedVomTot = new Filme("Spiel mir das Lied vom Tod" ,1.99, LocalDate.now(), "Western Film mit Chrales Bronson", Untergruppen.FILME, false, Filmgenre.WESTERN, 1968, 2.55, Fsk.FSK16, Sprachen.ENGLISCH);
		Filme.addFilm(spielMirDasLiedVomTot);
		
		Filme aQuietPlace = new Filme("a Quiet Place" , 6.99, LocalDate.now(), "packender Horror Thriller ", Untergruppen.FILME, true, Filmgenre.HORROR, 2018, 1.31, Fsk.FSK18, Sprachen.SPANISCH);
		Filme.addFilm(aQuietPlace);
		
		Filme theTransporter3  = new Filme("The Transporter Teil 3" , 3.99, LocalDate.now(), "Action Film mit Jason Statham ", Untergruppen.FILME, true, Filmgenre.ACTION, 2014, 1.44, Fsk.FSK12, Sprachen.ENGLISCH);
		Filme.addFilm(theTransporter3);
		
		
		/**
		 * Bef�llen des Lagers mit Getr�nke Artikeln
		 */
		
		Getraenke becksGold = new Getraenke("Becks Gold_", 2.50, LocalDate.now(), 4.90);
		Getraenke.addGetraenke(becksGold);
		
		Getraenke captainMorgan = new Getraenke("Captain Morgan_", 11.00, LocalDate.now(), 40.00);
		Getraenke.addGetraenke(captainMorgan);
		
		Getraenke jackDaniels = new Getraenke("Jack Daniels_", 17.99, LocalDate.now(), 40.00);
		Getraenke.addGetraenke(jackDaniels);
		
		Getraenke jaegerMeister = new Getraenke("J�ger Meister_", 12.99, LocalDate.now(), 37.00);
		Getraenke.addGetraenke(jaegerMeister);
		
		Getraenke rotkaeppchenSekt = new Getraenke("Rotk�ppchen Sekt halbtrocken_", 3.39, LocalDate.now(), 11.0);
		Getraenke.addGetraenke(rotkaeppchenSekt);
		
		Getraenke absoloutVodka = new Getraenke("Absolout Vodka_", 19.99, LocalDate.now(), 40.00);
		Getraenke.addGetraenke(absoloutVodka);
		
		Getraenke torresNatureo = new Getraenke("Rotwein Torres Natureo Tinto 2021_", 8.50, LocalDate.now(), 8.00);
		Getraenke.addGetraenke(torresNatureo);
		
		Getraenke elCotoBlanco = new Getraenke("Wei�wein El Coto Blanco_", 15.00, LocalDate.now(), 12.00);
		Getraenke.addGetraenke(elCotoBlanco);
		
		Getraenke licor43 = new Getraenke("Licor 43_", 15.00, LocalDate.now(), 31.00);
		Getraenke.addGetraenke(licor43);
		
		Getraenke astraRotlicht = new Getraenke("Astra Rotlicht_", 1.50, LocalDate.now(), 6.00);
		Getraenke.addGetraenke(astraRotlicht);
		
		
		
		

		/**
		 * Bef�llen des Lagers mit Kleidungsst�cken
		 */
		
		Kleidung tommyJeansHerrenJacke = new Kleidung("Tommy Jeans Herrenjacke schwarz" , 99.00, LocalDate.now(), "Jacke in verschiedenen Gr��en von Firma Tommy Jeans", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.OBERKOERPER, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(tommyJeansHerrenJacke);
		
		Kleidung merino200OasisInnenhandschuhe = new Kleidung("Merino 200 Oasis Innenhandschuhe Unisex" , 29.98, LocalDate.now(), "Handschuhe von Merino", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.HAENDE, Stofftypen.WOLLE);
		Kleidung.addKleidung(merino200OasisInnenhandschuhe);
		
		Kleidung muetzeThinsulateHerrenMarineblau = new Kleidung("Thinsulate Herren Strickm�tze Marineblau" , 12.99, LocalDate.now(), "M�tze f�r den Winter", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.KOPF, Stofftypen.CHEMIEFASER);
		Kleidung.addKleidung(muetzeThinsulateHerrenMarineblau);
		
		Kleidung bossDamenRockVilea = new Kleidung("Damen Rock von Boss Vilea " , 159.95, LocalDate.now(), "Damen Rock in schwarz", Untergruppen.KLEIDUNG, Jahreszeit.SOMMER, Koerperteile.BEINE, Stofftypen.WOLLE);
		Kleidung.addKleidung(bossDamenRockVilea);
		
		Kleidung appostaHemdSchwarz = new Kleidung("schwarzes Hemd von Apposta" , 179.00, LocalDate.now(), "das Hemd zum ausgehen aus Seide APPOSTA", Untergruppen.KLEIDUNG, Jahreszeit.FRUEHLING, Koerperteile.OBERKOERPER, Stofftypen.SEIDE);
		Kleidung.addKleidung(appostaHemdSchwarz);
		
		Kleidung schuheNikeSportFreeze = new Kleidung("Nike Sport Schuhe Freeze" , 59.99, LocalDate.now(), "Nike Schuhe ", Untergruppen.KLEIDUNG, Jahreszeit.FRUEHLING, Koerperteile.FUESSE, Stofftypen.KEINE);
		Kleidung.addKleidung(schuheNikeSportFreeze);
		
		Kleidung bundhoseEngelbertStrauss = new Kleidung("Arbeitshose als Bundhose Engelbert Strauss" , 39.15, LocalDate.now(), "Engelbert Strauss Arbeitshose ais Leine", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.BEINE, Stofftypen.LEINE);
		Kleidung.addKleidung(bundhoseEngelbertStrauss);
		
		Kleidung peterHahnPulloverBlau = new Kleidung("Pullover von Peter Hahn in blau" , 79.95, LocalDate.now(), "lang�rmeliger Pullover", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.ARME, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(peterHahnPulloverBlau);
		
		Kleidung tomTailorJeansBlau = new Kleidung("Tom Tailor Jeans in blau. viele gr��en vorhanden." , 39.99, LocalDate.now(), "Jeans von Tom Tailor. Slim", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.BEINE, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(tomTailorJeansBlau);
		
		Kleidung calvinKleinUnterhose = new Kleidung("Calvin Klein Unterhosen" , 29.99, LocalDate.now(), "Unterhosen unterschiedliche Gr��en", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.BEINE, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(calvinKleinUnterhose);
		
	}

}
 