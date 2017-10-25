package be.pxl.h7.oef1;

import java.util.Scanner;

public class H7Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int intArray [] = new int[15];
		int sum = 0;
		int aantalGetallenKleinerDanHetGemiddelde = 0;
		double gemiddelde, procent;
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("Geef een getal in: ");
			intArray[i] = keyboard.nextInt();
			sum += intArray[i];
		}
		
		gemiddelde = (double)sum / 15;
		
		for(int getal : intArray) {
			if(getal < gemiddelde) {
				aantalGetallenKleinerDanHetGemiddelde++;
			}
		}
		
		procent = ((double) aantalGetallenKleinerDanHetGemiddelde / 15) * 100;
		
		System.out.printf("Het gemiddelde is: %.1f \n", gemiddelde);
		System.out.println("Er zijn " + aantalGetallenKleinerDanHetGemiddelde + " kleiner dan het gemiddelde." );
		System.out.printf("Dit is %.1f procent van de ingegeven getallen.", procent);
		
		keyboard.close();
	}

}
