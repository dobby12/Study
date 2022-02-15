package questions.baekjoon;

import java.util.Random;

public class Q2480 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int a = random.nextInt(6) + 1;
		int b = random.nextInt(6) + 1;
		int c = random.nextInt(6) + 1;
		
		System.out.println(a + " " + b + " " + c);
		
		int result = 0;
		
		if(a==b && b==c) {
			result = 10000 + (a*1000);
		} else if((a==b && b!=c) || (a!=b && b==c) || (a==c && b!=c)) {
			if(a==b || a==c) {
				result = 1000 + (a*100);
			} else if(b==c) {
				result = 1000 + (b*100);
			}
		} else if(a!=b && b!=c && c!=a) {
			result = (Integer.max(c, Integer.max(a, b)))*100;
		}
		
		System.out.println(result);
		
	}

}
