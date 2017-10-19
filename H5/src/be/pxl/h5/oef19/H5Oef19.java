package be.pxl.h5.oef19;

/*Oefening 19
 * 
 * Schrijf een programma om volgende schermafdruk te verkrijgen. 
 * 
 *@ @ @ @ @ @ @ @ @ @
 *@ @ @ @ @ @ @ @ @
 *@ @ @ @ @ @ @ @
 *@ @ @ @ @ @ @
 *@ @ @ @ @ @
 *@ @ @ @ @
 *@ @ @ @
 *@ @ @
 *@ @
 *@
 * 
 * De grootte van de driehoek wordt als gegeven via het toetsenbord ingegeven. 
 * Ter info: de hoogte en de breedte van de driehoek zijn gelijk
 * 
 */

import java.util.Scanner;

public class H5Oef19 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int driehoeksGrootte, remainingLength;
		
		System.out.println("Driehoeksgrootte: ");
		driehoeksGrootte = keyboard.nextInt();
		remainingLength = driehoeksGrootte;
		
		for(int i = 0; i < driehoeksGrootte; i++) {
			System.out.println();
			
			for(int j = 0; j < remainingLength; j++) {
				System.out.print('@');
			}
			
			remainingLength--;
		}
		keyboard.close();
	}
}
