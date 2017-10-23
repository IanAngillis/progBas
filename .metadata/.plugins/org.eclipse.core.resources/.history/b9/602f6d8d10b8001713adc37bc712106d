package be.pxl.h6.oef7;

import java.awt.Point;

public class H6Oef7 {

	public static void main(String[] args) {
		Point p1 = new Point(5, 8);			//Punt aanmaken op een specifieke locatie
		//Point p1 = new Point();			Punt aanmaken en initialiseren op locatie (0,0)
		//Point p10 = new Point(p1);		Punt aanmaken op de locatie van p1, we geven het object mee
		//Point p11 = p10;					Punt koppelen aan ander bestaan punt.
		Point p2 = new Point(p1);
		
		if(p1.equals(p2)) { 				//Vergelijkt of het over dezelfde punten gaat
			System.out.println("De punten hebben dezelfde waarden voor x en y");
		} else {
			System.out.println("De punten hebben verschillende waarden voor x en y");
		}
		
		if(p1 == p2) { 					//Kijkt of het over hetzelfde object gaat, over dezelfde plek in het geheugen
			System.out.println("Het gaat om hetzelfde Point-object");
		} else {
			System.out.println("Het gaat niet over hetzelfde Point-object");
		}
			
		p2.translate(2,3); //verplaatst het punt, argumenten zijn (dx, dy)
		
		int x1 = (int)p1.getX();
		int y1 = (int)p1.getY();
		int x2 = (int)p2.getX();
		int y2 = (int)p2.getY();
		
		System.out.println("De x en y voor p1 zijn : " + x1 + "-" + y1 );
		System.out.println("De x en y voor p2 zijn : " + x2 + "-" + y2 );
	}

}

