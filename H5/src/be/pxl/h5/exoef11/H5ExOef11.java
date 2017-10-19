package be.pxl.h5.exoef11;

/*Extra Oefening 11
 * 
 * We wensen een tabel af te drukken voor de omzetting van Celsiusgraden in
 * Fahrenheitgraden. Van -40 tot 100 graden Celsius wordt per 10 graden het overeenkomstig
 * aantal Fahrenheitgraden berekend. Formule: F = (9/5) C+32
 * 
 */

public class H5ExOef11 {

	public static void main(String[] args) {
		
		double fahrenheit, celsius;
		celsius = -40;
		
		System.out.println("Graden Celsius \t Graden Fahrenheit");
		
		for(int i = 0; i < 15; i++) {
			
			fahrenheit = (1.8 * celsius) + 32;
			System.out.println((int)celsius + " \t " + (int)fahrenheit);
			celsius += 10;
		}
		
	}

}
