package opdrachten;

public class Opdracht4 {
	public static void main(String[] args) {
		int a = 2147483645, b = 2147483642, product1;
		long product2, product3;
		
		product1 = a * b;	//INT in een INT steken geeft NOOIT problemen, ook al is er een overflow.
		
		product2 = a * b;	//Resultaat is een int die we in een long gaan steken, maar die int is overflowed dus geeft het alsnog een fout resultaat.
		
		product3 = (long)a * b; // We casten a naar een long dan en dat lost ons probleem op. We kennen een long aan een long toe.
		
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		System.out.println("Zie comments in de code!");

	}
}
