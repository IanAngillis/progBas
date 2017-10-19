package be.pxl.h5.oef22;

/*Oefening 22
 * 
 * Een verfhandelaar wenst snel te kunnen uitrekenen hoeveel liter verf nodig is om een plafond te verven. 
 * Hij heeft ongeveer 1 liter verf nodig per 7 m2. 
 * De lengte en breedte van het te verven plafond worden ingevoerd, waarna de benodigde hoeveelheid verf berekend (via een methode) en afgedrukt wordt. 
 * Als de verf verkocht wordt in potten van k liter, hoeveel potten verf heeft hij dan nodig (via een methode berekenen). 
 * k is een geheel getal dat door de gebruiker wordt ingegeven.
 */

import java.util.Scanner;

public class H5Oef22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int k, aantalPotten;
		double verfNodig, lengte, breedte;
		
		System.out.println("Lengte: ");
		lengte = keyboard.nextInt();
		
		System.out.println("Breedte");
		breedte = keyboard.nextInt();
		
		System.out.println("liter/pot?");
		k = keyboard.nextInt();
		
		verfNodig = HoeveelheidBenodigdeVerf(lengte, breedte);
		aantalPotten = BerekenAantalPottenVerf(verfNodig, k);
		//System.out.println(verfNodig);
		//System.out.println(roundNumber);
		
		System.out.println("De benodigde hoeveelheid verf is: " + verfNodig + " l");
		System.out.println("We hebben " + aantalPotten + " potten verf van " + k + "l nodig.");
		
		
		keyboard.close();
	}
	
	public static int BerekenAantalPottenVerf(double verf, int k) {
		
		int aantalPottenVerf, verfNodigAfgerond;
		double verfNodig;
		
		verfNodig = verf / k;
		verfNodigAfgerond = (int)verfNodig;
		aantalPottenVerf = verfNodigAfgerond;
		
		if (verfNodig > verfNodigAfgerond) {
			aantalPottenVerf++;
		}
		
		return aantalPottenVerf;
	}
	
	public static double HoeveelheidBenodigdeVerf(double lengte, double breedte) {
		double verfNodig;
		
		verfNodig = (lengte * breedte)/7;
		
		return verfNodig;
	}

}
