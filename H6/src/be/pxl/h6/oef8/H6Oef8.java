package be.pxl.h6.oef8;

import java.awt.Point;
import java.awt.Rectangle;

public class H6Oef8 {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(1, 2, 20, 30);
		Point p1 = new Point(5, 5);
		
		if (rect1.contains(p1)) {
			System.out.println("Punt bevind zich in Rectangle");
		} else {
			System.out.println("Punt bevind zich niet in Rectangle");
		}
		
		p1.translate(40, 50);
		
		Rectangle rect2 = new Rectangle(p1);
		rect2.setSize(100, 110);
		
		System.out.println("De x en y van rect2 : " + (int)rect2.getX() + "-" + (int)rect2.getY());
		
		if(rect2.contains(rect1)) {
			System.out.println("Rect bevind zich volledig in rect2");
		} else {
			System.out.println("Rect bevind zich niet volledig in rect2");
		}
		
		System.out.println("rect1 :" + rect1.getHeight());
		System.out.println("rect2 :" + rect2.getHeight());
		
		rect1.grow(20, 40); //laten nakijken
		
		System.out.println("rect1 :" + rect1.getHeight());
		System.out.println("rect2 :" + rect2.getHeight());
		
		if(rect1.getHeight() == rect2.getHeight()) {
			System.out.println("De hoogte van rect1 en rect2 is hetzelfde");
		} else {
			System.out.println("De hoogte van rect1 en rect2 is niet hetzelfde");
		}
		
	}

}
