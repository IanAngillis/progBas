package be.pxl.h5.oef20;
//?????????????????????????????
/*Oefening 20
 * 
 * Vertrek van de oplossing van oefening 18 en pas je oplossing als volgt aan: 
 * het berekenen van de faculteit dient met een methode te gebeuren.
 */

import java.util.Scanner;

public class H5Oef20 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal, faculteit;
		
		System.out.println("Geheel getal: ");
		getal = keyboard.nextInt();
		
		while(getal != 0) {
			
			faculteit = Faculteit(getal);
			System.out.println("De faculteit van " + getal + " is " + faculteit);
			System.out.println("Geheel getal: ");
			getal = keyboard.nextInt();
		}
		
		System.out.println("*** Programma sluiten ***");
		keyboard.close();
	}
	
	public static int Faculteit(int x) {
		int faculteit = 1;
					
		for (int i = 0; i < x; i++) {
			faculteit *= (x - i);
		}	

		return faculteit;
	}

}
