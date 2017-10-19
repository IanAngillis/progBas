package be.pxl.h4h5.selectie.oef2;

/*Oefeningen op selectie
 * 
 * Oefening 2
 * 
 * Lees twee getallen in en deel het grootste door het kleinste. Opgepast met delen door 0.
 */

import java.util.Scanner;

public class H4H5SelectieOef2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a, b, biggestNumber, smallestNumber;
		float c;
		
		System.out.println("Geef een getal in: ");
		a = keyboard.nextInt();
		
		System.out.println("Geef een tweede getal in: ");
		b = keyboard.nextInt();
		
		if (a > b) {
			biggestNumber = a;
			smallestNumber = b;
		} else {
			biggestNumber = b;
			smallestNumber = a;
		}
		
		if (smallestNumber == 0) {
			System.out.println("Delen door 0 mag niet.");
		} else {
			c = biggestNumber/smallestNumber;
			System.out.println(biggestNumber + " : " + smallestNumber + " = " + c );
		}
		
		keyboard.close();
	}
}
