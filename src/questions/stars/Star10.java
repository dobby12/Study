package questions.stars;

public class Star10 {
	public static void main(String[] args) {
		
		// 10.
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int i=5 ; i>0 ; i--) {
			for(int j=0; j<5-i ; j++) {
				System.out.print(" ");
			}
			for(int k=i ; k>0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
