package opdrachten;

import java.util.Scanner;

public class Opdracht16a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal;
		
		System.out.println("Welke tafel wil je zien: ");
		getal = keyboard.nextInt();
		
		toonTafel(getal);
		
		keyboard.close();
	}
	
	public static void toonTafel(int a) { //methode drukt tafel af
		
		for(int i = 0; i < 10; i++ ) {
			System.out.println((i+1) + " x " + a + " = " + ((i+1) * a));
		}
	}

}
