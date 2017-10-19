package be.pxl.h4h5.iteratie.oef3;

/*Oefeningen op iteratie: Oefening 3a
 * 
 * a) Geef via het toetsenbord de dagtemperaturen in voor de maand januari
 * 		Gevraagd: druk de gemiddelde temperatuur af.
 * 
 * b) Idem als &, maar de temperatuur wordt gedurende een bepaalde periode ingegeven. De ingave eindigt met 0.
 * 
 * 
 */

import java.util.Scanner;

public class H4H5IteratieOef3a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double temperatuur;
		double totaalTemperatuur = 0;
		double gemiddeldeTemperatuur;
		
		for(int i = 0; i < 31; i++) {
			
			System.out.println("Temperatuur " + (i+1) + " januari: ");
			temperatuur = keyboard.nextDouble();
			
			totaalTemperatuur += temperatuur;
		}
		gemiddeldeTemperatuur = (totaalTemperatuur / 31);
		
		System.out.println("De gemiddelde temperatuur in de maand januari was " + gemiddeldeTemperatuur + " graden Celsius.");
		
		keyboard.close();
	}

}
