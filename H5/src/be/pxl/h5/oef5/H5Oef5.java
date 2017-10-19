package be.pxl.h5.oef5;

/*Oefening 5
 * 
 * Geef een geldbedrag in euro’s in (geen eurocenten). Hoeveel briefjes van 20 euro kan je hiermee maken? Wat is het restbedrag?
 */

import java.util.Scanner;

public class H5Oef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int bedrag, aantalBriefjesVan20, restBedrag;
		
		//Gegevens opvragen aan de gebruiker
		System.out.println("Geef een (geheel) bedrag in: ");
		bedrag = keyboard.nextInt();
		
		//Berekeningen
		aantalBriefjesVan20 = bedrag / 20;
		restBedrag = bedrag % 20;
		
		//Printen
		System.out.println("Met een bedrag van " + bedrag + " euro, kan je " + aantalBriefjesVan20 + " briefje(s) van 20 euro maken en heb je " + restBedrag + " euro over.");
		keyboard.close();
	}

}
