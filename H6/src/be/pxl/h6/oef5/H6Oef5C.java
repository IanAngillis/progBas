package be.pxl.h6.oef5;

public class H6Oef5C {

	public static void main(String[] args) {
		String text1 = "1. gewoon";
		String text2 = "2. Links";
		String text3 = "3. Rechts (met nul)";
		String text4 = "4. Rechts met 3 dec";

		System.out.printf("%20s %-20s %20s %20s \n", text1, text2, text3, text4);

		for (int i = 0; i < 9; i++) {

			String base = stringGenerator((i + 1));

			String number1 = stringCompleter(base, 1);
			String number2 = stringCompleter(base, 2);
			String number3 = stringCompleter(base, 3);

			System.out.printf("%20s %-20s %20s %20s \n", number1, number1, number2, number3);

		}

	}

	public static String stringCompleter(String base, int code) {

		String finalString = new String("");
		String temp;
		int difference;

		switch (code) {
		case 1:
			finalString = base + ",000000";
			break;

		case 2:
			finalString = base + ",000000";
			difference = 20 - finalString.length();
			temp = makeZeroString(difference);
			finalString = temp + finalString;
			break;

		case 3:
			finalString = base + ",000";

		}

		return finalString;

	}

	public static String makeZeroString(int length) {
		StringBuilder temp = new StringBuilder("");
		String finalString = new String("");

		for (int i = 0; i < length; i++) {
			temp.append('0');
		}

		finalString = temp.toString();
		return finalString;

	}

	public static String stringGenerator(int index) {
		StringBuilder temp = new StringBuilder();
		String finalString = new String("");

		for (int i = 0; i < index; i++) {
			temp.append((i + 1));
		}

		finalString = temp.toString();
		return finalString;
	}

}
