package be.pxl.h6.oef4;

import java.util.Scanner;
import java.lang.StringBuilder;

public class H6Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		String finalString;
		
		System.out.println("Eerste tekstvariabele: ");
		String tekstVariabele1 = keyboard.next();
		
		System.out.println("Tweede tekstvariabele: ");
		String tekstVariabele2 = keyboard.next();
		
		tekstVariabele1 = firstVariableChecker(tekstVariabele1);
		tekstVariabele2 = secondVariableChecker(tekstVariabele2);
		finalString = tekstVariabele1 + tekstVariabele2;
		
		System.out.println("De string die we zoeken is: " + finalString);
		keyboard.close();
	}
	
	public static String firstVariableChecker(String tekstVariabele) {
		
		String appendString = "*";
		int difference;
		
		if(tekstVariabele.length() > 4) {
			tekstVariabele = tekstVariabele.substring(0, 4);
		} else {
			difference = 4 - tekstVariabele.length();
			
			for(int i = 0; i < difference; i++) {
				
				tekstVariabele = tekstVariabele + appendString;
			}
		}
		
		tekstVariabele = tekstVariabele.toUpperCase();
		return tekstVariabele;
		
	}
	
	public static String secondVariableChecker(String tekstVariabele) {
		
		int difference;
		String appendString = "*";
		String temp = "*";
		
		if(tekstVariabele.length() > 4) {
			tekstVariabele = tekstVariabele.substring(tekstVariabele.length() - 4, tekstVariabele.length());
		} else {
			
			difference = 4 - tekstVariabele.length() - 1;
			
			for(int i = 0; i < difference; ++i) {
				temp = temp + appendString;
			}
			
			tekstVariabele = temp + tekstVariabele;
		}
		
		tekstVariabele = tekstVariabele.toLowerCase();
		return tekstVariabele;
	}

}
