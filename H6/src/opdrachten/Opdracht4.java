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
		
		tekst = "Gert";
		String tekst2 = new String("Gertjan");
		
		if(tekst.equals(tekst2)) {
			System.out.println("Gelijk");
			
		} else {
			System.out.println("ongelijk");
		}
		
		if(tekst.compareTo(tekst2) < 0) {
			System.out.println(tekst + "   " + tekst2);
		} else {
			System.out.println(tekst2 + "   " + tekst);
		}
		
		tekst = "    nu de tekst     ";
		tekst = tekst.trim();
		
		System.out.println(tekst + "!");
		
		//Naam samenvoegen
		String voornaam = "jEf";
		String familienaam = "vAn DEN boSSche";
		String naam = voornaam.charAt(0) + ""; //Nu is het een string;
		naam = naam.toUpperCase() + ". ";
		naam = naam + familienaam.substring(0, 1).toUpperCase();
		naam = naam + familienaam.substring(1).toLowerCase();
		System.out.println(naam);
		
		tekst = "halloo";
		String midden;
		
		if(tekst.length() % 2 == 1) {
			midden = tekst.charAt(tekst.length()/2) + "";
		} else {
			midden = tekst.substring(tekst.length() / 2 - 1, tekst.length() / 2 + 1);
		}
		
		System.out.println(midden);
	}	
}
