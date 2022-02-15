package questions.baekjoon;

import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=1 ; i<n+1 ; i++) {
			result+=i;
		}
		System.out.println(result);
	}

}
