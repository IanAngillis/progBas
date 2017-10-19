package be.pxl.h5.exoef1;

/*Extra Oefening 1
 * 
 * U geeft via het toetsenbord het aantal graden Celsius in. 
 * De computer berekent het aantal graden Fahrenheit. 
 * Dit aantal wordt op het scherm afgedrukt
 */

import java.util.Scanner;

public class H5ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double temperatuurCelsius, temperatuurFahrenheit;
		
		System.out.println("Aantal graden: ");
		temperatuurCelsius = keyboard.nextDouble();
		
		temperatuurFahrenheit = (1.8 * temperatuurCelsius) + 32;
		
		System.out.println(temperatuurCelsius + " graden Celsius is " + temperatuurFahrenheit  + " Fahrenheit.");
		
		keyboard.close();
	}

}
