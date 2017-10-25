package be.pxl.h7.oef2;

import java.util.Random;

public class H7Oef2 {

	public static void main(String[] args) {
		Random rand = new Random();
		long som = 0;
		int som1 = 0;
		
		int intArray[] = new int[500];
		
		for(int i = 0; i < intArray.length; i++) {
			
			intArray[i] = rand.nextInt();
		}
		
		for(int getal : intArray) {
			
			if(getal > 100) {
				som += getal;
			}
		}
		
		System.out.println("Som (long): " + som);
		System.out.println("Som (int): " + som1);
	}

}
