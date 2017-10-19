package be.pxl.h5.oef25;

/*Oefening 25
 * 
 * Zie H5 Oefeningen
 */

import java.util.Scanner;

public class H5Oef25 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Declareren en initialiseren van variabelen
		int aantalPersonen = 0, geslacht, aantalPersonenMetOvergewicht = 0, aantalVrouwen = 0;
		double gewicht, lengte, gemiddeldeLengteVrouwen, kleinsteLengteMannen = 200, bmi, totaalLengteVrouwen = 0, percentageTeZwaar;
		
		//Opvragen geslacht
		System.out.println("Man of vrouw? (0/1): ");
		geslacht = keyboard.nextInt();
		
		while(geslacht != 0 && geslacht != 1 && geslacht != 2) {
			System.out.println("Ongeldige input, geef 0/1 of 2 in.");
			geslacht = keyboard.nextInt();
		}
		
		//Bereken BMI, print tekst uit en hou gegevens bij.
		while(geslacht != 2) {
			aantalPersonen++;
			
			System.out.println("Lengte (m): ");
			lengte = keyboard.nextDouble();
			
			System.out.println("Gewicht (kg): ");
			gewicht = keyboard.nextDouble();
			
			bmi = BmiCalculator(lengte, gewicht);
			BmiMelding(bmi);
			
			if(bmi >= 27) {
				aantalPersonenMetOvergewicht++;
			}
			
			if(geslacht == 0) {
				
				if(lengte < kleinsteLengteMannen) {
					kleinsteLengteMannen = lengte;
				}
			
			} else {
				aantalVrouwen ++;
				totaalLengteVrouwen += lengte;
			}
			
			System.out.println("Man of vrouw? (0/1): ");
			geslacht = keyboard.nextInt();
			
			while(geslacht != 0 && geslacht != 1 && geslacht != 2) {
				System.out.println("Ongeldige input, geef 0/1 of 2 in.");
				geslacht = keyboard.nextInt();
			}
		}
		
		//Berekeningen uit bijgehouden informatie
		percentageTeZwaar = ((double)aantalPersonenMetOvergewicht / aantalPersonen) * 100;
		gemiddeldeLengteVrouwen = totaalLengteVrouwen / aantalVrouwen;
				
		System.out.println(percentageTeZwaar + "% is volgens hun BMI te zwaar.");
		System.out.println("De gemiddelte lengte van de vrouwen is " + gemiddeldeLengteVrouwen + "m.");
		System.out.println("De kleinste lengte van de mannen is " + kleinsteLengteMannen + "m");
		keyboard.close();
	}
	
	public static double BmiCalculator(double lengte, double gewicht) {
		double bmi;
		
		bmi = gewicht / (lengte * lengte);
		
		return bmi;
	}
	
	public static void BmiMelding(double bmi) {
		
		int bmiInt = (int)bmi;
		System.out.println("Uw BMI: " + bmi);
		
		if (bmiInt < 18) {
			System.out.println("Resultaat: Ondergewicht");
		} else if (bmiInt < 25) {
			System.out.println("Resultaat: Normaal gewicht");
		} else if (bmiInt < 27) {
			System.out.println("Resultaat: Neiging tot overgewicht");
		} else if (bmiInt < 30) {
			System.err.println("Resultaat: Overgewicht");
		} else if (bmiInt < 40) {
			System.out.println("Resultaat: Zwaarlijvigheid (obesitas)");
		} else {
			System.out.println("Resultaat: Ernstige zwaarlijvigheid");
		}
		
	}
}
