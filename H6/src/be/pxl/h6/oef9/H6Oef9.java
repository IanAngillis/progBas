package be.pxl.h6.oef9;

import java.awt.Rectangle;
import java.util.Random;

public class H6Oef9 {

	public static void main(String[] args) {
		Random rand = new Random();
		Rectangle baseRectangle = new Rectangle(0, 0, 100, 100);
		Rectangle biggestRectangle = new Rectangle();
		StringBuilder placedRectanglesList = new StringBuilder("");
		
		int x, y, lengte, breedte;
		
		char a = 'x';
		char b = 'y';
		String stringa = "breedte";
		String stringb = "lengte";
		
		 System.out.println("Gemaakte rechthoeken: ");
		 System.out.printf("%15c %15c %15s %15s \n", a, b, stringa, stringb);
		
		for(int i = 0; i < 20; i++) {
			
			//genereren van variabelen
			x = rand.nextInt(100);
			y = rand.nextInt(100);
			lengte = rand.nextInt(70 - 1 + 1) + 1; 
			breedte = rand.nextInt(70 - 1 + 1) + 1; 
			
			Rectangle rect = new Rectangle(x, y, lengte, breedte);
			System.out.printf("%15d %15d %15d %15d", x, y, lengte, breedte);
			
			if(baseRectangle.contains(rect)) {
				System.out.println("\t geplaatst");
				placedRectanglesList.append(i+1);
				
				if(newBiggestRectangle(biggestRectangle, rect)) {
					biggestRectangle = rect;
				}
				
			} else {
				System.out.println();
			}
			
			
		}
		
		printPlacedRectangles(placedRectanglesList);
		printBiggestPlacedRectangle(biggestRectangle);
	}
	
	public static void printBiggestPlacedRectangle(Rectangle rect) {
		System.out.println("De gootste rechthoek : xy = " + (int)rect.getX() + "-" + (int)rect.getY() + " , breedte = " + (int)rect.getWidth() + ", hoogte = " + (int)rect.getHeight());
	}
	
	public static void printPlacedRectangles(StringBuilder list) {
		
		int teller = -1;
		
		for(int i = 0; i < list.length(); i++) {
			
			if(list.charAt(i) == '1') {
				teller++;
			}
			
			if(teller > 0) {
				System.out.println("Rechthoek " + list.charAt(i) + list.charAt(i+1) + " is toegevoegd");
				i++;
				
			} else {
				System.out.println("Rechthoek " + list.charAt(i) + " is toegevoegd");
			}
			
		}
	}
	
	public static boolean newBiggestRectangle(Rectangle biggestRectangle, Rectangle rect) {
		
		if( (rect.getX() * rect.getY() ) > ( biggestRectangle.getX() * biggestRectangle.getY() ) ) {
			return true;
		} else {
			return false;
		}
	}
	
}
