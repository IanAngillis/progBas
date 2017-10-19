package be.pxl.h5.exoef5;

import java.util.Scanner;

public class H5ExOef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal;
		
		System.out.println("Geef een getal in (bestaat minstens uit 3 cijfers): ");
		getal = keyboard.nextInt();
		
		System.out.println(getal);
		
		keyboard.close();
	}

}
