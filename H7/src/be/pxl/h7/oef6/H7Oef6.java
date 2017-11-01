package be.pxl.h7.oef6;

import java.util.Scanner;

public class H7Oef6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int results[][] = new int [5][4];
		
		
		for(int i = 0; i < results.length; i++) {
			
			for(int j = 0; j < results[i].length; j++) {
				System.out.println("Geef resultaat in: ");
				results[i][j] = keyboard.nextInt();
			}
		}
		
		
		System.out.println("Vakresultaten");
		
		for(int i = 0; i < results[i].length; i++) {
			
			System.out.println("Vak " + (i+1) + ": ");
			lowestGrade(results, i);
			gemiddelde(results, i);
	
		}
		
		/*
		for(int i = 0; i < results.length; i++) {
					
					for(int j = 0; j < results[i].length; j++) {
						System.out.print(" " + results[i][j]);
						
			}
					
					
			System.out.println();
		}
		*/
		keyboard.close();
	}
	
	public static void lowestGrade(int results[][], int index) {
		int lowestScore = 20;
		int student = -1;
		
		for(int i = 0; i < results.length; i++) {
			
			if(results[i][index] < lowestScore) {
				lowestScore = results[i][index];
				student = (i+1);
			}

		}
		
		System.out.println("Laaste score: " + lowestScore + " behaald door student " + student);
		
	}
	
	public static void gemiddelde(int results[][], int index) {
		double gemiddelde;
		double som = 0;
		
		for(int i = 0; i < results.length; i++) {
				som += results[i][index];
		}
		
		gemiddelde = (som / results.length);
		
		System.out.printf("Gemiddelde: %.1f", gemiddelde);
		System.out.println();
	}
}

