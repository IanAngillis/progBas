package be.pxl.h5.exoef18;

/*Extra Oefening 18
 * 
 * Leonardo van Pisa, ook wel Fibonacci genoemd, bestudeerde omstreeks 1200 de
 * vermenigvuldiging van konijnen. Hij gebruikte daarvoor een getallenrij waarin elke term
 * gevormd wordt door de som van zijn twee directe voorgangers te nemen. De eerste twee
 * termen zijn 1. De rij ziet er dus als volgt uit: 1 1 2 3 5 8 13 … De computer drukt de
 * elementen van de rij af die kleiner zijn dan 1500.
 */
public class H5ExOef18 {

	public static void main(String[] args) {
		
		int firstNumber, secondNumber, newNumber;
		firstNumber = 1;
		secondNumber = 1;
		newNumber = 0;
		
		System.out.print(firstNumber + " " + secondNumber);
		newNumber = firstNumber + secondNumber;
		
		while(newNumber < 1500) {
			System.out.print(" " + newNumber);
			
			firstNumber = secondNumber;
			secondNumber = newNumber;
			newNumber = firstNumber + secondNumber;
			
		}
	}
}
