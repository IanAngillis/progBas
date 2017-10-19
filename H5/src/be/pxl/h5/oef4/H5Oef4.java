package be.pxl.h5.oef4;

/*Oefening 4
 * Schrijf een programma dat een ingegeven tijd in seconden omzet naar uren, minuten en seconden.
 */

import java.util.Scanner;

public class H5Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int tijd, uren, minuten, seconden, temp;
		
		//Gegevens opvragen aan gebruiker
		System.out.println("Geef de tijd in seconden: ");
		tijd = keyboard.nextInt();
		
		//Berekeningen
		uren = tijd/3600;
		temp = tijd % 3600;
		minuten = temp/60;
		seconden = temp % 60;
		
		//Printen
		System.out.println(tijd + " seconden is gelijk aan " + uren +" uren, " + minuten + " minuten en " + seconden + " seconden.");
		 
		keyboard.close();
	}

}
