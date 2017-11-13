package be.pxl.h7.exoef5;

public class H7ExOef5 {

	public static void main(String[] args) {
		int[][] enqueteResultaten = {{25, 36, 55, 46, 38}, {35, 45, 54, 65, 1}, {75, 66, 44, 10, 5}, {23, 33, 45, 50, 49}};
	
		berekenGewogenGemiddeldes(enqueteResultaten);
		
	}
	
	public static void berekenGewogenGemiddeldes(int[][] enqueteResultaten) {
		int sum;
		double hoogsteGemiddelde = 0;
		double gewogenGemiddelde;
		int vraagMetHoogsteGemiddelde = 0;
		int multiplier;
		
		for(int i = 0; i < enqueteResultaten.length; i++) {
			
			sum = 0;
			multiplier = 1;
			for(int j = 0; j <enqueteResultaten[i].length; j++) {
				
				sum += (enqueteResultaten[i][j] * multiplier);
				multiplier++;
			}
			
			gewogenGemiddelde = ((double)sum / 200);
			
			
			System.out.printf("Vraag %d heeft een gewogen gemiddelde van %.2f \n", (i + 1), gewogenGemiddelde);
			
			if(gewogenGemiddelde  > hoogsteGemiddelde) {
				hoogsteGemiddelde = gewogenGemiddelde;
				vraagMetHoogsteGemiddelde = (i+1);
			}
		}
		
		System.out.printf("Vraag %d had het hoogste gewogen gemiddelde: %.2f \n", vraagMetHoogsteGemiddelde, hoogsteGemiddelde);
	}

}
