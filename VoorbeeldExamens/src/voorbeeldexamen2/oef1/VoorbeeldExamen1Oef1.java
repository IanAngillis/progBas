package voorbeeldexamen2.oef1;

import java.util.Scanner;
import java.util.Random;

public class VoorbeeldExamen1Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int hoeveelGetallen;
		int veelvoud;
		
		System.out.println("Geef het aantal getallen in dat random zal berekend worden: ");
		hoeveelGetallen = keyboard.nextInt();
		
		while(hoeveelGetallen < 2) {
			System.out.println("Geef het aantal getallen in dat random zal berekend worden: ");
			hoeveelGetallen = keyboard.nextInt();
		}
		
		int [] intArray = new int[hoeveelGetallen];
		
		System.out.println("Geef het veelvoud op: ");
		veelvoud = keyboard.nextInt();
		
		while(veelvoud >= 10) {
			System.out.println("Geef het veelvoud op: ");
			veelvoud = keyboard.nextInt();
		}
		
		vulArray(intArray, veelvoud);
		
		System.out.println("De gegeneerde getallen zijn: ");
		
		printArray(intArray);
		
		System.out.println("De array in speciale afdruk: ");
		arrayInSpecialeAfdruk(intArray);
		
		System.out.println("De getallen die kleiner zijn dan het gemiddelde: ");
		afdrukGetallenKleinerDanHetGemiddelde(intArray);
		
	
		keyboard.close();
	}
	
	public static void afdrukGetallenKleinerDanHetGemiddelde(int [] intArray) {
		double gemiddelde = getGemiddelde(intArray);
		
		for(int number : intArray) {
			
			if(number < gemiddelde) {
				System.out.print(number + " ");
			}
		}
	}
	
	public static double getGemiddelde(int [] intArray) {
		double gemiddelde = 0;
		
		for(int number : intArray) {
			gemiddelde += number;
		}
		
		gemiddelde = (double)gemiddelde / intArray.length;
		return gemiddelde;
	}
	
	public static void printArray(int [] intArray) {
		for(int number: intArray) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
	
	public static void arrayInSpecialeAfdruk(int [] intArray) {
		
		if(intArray.length % 2 == 0) {
			printArray(intArray);
		} else {
			
			for(int i = 0; i < intArray.length; i++) {
				System.out.print(intArray[intArray.length - 1 - i] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void vulArray(int [] intArray, int veelvoud) {
		
		int getal;
		
		for(int i = 0; i < intArray.length; i++) {
			
			getal = getRandomGetal(veelvoud);
			intArray[i] = getal;
		}
	}
	
	public static int getRandomGetal(int veelvoud) {
		Random rand = new Random();
		int randomGetal;
		
		randomGetal = rand.nextInt(100) + 1;
		
		while(randomGetal % veelvoud != 0) {
			randomGetal = rand.nextInt(100) + 1;
		}
		
		return randomGetal;
	}

}
