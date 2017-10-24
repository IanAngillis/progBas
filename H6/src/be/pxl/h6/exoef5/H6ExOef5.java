package be.pxl.h6.exoef5;

import java.util.Scanner;

public class H6ExOef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Tekst: ");
		String text = keyboard.nextLine();
		
		System.out.println("teken: ");
		char teken = keyboard.next().charAt(0);
		
		
		text = vowelChanger(text, teken);
				
		System.out.println(text);
		keyboard.close();
	}
	
	public static boolean charIsVowel(char character) {
		
		switch(character) {
			case 'A': return true;
			case 'E': return true;
			case 'I': return true; 
			case 'O': return true;
			case 'U': return true;
			case 'a': return true;
			case 'e': return true;
			case 'i': return true;
			case 'o': return true;
			case 'u': return true;
			default:
				return false;
		}
	}
	
	public static String vowelChanger(String text, char teken) {
		
		StringBuilder temp = new StringBuilder(text);
		
		for(int i = 0; i < text.length(); i++) {
			
			if(charIsVowel(temp.charAt(i))) {
				temp.setCharAt(i, teken);
			}
			
		}
		
		text = temp.toString();
		return text;
	}

}
