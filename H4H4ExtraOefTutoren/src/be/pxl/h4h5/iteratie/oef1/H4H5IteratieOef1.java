package be.pxl.h4h5.iteratie.oef1;

/*Oefeningen op iteratie: Oefening 1
 * 
 * 10 getallen dienen ingelezen te worden. Druk het product van deze 10 getallen af.
 */

import java.util.Scanner;

public class H4H5IteratieOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Declaratie variabelen
		int product = 1;
		int getal;
		
		//Loop die 10 getallen opvraagt aan de gebruiker en deze met elkaar vermenigvuldigd
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Getal " + (i+1) + ": ");
			getal = keyboard.nextInt();
			
			product *= getal;
		}
		
		System.out.println("Het product van deze tien getallen samen is " + product);
		
		keyboard.close();
	}

}
