package be.pxl.h6.exoef7;

import java.util.Scanner;

public class H6ExOef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// Variabelen
		String code = new String();
		String naamM = new String();
		String naamV = new String();
		String answer = new String();
		String prioriteitsNummer = new String();

		double inkomenV;
		double inkomenM;
		double kandidaatKopersInSocialeWoningen;

		int aantalKinderen;

		boolean alleenstaand;
		boolean goedkopereLening;

		int aantalAanvragen = 0;
		int aantalGezinnenInSocialeWoning = 0;

		System.out.println("Code: ");
		code = keyboard.next();

		while (codeIsValid(code, 0)) {
			aantalAanvragen++;
			// checks wether the given code can be used or not, if it is incorrect a new
			// code will be asked from the user
			while (!(codeIsValid(code, 1))) {
				System.out.println("Please enter a correct code: ");
				code = keyboard.next();
				// TODO
			}

			if (code.charAt(0) == 'J') {
				aantalGezinnenInSocialeWoning++;
			}

			System.out.println("Alleenstaand? (J/N): ");
			answer = keyboard.next();

			alleenstaand = isAlleenstaand(answer);

			if (alleenstaand) {
				System.out.println("Geslacht? (M/V): ");
				answer = keyboard.next();

				if (answer.charAt(0) == 'M') {
					keyboard.nextLine();
					System.out.println("Naam (achternaam_voornaam): ");
					naamM = keyboard.nextLine();
					naamM = veranderSpatiesMetUnderscores(naamM);

					System.out.println("Inkomen: ");
					inkomenM = keyboard.nextDouble();

					naamV = "xx";
					inkomenV = 0;

				} else {
					keyboard.nextLine();
					System.out.println("Naam (achternaam_voornaam): ");
					naamV = keyboard.nextLine();
					naamV = veranderSpatiesMetUnderscores(naamV);

					System.out.println("Inkomen: ");
					inkomenV = keyboard.nextDouble();

					naamM = "xx";
					inkomenM = 0;
				}

			} else {
				keyboard.nextLine();
				System.out.println("Naam MAN (achternaam_voornaam): ");
				naamM = keyboard.nextLine();

				System.out.println("Naam VROUW (achternaam_voornaam): ");
				naamV = keyboard.nextLine();

				naamM = veranderSpatiesMetUnderscores(naamM);
				naamV = veranderSpatiesMetUnderscores(naamV);

				System.out.println("Inkomen van " + naamM + ": ");
				inkomenM = keyboard.nextDouble();

				System.out.println("Inkomen van " + naamV + ": ");
				inkomenV = keyboard.nextDouble();
			}

			System.out.println("Aantal kinderen: ");
			aantalKinderen = keyboard.nextInt();

			prioriteitsNummer = berekenPrioriteitsNummer(code, naamM, naamV, inkomenM, inkomenV, aantalKinderen,
					alleenstaand);
			goedkopereLening = goedkopereLeningCheck(alleenstaand, aantalKinderen, inkomenV, inkomenM, code);

			printAanvraag(aantalAanvragen, alleenstaand, goedkopereLening, naamM, naamV, prioriteitsNummer);

			System.out.println("Code: ");
			code = keyboard.next();

		}

		// kandidaatKopersInSocialeWoningen = (aantalGezinnenInSocialeWoning /
		// aantalAanvragen) * 100;
		// System.out.printf("%f.1 % van de kandidaat kopers wonen in sociale
		// woningen.", kandidaatKopersInSocialeWoningen);

		keyboard.close();
	}

	public static void printAanvraag(int aantalAanvragen, boolean alleenstaand, boolean goedkopereLening, String naamM,
			String naamV, String prioriteitsNummer) {

		char lening = getCharLening(goedkopereLening);
		String familieNaam = getFamilienaam(alleenstaand, naamM, naamV);

		String string1 = "Aanvraagnr";
		String string2 = "Familie naam";
		String string3 = "Prioriteit";
		String string4 = "Bouwlening stad";

		System.out.printf("%11s | %100s | %11s | %15s \n", string1, string2, string3, string4);
		System.out.printf("%-11s | %100s | %11s | %15s \n", aantalAanvragen, familieNaam, prioriteitsNummer, lening);

	}

	public static String getFamilienaam(boolean alleenstaand, String naamM, String naamV) {

		StringBuilder temp = new StringBuilder();
		String familieNaam = new String();

		int index;

		if (alleenstaand) {

			if (naamM.charAt(0) == 'x' && naamM.charAt(1) == 'x') {

				index = naamV.indexOf('_');

				temp.append("Mevrouw ");
				temp.append(naamV.charAt(index + 1));
				temp.append(". ");
				temp.append(naamV.substring(0, index));

				familieNaam = temp.toString();
				return familieNaam;

			} else {

				index = naamM.indexOf('_');

				temp.append("Meneer ");
				temp.append(naamM.charAt(index + 1));
				temp.append(". ");
				temp.append(naamM.substring(0, index));

				familieNaam = temp.toString();
				return familieNaam;

			}
		} else {

			index = naamM.indexOf('_');

			temp.append("De Heer en Mevrouw ");
			temp.append(naamM.charAt(index + 1));
			temp.append(". ");
			temp.append(naamM.substring(0, index));
			temp.append("-");
			index = naamV.indexOf('_');
			temp.append(naamV.substring(0, index));

			familieNaam = temp.toString();
			return familieNaam;

		}
	}

	public static char getCharLening(boolean goedKopereLening) {

		if (goedKopereLening) {
			return 'J';
		} else {
			return ' ';
		}
	}

	public static boolean goedkopereLeningCheck(boolean alleenstaand, int aantalKinderen, double inkomenV,
			double inkomenM, String code) {

		if (alleenstaand) {

			if (code.charAt(0) == 'J') {
				return false;
			} else {
				double inkomenAlleenstaande = inkomenM + inkomenV;

				if (aantalKinderen >= 1) {
					return true;
				} else if (inkomenAlleenstaande < 1500) {
					return true;
				} else {
					return false;
				}
			}

		} else {

			return false;
		}

	}

	public static String berekenPrioriteitsNummer(String code, String naamM, String naamV, double inkomenM,
			double inkomenV, int aantalKinderen, boolean alleenstaand) {

		double gezinsInkomen = inkomenM + inkomenV;
		String prioriteit = new String();

		if (code.charAt(0) == 'J') {
			int jaar = getJaar(code);

			if (2017 - jaar < 5) {
				prioriteit = "*****";
				return prioriteit;
			}
		}

		if (gezinsInkomen >= 2500) {
			prioriteit = "****";
			return prioriteit;

		} else if (gezinsInkomen >= 2000) {
			prioriteit = "***";
			return prioriteit;

		} else if (aantalKinderen < 3) {
			prioriteit = "**";
			return prioriteit;
		} else {
			prioriteit = "*";
			return prioriteit;
		}
	}

	public static int getJaar(String code) {

		int jaar = Integer.parseInt(code.substring(1, code.length()));
		return jaar;
	}

	public static String veranderSpatiesMetUnderscores(String naam) {

		StringBuilder temp = new StringBuilder(naam);

		for (int i = 0; i < naam.length(); i++) {

			if (temp.charAt(i) == ' ') {
				temp.setCharAt(i, '_');
			}
		}

		naam = temp.toString();
		return naam;
	}

	public static boolean isAlleenstaand(String answer) {

		if (answer.charAt(0) == 'J') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDigit(char character) {
		switch (character) {
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
		default:
			return false;
		}
	}

	// Controleert zowel de loopvoorwaarde als de ingegeven variabelen op hun
	// correctheid. 0 wordt meegegeven als argument als het betrekking heeft op de
	// loop
	public static boolean codeIsValid(String code, int itIsAboutTheLoop) {

		if (itIsAboutTheLoop == 0) {

			if (code.equals("stop") || code.equals("STOP")) {
				return false;
			} else {
				return true;
			}

		} else {

			if (code.length() == 1) {

				if (code.charAt(0) == 'N') {
					return true;
				} else {
					return false;
				}

			} else if (code.length() == 5) {

				if (code.charAt(0) != 'J') {
					return false;
				} else {
					for (int i = 1; i < code.length(); i++) {
						if (!(isDigit(code.charAt(i)))) {
							return false;
						}
					}
					return true;
				}

			} else {
				return false;
			}
		}

	}

}
