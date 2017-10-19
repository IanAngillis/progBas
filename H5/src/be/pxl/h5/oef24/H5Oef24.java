package be.pxl.h5.oef24;

/*Oefening 24
 * 
 * Schrijf een programma om de prijs van de huur van films en de huurtijd te berekenen. Je geeft het aantal films in die een persoon huurt. Vervolgens geef je per film het genrenummer (getal bestaande uit 5 cijfers), 
 * het aantal sterren, het jaar van uitgave en de speeltijd in minuten in.
 * De huurprijs wordt als volgt berekend:
 * 		4 en 5 sterrenfilms kosten 4,5€ 3 en 2 sterrenfilms kosten 3,75€ 1 sterrenfilms kosten 3€
 * 		Voor films ouder dan 10 jaar betaal je 0,50€ minder.
 * 		Let op: beide voorgaande regels gelden niet voor tekenfilms (genrenummer begint met een 1). Hiervoor geldt een huurprijs van 0,5 eurocent per minuut speeltijd.
 * 
 * De huurtijd wordt als volgt berekend:
 * 		voor recente films (films die hoogstens 2 jaar oud zijn), die ofwel 5 sterren hebben, ofwel van het genre science fiction (genrenummer begint met een 5) zijn, geldt een huurtijd van 1 dag, voor anderen 2 dagen.
 * Maak voor het berekenen van de huurprijs en de huurtijd gebruik van methoden. Druk per persoon voor elke gehuurde film de kostprijs en de huurtijd af. Druk ook de totale kostprijs af en de gemiddelde kostprijs per film af.
 * Voorbeeld van afdruk voor een persoon die 3 films huurt Film1 € 4.5 1 dag Film2 € 3.75 2 dagen Film3 € 2.5 2 dagen Te betalen: € 10.75 Gemiddelde kostprijs per film: € 3.5833333
 * Extra: Zorg ervoor dat het gemiddelde wordt weergegeven met 2 decimalen.
 */

import java.util.Scanner;

public class H5Oef24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aantalFilms, genreNummer, aantalSterren, jaarVanUitgave, speeltijdMinuten, huurTijd, gemiddeldBedragInt, gemiddeldBedragDecimalen;
		double huurprijs, totaalbedrag = 0, gemiddeldbedrag;
		
		//Input vragen aan de gebruiker
		System.out.println("Aantalfilms: ");
		aantalFilms = keyboard.nextInt();
		
		for(int i = 0; i < aantalFilms; i++) {
			System.out.println("Genre nummer (1 - 5): ");
			genreNummer = keyboard.nextInt();
			
			System.out.println("rating (1-5): ");
			aantalSterren = keyboard.nextInt();
			
			System.out.println("Jaar van uitgave: ");
			jaarVanUitgave = keyboard.nextInt();
			
			System.out.println("Speeltijd (minuten): ");
			speeltijdMinuten = keyboard.nextInt();
			
			huurprijs = Huurprijs(aantalSterren, jaarVanUitgave, speeltijdMinuten, genreNummer);
			totaalbedrag += huurprijs;
			
			huurTijd = Huurtijd(aantalSterren, jaarVanUitgave, genreNummer);
			
			if(huurTijd == 1) {
				System.out.println("Film " + (i+1) + " " + huurprijs + " " + huurTijd + " dag");
			} else {
				System.out.println("Film " + (i+1) + " " + huurprijs + " " + huurTijd + " dagen");
			}
			
		}
		
		if(aantalFilms == 0) {
			System.out.println("Geen films");
		} else {
			gemiddeldbedrag = totaalbedrag / aantalFilms;
			
			//Berekeningen voor bedrag uit te schrijven met 2 decimalen na de komma.
			gemiddeldBedragInt = (int)gemiddeldbedrag;
			gemiddeldBedragDecimalen = (int)(gemiddeldbedrag * 100) - (gemiddeldBedragInt * 100);
			//System.out.println(gemiddeldBedragInt);
			//System.out.println(gemiddeldBedragDecimalen);
			
			
			System.out.println("Te betalen: " + totaalbedrag);
			System.out.println("Gemiddelde kostprijs per film: " + gemiddeldBedragInt + "." + gemiddeldBedragDecimalen);
		}
		
		
		keyboard.close();

	}
	
	public static double Huurprijs(int aantalSterren, int jaarVanUitGave, int speeltijdMinuten, int genreNummer) {
		
		double prijs = 0;
		final int CURRENTYEAR;
		CURRENTYEAR = 2017;
		
		if (genreNummer == 1) {
			prijs = speeltijdMinuten * 0.5;
			System.out.println(prijs);
			return prijs;
		} else {
			if((aantalSterren == 4) || (aantalSterren == 5)) {//Bepaal prijs a.d.h.v. rating
				prijs += 4.5;
			} else if ((aantalSterren == 2) ||(aantalSterren == 3 )) {
			prijs += 3.75;
			} else {
			prijs += 3;
			}
			//Controleer of de film ouder is dan 10 jaar
			if(CURRENTYEAR - jaarVanUitGave > 10) {
				prijs -= 0.5;
			}
			System.out.println(prijs);
			return prijs;
	
		}
		
	}
	
	public static int Huurtijd(int aantalSterren, int jaarVanUitGave, int genreNummer) {
		
		int aantalDagen;
		final int CURRENTYEAR = 2017;
		
		if(((CURRENTYEAR - jaarVanUitGave) <= 2) || (aantalSterren == 5) || (genreNummer == 5)) {
			aantalDagen = 1;
			return aantalDagen;
		} else {
			aantalDagen = 2;
			return aantalDagen;
		}
		
	}
		
}
