package opdrachten;

public class voorbeeldOverloading {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 2;
		
		int som = berekenSom(a, b);
		int som2 = berekenSom(a, b, c);
		
		System.out.println("Eerste som: " + som);
		System.out.println("Tweede som: " + som2);
	}
	
	public static int berekenSom(int a, int b) {
		return (a+b);
	}
	
	public static int berekenSom(int a, int b, int c) {
		return (a + b + c);
	}
	
	public static void random() {
		
		
	}

}
