package opdrachten;

public class Vb_argumenten {

	public static void main(String[] args) {

		for (String a : args) {
			System.out.println(a);
		}
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[args.length -1 - i]);
		}
		
		
		
	}

}
