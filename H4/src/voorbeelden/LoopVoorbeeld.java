package voorbeelden;

import java.util.Scanner;

public class LoopVoorbeeld {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;
		
		System.out.println("Geef een getal in dat groter is dan 100");
		getal = keyboard.nextInt();
		
		while (getal > 100) {
			int product = getal *3;
			System.out.println("Het getal is " + getal);
			System.out.println("Het driedubbele van " + getal + " is " + product);
			
			System.out.println("Geef een getal in dat groter is dan 100");
			getal = keyboard.nextInt();
		}
		
		System.out.println("**Program ends**");
		keyboard.close();
	}

}
