package be.pxl.h5.exoef10;

/*Extra Oefening 10
 * 
 * Ga na of een ingevoerd jaar een schrikkeljaar is of niet.
 * Een jaar is een schrikkeljaar als het deelbaar is door 4; 
 * maar als het jaartal deelbaar is door 100 is het geen schrikkeljaar,
 * tenzij het deelbaar is door 400. Zo is bijvoorbeeld het jaar 2000 een schrikkeljaar,
 * want deelbaar door 400; het jaar 1900 is geen schrikkeljaar, want deelbaar door 100 en niet door 400
 * 
 */

import java.util.Scanner;

public class H5ExOef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int jaar;
		
		System.out.println("Geef een jaartal in: ");
		jaar = keyboard.nextInt();
		
		if((jaar % 4 == 0) && ((jaar % 100 != 0) || (jaar % 400 == 0))) {
			System.out.println(jaar + " is een schrikkeljaar");
		} else {
			System.out.println(jaar + " is geen schrikkeljaar");
		}
		
		keyboard.close();
	}

}
