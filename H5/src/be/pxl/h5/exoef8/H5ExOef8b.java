package be.pxl.h5.exoef8;

import java.util.Scanner;

public class H5ExOef8b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getal1, getal2, getal3, highestNumber, secondHighestNumber, lowestNumber, temp1, temp2;
		
		System.out.println("Getal: ");
		getal1 = keyboard.nextInt();
		System.out.println("Getal: ");
		getal2 = keyboard.nextInt();
		System.out.println("Getal: ");
		getal3 = keyboard.nextInt();
		
		if(getal1 > getal2) {
			highestNumber = getal1;
			secondHighestNumber = getal2;
		} else {
			highestNumber = getal2;
			secondHighestNumber = getal1;
		}
		
		if(highestNumber < getal3) {
			temp1 = highestNumber;
			temp2 = secondHighestNumber;
			
			highestNumber = getal3;
			secondHighestNumber = temp1;
			lowestNumber = temp2;
		} else if (secondHighestNumber < getal3) {
			lowestNumber = secondHighestNumber;
			secondHighestNumber = getal3;
		} else {
			lowestNumber = getal3;
		}
		
		System.out.println(lowestNumber + " < " + secondHighestNumber + " < " + highestNumber);
		keyboard.close();
	}

}
