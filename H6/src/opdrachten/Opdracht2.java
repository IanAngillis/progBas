package opdrachten;

import java.util.Random;

public class Opdracht2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int getal;
		
		for(int i = 0; i < 20; i++) { //Print 20 willekeurige getallen tussen 0 en 10
			
			getal = rand.nextInt(30-20 + 1) + 20;
			System.out.println((i+1) + " : " + getal);
		}
	}

}

//NextInt(Bovengrens - Ondergrens + 1) + ondergrenss  //+1 alleen als bovengrens inclusief is