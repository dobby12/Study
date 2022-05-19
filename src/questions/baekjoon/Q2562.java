package questions.baekjoon;

import java.util.Random;

public class Q2562 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length ; i++) {
			int ran = random.nextInt(100);
			System.out.println(ran);
			arr[i] = ran;
		}
		
		int max = arr[0];
		int seq=0;
		for(int i=0 ; i<arr.length ; i++) {
			if(max<=arr[i]) {
				max = arr[i];
				seq = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(seq);
		
	}

}
