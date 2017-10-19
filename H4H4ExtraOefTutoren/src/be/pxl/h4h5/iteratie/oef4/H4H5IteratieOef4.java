package be.pxl.h4h5.iteratie.oef4;

/*Oefening op iteratie: Oefening 4
 * 
 * Je geeft via het toetsenbord een aantal getallen in. 
 * De computer drukt het grootste en het kleinste getal af. 
 * het aantal getallen wordt vooraf ingelezen. 
 * Je mag ervan uitgaan dat minstens 1 getal wordt ingevoerd.
 */

import java.util.Scanner;

public class H4H5IteratieOef4 {
	public static void main(String[] args) {
		//Aanmaken van Scannerobject
		Scanner keyboard = new Scanner(System.in);
		
		//Declaratie van variabelen
		int aantalGetallen;
		int getal;
		int kleinsteGetal = 0 ;
		int grootsteGetal = 0 ;
		
		
		System.out.println("Hoeveel getallen wil je ingegven: ");
		aantalGetallen = keyboard.nextInt();
		
		for(int i = 0; i < aantalGetallen; i++) {
			
			System.out.println("Getal: ");
			getal = keyboard.nextInt();
			
			if(i == 0) {
				kleinsteGetal = getal;
				grootsteGetal = getal;
			}
			
			if(getal < kleinsteGetal) {
				kleinsteGetal = getal;
			}
			
			if(getal > grootsteGetal) {
				grootsteGetal = getal;
			}
		}
		
		System.out.println("Het grootste getal is: " + grootsteGetal);
		System.out.println("Het kleinste getal is: " + kleinsteGetal);
		
		keyboard.close();
	}
}
