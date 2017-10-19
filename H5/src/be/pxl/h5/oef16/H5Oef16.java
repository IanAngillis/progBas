package be.pxl.h5.oef16;

/*Oefening 16
 * 
 * Er wordt door renners een tijdrit gereden over een afstand van 36 km. 
 * Van iedere renner wordt inschrijvingsnummer en zijn tijd in seconden gegeven. 
 * Deze gegevens dienen nog ingegeven te worden. 
 * De invoer stopt wanneer er voor het inschrijvingsnummer een negatief getal wordt ingegeven. 
 * We veronderstellen dat alle renners er een verschillende tijd over doen. 
 * Gevraagd: 
 * 		Welke renner is het snelst? 
 * 		Het percentage van de renners dat er langer dan 1 uur over doet? 
 * 
 * Zorg voor volgende afdruk: 	Snelste renner is de renner met inschrijvingsnummer: ......... 
 * 								Het percentage van de renners dat er langer dan 1 uur over doet :………
Extra: Geef van de snelste renner ook zijn tijd in uren, minuten en seconden. En druk dit ook af.
 */

import java.util.Scanner;

public class H5Oef16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int inschrijvingsNummer = 0, seconden, snelsteRenner, snelsteTijd, totaalAantalRenners = 0, aantalRennersMetTijdLangerDanUur = 0, snelsteUur, snelsteMinuten, snelsteSeconden, temp;
		double percentageRennersMetTijdLangerdanUur;
		
		System.out.println("Inschrijvingsnummer: ");
		inschrijvingsNummer = keyboard.nextInt();
		snelsteTijd =  1000000;
		snelsteRenner = inschrijvingsNummer;
		
		//Gegevens opvragen en gegevens bijhouden
		while(inschrijvingsNummer > 0) {
			System.out.println("Tijd in seconden: ");
			seconden = keyboard.nextInt();
			
			totaalAantalRenners++;
			
			if(seconden < snelsteTijd) {
				snelsteTijd = seconden;
				snelsteRenner = inschrijvingsNummer;
			}
			
			if (seconden > 3600) {
				aantalRennersMetTijdLangerDanUur++;
			}
			
			System.out.println("Inschrijvingsnummer: ");
			inschrijvingsNummer = keyboard.nextInt();
	
		}
		
		//Berekeningen uitvoeren en gegevens printen naar de gebruiker
		if (totaalAantalRenners == 0) {
			System.out.println("Geen renners geregistreerd.");
		} else {
			
			//Berekenen snelste tijd in uren, minuten en seconden | copy-paste van code oef 4
			snelsteUur = snelsteTijd/3600;
			temp = snelsteTijd % 3600;
			snelsteMinuten = temp/60;
			snelsteSeconden = temp % 60;
			
			//Berekenen percentage met tijd langer dan uur
			percentageRennersMetTijdLangerdanUur = (double)aantalRennersMetTijdLangerDanUur / totaalAantalRenners;
			percentageRennersMetTijdLangerdanUur *= 100;
			
			//Printen van gegevens
			System.out.println("Snelste renner is de renner met inschrijvingsnummer: " + snelsteRenner);
			System.out.println("De snelste renner heeft de race afgelegd in " + snelsteUur + " uren, " + snelsteMinuten + " minuten en " + snelsteSeconden + " seconden." );
			System.out.println("Het percentage van de renners dat er langer dan 1 uur over doet: " + percentageRennersMetTijdLangerdanUur + "%." );
		}
		
		keyboard.close();
	}

}
