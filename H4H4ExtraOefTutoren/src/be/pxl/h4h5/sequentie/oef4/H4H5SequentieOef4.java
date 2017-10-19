package be.pxl.h4h5.sequentie.oef4;

/*Wim volgt het eerste jaar Toegepaste Informatica. Hij heeft slecht een zeer beperkt
 * programma, nl 2 opleidingsonderdelen= 'progammeren in java' (7 studiepunten, er is een
 * deelexamen dat voor 40% van de punten telt en een eindexamen dat voor 60% telt) en 
 * netwerkbesturingssystemen (3 studiepunten, een opdracht telt voor 70% van de punten en
 * het examen telt voor de overige 30%).
 * Voer via het toetsenbord de 4 resultaten in, telkens op 20 punten. Druk het 
 * totaalresultaat per opleidingsonderdeel af (op 20) en het totaal behaald percentage
 * (hierbij dien je rekening te houden met het aantal studiepunten).
 */

import java.util.Scanner;

public class H4H5SequentieOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float javaDeelExamen, javaExamen, netwerkTaak, netwerkExamen, javaTotaal, netwerkTotaal, procentGeslaagd;
		int javaTotal, netwerkTotal, studiepuntenGeslaagd = 0;
		
		System.out.println("Punten java deelexamen (op 20): ");
		javaDeelExamen = keyboard.nextFloat();
		
		System.out.println("Punten java examen (op 20): ");
		javaExamen = keyboard.nextFloat();
		
		System.out.println("Punten netwerk taak (op 20): ");
		netwerkTaak = keyboard.nextFloat();
		
		System.out.println("Punten netwerk examen (op 20): ");
		netwerkExamen = keyboard.nextFloat();
		
		javaTotaal = (javaDeelExamen * 0.4f) + (javaExamen * 0.6f);
		netwerkTotaal = (netwerkTaak * 0.7f) + (netwerkExamen * 0.3f);
		
		javaTotal = (int)javaTotaal;
		netwerkTotal = (int)netwerkTotaal;
		
		if (javaTotal >= 10)
			studiepuntenGeslaagd += 7;
		
		if (netwerkTotal >= 10)
			studiepuntenGeslaagd += 3;
		
		procentGeslaagd = (studiepuntenGeslaagd/10) * 100;
		
		System.out.println("Java: " + javaTotal + "/20.");
		System.out.println("Netwerken: " + netwerkTotal + "/20");
		System.out.println(procentGeslaagd + "% geslaagd.");
		
		keyboard.close();
	}

}
