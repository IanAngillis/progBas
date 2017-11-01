package be.pxl.h6.oef4;

import java.util.Scanner;

public class H6Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//Aanmaken Scanner
		
		
		String finalString; 
		
		/*Input vragen aan de gebruiker*/
		System.out.println("Eerste tekstvariabele: ");
		String tekstVariabele1 = keyboard.next();
		
		System.out.println("Tweede tekstvariabele: ");
		String tekstVariabele2 = keyboard.next();
		
		//Berekeningen met strings
		tekstVariabele1 = firstVariableChecker(tekstVariabele1);
		tekstVariabele2 = secondVariableChecker(tekstVariabele2);
		finalString = tekstVariabele1 + tekstVariabele2;
		
		System.out.println("De string die we zoeken is: " + finalString);
		keyboard.close();
	}
	
	/*firstVariableChecker controleert en bewerkt de eerste ingegeven variabele
	 * 
	 * De functie kijkt naar de lengte van de string. Als deze lang genoeg is neemt het een substring en wordt deze omgezet naar uppercase vooraleer we de string returnen.
	 * In het andere geval maken we een andere string met * zodat deze aan de voorwaaden voldoet. Daarna plakken we de inputstring en de gemaakte string aan elkaar en zetten we deze naar uppercase alvorens deze te returnen.
	 * */
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
	
	//Dezelfde uitleg als firstVariableChecker "
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
