package voorbeeldexamen2.oef2;

import java.util.Scanner;
import java.util.Random;

public class VoorbeeldExamen2Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		String romeinsCijfer = new String("");
		String[] roman = { "XL", "X", "IX", "V", "IV", "I" };
		int[] waarde = { 40, 10, 9, 5, 4, 1 };

		int randomGetal;
		char character;
		int vorigGetal = -1;

		System.out.println("Geef letter: ");
		character = keyboard.next().charAt(0);

		for (char i = 'a'; i <= character; i++) {
			
			System.out.println("Reeks " + i);
			randomGetal = rand.nextInt(50 - 2) + 1;
			
			while(randomGetal > vorigGetal) {
				
				vorigGetal = randomGetal;
				romeinsCijfer = zetOmNaarRomeinsCijfer(randomGetal, roman, waarde);
				System.out.println("Het Romeinse cijfer voor " + randomGetal + " is " + romeinsCijfer);
				
				randomGetal = rand.nextInt(50 - 2) + 1;
			}
			
		vorigGetal = -1;

		}

		keyboard.close();
	}

	public static String zetOmNaarRomeinsCijfer(int randomGetal, String[] roman, int[] waarde) {
		StringBuilder temp = new StringBuilder("");
		String romeinsCijfer = new String("");

		// while

		while (randomGetal != 0) {
			for (int i = 0; i < roman.length; i++) {

				if (randomGetal - waarde[i] > 0) {
					temp.append(roman[i]);
					randomGetal -= waarde[i];
					break;
				} else if (randomGetal - waarde[i] == 0) {
					temp.append(roman[i]);
					randomGetal -= waarde[i];
					break;
				}
			}
		}
		romeinsCijfer = temp.toString();
		return romeinsCijfer;
	}

}
