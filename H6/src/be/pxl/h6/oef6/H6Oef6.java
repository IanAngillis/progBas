package be.pxl.h6.oef6;

import java.util.Scanner;

public class H6Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double hoogte, breedte, prijs, oppervlakte, gewicht, motorprijs;
		String naamVerkoper, motor, offerteNummer;
		boolean specialeKleur;
		
		System.out.println("Naam: ");
		naamVerkoper = keyboard.nextLine();
		System.out.println("Wenst u een speciale kleur?");
		specialeKleur = keyboard.nextBoolean();
		
		hoogte = getHoogte();
		breedte = getBreedte();
		oppervlakte = getOppervlakte(hoogte, breedte);
		gewicht = getGewicht(oppervlakte);
		motor = getMotor(gewicht);
		motorprijs = getMotorPrijs(motor);
		prijs = getPrijs(oppervlakte, motorprijs, specialeKleur);
		offerteNummer = getOfferteNummer(naamVerkoper, prijs);
		
		printOfferte(offerteNummer, oppervlakte, gewicht, motor, prijs, naamVerkoper);
		
		keyboard.close();
	}
	
	public static void printOfferte(String offertenummer, double oppervlakte, double gewicht, String motor, double prijs, String naamVerkoper) {
		System.out.println("*********************************************************");
		System.out.println("Naam: " + naamVerkoper );
		System.out.println("Offertenummer: " + offertenummer);
		System.out.println("Oppervlakte poort: " + oppervlakte + " m�");
		System.out.println("Gewicht poort: " + gewicht + " kg");
		System.out.println("Type motor: " + motor);
		System.out.println("Totaalprijs: " + prijs + " euro");
		System.out.println("*********************************************************");
	}
	
	public static String getOfferteNummer(String naamVerkoper, double prijs) {
		
		String finalString;
		String temp1 = prijs + "";
		
		StringBuilder temp2 = new StringBuilder(temp1);
		temp2 = temp2.reverse();
		temp1 = temp2.toString();
		
		finalString = "2016_" + naamVerkoper.toUpperCase() + "_" + temp1;
		
		return finalString;
	}
	
	public static double getPrijs(double oppervlakte, double motorprijs, boolean specialeKleur) {
		
		double prijs;
		
		prijs = (oppervlakte  * 113.5) + motorprijs;
		
		if(specialeKleur) {
			prijs *= 1.10;
		}
		
		return prijs;
	}
	
	public static String getMotor(double gewicht) {
		String motor;
		
		if(gewicht > 300) {
			motor = "X300";
		} else if (gewicht < 150) {
			motor = "A101";
		} else if ((gewicht >= 150) && (gewicht <= 300)) {
			motor = "A105";
		} else {
			motor = "";
		}
		
		return motor;
	}
	
	public static double getMotorPrijs(String motor) {
		double prijs;
		
		switch (motor) {
		case "A101": prijs = 120;
					break;
		case "A105": prijs = 220.5;
					break;
		case "A300": prijs = 250.5;
					break;
		default:
				prijs = 0;
		}
		
		return prijs;
	}
	
	
	public static double getGewicht(double oppervlakte) {
		return (oppervlakte * 11);
	}
	
	public static double getOppervlakte(double hoogte, double breedte) {
		return (hoogte * breedte);
	}
	
	public static double getHoogte() {
		Scanner keyboard = new Scanner(System.in);
		double hoogte;
		
		System.out.println("Hoogte: ");
		hoogte = keyboard.nextDouble();
		
		while((hoogte < 2) || (hoogte > 6.5)) {
			System.out.println("De poort kan minimaal 2m hoog en maximimaal 6.5m hoog zijn.");
			System.out.println("Hoogte: ");
			hoogte = keyboard.nextDouble();
		}
		
		return hoogte;
	}
	
	public static double getBreedte() {
		Scanner keyboard = new Scanner(System.in);
		double breedte;
		
		System.out.println("Breedte: ");
		breedte = keyboard.nextDouble();
		
		while((breedte < 2) || (breedte > 8)) {
			System.out.println("De poort kan minimaal 2m breed en maximimaal 8m breed zijn.");
			System.out.println("Breedte: ");
			breedte = keyboard.nextDouble();
		}
		
		return breedte;
	}

}
