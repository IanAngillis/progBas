package voorbeeldexamen1.oef1;

import java.util.Scanner;

public class Ex1Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] temperaturen = new int [7];
		String[] neerslag = new String[7];
		boolean thuisBlijven = false;
		boolean dagUitstap = false;
		int aantalVoorspellingen = 0;
		
		for(int i = 0; i < 7; i++) {
			
			System.out.println("Geef regen in: ");
			neerslag[i] = keyboard.next();
			
			if(neerslag[i].equals("overvloed")) {
				thuisBlijven = true;
				break;
			}
				
			System.out.println("Geef temperatuur in: ");
			temperaturen[i] = keyboard.nextInt();
			//keyboard.nextLine(); //Scanner bullshit voorkomen
				
			if(temperaturen[i] < 15) {
				dagUitstap = true;
			}
			
			aantalVoorspellingen++;
		}
		
		printDecision(temperaturen, neerslag, thuisBlijven, dagUitstap, aantalVoorspellingen);
		
		keyboard.close();
	}
	
	public static void printDecision(int[] temperaturen, String[] neerslag, boolean thuisBlijven, boolean dagUitstap, int limiet) {
		
		System.out.printf("%10s %20s %20s \n", "dag", "temperatuur", "neerslag" );
		for(int i = 0; i < limiet; i++) {
			
			System.out.printf("%10d %20d %20s \n", (i+1), temperaturen[i], neerslag[i]);
		}
		
		if(thuisBlijven) {
			System.out.println("We blijven thuis");
		} else if (dagUitstap) {
			System.out.println("We gaan op daguitstap");
		} else {
			System.out.println("We gaan op tweedaagse");
		}
		
	}
}
