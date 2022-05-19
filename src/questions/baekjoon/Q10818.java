package questions.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10818 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[a];
		
		
		for(int i=0 ; i<a ; i++) {
			int num = sc.nextInt();
			list.add(Integer.valueOf(num));
			arr[i] = num;
		}
		
		
		//방법 1
		int max1 = Collections.max(list);
		int min1 = Collections.min(list);
		
		System.out.println(min1 + " " + max1);
		
		
		//방법 2
		int min2 = arr[0];
		int max2 = arr[0];
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>max2) {
				max2=arr[i];
			}
			if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		
		System.out.println(min2 + " " + max2);
		
		
	}

}
