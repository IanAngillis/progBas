package be.pxl.h5.exoef14;

import java.util.Scanner;

public class H5ExOef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int geslacht, aantalWerknemers, aantalWerknemersMetSlechteConditie;
		double afgKm, percentageWerknemersMetSlechteConditie, conditieGetal, conditieVoorwaarde;
		
		aantalWerknemers = 0;
		aantalWerknemersMetSlechteConditie = 0;
		
		
		System.out.println("Geslacht (1(man) / 2(vrouw) / 0 (end the program): ");
		geslacht = keyboard.nextInt();
		
		
		while(geslacht != 0) {
			aantalWerknemers++;
			
			System.out.println("Afgelegde km na 12 minuten: ");
			afgKm = keyboard.nextFloat();
			
			conditieGetal = ((afgKm * 1000) - 504.9) / 44.73;
			
			if(geslacht == 1) {
				conditieVoorwaarde = 36;
			} else {
				conditieVoorwaarde = 29;
			}
			
			if(conditieGetal < conditieVoorwaarde) {
				aantalWerknemersMetSlechteConditie++;
			}
			
			System.out.println("Geslacht (1(man) / 2(vrouw) / 0 (end the program): ");
			geslacht = keyboard.nextInt();
		}
		
		percentageWerknemersMetSlechteConditie = ((double)aantalWerknemersMetSlechteConditie / aantalWerknemers) * 100;
		
		System.out.println(percentageWerknemersMetSlechteConditie + "% van de werknemers hebben een slechte conditie.");
		
		keyboard.close();
	}

}
