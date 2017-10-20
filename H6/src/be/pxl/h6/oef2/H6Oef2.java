package be.pxl.h6.oef2;

public class H6Oef2 {

	public static void main(String[] args) {
		//indexOf
		String string = "Dis is een mooie strings";

		int first_t, first_T, lowestIndex;
		
		first_t = string.indexOf('t');
		first_T = string.indexOf('T');
		
		if(first_t == -1 && first_T == -1) {
			
			System.out.println("Er zit geen t of T in de gegeven tekst");
			
		} else if (first_t == -1){
			
			string = stringParser(string, first_T);
			
		} else if(first_T == -1) {
			
			string = stringParser(string, first_t);
		} else {
			
			if(first_t < first_T) {
				
				lowestIndex = first_t;
			} else {
				lowestIndex = first_T;
			}
			string = stringParser(string, lowestIndex);
		}
		
		System.out.println(string);
	}
	
	public static String stringParser(String string, int index) {
		
		int length;
		String temp;
		
		length = string.length();
		temp = string.substring(index, string.length());
		string = string.substring(0, index);
		
		if(length % 2 == 0) {
			temp = temp.toLowerCase();
		} else {
			temp = temp.toUpperCase();
		}
		
		string = string + temp;
		return string;
	}
}