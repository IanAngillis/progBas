package voorbeelden;

import java.util.Scanner;

public class VoorbeeldAge {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = keyboard.nextInt();
		
		if(age >= 18) {
			System.out.println("You're an adult");
		} else {
			System.out.println("You are a child");
		}
		
		keyboard.close();
	}

}
