package be.pxl.h4h5.sequentie.oef1;

/*Oefeningen op sequentie
 * 
 * Oefening 1
 * 
 * De telefoonmaatschappij rekent aan haar klanten tweemaandelijks een vast bedrag van 20
 * euro (aansluiting, huur, onderhoud). Een telefoongesprek binnen Belgi� kost 12 eurocent
 * (ongacht de duur van het gesprek), een telefoongesprek naar het buitenland kost 50 
 * eurocent per begonnen minuut. In deze tarieven is geen BTW inbegrepen. 
 * Je geeft via het toetsenbord het aantal Belgisch gesprekken op en het aantal minuten dat
 * er naar het buitenland getelefoneerd werd. Het programma berekent hoeveel je moet 
 * betalen. Het BTW percentage is 21%.
 */

import java.util.Scanner;

public class H4H5SequentieOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int aantalGesprekken, aantalMinuten;
		float sum, btw, belgischTarief = 0.12f, buitenlandsTarief = 0.5f;
		
		System.out.println("Aantal Belgische gesprekken: ");
		aantalGesprekken = keyboard.nextInt();
		
		System.out.println("Aantal buitenlandse minuten: ");
		aantalMinuten = keyboard.nextInt();
		
		sum = (aantalGesprekken * belgischTarief) + (aantalMinuten * buitenlandsTarief);
		btw = sum * 0.21f;
		
		sum += btw;
		
		System.out.println("Je moet �" + sum + " betalen.");
		
		keyboard.close();
	}

}
