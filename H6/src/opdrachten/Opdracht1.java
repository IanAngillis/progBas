package opdrachten;

import java.util.Random;

public class Opdracht1 {

	public static void main(String[] args) {
		Random willekeurig = new Random();

		//a - Een random getalleke
		
		int getal = willekeurig.nextInt();
		System.out.println(getal); //Eender welke int, ook negatieve getalle
	}

}
