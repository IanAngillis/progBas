package be.pxl.h6.exoef4;

public class H6ExOef4 {

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder("");
		
		char character;
		
		for(char i = 'a'; i <=  'z'; i++ ) {
			string.append(i);
		}
		
		System.out.println(string);
		
		for(int i = 0; i < 26; i++) {
			
			if(i % 2 == 1) {
				character = (char)(string.charAt(i) - 32);
				string.setCharAt(i, character);
			}
		}
		
		System.out.println(string);
	}

}
