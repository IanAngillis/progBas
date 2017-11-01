package voorbeeldexamen1.oef3;

import java.util.Scanner;

public class Ex1Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Tekst: ");
		String tekst = keyboard.nextLine();

		System.out.println("Maximaal aantal charactars (negatief stopt): ");
		int maxAantalCharacters = keyboard.nextInt();

		while (maxAantalCharacters > 0) {

			tekst = deleteSpacesInFrontAndEndOfString(tekst);
			printTekstInCorrectFormaat(tekst, maxAantalCharacters);

			System.out.println("Maximaal aantal charactars (negatief stopt): ");
			maxAantalCharacters = keyboard.nextInt();
		}

		keyboard.close();
	}

	public static void printTekstInCorrectFormaat(String tekst, int maxAantalCharacters) {
		StringBuilder temp = new StringBuilder("");
		String temp2 = new String("");
		int index;

		printKoppeltekens(maxAantalCharacters);

		for (int i = 0; i < tekst.length(); i++) {

			if (temp.length() == maxAantalCharacters) {

				if (tekst.charAt(i-1) != ' ' && !(temp.charAt(temp.length() - 1) == ' ')) {
					index = i;

					while (tekst.charAt(index) != ' ') {
						temp.append(tekst.charAt(index));
						index++;
						
						if(index  == tekst.length()) {
							index--;
							break;
						}
					}
					
					i = index;
					temp2 = temp.toString();
					temp.setLength(0);
					System.out.printf("%s\n", temp2);
					temp.append(tekst.charAt(i));
					
				} else {
					temp2 = temp.toString();
					temp.setLength(0);
					System.out.printf("%s\n", temp2);
					temp.append(tekst.charAt(i));
				}

			} else {
				temp.append(tekst.charAt(i));
			}
		}
		
		if(temp.length() > 1) {
			temp2 = temp.toString();
			System.out.printf("%s\n", temp2);
		}
	}

	public static void printKoppeltekens(int maxAantalCharacters) {

		for (int i = 0; i < maxAantalCharacters; i++) {
			System.out.print('-');
		}

		System.out.println();
	}

	public static String deleteSpacesInFrontAndEndOfString(String tekst) {
		StringBuilder temp = new StringBuilder(tekst);

		while (temp.charAt(0) == ' ') {
			temp.deleteCharAt(0);
		}

		temp = temp.reverse();

		while (temp.charAt(0) == ' ') {
			temp.deleteCharAt(0);
		}

		temp = temp.reverse();
		tekst = temp.toString();

		System.out.println("test" + tekst);
		return tekst;
	}
}
