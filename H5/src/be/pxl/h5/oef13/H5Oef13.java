package be.pxl.h5.oef13;

/*Oefening 13
 * 
 * Schrijf een programma dat een getal tussen 1 en 100 opvraagt. Zorg ervoor dat elke foutieve invoer geweigerd wordt. 
 * Telkens een verkeerde invoer gebeurt dient er op het scherm een foutboodschap te verschijnen. 
 * Ofwel “Fout! Het getal moet groter zijn dan 1” ofwel, “Fout! Het getal moet kleiner zijn dan 100”. 
 * Het programma stopt als er een juiste invoer gedaan is. Het getal wordt dan weergegeven op het scherm.
 */

import java.util.Scanner;

public class H5Oef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		boolean loopController = true;
		int getal;
		
		while(loopController) {
			System.out.println("Geef een geheel getal in: ");
			getal = keyboard.nextInt();
			
			if (getal < 1) {
				System.out.println("Fout! Het getal moet groter zijn dan 1.");
			} else if (getal > 99) {
				System.out.println("Fout! Het getal moet kleiner zijn dan 100.");
			} else {
				
				System.out.println(getal);
				loopController = false;
			}
		}
		
		keyboard.close();
	}
}
