package be.pxl.h5.oef2;

/*Oefening 2
 * 
 * De eenheidsprijs van een bepaald artikel is €11,5, het btw percentage bedraagt 21%. Vraag
 * de klant hoeveel artikels hij wil bestellen en toon dan het bedrag exclusief btw, het btw -
 * bedrag en het bedrag inclusief btw.
 */

import java.util.Scanner;

public class H5Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Aanmaken variabelen
		int aantalArtikels;
		double btwPercentage = 0.21, eenheidsprijs = 11.5, bedragInclusiefBtw, btwBedrag, bedragExclusiefBtw;
		
		//Input vragen aan de gebruiker
		System.out.println("Aantal artikels aan €11.5/stuk: ");
		aantalArtikels = keyboard.nextInt();
		
		//Berekeninegn
		bedragExclusiefBtw = eenheidsprijs * aantalArtikels;
		//System.out.println(bedragExclusiefBtw); Contole
		btwBedrag = bedragExclusiefBtw * btwPercentage;
		//System.out.println(btwBedrag); Controle
		bedragInclusiefBtw = bedragExclusiefBtw + btwBedrag;
		
		//Printen informatie
		System.out.println("Bedrag exclusief btw: " + bedragExclusiefBtw);
		System.out.println("Bedrag btw: " + btwBedrag);
		System.out.println("Bedrag inclusief btw: " + bedragInclusiefBtw);
		
		keyboard.close();
	}

}
