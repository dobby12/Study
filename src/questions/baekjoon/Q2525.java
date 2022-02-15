package questions.baekjoon;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int time = sc.nextInt();
		
		int resultMin = min + time;
		if(resultMin>=60) {
			hour = hour + (resultMin/60);
			if(hour >= 24) {
				hour = hour%24;
			}
			min = resultMin%60;
		} else {
			min = resultMin;
		}
		System.out.println(hour + " " + min);
		
	}

}
