package opdrachten;

public class Opdracht1 {

	public static void main(String[] args) {
		
		int veelvoud7 [] = new int [20];
		
		//Creatie en vullen
		for(int i = 0; i < veelvoud7.length; i++) {
			veelvoud7[i] = i*7;
		}
		
		//Array uitprinten met for-each-loop
		for(int v : veelvoud7) {
			System.out.println(v);
		}
		
		//Array van booleans
		boolean boolArray [] = new boolean [6];
		boolArray[3] = true;
		
		for(boolean bool : boolArray) {
			System.out.println(bool);
		}
		
		System.out.println(boolArray);
		
		//Array maken (apart) + daarna vullen
		int nummers [] = new int [10];
		
		for(int i = 0; i < nummers.length; i++) {
			nummers[i] = i * 2 + 1;
		}
		
		int nummers2[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		
		//Printen met for each
		for(int nummer : nummers) {
			System.out.println(nummers);
		}
		
		for(int i = 0; i < nummers2.length; i++) {
			System.out.println(nummers2[nummers2.length - 1 - i]);
		}
		
		
	}

}
