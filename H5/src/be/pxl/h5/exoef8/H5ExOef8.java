package be.pxl.h5.exoef8;

/*Extra Oefening 8
 * 
 * Rangschik 3 willekeurige getallen volgens grootte. Het kleinste getal eerst. Gebruik hierbij geen logische operatoren.
 */

import java.util.Scanner;

public class H5ExOef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int number1, number2, number3, difference, temp, highestNumber, secondHighestNumber, lowestNumber = 0, temp1, temp2;
		
		System.out.println("Geef een getal: ");
		number1 = keyboard.nextInt();
		System.out.println("Geef een getal: ");
		number2 = keyboard.nextInt();
		System.out.println("Geef een getal: ");
		number3 = keyboard.nextInt();
		
		difference = number1 - number2;
		temp = difference + Math.abs(difference);
		
		if (temp == 0) {
			highestNumber = number2;
			secondHighestNumber = number1;
		} else {
			highestNumber = number1;
			secondHighestNumber = number2;
		}
		
		difference = highestNumber - number3;
		temp = difference + Math.abs(difference);
		
		if (temp == 0) {
			temp1 = highestNumber;
			temp2 = secondHighestNumber;
			highestNumber = number3;
			secondHighestNumber = temp1;
			lowestNumber = temp2;
		} else {
			difference = secondHighestNumber - lowestNumber;
			temp = difference + Math.abs(difference);
			
			if(temp == 0) {
				temp1 = secondHighestNumber;
				secondHighestNumber = number3;
				lowestNumber = temp1;
			} else {
				lowestNumber = number3;
			}
		}
		
		System.out.println(highestNumber + " > " + secondHighestNumber + " > " + lowestNumber);
		keyboard.close();
	}

}
