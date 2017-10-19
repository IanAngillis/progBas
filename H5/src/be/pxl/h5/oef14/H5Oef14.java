package be.pxl.h5.oef14;

/*Oefening 14
 * 
 * Geef via het toetsenbord artikelnummer, hoeveelheid en eenheidsprijs in. 
 * De invoer eindigt met artikelnummer = 999. 
 * Gevraagd een afdruk van: de gegevens per artikel (artikelnummer, hoeveelheid, eenheidsprijs, bedrag) 
 * het totaal te betalen bedrag per aankoop.
 */

import java.util.Scanner;

public class H5Oef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int artikelNr, hoeveelheid;
		float eenheidsprijs, bedrag, totaalbedrag;
		totaalbedrag = 0;
		
		System.out.println("Geef artikelnummer in: ");
		artikelNr = keyboard.nextInt();
		
		while(artikelNr != 999) {
			System.out.println("Geef de prijs in: ");
			eenheidsprijs = keyboard.nextFloat();
			
			System.out.println("Geef hoeveelheid: ");
			hoeveelheid = keyboard.nextInt();
			
			bedrag = eenheidsprijs * hoeveelheid;
			totaalbedrag += bedrag;
			
			System.out.println("Artikel: " + artikelNr);
			System.out.println("Hoeveelheid: " + hoeveelheid);
			System.out.println("Eenheidsprijs: " + eenheidsprijs);
			System.out.println("Bedrag: " + bedrag);
			
			System.out.println("Geef artikelnummer in: ");
			artikelNr = keyboard.nextInt();
		}
		
		System.out.println("Het totaalbedrag is: " + totaalbedrag);
		keyboard.close();
	}

}
