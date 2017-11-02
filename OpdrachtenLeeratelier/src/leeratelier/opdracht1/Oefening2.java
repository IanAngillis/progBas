package leeratelier.opdracht1;

import java.time.LocalDate;
import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		int[] aantalAanvragenPrioriteit = new int[5];
		String[][] kandidatenLijst = new String[20][3];
		Scanner keyboard = new Scanner(System.in);
		String name = new String("");
		String namePartner = new String("");
		String answer = new String("");
		String prioriteit = new String("");
		int aantalMensenRechtOpGoedkopereLening = 0;
		boolean isAlleenstaand;
		boolean woontInSocialeWoning;
		boolean rechtOpGoedkopereLening;
		int inkomen;
		int inkomenPartner = 0;
		int aantalKinderen;
		char character;
		int jaar;
		int kandidaatKopers = 0;
		double aantalProcentRechtOpGoedkopereLening = 0;

		System.out.println("Naam (achternaam_voornaam): ");
		name = keyboard.nextLine();

		while (notStop(name)) {
			
			while (!naamIsValid(name)) {
				System.out.println("Fout formaat");
				System.out.println("Naam (achternaam_voornaam)");
				name = keyboard.nextLine();
			}
			
			System.out.println("Inkomen: ");
			inkomen = keyboard.nextInt();

			System.out.println("bent u alleenstaand? (JA/NEE)");
			answer = keyboard.next();

			while (!isValid(answer)) {
				System.out.println("Bent u alleenstaand? (JA/NEE)");
				answer = keyboard.next();
				keyboard.nextLine();
			}

			isAlleenstaand = getAlleenstaand(answer);

			if (isAlleenstaand) {

				namePartner = "xx";
			} else {

				System.out.println("Naam partner: (achternaam_voornaam)");
				namePartner = keyboard.next();
				inkomenPartner = 0;

				while (!naamIsValid(namePartner)) {
					System.out.println("Fout formaat");
					System.out.println("Naam partner (achternaam_voornaam)");
					name = keyboard.nextLine();
				}

				System.out.println("Inkomen partner: ");
				inkomenPartner = keyboard.nextInt();
			}

			System.out.println("Aantal kinderen: ");
			aantalKinderen = keyboard.nextInt();
			keyboard.nextLine();

			System.out.println("Woont u in een sociale woning (J/N): ");
			character = keyboard.next().toUpperCase().charAt(0);

			while (!characterIsValid(character)) {
				System.out.println("Woont u in een sociale woning (J/N): ");
				character = keyboard.next().toUpperCase().charAt(0);
			}

			woontInSocialeWoning = getWoontInSocialeWoning(character);

			if (woontInSocialeWoning) {
				System.out.println("Sinds welk jaar wordt deze gehuurd?");
				jaar = keyboard.nextInt();
			} else {
				jaar = 0;
			}

			prioriteit = berekenPrioriteit(inkomen, inkomenPartner, aantalKinderen, woontInSocialeWoning, jaar);
			rechtOpGoedkopereLening = getRechtOpGoedkopereLening(isAlleenstaand, aantalKinderen, inkomen);

			if (rechtOpGoedkopereLening) {
				aantalMensenRechtOpGoedkopereLening++;
			}

			kandidatenLijst[kandidaatKopers][0] = getNames(name, namePartner);
			kandidatenLijst[kandidaatKopers][1] = prioriteit;
			kandidatenLijst[kandidaatKopers][2] = getRecht(rechtOpGoedkopereLening);

			aantalAanvragenPrioriteit[prioriteit.length() - 1]++;

			kandidaatKopers++;
			
			keyboard.nextLine();
			System.out.println("Naam (achternaam_voornaam): ");
			name = keyboard.nextLine();
		}

		aantalProcentRechtOpGoedkopereLening = ((double) aantalMensenRechtOpGoedkopereLening / kandidaatKopers) * 100;

		printAanvragen(kandidatenLijst, kandidaatKopers);
		printAanvragenPrioriteit(aantalAanvragenPrioriteit);

		System.out.printf("%.1f % van de aanvragen heeft recht op een goedkopere lening.",
				aantalProcentRechtOpGoedkopereLening);

		keyboard.close();
	}

	public static void printAanvragenPrioriteit(int[] aantalAanvragenPrioriteit) {

		for (int i = 0; i < aantalAanvragenPrioriteit.length; i++) {
			System.out.println("Aantal aanvragen prioriteit " + (i+1) + ": " + aantalAanvragenPrioriteit[i]);
		}
	}

	public static void printAanvragen(String[][] kandidatenLijst, int index) {
		
		for(int i = 0; i < index; i++) {
			System.out.printf("Aanvraag %d: %30s %10s %10s \n", (i+1), kandidatenLijst[i][0], kandidatenLijst[i][1], kandidatenLijst[i][2]);
		}
	}

	public static String getNames(String name, String namePartner) {

		String finalName = new String("");

		if (!namePartner.equals("xx")) {
			String deel1 = getName(name);
			String deel2 = getName(namePartner);
			finalName = deel1 + " en " + deel2;
		} else {
			finalName = getName(name);
		}
		return finalName;
	}

	public static String getName(String name) {
		String finalName = new String("");
		StringBuilder temp = new StringBuilder("");
		int index;

		index = name.indexOf('_');
		temp.append(name.charAt(index + 1));
		temp.append(". ");
		temp.append(name.charAt(0));
		finalName = temp.toString();
		finalName.toUpperCase();
		temp = new StringBuilder(finalName);
		temp.append(name.substring(1, index));

		finalName = temp.toString();

		return finalName;
	}

	public static String getRecht(boolean recht) {
		if (recht) {
			return "J";
		} else {
			return "";
		}
	}

	public static boolean getRechtOpGoedkopereLening(boolean isAlleenstaand, int aantalKinderen, int inkomen) {

		if (isAlleenstaand) {

			if (aantalKinderen > 0) {
				return true;
			}

			if (inkomen < 1500) {
				return true;
			}
		}

		return false;
	}

	public static String berekenPrioriteit(int inkomen, int inkomenPartner, int aantalKinderen,
			boolean woontInSocialeWoning, int jaar) {

		int gezinsinkomen = inkomen + inkomenPartner;
		String prioriteit = new String("");

		if (jaar != 0) {

			if ((LocalDate.now().getYear() - jaar) < 5) {
				prioriteit = "*****";
				return prioriteit;
			}
		}

		if (gezinsinkomen >= 2500) {
			prioriteit = "****";

		} else if (gezinsinkomen >= 2000) {
			prioriteit = "***";
		} else if (aantalKinderen < 3) {
			prioriteit = "**";
		} else {
			prioriteit = "*";
		}

		return prioriteit;
	}

	public static boolean notStop(String name) {
		if (name.equals("STOP") || name.equals("stop")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean getWoontInSocialeWoning(char character) {
		if (character == 'J') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean characterIsValid(char character) {
		if (character == 'J' || character == 'N') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean getAlleenstaand(String answer) {

		if (answer.equals("JA")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isValid(String answer) {
		if (answer.toUpperCase().equals("JA") || answer.toUpperCase().equals("NEE")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean naamIsValid(String name) {

		String[] delen = name.split("_");

		if (delen.length == 2) {
			return true;
		} else {
			return false;
		}
	}

}
