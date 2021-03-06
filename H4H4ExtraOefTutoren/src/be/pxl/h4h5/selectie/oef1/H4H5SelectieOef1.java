package be.pxl.h4h5.selectie.oef1;

/*Oefeningen op de selectie
 * 
 * Oefening 1
 * 
 * Geef via het toetsenbord het brutoloon van een werknemer in. gevraagd wordt het
 * jaarlijks vakantiegeld en de jaarlijkse bijdrage te berekenen en af te drukken. Het 
 * vakantiegeld is 5% van dit brutoloon. Is dit vakantiegeld minstens 350 euro, dan is de 
 * jaarlijkse bijdrage gelijk aan 8% van 350 euro. Is dit vakantiegeld kleiner dan 350 euro dan
 * is de jaarlijkse bijdrage 8% van het vakantiegeld. druk af voor deze werknemer: brutoloon, 
 * vakantiegeld en jaarlijkse bijdrage.
 */

import java.util.Scanner;

public class H4H5SelectieOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float brutoloon, vakantieGeld, jaarlijkseBijdrage;
		
		System.out.println("Brutoloon: ");
		brutoloon = keyboard.nextFloat();
		
		vakantieGeld = brutoloon * 0.05f;
		
		if(vakantieGeld >= 350)
		{
			jaarlijkseBijdrage = 350*0.08f;
		} else {
			jaarlijkseBijdrage = vakantieGeld * 0.08f;
		}
		
		System.out.println("Brutoloon: �" + brutoloon);
		System.out.println("Vakantiegeld: �" + vakantieGeld);
		System.out.println("jaarlijkseBijdrage: �" + jaarlijkseBijdrage);
		
		keyboard.close();
	}

}
