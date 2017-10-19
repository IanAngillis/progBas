package helloWorld;

import java.util.Scanner;

public class HJk {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een even getal in");
		int eindGetal = keyboard.nextInt();
		
		int beginGetal = 1;
		
		while(eindGetal % 2 == 1) {
			System.out.println("Geef een even getal in");
			eindGetal = keyboard.nextInt();
		}
		
		while((eindGetal - beginGetal) != -1)
		{
			System.out.println(beginGetal + "/" + eindGetal);
			beginGetal++;
			eindGetal--;
		}
		keyboard.close();
 }
}
