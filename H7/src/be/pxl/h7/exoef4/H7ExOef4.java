package be.pxl.h7.exoef4;

import java.util.Scanner;

public class H7ExOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char[] characters = { 'z', 'b', 'r', 'o', 'g', 'G', 'B', 'V', 'L', 'M' };
		char a;
		char b;
		char c;
		int r;

		System.out.println("First character: ");
		a = keyboard.next().charAt(0);

		while (!characterIsValid(a)) {
			System.out.println("First character: ");
			a = keyboard.next().charAt(0);
		}

		System.out.println("Second character: ");
		b = keyboard.next().charAt(0);

		while (!characterIsValid(a)) {
			System.out.println("Second character: ");
			b = keyboard.next().charAt(0);
		}

		System.out.println("Third character: ");
		c = keyboard.next().charAt(0);

		while (!characterIsValid(a)) {
			System.out.println("Third character: ");
			c = keyboard.next().charAt(0);
		}

		r = (10 * getValue(characters, a) + getValue(characters, b)) * tenToThePowerOf(getValue(characters, c));
		System.out.println("R is " + r);

		keyboard.close();
	}

	public static int getValue(char[] characters, char character) {
		int value = 0;

		for (int i = 0; i < characters.length; i++) {

			if (characters[i] == character) {

				value = i;
				break;
			}
		}
		return value;
	}

	public static int tenToThePowerOf(int value) {

		int product = 1;

		for (int i = 0; i < value; i++) {

			product *= 10;
		}

		return product;
	}

	public static boolean characterIsValid(char character) {

		switch (character) {
		case 'z':
			return true;
		case 'b':
			return true;
		case 'r':
			return true;
		case 'o':
			return true;
		case 'g':
			return true;
		case 'G':
			return true;
		case 'B':
			return true;
		case 'V':
			return true;
		case 'L':
			return true;
		case 'W':
			return true;
		}

		return false;
	}

}
