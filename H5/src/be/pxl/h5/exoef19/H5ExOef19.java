package be.pxl.h5.exoef19;

public class H5ExOef19 {

	public static void main(String[] args) {
		long totalSum = 0;
		long product = 1;
		int limit = 2;
		int j = 0;
		
		for(int i = 1; i <= 23; i+=2) {
			
			
			while(j < limit) {
				product *= i;
				j++;
			}
			
			totalSum += product;
			product = 1;
			limit++;
			j = 0;
		}
		
		System.out.println("Sum: " + totalSum);
	}

}
