package be.pxl.h6.exoef6;

import java.util.Scanner;

public class H6ExOef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Productcode: ");
		String productcode = keyboard.nextLine();
		
		while(productcodeIsNotValid(productcode)) {
			System.out.println("Productcode: ");
			productcode = keyboard.nextLine();
		}
		
		System.out.println(productcode);
		keyboard.close();
	}
	
	public static boolean lastCharactersAreNotValid(String lastCharacters) {
		if(lastCharacters.equals("bo") || lastCharacters.equals("on")) {
			return false;
		}
		
		return true;
	}
	
	public static boolean firstCharacterIsNotValid(char character) {
		
		switch (character) {
			case 'l': return false;
			case 'L': return false;
			case 'r': return false;
			case 'R': return false;
			default:
				return true;
		}
	}
	
	public static boolean productcodeIsNotValid(String productcode) {
		
		
		if(productcode.length() != 8) {
			System.out.println("Lengte niet in orde");
			return true;
		}
		
		if(firstCharacterIsNotValid(productcode.charAt(0))) {
			System.out.println("Eerste character niet in orde");
			return true;
		}
		
		if(lastCharactersAreNotValid(productcode.substring(productcode.length() - 2, productcode.length()))) {
			System.out.println("Laatste characters niet in orde");
			return true;
		}
		
		return false;
		
	}
}
