package questions.numbers;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		
//		2. 어떤 수의 약수를 구하는 프로그램을 작성하여라
//	    약수 = 어떤 수를 정수로 나눌 수 있는 수

		Scanner sc = new Scanner(System.in);
		
		System.out.print("약수를 구할 숫자를 입력하시오. : ");
		int input = sc.nextInt();
		sc.nextLine(); //버퍼 비우기
		
		int[] divisor = new int[input+1];
		for(int i=1 ; i<=input ; i++) {
			if(input%i == 0) {
				divisor[i] = i;
			}
		} //for end
		System.out.print(input + "의 약수는 ");
		for(int i=0 ; i<divisor.length ; i++) {
			if(divisor[i] != 0) {
				if(divisor[i] != divisor[input]) {
					System.out.print(divisor[i] + ", ");					
				} else {
					System.out.print(divisor[i]);
				}
			}
		}
		System.out.println("입니다.");
	}

}
