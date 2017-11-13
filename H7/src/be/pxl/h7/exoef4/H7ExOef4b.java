package be.pxl.h7.exoef4;

import java.util.Scanner;

public class H7ExOef4b {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char a;
		char b;
		char c;
		int value1;
		int value2;
		int value3;
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

		value1 = getValue(a);
		value2 = getValue(b);
		value3 = getValue(c);

		r = (10 * value1 + value2) * tenToThePowerOf(value3);

		System.out.println("R is " + r);
		keyboard.close();
	}
	
	public static int tenToThePowerOf(int value) {
		
		int product = 1;
		
		for(int i = 0; i < value; i++) {
			
			product *= 10;
		}
		
		return product;
	}

	public static int getValue(char character) {
		int value = 0;

		switch (character) {
		case 'z':
			value = 0;
			break;

		case 'b':
			value = 1;
			break;

		case 'r':
			value = 2;
			break;

		case 'o':
			value = 3;
			break;

		case 'g':
			value = 4;
			break;

		case 'G':
			value = 5;
			break;

		case 'B':
			value = 6;
			break;

		case 'V':
			value = 7;
			break;

		case 'L':
			value = 8;
			break;

		case 'W':
			value = 9;
			break;

		}

		return value;
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
