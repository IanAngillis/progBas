package be.pxl.h5.oef1;

/*Oefening 1
 * 
 * Zet een via het toetsenbord ingegeven bedrag in BEF om in euro (1 euro = 40.3399 bef).
 */

import java.util.Scanner;

public class H5Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int belgischeFrank;
		double bedragEuro;
		final double BEF; //Omzetkoers
		BEF = 40.3399;
		
		System.out.println("Geef een bedrag in (BEF): ");
		belgischeFrank = keyboard.nextInt();
		
		bedragEuro = belgischeFrank/BEF;
		
		System.out.println(belgischeFrank + " Belgische Frank is " + bedragEuro + " euro.");
		
		keyboard.close();
	}

}
