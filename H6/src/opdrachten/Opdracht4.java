package opdrachten;

public class Opdracht4 {

	public static void main(String[] args) {
		String tekst = "Wij zijn de studenten van 1TINA";
		
		int lengte = tekst.length();
		System.out.println("De tekst is: " + tekst);
		System.out.println("De lengte: " + lengte);
		
		tekst = tekst.toUpperCase();
		System.out.println(tekst);
		
		tekst = tekst.toLowerCase();
		System.out.println(tekst);
		
		tekst = tekst.replace('a', 'o');
		System.out.println(tekst);
		
		int tel = 0;
		
		for(int i = 0; i < tekst.length(); i++) {
			if(tekst.charAt(i) == 'e') {
				tel++;
			}
		}
		
		System.out.println("Aantal e's: " + tel);
	}

}
