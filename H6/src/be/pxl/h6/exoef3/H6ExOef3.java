package be.pxl.h6.exoef3;

import java.util.Scanner;
import java.util.Random;

public class H6ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int randomValue;

		randomValue = rand.nextInt(24 - 2 + 1) + 2;

		while (randomValue % 2 != 0) {
			randomValue = rand.nextInt(24 - 2 + 1) + 2;
		}

		System.out.println(randomValue);

		System.out.println("Tekst: ");
		String inputString = keyboard.nextLine();
		String encryptedString = encryptor(inputString, randomValue);

		System.out.println(encryptedString);
		keyboard.close();
	}

	public static String encryptor(String input, int randomValue) {

		StringBuilder encryptedString = new StringBuilder(input);
		char a;

		for (int i = 0; i < input.length(); i++) {
			a = (char) (input.charAt(i) + randomValue);
			encryptedString.setCharAt(i, a);
		}

		input = encryptedString.toString();

		return input;
	}
}
