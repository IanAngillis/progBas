package be.pxl.h5.exoef17;

//FOUT TODO

import java.util.Scanner;

public class H5ExOef17 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double rentePercentage, temp;
		int jaren = 0;
		
		
		System.out.println("Rentepercentage: ");
		rentePercentage = keyboard.nextDouble();
		
		temp = 1 + rentePercentage;
		
		while(temp < 2) {
			temp *= temp;
			jaren++;
		}
		
		System.out.println("Het zal " + jaren + " jaar duren alvorens het beginkapitaal verdubbeld is met deze rente.");
		
		keyboard.close();
	}

}

