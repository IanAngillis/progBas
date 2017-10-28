package be.pxl.h7.oef5;

import java.awt.Point;
import java.awt.Rectangle;

public class H7Oef5 {

	public static void main(String[] args) {
		
		//5 gegeven punten
		Point p0 = new Point(1, 1);
		Point p1 = new Point(1, 0);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(4, 1);
		Point p4 = new Point(0, 2);
		
		//x en y array
		int xArray [] = {(int)p0.getX(),(int) p1.getX(),(int) p2.getX(),(int) p3.getX(),(int) p4.getX()};
		int yArray [] = {(int)p0.getY(),(int) p1.getY(),(int) p2.getY(),(int) p3.getY(),(int) p4.getY()};
		
		//Punt array
		Point puntArray [] = new Point[5];
		
		// Aanmaken van een array van punt objecten gebruik makend van de x- en y arrays
		for(int i = 0; i < puntArray.length; i++) {
			puntArray[i] = new Point(xArray[i], yArray[i]);
		}
		
		Rectangle rectArray [] = new Rectangle[5];
		
		for(int i = 0; i < rectArray.length; i++) {
			rectArray[i] = new Rectangle(puntArray[i]);
			
			rectArray[i].setSize(1, 3);
		}
		
		System.out.println("Rectangles and their values: ");
		
		for(int i = 0; i < rectArray.length; i++) {
			
			System.out.println("Rectangle " + (i+1) + ": x = " + (int)rectArray[i].getX() + " y = " + (int)rectArray[i].getY() + " h = " + (int)rectArray[i].getHeight() + " b = " + (int)rectArray[i].width);
		}
		
		//Verandert kenmerken van de laatste rechthoek
		rectArray[rectArray.length-1].setLocation(0, 0);
		rectArray[rectArray.length-1].setSize(3, 2);
		
		//Ga voor elke rechthoek na welk punten in de rechthoek liffen en druk dit af
		for(int i = 0; i < rectArray.length; i++) {
			System.out.print("Rechthoek nummer " + (i+1) + " bevat:");
			for(int j = 0; j < rectArray.length; j++) {
				
				if(rectArray[i].contains((int)rectArray[j].getX(),(int)rectArray[j].getY() )) {
					System.out.print(" punt nr " + (j+1));
				}
			}
			
			System.out.println();
		}
		
		//Ga voor elke rechthoek na welke rechthoek de laatste rechthoek snijdt en druk deze rechthoeken af
		
		System.out.print("Rechthoeken die rechthoek nr 5 snijden:");
		for(int i = 0; i < (rectArray.length - 1); i++) {
			
			if(rectArray[i].intersects(rectArray[4])) {
				System.out.print(" recthoek nr " + (i+1));
			}
		}
		
		System.out.println();
		
	}

}
