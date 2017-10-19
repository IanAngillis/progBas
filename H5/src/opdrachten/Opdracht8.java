package opdrachten;

import java.util.Scanner;

public class Opdracht8 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		float lengte, bmi;
		int gewicht;
		
		System.out.println("Geef u lengte in meter: ");
		lengte = keyboard.nextFloat();
		
		System.out.println("Geef u gewicht in kg: ");
		gewicht = keyboard.nextInt();
		
		bmi = gewicht / (lengte * lengte);
		System.out.println("Je bmi is " + bmi);
		
		if (bmi < 18) {
			System.out.println("Ondergewicht");
		} else {
			if (bmi <= 25) {
				System.out.println("Ok");
			} else {
				System.out.println("Overweeg een dieet");
				if (bmi <= 30) {
					System.out.println("Overgewicht");
				} else {
					if (bmi <= 40) {
						System.out.println("Obesitas");
					} else {
						System.out.println("Extreme obesitas");
					}
				}
			}
		}
		
	}

}
