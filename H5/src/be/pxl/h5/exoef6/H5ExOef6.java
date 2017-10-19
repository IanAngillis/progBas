package be.pxl.h5.exoef6;

/*Extra Oefening 6
 * 
 * Bereken de vereiste frankering van een brief waarvan het gewicht via het toetsenbord 
 * wordt ingegeven. Gebruik hierbij de volgende tarieven: 
 * massa van de brief bedrag (in euro) 
 * 		tot en met 20 gram 0.3 
 * 		tot en met 50 gram 0.5 
 * 		tot en met 150 gram 0.7 
 * 		tot en met 250 gram 1.0 
 * 		meer dan 250 gram 1.9.
 */

import java.util.Scanner;

public class H5ExOef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int gewicht;
		
		System.out.println("Gewicht van de brief in gram: ");
		gewicht = keyboard.nextInt();
		
		if(gewicht > 250) {
			System.out.println("De vereiste frankering is 1,9 euro");
		} else if (gewicht > 150 ) {
			System.out.println("De vereiste frankering is 1.0 euro");
		} else if (gewicht > 50) {
			System.out.println("De vereiste frankering is 0.7 euro");
		} else if (gewicht  > 20) {
			System.out.println("De vereiste frankering is 0.5 euro");
		} else {
			System.out.println("De vereiste frankering is 0.3 euro");
		}
		
		keyboard.close();
	}

}
