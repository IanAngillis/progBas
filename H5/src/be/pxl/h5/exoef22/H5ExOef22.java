package be.pxl.h5.exoef22;

public class H5ExOef22 {

	public static void main(String[] args) {
		
		char corner, horizontal, vertical;
		
		corner = '+';
		horizontal = '-';
		vertical = '|';
		
		printRaster(corner, horizontal, vertical);
		
	}
	
	public static void printRaster(char corner, char horizontal, char vertical) {
		
		int rows = 0;
		
		while(rows < 21) {
			
			if(rows % 5 == 0) {
				for(int i = 0; i < 5; i++) {
					System.out.print(corner);
					
					for (int j = 0; j < 9; j++) {
						System.out.print(horizontal);
					}
				}
				System.out.println(corner);
				rows ++;
			} else {
				
				for(int i = 0; i < 50; i++) {
					
					if(i % 10 == 0) {
						System.out.print(vertical);
					} else {
						System.out.print(" ");
					}	
				}
				
				System.out.println(vertical);
				rows ++;
			}
		}
	}
}
