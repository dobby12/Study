package questions.numbers;

import java.util.Scanner;

public class Number4 {
	public static void main(String[] args) {
//		4. 입력받은 두수의 최소 공배수와 최대 공약수를 구하는 프로그램을 작성하라.
//	    최소공배수 = 공배수 중에서 가장 작은 정수
//	    최대공약수 = 공약수 중에서 절대치가 가장 큰 수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수와 최소공배수를 구할 숫자 두 개를 입력하세요.");
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int max=0;
		if(num1 > num2) {
			for(int i=1 ; i<=num1 ; i++) {
				if(num1%i == 0 && num2%i == 0) {
					max = i;
				}
			}
			System.out.println(num1 + "과 " + num2 + "의 최대공약수는 " + max + "입니다.");
		} else if (num1 < num2) {
			for(int i=1 ; i<=num2 ; i++) {
				if(num1%i == 0 && num2%i == 0) {
					max = i;
				}
			}
			System.out.println(num1 + "과 " + num2 + "의 최대공약수는 " + max + "입니다.");
			
		} else if(num1 == num2) {
			System.out.println("같은 수는 입력할 수 없습니다. 다시 시도하세요.");
		}
		
		
		//최소공배수 모르겠어..
		
		
		
		
	} //main end

}
