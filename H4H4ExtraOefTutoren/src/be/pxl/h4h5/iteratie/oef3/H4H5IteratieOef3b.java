package be.pxl.h4h5.iteratie.oef3;

/*Oefeningen op iteratie: Oefening 3a
 * 
 * a) Geef via het toetsenbord de dagtemperaturen in voor de maand januari
 * 		Gevraagd: druk de gemiddelde temperatuur af.
 * 
 * b) Idem als &, maar de temperatuur wordt gedurende een bepaalde periode ingegeven. 
 * De ingave eindigt met 0.
 * 
 * 
 */

import java.util.Scanner;

public class H4H5IteratieOef3b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aantalDagen = 0;
		double temperatuur;
		double gemiddeldeTemperatuur;
		double totaalTemperatuur = 0;
		
		System.out.println("Temperatuur dag 1: ");
		temperatuur = keyboard.nextDouble();
		
		while(temperatuur != 0) {
			aantalDagen++;
			
			totaalTemperatuur += temperatuur;
			
			System.out.println("Temperatuur dag " + (aantalDagen+1) + " : ");
			temperatuur = keyboard.nextDouble();
		}
		
		gemiddeldeTemperatuur = totaalTemperatuur / aantalDagen;
		
		System.out.println("De gemiddelde temperatuur over " + aantalDagen + " dagen was " + gemiddeldeTemperatuur + " graden Celsius.");
		keyboard.close();
	}

}
