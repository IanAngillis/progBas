package be.pxl.h5.oef18;

/*Oefening 18
 * 
 * Schrijf een programma om van een ingevoerd getal de faculteit te berekenen (bvb. faculteit van het getal 5: 5! = 1󫎿󫶙). 
 * Geef een afdruk van deze waarde. 
 * Meerdere getallen kunnen ingevoerd worden. 
 * Het programma eindigt wanneer voor het getal een 0 wordt ingegeven.
 */

import java.util.Scanner;

public class H5Oef18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal, faculteit;
		
		System.out.println("Geheel getal: ");
		getal = keyboard.nextInt();
		
		while(getal != 0) {
			
			faculteit = 1;
			
			for (int i = 0; i < getal; i++) {
				faculteit *= (getal - i);
			}
			
			System.out.println("De faculteit van " + getal + " is " + faculteit);
			System.out.println("Geheel getal: ");
			getal = keyboard.nextInt();
		}
		
		System.out.println("*** Programma sluiten ***");
		keyboard.close();
	}

}
