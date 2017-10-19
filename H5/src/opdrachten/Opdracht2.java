package opdrachten;

public class Opdracht2 {
	public static void main(String[] args) {
		byte aByte = 2;
		short aShort = 1568;
		
		//aShort = aByte; -> Werkt perfect. klein naar groot -> compiler heeft daar geen probleem mee.
		
		aByte = (byte)aShort; //groot naar klein -> altijd casten
		System.out.println(aByte);
		
		float f = 12.3f;
		long heelGrootGetal = 123456789L;
}
}
