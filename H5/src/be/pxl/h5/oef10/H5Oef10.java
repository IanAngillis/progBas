package be.pxl.h5.oef10;

/*Oefening 10
 * 
 * Schrijf een programma voor het berekenen van de eindejaarspremie voor de bedienden van een firma. 
 * Volgende gegevens dienen ingegeven te worden: bruto jaarwedde en beoordelingscode 
 * (1 = slecht, 2 = voldoende, 3 = goed, 4 = schitterend)
 * Berekening van de eindejaarspremie: Het vaste gedeelte van het premiebedrag bedraagt 1/20ste van de bruto jaarwedde. 
 * Het variabele gedeelte is als volgt samengesteld: een bepaald percentage naargelang de beoordelingscode:
 * 
 * 		0% van het vaste gedeelte indien code = 1 
 * 		18% van het vaste gedeelte indien code = 2 
 * 		25% van het vaste gedeelte indien code = 3 
 * 		33% van het vaste gedeelte indien code = 4
 * 
 * Geef via het toetsenbord de bruto jaarwedde en de beoordelingscode in. 
 * Druk de eindejaarspremie af.
 */

import java.util.Scanner;

public class H5Oef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double jaarwedde, vastGedeelte, variabelGedeelte, eindejaarspremie, beoordelingscodeProcent = 0;
		int code;
		
		System.out.println("Bruto jaarwedde: ");
		jaarwedde = keyboard.nextDouble();
		
		System.out.println("Beoordelingscode (1 - 5): ");
		code = keyboard.nextInt();
		
		//Verwerken beoordelingscode
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
		
		System.out.println("Eindejaarspremie: " + eindejaarspremie  + " euro.");
		
		
		keyboard.close();
	}
}
