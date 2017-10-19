package be.pxl.h5.exoef9;

/*Extra Oefening 9
 * 
 * Bereken de leeftijd van een persoon in jaren.
 * Geboortedag, geboortemaand en geboortejaar worden als gegevens ingegeven.
 * De huide dag, huide maand, huidig jaar moeten ook als gegevens ingegeven worden.
 */

import java.util.Scanner;

public class H5ExOef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int geboorteDag, geboorteMaand, geboorteJaar, huidigeDag, huidigeMaand, huidigJaar, jaarOud;
		
		System.out.println("Dag (geboorte): ");
		geboorteDag = keyboard.nextInt();
		System.out.println("Maand (geboorte): ");
		geboorteMaand = keyboard.nextInt();
		System.out.println("Jaar (geboorte): ");
		geboorteJaar = keyboard.nextInt();
		System.out.println("Dag (vandaag): ");
		huidigeDag = keyboard.nextInt();
		System.out.println("Maand (vandaag): ");
		huidigeMaand = keyboard.nextInt();
		System.out.println("Jaar (vandaag): ");
		huidigJaar = keyboard.nextInt();
		
		jaarOud = huidigJaar - geboorteJaar;
		
		if(huidigeMaand == geboorteMaand) {
			
			if(huidigeDag < geboorteDag) {
				jaarOud--;
			}
		} else if (huidigeMaand < geboorteMaand){
			jaarOud--;
		}
		
		System.out.println("Je bent " + jaarOud + " jaar jong.");
		
		keyboard.close();
	}

}
