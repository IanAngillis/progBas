package be.pxl.h4h5.iteratie.oef2;

/*Oefeningen op iteratie: Oefening 2
 * 
 * Lees twee getallen in, maak er de som en het verschil van en druk dit af.
 * Herhaal dit tot de twee getallen die men ingeeft beiden nul zijn.
 */

import java.util.Scanner;

public class H4H5IteratieOef2 {

	public static void main(String[] args) {
		//Aanmaken Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Declaratie variabelen
		int getal1;
		int getal2;
		int som;
		int verschil;
		
		System.out.println("Getal 1: ");
		getal1 = keyboard.nextInt();
		
		System.out.println("Getal 2: ");
		getal2 = keyboard.nextInt();
		
		while((getal1 != 0) && (getal2 != 0)) {
			som = getal1 + getal2;
			verschil = getal1 - getal2;
			
			System.out.println("Som: " + getal1 + " + " + getal2 + " = " + som);
			System.out.println("Som: " + getal1 + " - " + getal2 + " = " + verschil);
			
			System.out.println("Getal 1: ");
			getal1 = keyboard.nextInt();
			
			System.out.println("Getal 2: ");
			getal2 = keyboard.nextInt();
		}
		
		System.out.println("***PROGRAMMA SLUITEN***");
		keyboard.close();
	}

}
