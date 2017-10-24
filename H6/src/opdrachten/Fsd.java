package opdrachten;

import java.util.Scanner;

public class Fsd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String string = new String("stop");
		
		if(string.equals("stop")) {
			System.out.println("ja");
		} else {
			System.out.println("nee");
		}
		
		

		keyboard.close();
	}

}