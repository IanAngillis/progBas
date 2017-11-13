package be.pxl.h7.exoef4;

import java.util.Scanner;

public class H7ExOef4c {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[][] intArray = new int[3][4];
		int som;
		
		//vul de tweedimensionele array met cijfers
		for(int i = 0;i < intArray[0].length; i++) {
			
			for(int j = 0; j < intArray.length; j++) {
				
				System.out.println("Nummer op positie " + i + " " + j + " : ");
				intArray[j][i] = keyboard.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < intArray.length; i++) {
			
			som = 0;
			for(int j = 0; j  < intArray[i].length; j++) {
				
				som += intArray[i][j];
			}
			
			System.out.println("Rij " + (i+1) + " = " + som);
		}
		
		System.out.println(1 + 5 + " lol " + 1 + 5);

		keyboard.close();
	}
	

}
