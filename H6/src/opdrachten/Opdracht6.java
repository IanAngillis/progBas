package opdrachten;

public class Opdracht6 {

	public static void main(String[] args) {
		System.out.printf("%10s %10s", " m ", "voet");
		System.out.printf("\n");
		for(double m = 1; m <= 20; m += 0.5) {
			double voet = m * 3.2808399;
			System.out.printf("%10.2f %10.2f", m,  voet);
			System.out.printf("\n");
		}
	}

}
