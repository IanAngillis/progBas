package be.pxl.h6.oef5;

public class H6Oef5 {

	public static void main(String[] args) {
	
		String text1 = "1. Gewoon";
		String text2 = "2. links";
		String text3 = "3. rechts (met null)";
		String text4 = "4. rechts met 3 dec";
		String eersteText;
		String tweedeText;
		String derdeText;
		
		
		System.out.printf("%20s %-20s %20s %20s", text1, text2, text3, text4);
		System.out.println();
		
		for(int i = 0; i < 9; i++) {
			
			eersteText = stringBuilder(i, 1);
			tweedeText = stringBuilder(i, 2);
			derdeText = stringBuilder(i, 3);
			
			System.out.printf("%20s %-20s %20s %20s", eersteText, eersteText, tweedeText, derdeText);
			System.out.println();
		}
	}
	
	//Maakt de string terug
	public static String stringBuilder(int index, int code) {
		
		String finalString = "";
		StringBuilder string = new StringBuilder("");
		int limit = (index + 1);
		
		//Maakt het cijfergedeelte van de string.
		for(int i = 0; i < limit; i++) {
			string.append(i+1);
		}
		
		//Maakt het "0" en "," gedeelte
		switch (code){
			case 1: string.append(",000000");
					finalString = string.toString();
					break;
			
			case 2: string.append(",000000");
					finalString = string.toString();
					finalString = "0000000000000" + finalString;
					finalString = finalString.substring(finalString.length() - 21, finalString.length() - 1);
					break;
			
			case 3: string.append(",000");
					finalString = string.toString();
					break;
					
		}
		return finalString;
	}

}
