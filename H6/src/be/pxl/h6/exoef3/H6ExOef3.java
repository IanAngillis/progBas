package be.pxl.h6.exoef3;

import java.util.Scanner;
import java.util.Random;

public class H6ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		String sub;
		
		System.out.println("Text: ");
		String text = keyboard.nextLine();
		
		sub = text.substring(0, 1);
		
		System.out.println(sub);
		
		sub += 7;
		
		System.out.println(sub);
		
		keyboard.close();
	}

}
