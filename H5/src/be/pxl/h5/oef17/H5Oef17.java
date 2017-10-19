package be.pxl.h5.oef17;

/*Oefening 17
 * 
 * Schrijf een programma dat de volgende vermenigvuldigingstabel afdrukt
 * 1	2	3	4	5	6	7	8	9	10
 * 2	4	6	8	10	12	14	16	18	20
 * ..	..	..	..	..	..	..	..	..	..
 * 5	10	15	20	25	30	35	40	45	50
 */

public class H5Oef17 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			
			for (int j = 0; j < 10; j++) {
				int product = (i+1) * (j+1);
				System.out.print(product + "\t");
			}
		}
	}
}
