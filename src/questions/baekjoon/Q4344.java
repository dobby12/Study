package questions.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
//		점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int c = sc.nextInt();
		sc.nextLine();
		List<String> per = new ArrayList<>();
		
		for(int i=0 ; i<c ; i++) {
			System.out.print("몇 명? : ");
			int n = sc.nextInt();
			if(n<1 || n>1000) {
				System.out.println("1명 이상, 1000명 이하");
				break;
			}
			int[] score = new int[n];
			for(int j=0 ; j<n ; j++) {
				score[j] = sc.nextInt();
				if(score[j]<0 || score[j]>100) {
					System.out.println("0점 이상, 100점 이하");
					break;
				}
			}
			double sum=0;
			for(int k=0 ; k<n ; k++) {
				sum+=score[k];
			}
			double avg = sum/n;
			int count=0;
			for(int l=0 ; l<n ; l++) {
				if(score[l]>avg) {
					count++;
				}
			}
			per.add(String.format("%.3f",(double) 100*count/n)+"%");
		}
		if(!per.isEmpty()) {			
			System.out.println(per);
		}
		
		sc.close();
	} //main end

}
