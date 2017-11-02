package be.pxl.h7.exoef7;

import java.util.Scanner;

public class H7ExOef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int aantalDeelnemers = 0;
		int seconden;
		String[][] deelnemers = new String[20][4];

		char[] correcteOplossingen = new char[5];

		// Verkrijg de correcte antwoorden
		for (int i = 0; i < correcteOplossingen.length; i++) {
			System.out.println("Correcte antwoord vraag " + (i + 1) + ": ");
			correcteOplossingen[i] = keyboard.next().charAt(0);
		}

		System.out.println("Deelnemersnummer: ");
		deelnemers[aantalDeelnemers][0] = keyboard.next();

		while (deelnemersnummerIsNotValid(deelnemers[aantalDeelnemers][0])) {
			System.out.println("Deelnemersnummer: ");
			deelnemers[aantalDeelnemers][0] = keyboard.next();
		}

		while (!deelnemers[aantalDeelnemers][0].equals("0")) {

			System.out.println("Seconden: ");
			seconden = keyboard.nextInt();
			deelnemers[aantalDeelnemers][1] = getAnswers();
			deelnemers[aantalDeelnemers][2] = getTime(seconden);
			deelnemers[aantalDeelnemers][3] = getPoints(deelnemers[aantalDeelnemers][1], correcteOplossingen, seconden);

			aantalDeelnemers++;

			// vraag nieuw nummer op
			System.out.println("Deelnemersnummer: ");
			deelnemers[aantalDeelnemers][0] = keyboard.next();

			while (deelnemersnummerIsNotValid(deelnemers[aantalDeelnemers][0])) {
				System.out.println("Deelnemersnummer: ");
				deelnemers[aantalDeelnemers][0] = keyboard.next();
			}

		}

		printUitslag(deelnemers, (aantalDeelnemers));
		keyboard.close();
	}

	public static void printUitslag(String[][] deelnemers, int aantalDeelnemers) {

		for (int i = 0; i < aantalDeelnemers; i++) {

			System.out.print("1.");
			for (int j = 0; j < 4; j++) {

				if (j != 1) {
					System.out.print(" " + deelnemers[i][j] + " ");
				}
			}

			System.out.println();
		}
	}

	public static String getAnswers() {
		Scanner keyboard = new Scanner(System.in);
		char character;

		StringBuilder temp = new StringBuilder("");
		String antwoorden = new String("");

		for (int i = 0; i < 5; i++) {
			System.out.println("Geef antwoord " + (i + 1) + ": ");
			character = keyboard.next().charAt(0);

			while (!isValidAnswer(character)) {
				System.out.println("Geef een geldig antwoord in (A/B/C/D/E): ");
				character = keyboard.next().charAt(0);
			}

			temp.append(character);
		}

		antwoorden = temp.toString();
		return antwoorden;
	}

	public static String getTime(int seconds) {
		String tijd = new String("");
		int minuten;

		minuten = seconds / 60;
		seconds = seconds % 60;

		tijd = minuten + " m " + seconds + " sec";

		return tijd;
	}

	public static String getPoints(String antwoorden, char[] oplossingen, int tijd) {
		String totaalPunten = new String("");
		int punten = 10;

		for (int i = 0; i < 5; i++) {

			if (antwoorden.charAt(i) == oplossingen[i]) {
				punten += 3;
			} else if (antwoorden.charAt(i) == 'E') {
				punten += 0;
			} else {
				punten -= 1;
			}
		}

		punten = puntenInVerbandMetTijd(punten, tijd);
		totaalPunten = punten + " ptn";

		return totaalPunten;
	}

	public static int puntenInVerbandMetTijd(int punten, int tijd) {

		if (tijd >= 300) {
			punten -= 5;
		} else if (tijd >= 200) {
			punten += 0;
		} else if (tijd >= 100) {
			punten += 2;
		} else {
			punten += 5;
		}

		return punten;
	}

	public static boolean isValidAnswer(char c) {
		switch (c) {
		case 'A':
			return true;
		case 'B':
			return true;
		case 'C':
			return true;
		case 'D':
			return true;
		case 'E':
			return true;
		case '0':
			return true;
		}

		return false;
	}

	public static boolean deelnemersnummerIsNotValid(String number) {
		if (number.equals("0")) {
			return false;
		}

		if (number.length() != 4) {
			return true;
		}

		for (int i = 0; i < number.length(); i++) {
			if (!isDigit(number.charAt(i))) {
				return true;
			}
		}

		return false;
	}

	public static boolean isDigit(char c) {
		switch (c) {
		case '0':
			return true;
		case '1':
			return true;
		case '2':
			return true;
		case '3':
			return true;
		case '4':
			return true;
		case '5':
			return true;
		case '6':
			return true;
		case '7':
			return true;
		case '8':
			return true;
		case '9':
			return true;
		}

		return false;
	}

}
