package opdrachten;

import java.util.Scanner;

public class Opdracht16b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double belastbaar, bedrag;
		
		System.out.println("Geef het belastbaar bedrag in: ");
		belastbaar = keyboard.nextFloat();
		
		bedrag = BerekenBelasting(belastbaar);
		System.out.println("U moet " + bedrag + " belasting betalen.");
		
		
		keyboard.close();
	}
	
	public static double BerekenBelasting(double belastbaar){
		double belasting;
		
		if(belastbaar <= 25000) {
			belasting = 38.4 * belastbaar / 100;
		} else if (belastbaar <= 55000) {
			belasting = 25000 * 38.4 / 100  + (belastbaar - 25000) * 50/100.0;
		} else {
			belasting = 25000 * 38.4 / 100 + 30000 * 50/100.0 + (belastbaar - 55000) * 60 / 100.0;
		}
		
		return belasting;
	}

}
