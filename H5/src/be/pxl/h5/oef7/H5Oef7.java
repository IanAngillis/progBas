package be.pxl.h5.oef7;

/*Oefening 7
 * 
 * De prijs van een vliegtuigticket wordt bepaald door een aantal factoren, nl.:
 * 		de lengte van de vlucht of de afstand in km
 * 			<1000 km korte afstandsvlucht: 25 eurocent/km
 * 			1000-2999 km middellange afstandsvlucht: 20 eurocent/km
 * 			>2999 km lange afstandsvlucht: 12 eurocent/km
 * 		de soort vlucht of klasse: toeristenklasse, charter -20%, zakenreis +30%
 * 
 * Schrijf een programma dat de prijs van een vliegtuigticket berekent. De afstand in km en
 * de klasse (1 = toeristenklasse, 2 = charter en 3 = zakenreis) dienen ingegeven te worden.
 * Druk de uiteindelijke ticketprijs af. Deze prijs moet uitgedrukt zijn in euro’s.
 * Extra: prijs afgedrukt in euro’s geen cijfers na de komma laten zien.
 */

import java.util.Scanner;

public class H5Oef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int afstand, klasse;
		double euroPerKm, tarief, prijs;
		
		System.out.println("Aantal kilometer: ");
		afstand = keyboard.nextInt();
		
		System.out.println("Klasse (1/2/3): ");
		klasse = keyboard.nextInt();
		
		System.out.println("*** Ticketprijs berekenen ***");
		
		//Bepaal eurocent/km
		if(afstand > 2999) {
			System.out.println("...lange afstand ...");
			euroPerKm = 0.12;
		} else if (afstand >= 1000){
			System.out.println("...middellange afstand ...");
			euroPerKm = 0.2;
			
		} else {
			System.out.println("...korte afstand...");
			euroPerKm = 0.25;
		}
		
		//Bepaal klasse en dus tarief
		if(klasse == 2) {
			System.out.println("...charter...");
			tarief = 0.8;
		} else if (klasse == 3) {
			System.out.println("...zakenreis...");
			tarief = 1.3;
		} else {
			System.out.println("...touristenklasse...");
			tarief = 1;
		}
		
		//Berekenen prijs
		prijs = (afstand * euroPerKm) * tarief;
		
		System.out.println("Het ticket kost " + prijs + " euro.");
		
		keyboard.close();
	}

}
