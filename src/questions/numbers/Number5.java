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
		
		
		
		//---------------------------------------------------------------------------------------
		//플래그 이용 방법
		
		System.out.print("Input >> ");
        int number = sc.nextInt();
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        
        boolean isNotPrime = false; //소수판별 플래그        
        
        for(int i=1; i<=number; i++) {
            
            //예외상황 : 1은 소수가 아님
            if( i==1 ) {
                System.out.println(i + " 소수가 아님");
                continue;
            }

            //i값에 대한 소수판별 플래그 초기화
            isNotPrime = false;
            
            //i값에 대한 소수 판별
            for(int j=2; j<=i-1; j++) {
                if( i%j == 0 ) { //약수가 존재함
                    isNotPrime = true; //소수가 아님!
                }
            }
            
            if(!isNotPrime) {
//                System.out.println(i + " 소수");
                list.add(i);
            }
            
        }
        
        System.out.println(list);

		
	}//main end

}
