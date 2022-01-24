package questions.baekjoon;

import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
//		세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
//		0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//		예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
//		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
//		첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
//		첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
//		마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("100 이상 1000 미만의 숫자 세 개를 작성해주세요.");
		System.out.print("A : ");
		int A = sc.nextInt();
		System.out.print("B : ");
		int B = sc.nextInt();
		System.out.print("C : ");
		int C = sc.nextInt();
		
		if(A>=1000 || A<100 || B>=1000 || B<100 || C>=1000 || C<100) {
			System.out.println("100 이상 1000 미만의 숫자로만 작성해주세요!");
			return;
		}
		
		System.out.println("A X B X C = " + A*B*C);
		
		String multi = String.valueOf(A*B*C);
		int[] arr = new int[multi.length()];
		for(int i=0 ; i<multi.length() ; i++) {
			arr[i] = Integer.parseInt(multi.substring(i, i+1));
		}
//		for(int i=0; i<arr.length ; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		int[] result = new int[10];
		for(int i=0 ; i<result.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[j] == i) {
					result[i] += 1;
				}
			}
		}
		
		for(int i=0 ; i<result.length ; i++) {
			System.out.println(result[i]);
		}
		
	}//main end

}//class Q2577 end
