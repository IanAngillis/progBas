package speelruimte;

import java.util.Random;

public class SpeelRuimte1 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int [] list = new int [5];

		for(int i = 0; i < list.length; i++){

			list[i] = rand.nextInt(50);
		}

		for(int number : list){
			System.out.print(number + " ");
		}

		

		for(int number : list){
			System.out.print(number + " ");
		}
		
	}
}
