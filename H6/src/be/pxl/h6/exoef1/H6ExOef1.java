package be.pxl.h6.exoef1;

import java.util.Scanner;
import java.util.Random;

public class H6ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int getal1 = rand.nextInt(11);
		int getal2;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Geef een getal in: ");
			getal2 = keyboard.nextInt();
			
			if(getal2 < getal1) {
				
				if(i == 3) {
					System.out.println("Verloren");
					break;
				}
				System.out.println("Hoger");
				
			} else if (getal2 > getal1) {
				
				if(i == 3) {
					System.out.println("Verloren");
					break;
				}
				
				System.out.println("Lager");
			} else {
				System.out.println("Proficiat, getal geraden");
				break;
			}
			
		}
		
		keyboard.close();
	}

}
