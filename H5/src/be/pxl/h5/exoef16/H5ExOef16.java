package be.pxl.h5.exoef16;

import java.util.Scanner;

public class H5ExOef16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int lengte, hoogte;
		
		System.out.println("Lengte: ");
		lengte = keyboard.nextInt();
		
		System.out.println("Hoogte: ");
		hoogte = keyboard.nextInt();
		
		for(int row = 0; row < hoogte; row++) {
			 
			if(row % (hoogte - 1) == 0) {
				for(int i = 0; i < lengte; i++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				System.out.print("* ");
				
				for(int i = 0; i <= (lengte); i++) {
					System.out.print(" ");
				}
				
				System.out.print(" *");
				System.out.println();
			}
		}
		
		keyboard.close();
	}

}
