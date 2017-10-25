package be.pxl.h7.oef4;

import java.util.Scanner;

public class H7Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int keuze;
		int aantalStemmen = 0;
		int stemmen [] = new int [4];
		String kandidaten [] = {"An Janssen", "Bart Vriends", "Andries Michiels", "Inge Kaas"};
		
		System.out.println("**********************************");
		System.out.println("VERKIEZINGEN STUDENT VAN HET JAAR");
		System.out.println("Kandidaten: ");
		System.out.println("1." + kandidaten[0] + "(1)");
		System.out.println("2." + kandidaten[1] + "(2)");
		System.out.println("3." + kandidaten[2] + "(3)");
		System.out.println("4." + kandidaten[3] + "(4)");
		System.out.println("Keuze: ");
		keuze = keyboard.nextInt();
		
		while(!(keuzeIsValid(keuze))) {
			System.out.println("Geef een geldige keuze in: ");
			keuze = keyboard.nextInt();
		}
		
		while(keuzeIsValid(keuze)) {
			
			while(!(keuzeIsValid(keuze))) {
				System.out.println("Geef een geldige keuze in: ");
				keuze = keyboard.nextInt();
			}
			
			aantalStemmen++;
			stemmen[keuze - 1] += 1;
			
			System.out.println("**********************************");
			System.out.println("VERKIEZINGEN STUDENT VAN HET JAAR");
			System.out.println("Kandidaten: ");
			System.out.println("1." + kandidaten[0] + "(1)");
			System.out.println("2." + kandidaten[1] + "(2)");
			System.out.println("3." + kandidaten[2] + "(3)");
			System.out.println("4." + kandidaten[3] + "(4)");
			System.out.println("Keuze: ");
			keuze = keyboard.nextInt();
			
		}
		
		printResultaten(kandidaten, stemmen, aantalStemmen);
		keyboard.close();
	}
	
	public static void printResultaten(String kandidaten [] , int stemmen [], int aantalStemmen) {
		
		double procent;
		
		System.out.println("Kandidaat \t Aantal stemmen Aandeel (%)");
		
		for(int i = 0; i < 4; i++) {
			procent = ((double)stemmen[i] / aantalStemmen) * 100;
			System.out.printf("%-20s \t %-10d %-10.1f \n", kandidaten[i], stemmen[i], procent);
		}
		
		System.out.println("Totaal aantal stemmen: " + aantalStemmen);
	}
	
	public static boolean keuzeIsValid(int keuze) {
		
		switch(keuze) {
		case 0: return false;
		case 1: return true;
		case 2: return true;
		case 3: return true;
		case 4: return true;
		default:
			return false;
		}
	}

}
