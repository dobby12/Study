package questions.baekjoon;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
//		첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
//		그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//		입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
//		시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(hour>23 || hour<0 || min>59 || min<0) {
			System.out.println("시간은 0~23까지의 숫자만, 분은 0~59까지의 숫자만 입력하세요.");
			return;
		}
		
		int resultHour = 0;
		int resultMin = 0;
		if(min >= 45) {
			resultHour = hour;
			resultMin = min-45;
		} else {
			hour = hour-1;
			min = 60-(45-min);
			if(hour<0) {
				resultHour = 24+hour;
				resultMin = min;
			} else {
				resultHour = hour;
				resultMin = min;
			}
		}
		System.out.println(resultHour + ":" + resultMin);
		
		
		
	} //main end

} //class Q2884 end
