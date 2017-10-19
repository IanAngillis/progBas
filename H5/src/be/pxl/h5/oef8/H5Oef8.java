package be.pxl.h5.oef8;

/*Oefening 8
 * 
 * De resultaten van een student behaald op 3 verschillende examens, moeten via het toetsenbord ingegeven worden. 
 * Deze resultaten staan op 20 en alleen gehele punten worden gegeven. 
 * Bepaal het behaald percentage van deze student en geef hiervan een afdruk weer samen met zijn behaalde graad. 
 * 		<60% onvoldoende 
 * 		<70% voldoende 
 * 		<80% onderscheiding 
 * 		<90% grote onderscheiding 
 * 		≥90% grootste onderscheiding.
 */

import java.util.Scanner;

public class H5Oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int resultaat1, resultaat2, resultaat3, totaalResultaat;
		
		System.out.println("Eerste resultaat: ");
		resultaat1 = keyboard.nextInt();
		
		System.out.println("Tweede resultaat: ");
		resultaat2 = keyboard.nextInt();
		
		System.out.println("Derde resultaat: ");
		resultaat3 = keyboard.nextInt();
		
		totaalResultaat = resultaat1 + resultaat2 + resultaat3;
		
		if(totaalResultaat >= 54) {
			System.out.println("Geslaagd met grootste onderscheiding.");
		} else if (totaalResultaat >= 48) {
			System.out.println("Geslaagd met grote onderscheiding.");
		} else if (totaalResultaat >= 42) {
			System.out.println("Geslaagd met onderscheiding.");
		} else if (totaalResultaat >= 36) {
			System.out.println("Voldoende.");
		} else {
			System.out.println("Onvoldoende.");
		}
		
		keyboard.close();
	}

}
