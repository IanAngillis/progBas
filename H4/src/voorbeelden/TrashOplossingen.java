package voorbeelden;
 import java.util.Scanner;
public class TrashOplossingen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int gewicht;
		System.out.println("Geef het gewicht van een appel in gram in");
		gewicht = input.nextInt();
		System.out.println("aantal gewicht");
		for (int aantal = 1; aantal <= 100; aantal++) {
			System.out.println(aantal + " " + aantal * gewicht);}
		input.close();
		}
	}


