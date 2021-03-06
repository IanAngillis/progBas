package be.pxl.h5.exoef13;

/* Extra Oefening 13
 * 
 * Schrijf een programma dat het volgende probleem oplost. 
 * Wat is het eindkapitaal bij een bepaald beginkapitaal dat gedurende een aantal jaren wordt uitgezet?
 * Volgende gegevens dienen ingelezen te worden: beginkapitaal, intrestvoet en het aantal
 * jaren. Maak hierbij gebruik van volgende formule:
 * eindkapitaal = beginkapitaal � (1 + intrestvoet)aantal jaren.
 * Druk na elk jaar het tot dan toe bekomen kapitaal af.
 */

//FOUT TODO
import java.util.Scanner;

public class H5ExOef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double beginKapitaal, intrestvoet, eindKapitaal = 1;
		int aantalJaren;
		
		System.out.println("Beginkapitaal: ");
		beginKapitaal = keyboard.nextDouble();
		
		System.out.println("Intrestvoet (0.%): ");
		intrestvoet = keyboard.nextDouble();
		
		System.out.println("Aantal jaren: ");
		aantalJaren = keyboard.nextInt();
		
		for(int i = 0; i < aantalJaren; i++) {
			eindKapitaal *= (beginKapitaal*(1 + intrestvoet));
			System.out.println("Het eindkapitaal na " + (i+1) + " jaar is " + eindKapitaal);
		}
		
		keyboard.close();
	}

}

//Opnieuw maken