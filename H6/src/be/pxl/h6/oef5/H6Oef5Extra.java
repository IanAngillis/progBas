package be.pxl.h6.oef5;

public class H6Oef5Extra {
	
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
			
			String base = baseBuilder(i);
			eersteText = stringParser1(base);
			tweedeText = "00000000000000000" + eersteText;
			tweedeText = tweedeText.substring(tweedeText.length() - 21, tweedeText.length() - 1);
			
			System.out.printf("%20s %-20s %20s", eersteText, eersteText, tweedeText);
			System.out.println(base);
		}
	}
	
	public static String stringParser1(String base) {
		
		if(base.length() < 6) {
			base = base + ",000000";
			
			return base;
		} else {
			base = base + "00000";
			base = base.substring(0, 13);
			
			return base;
		}
		
	}
	
	//Maakt de string terug
	public static String baseBuilder(int index) {
		
		String finalString = "";
		StringBuilder string = new StringBuilder("");
		int limit = (index + 1);
		
		//Maakt het cijfergedeelte van de string.
		for(int i = 0; i < limit; i++) {
			
			if((i + 1) == 6) {
				string.append(',');
			}
			
			string.append(i+1);
		}
		
		finalString = string.toString();
		return finalString;
	}


}
