package be.pxl.h5.exoef3;

/*Extra Oefening 3
 * 
 * Een handelaar in op maat gemaakte zwembaden wenst snel te kunnen uitrekenen hoeveel liter water en ontsmettingsmiddel in een zwembad van een bepaalde grootte kunnen. 
 * 100 liter zwembadwater moet 98 l water bevatten en 2 liter ontsmettingsmiddel. 
 * De lengte, breedte en diepte van het zwembad (uitgedrukt in meter) worden ingevoerd, 
 * waarna aantal liter water en aantal liter ontsmettingsmiddel afgedrukt worden (zonder cijfers na de komma).
 */

import java.util.Scanner;

public class H5ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double WATERPERCENTAGE = 0.98;
		final double ONTSMETTINGSMIDDELPERCENTAGE = 0.02;
		
		double lengte, breedte, diepte, water, ontsmetting, totaalAantalL;
		int waterInt, ontsmettingsInt;
		
		
		System.out.println("Lengte: ");
		lengte = keyboard.nextDouble();
		
		System.out.println("Breedte: ");
		breedte = keyboard.nextDouble();
		
		System.out.println("Diepte: ");
		diepte = keyboard.nextDouble();
		
		totaalAantalL = lengte * breedte * diepte;
		water = totaalAantalL * WATERPERCENTAGE;
		ontsmetting = totaalAantalL * ONTSMETTINGSMIDDELPERCENTAGE;
		
		waterInt = (int)(water * 100);
		ontsmettingsInt = (int)(ontsmetting * 100);
		
		System.out.println("Voor een zwembad van " + totaalAantalL + " kubieke meter heeft de handelaar " + waterInt + "l water nodig en " + ontsmettingsInt + "l ontsmettingsmiddel nodig.");
		
		keyboard.close();
	}

}
