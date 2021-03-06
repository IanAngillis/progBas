package be.pxl.h4h5.sequentie.oef3;

/*Oefeningen op sequentie
 * 
 * Oefening 3
 * 
 * Schrijf een programma dat het btw percentage berekent en afdrukt. Via he toetsenbord
 * wordt de prijs inclusief BTW en de prijs exclusief BTW ingegeven. 
 * Opmerking: een percentage van 21% moet afgedrukt worden als 0.21.
 */

import java.util.Scanner;

public class H4H5SequentieOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float bedragInclusiefBtw, bedragExclusiefBtw, btwTarief;
		
		System.out.println("Bedrag inclusief btw: ");
		bedragInclusiefBtw = keyboard.nextFloat();
		
		System.out.println("Bedrag exclusief btw: ");
		bedragExclusiefBtw = keyboard.nextFloat();
		
		btwTarief = bedragInclusiefBtw/bedragExclusiefBtw;
		
		btwTarief -= 1;
		
		System.out.println("Het btw-tarief is " + btwTarief);
		
		keyboard.close();
	}

}
