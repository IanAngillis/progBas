package be.pxl.h5.oef3;

/*Oefening 3
 * 
 * Wat kost mijn auto? Prijsbewust personen willen weten hoeveel het verbruik per jaar van
 * hun auto echt kost.
 * Achtereenvolgens wordt ingevoerd:
 * 	aantal afgelegde km per jaar (afgKm)
 * 	verbruik in l per 100 km (verbruik)
 * 	prijs van 1l brandstof (prijsL)
 * 
 * Als uitvoer wordt verlangd:
 * 	De totale verbruikskosten per jaar voor het aantal opgegeven km
 * 	De kostprijs per km rijden. 
 */

import java.util.Scanner;

public class H5Oef3 {
	public static void main(String[] args) {
		//Aanmaken scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Aanmaken variabelen
		int afgKm;
		double verbruik, prijsL, prijsPerKm, totaleKostenPlaatje;
		
		//Gegevens vragen aan de gebruiker
		System.out.println("Aantal afgelegde kilometers in een jaar: ");
		afgKm = keyboard.nextInt();
		
		System.out.println("liter per 100 km: ");
		verbruik = keyboard.nextFloat();
		
		System.out.println("Prijs van 1l brandstof: ");
		prijsL = keyboard.nextFloat();
		
		//Berekeningen
		totaleKostenPlaatje = afgKm * verbruik * prijsL;
		prijsPerKm = totaleKostenPlaatje/afgKm;
		
		System.out.println("Het totale kostenplaatje is: " + totaleKostenPlaatje + " euro.");
		System.out.println("De prijs per km is: " + prijsPerKm + " euro.");
		
		keyboard.close();
	}
}
