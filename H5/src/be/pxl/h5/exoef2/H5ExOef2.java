package be.pxl.h5.exoef2;

/*Extra Oefening 2
 * 
 * U geeft via het toetsenbord het aantal graden Fahrenheit in en de computer berekent het aantal graden Celsius. Dit aantal wordt ook afgedrukt.
 */

import java.util.Scanner;

public class H5ExOef2 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double temperatuurCelsius, temperatuurFahrenheit;
		
		System.out.println("Aantal Fahrenheit: ");
		temperatuurFahrenheit = keyboard.nextDouble();
		
		temperatuurCelsius = (temperatuurFahrenheit - 32) / 1.8;
		
		System.out.println(temperatuurFahrenheit + " graden Fahrenheit is " + temperatuurCelsius  + " graden Celsius.");
		
		keyboard.close();
	}

}
