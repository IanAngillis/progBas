package be.pxl.h7.oef7;

public class H7Oef7 {

	public static void main(String[] args) {

		int[][] voorraadTshirts = { { 45, 102, 19, 55, 0 }, { 79, 47, 58, 22, 46 }, { 109, 33, 112, 0, 0 } };
		int[] matenVoorwaarde = new int[3];
		String[] bijbestellen = new String[15];

		getMatenVoorwaarde(matenVoorwaarde, voorraadTshirts);
		getTshirtThatNeedToBeOrdered(bijbestellen, matenVoorwaarde, voorraadTshirts);
		printOrders(bijbestellen);

	}

	public static void printOrders(String[] bijbestellen) {

		System.out.println("Tshirts doe moeten bijbesteld worden: ");

		for (int i = 0; i < bijbestellen.length; i++) {

			if (bijbestellen[i] != null) {
				System.out.println(bijbestellen[i]);
			}
		}
	}

	public static void getTshirtThatNeedToBeOrdered(String[] bijbestellen, int[] matenVoorwaarde,
			int[][] voorraadTshirts) {

		String size = new String("");
		String color = new String("");

		int index = 0;

		for (int i = 0; i < voorraadTshirts.length; i++) {

			for (int j = 0; j < voorraadTshirts[i].length; j++) {

				if (voorraadTshirts[i][j] < matenVoorwaarde[i]) {

					size = getSize(i);
					color = getColor(j);

					bijbestellen[index] = size + " " + color;
					index++;

				}
			}
		}

	}

	public static String getSize(int i) {

		String temp = new String("");
		switch (i) {
		case 0:
			temp = "small";
			break;
		case 1:
			temp = "medium";
			break;
		case 2:
			temp = "large";
			break;
		}

		return temp;
	}

	public static String getColor(int i) {

		String temp = new String("");
		switch (i) {
		case 0:
			temp = "rood";
			break;
		case 1:
			temp = "wit";
			break;
		case 2:
			temp = "blauw";
			break;
		case 3:
			temp = "oranje";
			break;
		case 4:
			temp = "zwart";
			break;
		}

		return temp;
	}

	public static void getMatenVoorwaarde(int[] matenVoorwaarde, int[][] voorraadTshirts) {

		int sum;
		double thirdOfSum;

		for (int i = 0; i < voorraadTshirts.length; i++) {

			sum = 0;
			for (int j = 0; j < voorraadTshirts[i].length; j++) {

				sum += voorraadTshirts[i][j];
			}

			thirdOfSum = (double) sum / 3;
			matenVoorwaarde[i] = (int) thirdOfSum;
		}
	}

}
