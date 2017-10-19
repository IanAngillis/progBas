package opdrachten;

public class Opdracht3 {
	public static void main(String[] args) {
		int getal1 = 7;
		int getal2 = 2;
		
		int res;
		
		res = getal1 + getal2;
		System.out.println("De som is " + res);
		
		res = getal1 * 4;
		System.out.println("De vermenigvuldiging is " + res);
		
		res = getal1/getal2;
		System.out.println("De gehele deling!!!! " + res);
		
		res = getal1%getal2;
		System.out.println("De modulus is " + res);
		
		res = (int)(getal2 * 2.7);
		System.out.println("Vermeningvuldiging met kommagetal " + res);
		
		//rekenen met char!!
		char teken = 'a';
		teken++;
		System.out.println("Het teken is: " + teken);
		teken = (char)(teken + 8);
		System.out.println("Het teken is: " + teken);
		teken += 3; // equivalent met teken = teken + 3;
		System.out.println("Het teken is: " + teken);
		teken =+ 6; //Goed mee opletten, is equivalent met teken = 6;
		System.out.println("Het teken is: " + teken);
	}
}
