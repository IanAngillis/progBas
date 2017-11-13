package be.pxl.h7.exoef6;

public class H7ExOef6 {

	public static void main(String[] args) {

		String[][] array1 = { { "De Chninkel", "Vandamme" }, { "Kuifje in Tibet", "Herge" }, { "Maus", "Spiegelmann" },
				{ "Kuifje en de blauwe lotus", "Herge" }, { "Large winch: de erfgenamen", "Vanhamme" } };
		int[][] array2 = { { 105, 35, 5 }, { 66, 21, 12 }, { 44, 36, 56 }, { 56, 12, 12 }, { 29, 10, 9 } };
		int aantalStemmen;
		int hoogsteAantalStemmen = 0;
		int stripMetHetHoogsteAantalStemmen = 0;
		String finalString = new String("");
	
		
		for(int i = 0; i < array1.length; i++) {
			
			aantalStemmen = 0;
			for(int j = 0; j < array2[i].length; j++) {
				
				aantalStemmen += array2[i][j];
			}
			
			if(aantalStemmen > hoogsteAantalStemmen) {
				hoogsteAantalStemmen = aantalStemmen;
				stripMetHetHoogsteAantalStemmen = i;
			}
			
			System.out.println("Titel: " + array1[i][0] + " van " + array1[i][1] + " heeft " + aantalStemmen + " stemmen behaald.");
		}
		
		finalString = "de strip met het hoogste aantal stemmen is " + array1[stripMetHetHoogsteAantalStemmen][0].toUpperCase() + " van auteur " + array1[stripMetHetHoogsteAantalStemmen][1].toUpperCase();
		System.out.println(finalString);
	}

}
