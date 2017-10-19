package voorbeelden;

import java.util.Scanner;//Zie comment regel 12

public class VoorbeeldScanner {

	public static void main(String[] args) {
		
		int getal1, getal2, som; //int is een geheel getal
		
		
		/*Als je de Scanner klasse, zie hierboven, niet importeerd
		 * dan krijg je een foutmelding. De klasse maakt een 
		 * scanner object aan, die hebben we nodig om gegevens
		 * via het toetsenbord in te geven.*/
		
		Scanner keyboard = new Scanner(System.in);
		
		//We vragen eerst de gebruiker wat er van hem verwacht wordt
		//vooralleer we ons programma voorbereiden op input
		System.out.println("Geef een getal in: ");
		getal1 = keyboard.nextInt();//Het getal dat we nu ingeven wordt opgeslagen in die variabele
		
		//zie comment op lijn 19
		System.out.println("Geef nog een getal in: ");
		getal2 = keyboard.nextInt();//zie comment regel 22
		
		//We berekenen de som en printen wat we bekomen op het scherm
		som = getal1 + getal2;
		System.out.println("De som is " + som);// Als we tekst en veriabelen aan elkaar willen pallen gebruiken we '+'
		
		//keyboard sluiten
		keyboard.close();
	}

}
