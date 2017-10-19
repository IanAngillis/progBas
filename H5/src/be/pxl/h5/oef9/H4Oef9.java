package be.pxl.h5.oef9;

/*Oefening 9
 * 
 * Via het toetsenbord worden 2 gehele getallen a en b en een bewerkingscode c ingegeven. 
 * De bewerkingscode biedt de volgende mogelijkheden: 
 * code 1: optelling (a+b) 
 * code 2: aftrekking (a-b) 
 * code 3: vermenigvuldiging (a×b) 
 * code 4: kwadraat van a (a×a)
 * code 5: kwadraat van b (b×b)
 * Men wenst voor de ingevoerde getallen a en b, de via de code opgegeven bewerking uit te voeren, en het resultaat samen met de ingevoerde getallen af te drukken. 
 * Indien een code ingevoerd wordt die niet beantwoordt aan één van bovenvermelde bewerkingscodes, moet volgende boodschap “Foutieve code” afgedrukt worden.
 */

import java.util.Scanner;

public class H4Oef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int a, b, c, result;
		
		//Input vragen aan gebruiker
		System.out.println("Geef een eerste getal in: ");
		a = keyboard.nextInt();
		
		System.out.println("Geef een tweede getal in: ");
		b = keyboard.nextInt();
		
		System.out.println("Geef een bewerkingscode in (1 - 5): ");
		c = keyboard.nextInt();
		
		switch (c) {
			case 1: result = a + b;
					System.out.println(a + " + " + b + " = " + result);
					break;
					
			case 2: result  = a - b;
					System.out.println(a + " - " + b + " = " + result);
					break;
					
			case 3: result = a * b;
					System.out.println(a + " x " + b + " = " + result);
					break;
			
			case 4: result = a * a;
					System.out.println(a + " x " + a + " = " + result);
					break;
			
			case 5: result = b * b;
					System.out.println(b + " x " + b + " = " + result);
					break;
			
			default:
				System.out.println("Foutieve code.");
		}
		
		keyboard.close();
		
	}

}
