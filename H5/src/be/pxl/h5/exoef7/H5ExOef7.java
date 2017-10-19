package be.pxl.h5.exoef7;

/*Extra Oefening 7
 * 
 * In een handelszaak wenst men in het kader van de boekhouding de verkoopprijs inclusief BTW
 * van de verkochte artikelen uit te splitsen in het bedrag van de BTW en de verkoopprijs
 * exclusief BTW.
 * Geef de BTWcode en de verkoopprijs inclusief BTW in via het toetsenbord.
 * Als de BTWcode gelijk is aan
 * 		1 BTWpercentage 6%
 * 		2 BTWpercentage 17%
 * 		3 BTWpercentage 19%
 * 		4 BTWpercentage 25%
 * 		5 BTWpercentage 33%
 * 
 * In alle andere gevallen is het BTWpercentage 21%.
 * Geef een afdruk van het BTWpercentage, de verkoopprijs exclusief BTW en het BTWbedrag.
 * 
 * Extra 1: In plaats van BTWcode wordt een artikelnummer ingegeven dat bestaat uit 4
 * 		cijfers. In plaats van als de BTWcode gelijk is aan => als het 1ste cijfer van het
 * 		artikelnummer gelijk is aan. Je geeft dan een afdruk van het artikelnummer, het
 * 		BTWpercentage, de verkoopprijs exclusief Btw en het BTWbedrag.
 * 	
 * Extra 2: In plaats van BTWcode wordt een artikelnummer ingegeven. In plaats van als de
 * 		BTWcode gelijk is aan => als het laatste cijfer van het artikelnummer gelijk is
 * 		aan. Je geeft dan een afdruk van het artikelnummer, het BTWpercentage, de
 * 		verkoopprijs exclusief Btw en het BTWbedrag.
 *
 *TODO EXTRAS
 */

import java.util.Scanner;

public class H5ExOef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int btwCode;
		double btwPercentage = 0, prijsInclusiefBtw, prijsExclusiefBtw, btwBedrag;
		
		System.out.println("Verkoopprijs (inclusief btw):" );
		prijsInclusiefBtw = keyboard.nextFloat();
		
		System.out.println("BTWcode (1 - 5):");
		btwCode = keyboard.nextInt();
		
		switch(btwCode) {
			case 1: btwPercentage = 1.06;
				System.out.println("...BTW PERCENTAGE 6% ...");
					break;
			
			case 2: btwPercentage = 1.17;
			System.out.println("...BTW PERCENTAGE 17% ...");
					break;
					
			case 3: btwPercentage = 1.19;
			System.out.println("...BTW PERCENTAGE 19% ...");
					break;
					
			case 4: btwPercentage = 1.25;
					System.out.println("...BTW PERCENTAGE 25% ...");
					break;
					
			case 5: btwPercentage = 1.33;
					System.out.println("...BTW PERCENTAGE 33% ...");
					break;
			
			default:	
				btwPercentage = 1.21;
				System.out.println("...BTW PERCENTAGE 21% ...");
		}
		
		btwBedrag = prijsInclusiefBtw / btwPercentage;
		prijsExclusiefBtw = prijsInclusiefBtw - btwBedrag;
		
		System.out.println("BTW-bedrag: " + btwBedrag);
		System.out.println("Prijs exclusief btw: " + prijsExclusiefBtw);
		
		keyboard.close();
	}

}
