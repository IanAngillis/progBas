package be.pxl.h6.exoef2;

import java.util.Scanner;

public class H6ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in: ");
		String text = keyboard.nextLine();
		
		if(text.length() % 3 == 0) {
			text = text.toUpperCase();
			System.out.println("Deelbaar door 3");
		} else {
			text = text.toLowerCase();
			System.out.println("Niet deelbaar door 3");
		}
		
		System.out.println(text);
		
		keyboard.close();
	}

}
