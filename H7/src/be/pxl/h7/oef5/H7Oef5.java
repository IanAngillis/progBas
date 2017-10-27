package be.pxl.h7.oef5;

import java.awt.Point;

public class H7Oef5 {

	public static void main(String[] args) {
		
		//5 gegeven punten
		Point p0 = new Point(1, 1);
		Point p1 = new Point(1, 0);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(4, 1);
		Point p4 = new Point(0, 2);
		
		//x en y array
		double xArray [] = {p0.getX(), p1.getX(), p2.getX(), p3.getX(), p4.getX()};
		double yArray [] = {p0.getY(), p1.getY(), p2.getY(), p3.getY(), p4.getY()};
		
		Point puntArray [] = new Point[5];
		
		for(int i = 0; i < puntArray.length; i++) {
			puntArray[i].setLocation(xArray[i], yArray[i]);
		}
		
		for(Point p : puntArray) {
			System.out.println(p);
		}
		
	}

}
