package voorbeeldexamen1.oef2;

import java.math.BigInteger;

public class Ex1Oef2 {

	public static void main(String[] args) {
		BigInteger product = new BigInteger("1");
		String temp;
		
		for(int i = 1; i < 101; i++) {
			temp = i + "";
			BigInteger element = new BigInteger(temp);
			product = product.multiply(element);
		}
		
		System.out.println("Het product is : " + product);
	}

}
