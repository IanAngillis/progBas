package be.pxl.h5.oef15;

/*Oefening 15
 * 
 * Lees via het toetsenbord de temperatuur gemeten om 12u ’s middags in van 10 dagen. 
 * Gevraagd een afdruk van 
 * . de hoogste temperatuur voor deze 10 dagen 
 * . de gemiddelde temperatuur voor deze 10 dagen
 */

import java.util.Scanner;

public class H5Oef15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double temperatuur, temperatuurGemiddelde, temperatuurSom = 0, hoogsteTemperatuur = -1000;
		
		for(int i = 0; i < 10; i++) {
			int dag = i + 1;
			
			System.out.println("Temperatuur 12u 's middags dag " + dag + ": ");
			temperatuur = keyboard.nextDouble();
			
			temperatuurSom += temperatuur;
			
			if (temperatuur > hoogsteTemperatuur){
				hoogsteTemperatuur = temperatuur;
			}
		}
		
		temperatuurGemiddelde = temperatuurSom / 10;
		
		System.out.println("De hoogste temperatuur voor deze 10 dagen was " + hoogsteTemperatuur + "°");
		System.out.println("De gemiddelde temperatuur voor deze 10 dagen was " + temperatuurGemiddelde + "°");
		
		keyboard.close();
	}

}
