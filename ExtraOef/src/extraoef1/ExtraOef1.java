package extraoef1;

import java.util.Scanner;

public class ExtraOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int array[][], n, row, colum, player;
		int turn = 0;
		player = 0;	
		
		System.out.println("Getal: ");
		n = keyboard.nextInt();
		
		array = new int[n][n];
		
		setArrayToZero(array, n);
		printArray(array, n);
		System.out.println();
		
		
		while(gameHasNotEnded(array, n)) {
			
			player = turn % 2;
			
			System.out.println("Speler " + (player +1) + " is aan de beurt.");
			row = getRow(n);
			colum = getColum(n);
			
			updateArray(array, n, row, colum);
			printArray(array, n);
			
			turn++; //update turn
		}
		
		printArray(array, n);
		System.out.println("Speler " + (player + 1) + " heeft gewonnen.");
		System.out.println("Het spel heeft " + turn + " beurten geduurd.");
		
		keyboard.close();
	}
	
	public static void updateArray(int array[][], int length, int row, int colum) {
		
		for(int i = 0; i < length; i++) {
			
			array[row][i] = 1;
			array[i][colum] = 1;
		}
	}
	
	
	//Woordje meegeven in parameter
	public static int getRow(int length) {
		Scanner keyboard = new Scanner(System.in);
		int row;
		
		System.out.println("Rij: ");
		row = keyboard.nextInt();
		
		while((row < 1) || (row > length)) {
			System.out.println("Gegeven rij bestaat niet. Probeer Opnieuw. Rij: ");
			row = keyboard.nextInt();
		}
		
		row--; //voor indexering van array
		
		
		return row;
		
	}
	
	
	public static int getColum(int length) {
		Scanner keyboard = new Scanner(System.in);
		int colum;
		
		System.out.println("Kolom: ");
		colum = keyboard.nextInt();
		
		while((colum < 1) || (colum > length)) {
			System.out.println("Gegeven kolom bestaat niet. Probeer Opnieuw. Kolom: ");
			colum = keyboard.nextInt();
		}
		
		colum--; //voor indexering van array
		
		return colum;
		
	}
	
	public static void setArrayToZero(int array[][], int length) {
		
		for(int row = 0; row < length; row++) {
			
			for(int colum = 0; colum < length; colum++) {
				array[row][colum] = 0;
			}
		}
	}
	
	public static void printArray(int array[][], int length) {
		
		for(int row = 0; row < length; row++) {
			
			for(int colum = 0; colum < length; colum++) {
				System.out.print(array[row][colum] + " ");
			}
			System.out.println();
		}
	}

	public static boolean gameHasNotEnded(int array[][], int length) {
		for(int row = 0; row < length; row++) {
			
			for(int colum = 0; colum < length; colum++) {
				if(array[row][colum] != 1) {
					return true;
				}
			}
		}
		return false;
	}
}
