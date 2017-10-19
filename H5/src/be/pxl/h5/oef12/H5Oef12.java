package be.pxl.h5.oef12;

/*Oefening 12
 * 
 * Schrijf een programma om het gewicht van een persoon te berekenen op 3 planeten. 
 * Volgende gegevens worden via het toetsenbord ingevoerd: percentage van het gewicht t.o.v. aarde. 
 * Bvb voor de Maan, Jupiter en Mars.: Maan 16,5%; Jupiter 253,7 % en Mars 37,8%. 
 * AARDE MAAN JUPITER MARS 
 * 50 … … … 
 * 55 … … … … … … … 
 * 120 … … …
 */

import java.util.Scanner;

public class H5Oef12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double gewichtAarde = 50, percentageMaan, percentageMars, percentageJupiter, gewichtMaan, gewichtMars, gewichtJupiter;
		
		//Input vragen aan de gebruiker
		System.out.println("Percentage van het gewicht op de maan t.o.v. de aarde (%): ");
		percentageMaan = keyboard.nextDouble();
		percentageMaan /= 100;
		//System.out.println(percentageMaan);
		
		System.out.println("Percentage van het gewicht op Mars t.o.v. de aarde (%): ");
		percentageMars = keyboard.nextDouble();
		percentageMars /= 100;
		//System.out.println(percentageMars);
		
		System.out.println("Percentage van het gewicht op Jupiter t.o.v. de aarde (%): ");
		percentageJupiter = keyboard.nextDouble();
		percentageJupiter /= 100;
		//System.out.println(percentageJupiter);
		
		System.out.println("AARDE \t MAAN \t MARS \t JUPITER");
		
		for(int i = 0; i < 15; i++) {
			gewichtMaan = gewichtAarde * percentageMaan;
			gewichtMars = gewichtAarde * percentageMars;
			gewichtJupiter = gewichtAarde * percentageJupiter;
			
			System.out.println(gewichtAarde + "\t" + gewichtMaan + "\t" + gewichtMars + "\t" + gewichtJupiter);
			
			gewichtAarde += 5;
		}
		
		keyboard.close();
	}

}
