package be.pxl.exoef1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class H7ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef n: ");
		int n = keyboard.nextInt();
		int temp;
		
		int[] array = new int[n];
		
		//Vul array in
		for(int i = 0; i < n; i++) {
			
			System.out.println("Geef getal " + (i+1) + " in: ");
			array[i] = keyboard.nextInt();
		}
		
		//print oorspronkelijke array
		System.out.println("Oorspronkelijke array");
		for(int number: array) {
			System.out.println(number);
		}
		
		//Verschuiving
		for(int i = 0; i < n; i++) {
			
			temp = array[i];
			
			if(i < (n-1)){
				array[i] = array[i + 1];
				array[i+1] = temp;
			} 
		}
		
		//Print array na verschuiving
		System.out.println("Array na verschuiving");
		for(int number: array) {
			System.out.println(number);
		}
		
		keyboard.close();
	}

}
