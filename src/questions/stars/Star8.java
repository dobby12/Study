package questions.stars;

public class Star8 {
	public static void main(String[] args) {
		
		// 8.
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
