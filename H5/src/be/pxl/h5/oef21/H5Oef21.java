package be.pxl.h5.oef21;

/*Oefening 21
 * 
 * Vertrek van de oplossing van oefening 10 en pas je oplossing aan.
 * Schrijf een programma voor het berekenen van de eindejaarspremie voor de bedienden van een firma. 
 * Volgende gegevens dienen ingegeven te worden: bruto jaarwedde en de beoordelingscode. 
 * De invoer eindigt wanneer voor de bruto jaarwedde de waarde 0 wordt ingegeven. 
 * De berekening van de eindejaarspremie dient met een methode te gebeuren. 
 * Druk het percentage af van de personeelsleden dat de code schitterend heeft.
 */

import java.util.Scanner;

public class H5Oef21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double jaarwedde, eindejaarspremie;
		int code;
		
		System.out.println("Bruto jaarwedde: ");
		jaarwedde = keyboard.nextDouble();
		
		while(jaarwedde != 0) {
			System.out.println("Beoordelingscode (1 - 5): ");
			code = keyboard.nextInt();
			
			eindejaarspremie = EindejaarspremieCalculator(jaarwedde, code);
			
			System.out.println("Eindejaarspremie: " + eindejaarspremie  + " euro.");
			
			System.out.println("Bruto jaarwedde: ");
			jaarwedde = keyboard.nextDouble();
			
		}
		
		System.out.println("*** SLUITEN PROGRAMMA ***");
		keyboard.close();
	}
	
	//Berekent eindejaarspremie
	public static double EindejaarspremieCalculator(double jaarwedde, int code) {
		
		double beoordelingscodeProcent = 0, vastGedeelte, variabelGedeelte, eindejaarspremie;
		
		switch (code) {
		case 1:
			beoordelingscodeProcent = 0;
			break;
		
		case 2:
			beoordelingscodeProcent = 0.18;
			break;
			
		case 3:
			beoordelingscodeProcent = 0.25;
			break;
			
		case 4:
			beoordelingscodeProcent = 0.33;
		
		default:
			System.out.println("Geen correcte beoordelingscode");
					
	}
	
	//Berekenen eindejaarspremie
	vastGedeelte = jaarwedde / 20;
	//System.out.println(vastGedeelte);
	variabelGedeelte = vastGedeelte * beoordelingscodeProcent;
	//System.out.println(beoordelingscodeProcent);
	eindejaarspremie = vastGedeelte + variabelGedeelte;
	
	return eindejaarspremie;
		
	}

}
