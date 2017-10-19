package be.pxl.h5.oef11;

import java.util.Scanner;

/*Oefening 11
 * 
 * Lees gehele getallen in en druk de som af. 
 * De invoer stopt wanneer je het getal 0 inleest. Druk ook af hoeveel strikt negatieve getallen er werden ingegeven.
 */

public class H5Oef11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal, som = 0, negativeNumbers = 0;
		
		System.out.println("Geef een geheel getal in: ");
		getal = keyboard.nextInt();
		
		while(getal != 0) {
			som += getal;
			
			if(getal < 0) {
				negativeNumbers++;
			}
			
			System.out.println("Geef nog een geheel getal in: ");
			getal = keyboard.nextInt();
		}
		
		System.out.println("De som van alle ingegeven gehele getallen is " + som);
		System.out.println("Er werden " + negativeNumbers + " negatieve getallen ingegeven.");
	
		keyboard.close();
	}

}
