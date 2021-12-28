package questions.numbers;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		
//		1. 구구단 중 입력받은 수의 단수를 출력하여라
//		ex) Input >> 4
//	        4 x 1 = 4
//	        4 x 2 = 8
//	        4 x 3 = 12
//	        ....
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요. : ");
		int dan = sc.nextInt();
		sc.nextLine(); //버퍼 비우기
		
		for(int i=1 ; i<10 ; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
				
	}

}
