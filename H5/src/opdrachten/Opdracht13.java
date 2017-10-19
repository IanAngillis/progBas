package opdrachten;

import java.util.Scanner;
public class Opdracht13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal;
		
		System.out.println("Geef een getal in: ");
		getal = keyboard.nextInt();
		
		while((getal < 0) || (getal  > 10)) {
			System.out.println("Geef een getal in: ");
			getal = keyboard.nextInt();
		}
		
		System.out.println(getal);
	}

}
