package questions.stars;

public class Star13 {
	public static void main(String[] args) {
		
		// 13.
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=5 ; i>0 ; i--) {
			for(int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1 ; i<5 ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
