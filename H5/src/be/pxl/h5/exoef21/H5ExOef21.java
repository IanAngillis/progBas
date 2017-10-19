package be.pxl.h5.exoef21;

import java.util.Scanner;

public class H5ExOef21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int percent, rijksregisternummer, wagen, mutualiteit, aantalSlachtoffers, lidVanMutualiteit;
		double bedragSlachtoffer, totaalBedrag, percentageLidVanMutualiteit, afgKm, temp;
		
		aantalSlachtoffers = 0;
		lidVanMutualiteit = 0;
		totaalBedrag = 0;
		
		System.out.println("Rijksregisternummer slachtoffer: ");
		rijksregisternummer = keyboard.nextInt();
		
		while(rijksregisternummer != 9999) {
			aantalSlachtoffers++;
			bedragSlachtoffer = 0;
			
			
			System.out.println("Reanimatiewagen (0) / ziekenwagen (1): ");
			wagen = keyboard.nextInt();
			
			System.out.println("Afstand in km: ");
			afgKm = keyboard.nextFloat();
			
			System.out.println("Lid mutualiteit? nee (0) / ja (1): ");
			mutualiteit = keyboard.nextInt();
			
			if(wagen == 0) {
				bedragSlachtoffer += 25;
				temp = KmCalculator(afgKm, 2.25, 1.75);
				bedragSlachtoffer += temp;
				
				
			} else {
				bedragSlachtoffer += 20;
				temp = KmCalculator(afgKm, 1.75, 1.15);
				bedragSlachtoffer += temp;
			}
			
			if(mutualiteit == 1) {
				temp = TeruggaveMutualiteitCalculator(afgKm, wagen);
				bedragSlachtoffer -= temp;
				lidVanMutualiteit++;	
			} 
			
			totaalBedrag += bedragSlachtoffer;
			
			System.out.println("Patient " + rijksregisternummer + " moet " + bedragSlachtoffer + " betalen.");
			
			System.out.println("Rijksregisernummer slachtoffer: ");
			rijksregisternummer = keyboard.nextInt();
		}
		
		percentageLidVanMutualiteit = ((double)lidVanMutualiteit/aantalSlachtoffers) * 100;
		percent = (int)percentageLidVanMutualiteit;
		
		System.out.println(percent + "% van de slachtoffers is lid van de mutaliteit");
		System.out.println("Het totaalbedrag is " + totaalBedrag + " euro.");
		
		keyboard.close();
	}
	
	public static double TeruggaveMutualiteitCalculator(double afgKm, int wagen) {
		double bedrag = 0;
		
		if (wagen == 0) {
			bedrag += 15;
			
			if(afgKm > 11) {
				bedrag += (afgKm - 11) * 1.5;
				return bedrag;
			} else {
				return bedrag;
			}
			
		} else {
			bedrag += 10;
			
			if(afgKm > 11) {
				bedrag += (afgKm - 11);
				return bedrag;
			} else {
				return bedrag;
			}
		}
	}
	
	public static double KmCalculator(double afgKm, double bedrag1, double bedrag2) {
		
		double bedrag;
		
		if(afgKm < 12) {
			return 0;
		} else if (afgKm <= 22) {
			bedrag = (afgKm - 11) * bedrag1;
			return bedrag;
		} else {
			bedrag = (10 * bedrag1) + (afgKm - 21) * bedrag2;
			return bedrag;
		}
	}

}
