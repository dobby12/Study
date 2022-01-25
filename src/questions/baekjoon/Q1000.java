package questions.baekjoon;

import java.util.Scanner;

public class Q1000 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~10 사이의 숫자를 두 개 입력하세요.");
		System.out.print("A : ");
		int A = sc.nextInt();
		System.out.print("B : ");
		int B = sc.nextInt();
		
		if(A>10 || A<0 || B>10 || B<0) {
			System.out.println("1 이상 10 이하의 숫자만 입력하세요.");
			return;
		}
		
		System.out.println("A + B = " + (A+B));
	
	} //main end

} //class Q1000 end
