package be.pxl.h7.exoef2;

import java.util.Scanner;

public class H7Exoef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String klascode = new String("");
		int aantalStudenten;
		int betaaldeVoorschot;
		int[] onkostenArray;
		int studentenNummer;
		int onkosten;

		System.out.println("Klascode: ");
		klascode = keyboard.next();

		keyboard.nextLine();

		System.out.println("Aantal studenten: ");
		aantalStudenten = keyboard.nextInt();

		System.out.println("Betaalde voorschot: ");
		betaaldeVoorschot = keyboard.nextInt();

		onkostenArray = new int[aantalStudenten];

		System.out.println("Studentennummer: ");
		studentenNummer = keyboard.nextInt();

		while (studentenNummer != 0) {

			System.out.println("Onkosten: ");
			onkosten = keyboard.nextInt();
			onkostenArray[studentenNummer - 1] += onkosten;

			System.out.println("Studentennummer: ");
			studentenNummer = keyboard.nextInt();
		}

		for (int i = 0; i < onkostenArray.length; i++) {

			System.out.println(klascode + ": student " + (i + 1) + " heeft " + onkostenArray[i] + " onkosten. Saldo: "
					+ (onkostenArray[i] - betaaldeVoorschot));

		}

		keyboard.close();
	}

}
