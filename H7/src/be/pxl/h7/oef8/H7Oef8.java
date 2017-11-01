package be.pxl.h7.oef8;

import java.util.Scanner;

public class H7Oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] sterrenbeelden = {"steenbok", "waterman", "vissen", "ram", "stier", "tweelingen", "kreeft", "leeuw", "maagd", "weegschaal", "schorpioen", "boogschutter"};
		String sterrenbeeld = new String("");
		String printNaam = new String("");
		String voornaam = new String("");
		String naam = new String("");
		int geboorteDag;
		int geboorteMaand;
		
		System.out.println("Naam: ");
		naam = keyboard.nextLine();
		
		while(!naam.equals("/")) {
			
			System.out.println("Voornaam: ");
			voornaam = keyboard.nextLine();
			
			System.out.println("Geboortedag: ");
			geboorteDag = keyboard.nextInt();
			
			System.out.println("Geboortemaand: ");
			geboorteMaand = keyboard.nextInt();
			keyboard.nextLine();
			
			sterrenbeeld = getSterrenbeeld(sterrenbeelden, geboorteDag, geboorteMaand);
			printNaam = getNaam(voornaam, naam);
			
			System.out.println(printNaam + " " + sterrenbeeld);
			
			System.out.println("Naam: ");
			naam = keyboard.nextLine();
			
		}
	
		keyboard.close();
	}
	
	public static String getNaam(String voornaam, String naam) {
		
		String temp = voornaam.substring(0, 1).toUpperCase() + ". " + naam.toUpperCase();
		return temp;
	}
	
	public static String getSterrenbeeld(String [] sterrenbeelden, int dag, int maand) {
		
		if(dag > 20) {
			
			if (maand == 12) {
				return sterrenbeelden[0];
			} else {
				return sterrenbeelden[maand];
			}
		} else {
			return sterrenbeelden[maand - 1];
		}
	}

}
