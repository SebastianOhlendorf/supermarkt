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
import waren.Lebensmittel;
import waren.Medien;
import waren.NonFoodArtikel;

/**
 * Eine Klasse die zu Testzwecken des Programms von jeder Warenart 10 Objekte jeweils anlegt.
 * @author Lennart Sparbier
 * @version 1.0
 * @date 25.02.2021
 *
 */
public class Lager {
	
	/**
	 * Methode zum anlegen eines Beispiellagers um das Programm testbar zu machen
	 * 
	 */
	public static void erstelleLager() {
		
		/***
		 * Befüllen des Lagers mit Backwaren
		 */
		
		Backwaren franzbroetchen = new Backwaren("Franzbrötchen", 0.70, LocalDate.now(), 100.00, 4, false);
		Backwaren.addBackwaren(franzbroetchen);
		
		Backwaren mohnbroetchen = new Backwaren("Mohnbrötchen", 0.50, LocalDate.now(), 60.00, 4, false);
		Backwaren.addBackwaren(mohnbroetchen);
		
		Backwaren belegtesBroetchenSchinkenKaese = new Backwaren("belegtes Brötchen mit Schinken und Käse", 2.50, LocalDate.now(), 90.00, 4, false);
		Backwaren.addBackwaren(belegtesBroetchenSchinkenKaese);
		
		Backwaren belegtesBroetchenWurstKaese = new Backwaren("belegtes Brötchen mit Wurst und Käse", 2.30, LocalDate.now(), 90.00, 4, false);
		Backwaren.addBackwaren(belegtesBroetchenWurstKaese);
		
		Backwaren schokoBroetchen = new Backwaren("Schokobrötchen", 1.30, LocalDate.now(), 70.00,4, false);
		Backwaren.addBackwaren(schokoBroetchen);
		
		Backwaren weltMeister = new Backwaren("Weltmeisterbrötchen", 0.50, LocalDate.now(),60.00, 4, false);
		Backwaren.addBackwaren(weltMeister);
		
		Backwaren croissant  = new Backwaren("Croissant", 0.45, LocalDate.now(), 40.00,4, false);
		Backwaren.addBackwaren(croissant);
		
		Backwaren schokoTorte = new Backwaren("Schokotorte ganze Torte", 10.00, LocalDate.now(), 700.00, 8,true);
		Backwaren.addBackwaren(schokoTorte);
		
		Backwaren nougatHoernchen = new Backwaren("Nougat Hörnchen", 0.99, LocalDate.now(), 80.00, 4, false);
		Backwaren.addBackwaren(nougatHoernchen);
		
		Backwaren mohnSchnecke = new Backwaren("Mohnschnecke", 1.70, LocalDate.now(), 130.00, 4, false);
		Backwaren.addBackwaren(mohnSchnecke);
		
		/**
		 * Befüllen des Lagers mit Drogerie Artikeln
		 */
		
		DrogerieArtikel giletteFusionRasierKlingen = new DrogerieArtikel("Gilette Fusion Rasierklingen" , 13.95, LocalDate.now(), "Gilette Pflegeprodukt", Untergruppen.DROGERIEARTIKEL, Nutzung.KOERPERPFLEGE, 2.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(giletteFusionRasierKlingen);
		
		DrogerieArtikel sagrotanHanddesinfektionsgelAloeVera = new DrogerieArtikel("Sagrotan Handdesinfektionsgel Aloe Vera" , 1.95, LocalDate.now(), "Sagrotan Handdesinfektionsgel", Untergruppen.DROGERIEARTIKEL, Nutzung.KOERPERPFLEGE, 1.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(sagrotanHanddesinfektionsgelAloeVera);
		
		DrogerieArtikel lindtBonbonRotMilch = new DrogerieArtikel("Lindt Schokobonbon Lindor Beutel " , 3.99, LocalDate.now(), "Lindt Süßwaren", Untergruppen.DROGERIEARTIKEL, Nutzung.NAHRUNGSMITTEL, 1.0, Allergene.MILCH);
		DrogerieArtikel.addDrogerieArtikel(lindtBonbonRotMilch);
		
		DrogerieArtikel alnaturaOlivenoelNativ = new DrogerieArtikel("Alnatura Olivenöl nativ" , 3.49, LocalDate.now(), "Alnatura Kochprodukt", Untergruppen.DROGERIEARTIKEL, Nutzung.NAHRUNGSMITTEL, 3.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(alnaturaOlivenoelNativ);
		
		DrogerieArtikel ueltjeErdnuesse = new DrogerieArtikel("Ültje Erdnüsse geröstet und gesalzen" , 1.89, LocalDate.now(), "Ültje Erdnüsse 200 Gramm", Untergruppen.DROGERIEARTIKEL, Nutzung.NAHRUNGSMITTEL, 3.0, Allergene.ERDNUESSE);
		DrogerieArtikel.addDrogerieArtikel(ueltjeErdnuesse);
		
		DrogerieArtikel darkestBlackMascara = new DrogerieArtikel("Darkest Black MASCARA" , 34.50, LocalDate.now(), "Kosmetik Mascara Tierversuchsfrei", Untergruppen.DROGERIEARTIKEL, Nutzung.KOSMETIK, 1.8, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(darkestBlackMascara);
		
		DrogerieArtikel calvinKleinUnisex = new DrogerieArtikel("Calvin Klein CK One Eaude Toilette 200 ml Unisex" , 22.90, LocalDate.now(), "Calvin Klein Parfuem ", Untergruppen.DROGERIEARTIKEL, Nutzung.PARFUEM, 2.2, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(calvinKleinUnisex);
		
		DrogerieArtikel meisteProperAllesreinigerCitrus = new DrogerieArtikel("Meister-Proper Allesreiniger Professional Allzweckreiniger" , 12.77, LocalDate.now(), "Reinigungsprodukt Meister-Proper 5l", Untergruppen.DROGERIEARTIKEL, Nutzung.REINIGUNG, 3.7, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(meisteProperAllesreinigerCitrus);
		
		DrogerieArtikel niveaReichhaltigesBodyOil = new DrogerieArtikel("NIVEA Reichhaltiges Body Oil im (200 ml), Körperöl mit innovativer Trockenöl" , 5.95, LocalDate.now(), "Körperpflege mit Mandelöl", Untergruppen.DROGERIEARTIKEL, Nutzung.OELE, 1.5, Allergene.KEINE);
		DrogerieArtikel.addDrogerieArtikel(niveaReichhaltigesBodyOil);
		
		DrogerieArtikel niveaVitalSojaAntiAge = new DrogerieArtikel("NIVEA VITAL Soja Anti-Age Straffende Nachtpflege (50 ml)" , 9.29, LocalDate.now(), "Nivea Pflegeprodukt mit natürlichem Soja Extrakt", Untergruppen.DROGERIEARTIKEL, Nutzung.KOSMETIK, 1.3, Allergene.SOJA);
		DrogerieArtikel.addDrogerieArtikel(niveaVitalSojaAntiAge);
		
		/**
		 * Befüllen des Lagers mit Filmen
		 */
		
		Filme saw5 = new Filme("Saw 5" , 9.99, LocalDate.now(), "verstörender Horror mit Tobin Bell ", Untergruppen.FILME, true, Filmgenre.HORROR, 2014, 1.45, Fsk.FSK18, Sprachen.DEUTSCH);
		Filme.addFilm(saw5);
		
		Filme shangHighNoon = new Filme("Shang High Noon" , 5.99, LocalDate.now(), "lustige Actionkomödie mit Jackie Chan", Untergruppen.FILME, true, Filmgenre.ACTION, 2011, 2.00, Fsk.FSK12, Sprachen.CHINESISCH);
		Filme.addFilm(shangHighNoon);
		
		Filme getOut = new Filme("Get Out" , 7.99, LocalDate.now(), "spannender Thriller mit Daniel Kaluuya ", Untergruppen.FILME, true, Filmgenre.THRILLER, 2017, 1.35, Fsk.FSK16, Sprachen.DEUTSCH);
		Filme.addFilm(getOut);
		
		Filme kindskoepfe = new Filme("Kindsköpfe" , 6.99, LocalDate.now(), "Comedy Film mit Kevin James und Adam Sandler ", Untergruppen.FILME, true, Filmgenre.HUMOR, 2012, 1.30, Fsk.FSK6, Sprachen.ENGLISCH);
		Filme.addFilm(kindskoepfe);
		
		Filme titanic = new Filme("Titanic" , 2.99, LocalDate.now(), "packendes Drama mit Leonardo D.Caprio ", Untergruppen.FILME, false, Filmgenre.DRAMA, 1997, 3.30, Fsk.FSK12, Sprachen.ENGLISCH);
		Filme.addFilm(titanic);
		
		Filme derSoldatJamesRyan = new Filme("Der Soldat James Ryan" , 2.99, LocalDate.now(), "packendes Kriegsdrama ", Untergruppen.FILME, false, Filmgenre.KRIEG, 1998, 2.50, Fsk.FSK18, Sprachen.FRANZÖSISCH);
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
		 * Befüllen des Lagers mit Getränken
		 */
		
		Getraenke becksGold = new Getraenke("Becks Gold_", 2.50, LocalDate.now(), 4.90);
		Getraenke.addGetraenke(becksGold);
		
		Getraenke captainMorgan = new Getraenke("Captain Morgan_", 11.00, LocalDate.now(), 40.00);
		Getraenke.addGetraenke(captainMorgan);
		
		Getraenke jackDaniels = new Getraenke("Jack Daniels_", 17.99, LocalDate.now(), 40.00);
		Getraenke.addGetraenke(jackDaniels);
		
		Getraenke jaegerMeister = new Getraenke("Jäger Meister_", 12.99, LocalDate.now(), 37.00);
		Getraenke.addGetraenke(jaegerMeister);
		
		Getraenke rotkaeppchenSekt = new Getraenke("Rotkäppchen Sekt halbtrocken_", 3.39, LocalDate.now(), 11.0);
		Getraenke.addGetraenke(rotkaeppchenSekt);
		
		Getraenke absoloutVodka = new Getraenke("Absolout Vodka_", 19.99, LocalDate.now(), 40.00);
		Getraenke.addGetraenke(absoloutVodka);
		
		Getraenke torresNatureo = new Getraenke("Rotwein Torres Natureo Tinto 2021_", 8.50, LocalDate.now(), 8.00);
		Getraenke.addGetraenke(torresNatureo);
		
		Getraenke elCotoBlanco = new Getraenke("Weißwein El Coto Blanco_", 15.00, LocalDate.now(), 12.00);
		Getraenke.addGetraenke(elCotoBlanco);
		
		Getraenke licor43 = new Getraenke("Licor 43_", 15.00, LocalDate.now(), 31.00);
		Getraenke.addGetraenke(licor43);
		
		Getraenke astraRotlicht = new Getraenke("Astra Rotlicht_", 1.50, LocalDate.now(), 6.00);
		Getraenke.addGetraenke(astraRotlicht);
		

		/***
		 * Befüllen des Lagers mit Kleidungsstücken
		 */
		
		Kleidung tommyJeansHerrenJacke = new Kleidung("Tommy Jeans Herrenjacke schwarz" , 99.00, LocalDate.now(), "Jacke in verschiedenen Größen von Firma Tommy Jeans", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.OBERKOERPER, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(tommyJeansHerrenJacke);
		
		Kleidung merino200OasisInnenhandschuhe = new Kleidung("Merino 200 Oasis Innenhandschuhe Unisex" , 29.98, LocalDate.now(), "Handschuhe von Merino", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.HAENDE, Stofftypen.WOLLE);
		Kleidung.addKleidung(merino200OasisInnenhandschuhe);
		
		Kleidung muetzeThinsulateHerrenMarineblau = new Kleidung("Thinsulate Herren Strickmütze Marineblau" , 12.99, LocalDate.now(), "Mütze für den Winter", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.KOPF, Stofftypen.CHEMIEFASER);
		Kleidung.addKleidung(muetzeThinsulateHerrenMarineblau);
		
		Kleidung bossDamenRockVilea = new Kleidung("Damen Rock von Boss Vilea " , 159.95, LocalDate.now(), "Damen Rock in schwarz", Untergruppen.KLEIDUNG, Jahreszeit.SOMMER, Koerperteile.BEINE, Stofftypen.WOLLE);
		Kleidung.addKleidung(bossDamenRockVilea);
		
		Kleidung appostaHemdSchwarz = new Kleidung("schwarzes Hemd von Apposta" , 179.00, LocalDate.now(), "das Hemd zum ausgehen aus Seide APPOSTA", Untergruppen.KLEIDUNG, Jahreszeit.FRUEHLING, Koerperteile.OBERKOERPER, Stofftypen.SEIDE);
		Kleidung.addKleidung(appostaHemdSchwarz);
		
		Kleidung schuheNikeSportFreeze = new Kleidung("Nike Sport Schuhe Freeze" , 59.99, LocalDate.now(), "Nike Schuhe ", Untergruppen.KLEIDUNG, Jahreszeit.FRUEHLING, Koerperteile.FUESSE, Stofftypen.KEINE);
		Kleidung.addKleidung(schuheNikeSportFreeze);
		
		Kleidung bundhoseEngelbertStrauss = new Kleidung("Arbeitshose als Bundhose Engelbert Strauss" , 39.15, LocalDate.now(), "Engelbert Strauss Arbeitshose ais Leine", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.BEINE, Stofftypen.LEINE);
		Kleidung.addKleidung(bundhoseEngelbertStrauss);
		
		Kleidung peterHahnPulloverBlau = new Kleidung("Pullover von Peter Hahn in blau" , 79.95, LocalDate.now(), "langärmeliger Pullover", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.ARME, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(peterHahnPulloverBlau);
		
		Kleidung tomTailorJeansBlau = new Kleidung("Tom Tailor Jeans in blau. viele größen vorhanden." , 39.99, LocalDate.now(), "Jeans von Tom Tailor. Slim", Untergruppen.KLEIDUNG, Jahreszeit.HERBST, Koerperteile.BEINE, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(tomTailorJeansBlau);
		
		Kleidung calvinKleinUnterhose = new Kleidung("Calvin Klein Unterhosen" , 29.99, LocalDate.now(), "Unterhosen unterschiedliche Größen", Untergruppen.KLEIDUNG, Jahreszeit.WINTER, Koerperteile.BEINE, Stofftypen.BAUMWOLLE);
		Kleidung.addKleidung(calvinKleinUnterhose);
		
		
		/***
		 * Befüllen des Lagers mit Lebensmitteln
		 */
		
		Lebensmittel butterJa = new Lebensmittel("Butter von der Marke Ja", 0.60, LocalDate.now(), 500, 90, true);
		Lebensmittel.addLebensmittel(butterJa);
		
		Lebensmittel mettwurstDreiEichen = new Lebensmittel("Mettwurst, Firma Drei Eichen", 5.50, LocalDate.now(), 700, 210, false);
		Lebensmittel.addLebensmittel(mettwurstDreiEichen);
		
		Lebensmittel chesterGutUndGuenstig = new Lebensmittel("Chester Scheiblettenkäse von Gut und Günstig", 0.99, LocalDate.now(), 250, 30, false);
		Lebensmittel.addLebensmittel(chesterGutUndGuenstig);
		
		Lebensmittel grandDessertvanillePuddingEhrmann = new Lebensmittel("Ehrmann GrandDessert Vaille Pudding",0.70, LocalDate.now(), 100, 10, true);
		Lebensmittel.addLebensmittel(grandDessertvanillePuddingEhrmann);
		
		Lebensmittel superSandwichHarryBrot = new Lebensmittel("Harry Brot Sammys Super Sandwich", 1.30, LocalDate.now(), 750, 21, false);
		Lebensmittel.addLebensmittel(superSandwichHarryBrot);
		
		Lebensmittel schwartauExtraErdbeere = new Lebensmittel("Schwartau Extra Erdbeere Konfitüre", 1.99, LocalDate.now(), 400, 35, false);
		Lebensmittel.addLebensmittel(schwartauExtraErdbeere);
		
		Lebensmittel genussKroneMittelscharfSenf = new Lebensmittel("Genuss Krone mittelscharfer Tafel-Senf", 0.99, LocalDate.now(), 200, 150, false);
		Lebensmittel.addLebensmittel(genussKroneMittelscharfSenf);
		
		Lebensmittel gemischtesHackfleischMeineMetzgerei = new Lebensmittel("Gemischtes Hackfleisch von meine Metzgerei", 2.99, LocalDate.now(), 500,15, true);
		Lebensmittel.addLebensmittel(gemischtesHackfleischMeineMetzgerei);
		
		Lebensmittel barillaPastaFusilliNudeln = new Lebensmittel("Nudeln Barilla Pasta Fusilli", 1.65, LocalDate.now(), 500, 150, false);
		Lebensmittel.addLebensmittel(barillaPastaFusilliNudeln);
		
		Lebensmittel dieOfenFrischeSalami = new Lebensmittel("Die Ofenfrische Salami", 2.50, LocalDate.now(), 320, 200, true);
		Lebensmittel.addLebensmittel(dieOfenFrischeSalami);
		
		
		/***
		 * Befüllen des Lagers mit Medien Artikeln
		 */
		
		Medien eminemRelapseAlbum = new Medien("Eminem mit dem Album Relapse" ,9.99, LocalDate.now(), "Album von Eminem", Untergruppen.MEDIEN, true, Filmgenre.KEINE, 2009);
		Medien.addMedien(eminemRelapseAlbum);
		
		Medien theRaid = new Medien("The Raid Actionfilm" , 7.99, LocalDate.now(), "Actionfilm", Untergruppen.MEDIEN, true, Filmgenre.ACTION, 2011);
		Medien.addMedien(theRaid);
		
		Medien dieGeissensStaffel3 = new Medien("Die Geissens Staffel 3 DVD", 15.00, LocalDate.now(), "DVD von den Geissens", Untergruppen.MEDIEN, true, Filmgenre.HUMOR, 2015);
		Medien.addMedien(dieGeissensStaffel3);
		
		Medien intelligentInvestierenBenjaminGraham = new Medien("Buch Intelligent investieren von Benjamin Graham" , 30.00, LocalDate.now(), "Buch investieren", Untergruppen.MEDIEN, false, Filmgenre.KEINE, 2016);
		Medien.addMedien(intelligentInvestierenBenjaminGraham);
		
		Medien sakrileg = new Medien("das Buch Sakrileg" , 9.99, LocalDate.now(), "Buch zu dem Bestseller Sakrileg", Untergruppen.MEDIEN,false, Filmgenre.KEINE, 2003);
		Medien.addMedien(sakrileg);
		
		Medien volbeatRewindReplayRebound = new Medien("Volbeat mit dem Album Rewind Replay Rebound" , 20.00, LocalDate.now(), "Musik Album Volbeat", Untergruppen.MEDIEN, true, Filmgenre.KEINE, 2019);
		Medien.addMedien(volbeatRewindReplayRebound);
		
		Medien romeTotalWar2Computer = new Medien("Computerspiel Rome Total War 2 von Creative Assembly " , 18.99, LocalDate.now(), "Computerspiel Strategie", Untergruppen.MEDIEN, true, Filmgenre.KEINE, 2013);
		Medien.addMedien(romeTotalWar2Computer);
		
		Medien battlefield5Computer = new Medien("Computerspiel Battlefield 5 von Electronic Arts", 30.00, LocalDate.now(), "Computerspiel Ego Shooter", Untergruppen.MEDIEN, true, Filmgenre.KEINE, 2018);
		Medien.addMedien(battlefield5Computer);
		
		Medien mrBeanZeichentrickSerieStaffel2 = new Medien("Mr Bean die Cartoon Zeichentrick Serie Staffel 2" , 19.99, LocalDate.now(), "Zeichentrick Serie", Untergruppen.MEDIEN, true, Filmgenre.HUMOR, 2006);
		Medien.addMedien(mrBeanZeichentrickSerieStaffel2);
		
		Medien einerFlogUeberDasKuckucksnestFilm = new Medien("Einer Flog über das Kuckucksnest" , 5.99, LocalDate.now(), "DVD Film von 1975", Untergruppen.MEDIEN, false, Filmgenre.DRAMA, 1975);
		Medien.addMedien(einerFlogUeberDasKuckucksnestFilm);
		
		
		/***
		 * Befüllen des Lagers mit NonFood Artikeln
		 */
		
		NonFoodArtikel somatSpuelmaschinenSalz = new NonFoodArtikel("Somat Spülmaschinensalz" , 1.99, LocalDate.now(), "Spülmaschinensalz für Geschirrspüler", Untergruppen.DROGERIEARTIKEL);
		NonFoodArtikel.addNonFoodArtikel(somatSpuelmaschinenSalz);
		
		NonFoodArtikel funnyToilettenPapier = new NonFoodArtikel("dreilagiges Toilettenpapier von der Firma Funny" , 2.29, LocalDate.now(), "Toilettenpapier Funny", Untergruppen.DROGERIEARTIKEL);
		NonFoodArtikel.addNonFoodArtikel(funnyToilettenPapier);
		
		NonFoodArtikel reinigungsgelHautklarGarnier = new NonFoodArtikel("Reinigungsgel Hautklar Reinigungs- & Abschmink-Gel 2 in 1" , 4.95, LocalDate.now(), "200ml Reinigungsgel", Untergruppen.DROGERIEARTIKEL);
		NonFoodArtikel.addNonFoodArtikel(reinigungsgelHautklarGarnier);
		
		NonFoodArtikel yumayaNagelschereEdelstahl = new NonFoodArtikel("YUMAYA Profi Nagelschere Edelstahl rostfrei" , 12.95, LocalDate.now(), "Nagelschere von YUMAYA", Untergruppen.DROGERIEARTIKEL);
		NonFoodArtikel.addNonFoodArtikel(yumayaNagelschereEdelstahl);
		
		NonFoodArtikel somatClassicsSpuellmaschinenTabs= new NonFoodArtikel("Somat Classic 82 Tabs Spüllmaschinentabs" , 5.00, LocalDate.now(), "für die Geschirrspülmaschine", Untergruppen.DROGERIEARTIKEL);
		NonFoodArtikel.addNonFoodArtikel(somatClassicsSpuellmaschinenTabs);
		
		NonFoodArtikel jamesBond007Spectre = new NonFoodArtikel("James Bond 007 Spectre DVD" , 12.00, LocalDate.now(), "James Bond Film mit Daniel Craig", Untergruppen.FILME);
		NonFoodArtikel.addNonFoodArtikel(jamesBond007Spectre);
		
		NonFoodArtikel acDcBlackIce = new NonFoodArtikel("Das Album AC/DC Black Ice aus 2008" , 16.99, LocalDate.now(), "Album aus 2008", Untergruppen.MEDIEN);
		NonFoodArtikel.addNonFoodArtikel(acDcBlackIce);
		
		NonFoodArtikel jackAndJonesTshirtBlau = new NonFoodArtikel("Jack and Jones T-Shirt in Blau" , 15.99, LocalDate.now(), "T-shirt von Jack & Jones", Untergruppen.KLEIDUNG);
		NonFoodArtikel.addNonFoodArtikel(jackAndJonesTshirtBlau);
		
		NonFoodArtikel yamtionLaptopRucksack= new NonFoodArtikel("Yamtion Laptop Rucksack mit USB Ladeanschluss" , 29.99, LocalDate.now(), "Rucksack für Laptops", Untergruppen.KLEIDUNG);
		NonFoodArtikel.addNonFoodArtikel(yamtionLaptopRucksack);
		
		NonFoodArtikel pampersPremiumWindelnGr1 = new NonFoodArtikel("Pampers Größe 1 Premium Protection Baby Windeln, 96 Stück," , 14.58, LocalDate.now(), "Windeln für Babys", Untergruppen.DROGERIEARTIKEL);
		NonFoodArtikel.addNonFoodArtikel(pampersPremiumWindelnGr1);
		
	}

}
 