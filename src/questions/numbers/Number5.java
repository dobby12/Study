package questions.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number5 {
	public static void main(String[] args) {
//		5. 1에서부터 입력된 어떤 수까지 내에 있는 소수를 찾는 프로그램을 작성하라.
//	    * 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
//	    * ex) 2,3,5,7,11,13, ...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		List<Integer> sosu = new ArrayList<Integer>();
		
		for(int i=2 ; i<=num ; i++) {
			List<Integer> list = new ArrayList<>();
			for(int j=1 ; j<=i ; j++) {
				if(i%j == 0) {
					list.add(j);
				}
			}
			if(list.size() == 2) {
				sosu.add(i);
			}
		}
		
		System.out.println(sosu);
	}

}
