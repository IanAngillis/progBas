package opdrachten;

import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {
		String tekst = "abc";
		
		System.out.println(tekst);
		tekst = tekst.toUpperCase();
		System.out.println(tekst);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef je familienaam: ");
		String familienaam = keyboard.nextLine();
		System.out.println(familienaam);
		System.out.println("Geef je voornaam: ");
		String voornaam = keyboard.nextLine();
		System.out.println(voornaam);
		
		keyboard.close();
	}

}
