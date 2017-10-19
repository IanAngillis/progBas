package be.pxl.h5.exoef12;

/*Extra Oefening 12
 * 
 * Lees per arbeider de volgende gegevens in: het nummer van de arbeider, het uurloon en
 * het aantal gewerkte uren in een week. Bereken het weekloon rekening houdend met het
 * feit dat het uurloon voor uren boven de 38 uren 50% hoger ligt.
 * Druk af: het nummer van de arbeider en zijn weekloon.
 * Indien als nummer 0 wordt ingevoerd, betekent dit het einde van het programma.
 * Vervolgens wordt het nummer van de arbeider afgedrukt die het meeste uren gewerkt
 * heeft.
 */

import java.util.Scanner;

public class H5ExOef12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int arbeidersNummer, aantalGewerkteUren, overUren, meesteUrenGewerkt, besteArbeider;
		double uurLoon, weekLoon, loonOveruren;
		
		meesteUrenGewerkt = 0;
		besteArbeider = 0;
		
		
		System.out.println("Nummer: ");
		arbeidersNummer = keyboard.nextInt();
		
		while(arbeidersNummer != 0) {
			//Input vragen aan gebruiker
			System.out.println("Gewerkte uren: ");
			aantalGewerkteUren = keyboard.nextInt();
			
			System.out.println("Loon per uur: ");
			uurLoon = keyboard.nextFloat();
			
			//Meeste uren controleren
			if (aantalGewerkteUren > meesteUrenGewerkt) {
				meesteUrenGewerkt = aantalGewerkteUren;
				besteArbeider = arbeidersNummer;
			}
			
			//Overuren controleren
			if (aantalGewerkteUren > 38) {
				overUren = aantalGewerkteUren - 38;
			} else {
				overUren = 0;
			}
			
			//Loon berekenen
			loonOveruren = (uurLoon * 1.5) * overUren;
			weekLoon = (uurLoon * 38) + loonOveruren;
			
			System.out.println("Arbeider " + arbeidersNummer + " zijn weekloon is " + weekLoon);
			
			System.out.println("Nummer: ");
			arbeidersNummer = keyboard.nextInt();
		}
		
		System.out.println("Arbeider " + besteArbeider + " heeft " + meesteUrenGewerkt + " uren gewerkt." );
		
		keyboard.close();
	}

}
