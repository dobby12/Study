package questions.baekjoon;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String bAll = Integer.toString(b);
		System.out.println(a*(Integer.parseInt(bAll.substring(2, 3))));
		System.out.println(a*(Integer.parseInt(bAll.substring(1, 2))));
		System.out.println(a*(Integer.parseInt(bAll.substring(0, 1))));
		System.out.println(a*b);
		
	}

}
