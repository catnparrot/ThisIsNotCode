package dpm04.d28;

import java.util.Scanner;

public class ArraynMethod {
	//aryRmv 메소드 생성
	static void aryRmv(int[] a, int idx) {
		if(idx >=0 && idx < a.length) {
			for(int i = idx; i<a.length-1; i++)
				a[i]=a[i+1];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i<num; i++) {
			a[i]=sc.nextInt();
		}
		
		int idx =sc.nextInt();
		
		aryRmv(a, idx);
		for(int i =0; i<num; i++)
			/*배열a를 i-1만큼 출력*/;
	}
}
