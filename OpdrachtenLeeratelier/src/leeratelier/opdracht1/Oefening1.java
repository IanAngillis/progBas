package leeratelier.opdracht1;

import java.util.Scanner;
import java.util.Random;

public class Oefening1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int randomGetal;
		String gekozenKleur = new String("");
		int inzet = 10;
		int totaalIngezet = 0;
		int totaalGewonnen = 0;
		boolean isGewonnen = false;
		int ronde = 0;
		int[] rondesNodigOmTeWinnen = new int[10];

		System.out.println("Kies een kleur (ROOD/ZWART): ");
		gekozenKleur = keyboard.next();

		while (!kleurIsValid(gekozenKleur)) {
			System.out.println("Kies een kleur (ROOD/ZWART): ");
			gekozenKleur = keyboard.next();
		}

		for (int i = 0; i < 100; i++) {
			inzet = 10;
			isGewonnen = false;
			ronde = 0;
			
			while (!isGewonnen) {
				ronde++;
				totaalIngezet += inzet;
				
				randomGetal = (rand.nextInt(36) + 1);
				System.out.println("Inzet ronde " + ronde + ": " + inzet);

				if (spelerHeeftGewonnen(randomGetal, gekozenKleur)) {
					isGewonnen = true;
					inzet *= 2;
					totaalGewonnen += inzet;
					rondes(rondesNodigOmTeWinnen, ronde - 1);
					System.out.println("Gewonnen: " + inzet);
				} else {
					inzet *= 2;
					System.out.println("Helaas, probeer nog een keer.");
				}

			}
		}

		printGegevens(rondesNodigOmTeWinnen, totaalIngezet, totaalGewonnen);

		keyboard.close();
	}

	public static void rondes(int[] rondes, int index) {

		if (index >= 9) {
			rondes[9]++;
		} else {
			rondes[index]++;
		}
	}

	public static void printGegevens(int[] rondes, int totaalIngezet, int totaalGewonnen) {

		for (int i = 0; i < rondes.length; i++) {

			if (i == 9) {
				System.out.println("Aantal keer winst in ronde 10 (of meer): " + rondes[9]);
			} else {
				System.out.println("Aantal keer winst in ronde " + (i + 1) + ": " + rondes[i]);
			}
		}
		
		System.out.println("Totale inzet: " + totaalIngezet);
		System.out.println("Totaal gewonnen: " + totaalGewonnen);
		
		if((totaalGewonnen - totaalIngezet) >0 ) {
			System.out.println("Winst: " + (totaalGewonnen - totaalIngezet));
		} else {
			System.out.println("Verlies: " + (totaalGewonnen - totaalIngezet));
		}
	}

	public static boolean spelerHeeftGewonnen(int getal, String kleur) {
		String getalKleur = getKleur(getal);

		System.out.println(getal + " " + getalKleur);
		if (getalKleur.equals(kleur)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean kleurIsValid(String kleur) {

		if (kleur.toUpperCase().equals("ROOD") || kleur.toUpperCase().equals("ZWART")) {
			return true;
		} else {
			return false;
		}
	}

	//Aanpassen
	public static String getKleur(int getal) {

		if (getal < 11) {

			if (getal % 2 == 0) {

				return "ZWART";
			} else {

				return "ROOD";
			}
		} else if (getal < 19) {

			if (getal % 2 == 0) {

				return "ROOD";
			} else {
				return "ZWART";
			}
		} else if (getal < 29) {
			if (getal % 2 == 0) {
				return "ZWART";
			} else {
				return "ROOD";
			}
		} else {
			if (getal % 2 == 0) {
				return "ROOD";
			} else {
				return "ZWART";
			}
		}
	}

}
