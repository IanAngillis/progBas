package opdrachten;

public class Opdracht5 {

	public static void main(String[] args) {
		StringBuilder tekst = new StringBuilder("Het is maandag \nDe week begint weer");
		System.out.println(tekst);
		
		tekst.append("\nBrecht is fucking slecht in elk spel dat die speelt");
		System.out.println("********");
		System.out.println(tekst);
		System.out.println("********");
		tekst.reverse();
		System.out.println(tekst);
		System.out.println("********");
		
		
		String hulp = tekst.toString().replaceAll(" ", "");
		System.out.println("******");
		tekst = new StringBuilder(hulp);
		System.out.println(tekst);

	}

}
