package be.pxl.h5.exoef15;

import java.util.Scanner;

public class H5ExOef15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int vermenigvuldiger, vermenigvuldigtal, product;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Vermenigvuldiger: ");
			vermenigvuldiger = keyboard.nextInt();
			
			System.out.println("Vermenigvuldigtal: ");
			vermenigvuldigtal = keyboard.nextInt();
			
			System.out.println("Oefening " + (i+1));
			System.out.println();
			
			for(int j = 0; j <= vermenigvuldigtal; j++) {
				product = j * vermenigvuldiger;
				
				System.out.println(j + "x" + vermenigvuldiger + " = " + product);
			}
			System.out.println();
		}
		keyboard.close();
	}

}
