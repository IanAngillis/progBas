package be.pxl.h5.oef6;

/*Oefening 6
 * 
 * De eenheidsprijs van een bepaald artikel is €11,5 het btwPercentage bedraagt 21%. Vraag de klant hoeveel artikels hij wil bestellen. 
 * Op de totale prijs inclusief BTW wordt een reductie van 10% gegeven indien het bedrag hoger is dan 1.000 euro. Toon het bedrag dat de klant moet betalen.
 */

import java.util.Scanner;

public class H5Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double EENHEIDSPRIJS = 11.5;
		final double BTWPERCENTAGE = 0.21; //
		int aantalArtikels;
		double prijsExclusiefBtw, prijsInclusiefBtw, btwBedrag, kortingsTarief = 0.1, korting;
		
		//Input vragen aan de gebruiker
		System.out.println("Aantal artikels: ");
		aantalArtikels = keyboard.nextInt();
		
		prijsExclusiefBtw = EENHEIDSPRIJS * aantalArtikels;
		//System.out.println(prijsExclusiefBtw); Controle
		btwBedrag = prijsExclusiefBtw * BTWPERCENTAGE;
		//System.out.println(btwBedrag); Controle
		prijsInclusiefBtw = prijsExclusiefBtw + btwBedrag;
		
		if (prijsInclusiefBtw > 1000) {
			korting = prijsInclusiefBtw * kortingsTarief;
			prijsInclusiefBtw -= korting;
			System.out.println("Er wordt een korting van " + korting + " euro toegekend.");
		}
		
		System.out.println("Te betalen bedrag: " + prijsInclusiefBtw);
		
		keyboard.close();
	}

}
