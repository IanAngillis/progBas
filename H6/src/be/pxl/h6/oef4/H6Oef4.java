package be.pxl.h6.oef4;

import java.util.Scanner;
import java.lang.StringBuilder;

public class H6Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.println("Eerste tekstvariabele: ");
		String tekstVariabele1 = keyboard.next();
		
		System.out.println("Tweede tekstvariabele: ");
		String tekstVariabele2 = keyboard.next();
		
		if(tekstVariabele1.length() < 4) {
			tekstVariabele1 = tekstVariabele1.concat("*");
		}
		
		System.out.println(tekstVariabele1);
		
	}

}
