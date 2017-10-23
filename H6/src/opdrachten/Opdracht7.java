package opdrachten;

import java.util.Scanner;


public class Opdracht7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef getal");
		int getal = keyboard.nextInt();
		keyboard.nextLine();				//ZEKER DOEN ALS WE SWITCHEN VAN INT NAAR STRING EN VICA VERSA ANDERS CRASH
		System.out.println("Geef naam");
		String naam = keyboard.nextLine();
		
		keyboard.close();
	}

}
