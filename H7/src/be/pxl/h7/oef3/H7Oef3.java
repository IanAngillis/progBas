package be.pxl.h7.oef3;

import java.util.Scanner;

public class H7Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int posArray[] = new int [10];
		int negArray[] = new int [10];
		
		int getal, kleinsteGetal;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Geef een getal in: ");
			getal = keyboard.nextInt();
			
			if(getal > 0) {
				addNumberToArray(getal, posArray);
			} else if (getal  < 0){
				addNumberToArray(getal, negArray);
			} else {
				System.out.println("Getal is 0");
			}
			
		}
		
		System.out.println("Positieve array: ");
		printArray(posArray);
		
		System.out.println("Negatieve array: ");
		printArray(negArray);
		
		kleinsteGetal = findSmallestNumber(negArray);
		
		System.out.println("Het kleinste negatieve getal is " + kleinsteGetal);
		
		keyboard.close();
	}
	
	public static int findSmallestNumber(int array []) {
		
		int smallestNumber = 0;
		
		for(int number : array ) {
			
			if(number < smallestNumber) {
				smallestNumber = number;
			}
		}
		
		return smallestNumber;
		
	}
	
	public static void printArray(int array []) {
		
		if(array[0] != 0) {
			
			for(int number : array) {
				
				if(number == 0) {
					return;
				} else {
					System.out.println(number);
				}
			} 
		} else {
			System.out.println("Arrays is empty");
		}
	}
	
	public static void addNumberToArray(int getal, int array []){
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == 0) {
				array[i] = getal;
				return;
			}
		}
		
		System.out.println("Getal is niet geplaatst, array is vol.");
	}

}
