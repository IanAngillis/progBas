package be.pxl.h7.exoef3;

import java.util.Scanner;

public class H7ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een geheel getal in: ");
		String getal = keyboard.next();

		String getalInWoorden = getGetalInWoorden(getal);

		System.out.println(getalInWoorden);

		keyboard.close();
	}

	public static String getGetalInWoorden(String getal) {
		StringBuilder temp = new StringBuilder("");
		String getalAlsWoord = new String("");

		for (int i = 0; i < getal.length(); i++) {

			getalAlsWoord = getGetalAlsWoord(getal.charAt(i));
			temp.append(getalAlsWoord);

		}

		getal = temp.toString();
		return getal;
	}

	public static String getGetalAlsWoord(char number) {
		
		String woord = new String();
		
		switch (number) {
		case '1':
			woord = "een ";
			break;
		case '2':
			woord = "twee ";
			break;
		case '3':
			woord = "drie ";
			break;
		case '4':
			woord = "vier ";
			break;
		case '5':
			woord = "vijf ";
			break;
		case '6':
			woord = "zes ";
			break;
		case '7':
			woord = "zeven ";
			break;
		case '8':
			woord = "acht ";
			break;
		case '9':
			woord = "negen ";

		}
		return woord;
	}

}
