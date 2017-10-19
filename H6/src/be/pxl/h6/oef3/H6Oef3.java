package be.pxl.h6.oef3;

import java.util.Scanner;

public class H6Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een string in: ");
		String string = keyboard.nextLine();
		
		for(int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt((string.length()-1) -i));
		}
		
		keyboard.close();
	}
}
