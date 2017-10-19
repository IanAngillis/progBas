package opdrachten;

public class Opdracht6 {

	public static void main(String[] args) {
		int a = 3;
		int b = 11;
		
		boolean voorwaardeA = a > 2;
		boolean voorwaardeB = b < 10;
		
		if (!voorwaardeA  || voorwaardeB) {
			System.out.println("Het is waar");
		} else {
			System.out.println("Onwaar");
		}
		
		System.out.println(voorwaardeA);
		System.out.println(!voorwaardeA);
		System.out.println(!!!!!!!!voorwaardeA);
		
		//Opdracht 7
		a += b;
		System.out.println("a is nu " + a);
		a =+ b;
		System.out.println("a is nu " + a);
		a = 2;
		a *= b;
		System.out.println("a is nu " + a);
		
		a += 14.99999999999;
		System.out.println("a is nu " + a);
	}

}
