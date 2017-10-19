package be.pxl.h6.oef1;

import java.util.Random;

public class H6Oef1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		char reeks = 'A';
		char teken;
		int getal1, getal2;
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Reeks " + reeks);
			reeks += 1;
			
			for(int j = 0; j < 5; j++) {
				
				getal1 = rand.nextInt(21);
				getal2 = rand.nextInt(21);
				
				while(inputCheck(getal1, getal2)) {
					getal1 = rand.nextInt(21);
					getal2 = rand.nextInt(21);
				}
				
				teken = characterCheck(getal1, getal2);
				System.out.println((j+1) + ")\t" + getal1 + " " + teken + " " + getal2 + " =");
				
			}
		}
	}
	
	public static char characterCheck(int a, int b) {
		
		if((a + b) < 21){
			return '+' ;
		} else {
			return '-';
			
		}
	}
	
	public static boolean inputCheck(int a, int b) {
		
		boolean addition, subtraction;
		
		if((a + b) > 20){
			addition = false;
		} else {
			addition = true;
		}
		
		if((a - b) < 0) {
			subtraction = false;
		} else {
			subtraction = true;
		}
		
		if(addition || subtraction) {
			return false;
		} else {
			return true;
		}
	}
}
