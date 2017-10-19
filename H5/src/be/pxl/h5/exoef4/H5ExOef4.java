package be.pxl.h5.exoef4;

/*Extra Oefening 5
 * 
 * Schrijf een programma dat 3 getallen a, b en c inleest. 
 * Verplaats de waarde van a naar b, van b naar c en van c naar a. 
 * Druk daarna de waarden a, b en c af.
 */

import java.util.Scanner;

public class H5ExOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int a, b, c, temp1, temp2, temp3;
		
		System.out.println("Getal a: ");
		a = keyboard.nextInt();
		
		System.out.println("Getal b: ");
		b = keyboard.nextInt();
		
		System.out.println("Getal c: ");
		c = keyboard.nextInt();
		
		temp1 = a;
		temp2 = b;
		temp3 = c;
		
		a = temp3;
		b = temp1;
		c = temp2;
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
		
		keyboard.close();
	}

}
