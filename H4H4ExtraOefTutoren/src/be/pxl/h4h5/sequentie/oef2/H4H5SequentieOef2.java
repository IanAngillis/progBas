package be.pxl.h4h5.sequentie.oef2;

/*Oefeningen op sequentie
 * 
 * Oefening 2
 * 
 * Schrijf een programma dat de prijs exclusief BTW berekent en afdrukt. Via het toetsenbord
 * wordt de prijs inclusief BTW n het BTW percentage ingegeven.
 */

import java.util.Scanner;

public class H4H5SequentieOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float bedragInclusiefBtw, bedragExclusiefBtw, divider, btwPercentage;
		
		System.out.println("Geef een bedrag in: ");
		bedragInclusiefBtw = keyboard.nextFloat();
		
		System.out.println("Btw percentage: ");
		btwPercentage = keyboard.nextFloat();
		
		divider = (btwPercentage/100) + 1;
		
		System.out.println(divider);
		bedragExclusiefBtw = bedragInclusiefBtw/divider;
		
		System.out.println(bedragInclusiefBtw + " zonder exlusief " + btwPercentage + "% is " + bedragExclusiefBtw);
		
		keyboard.close();

	}

}
