package be.pxl.h6.oef4;

import java.util.Scanner;
import java.lang.StringBuilder;

public class H6Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int difference;
		
		System.out.println("Eerste tekstvariabele: ");
		String tekstVariabele1 = keyboard.next();
		
		System.out.println("Tweede tekstvariabele: ");
		String tekstVariabele2 = keyboard.next();
		
		String appendString = "*";
		
		if(tekstVariabele1.length() > 4) {
			tekstVariabele1 = tekstVariabele1.substring(0, 4);
		} else {
			difference = 4 - tekstVariabele1.length();
			
			for(int i = 0; i < difference; i++) {
				
				tekstVariabele1 = tekstVariabele1 + appendString;
			}
		}
		
		System.out.println("tekstvariabele 1: " + tekstVariabele1);
		
		
		keyboard.close();
	}

}
