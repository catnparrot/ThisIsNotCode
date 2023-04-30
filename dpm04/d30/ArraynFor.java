package dpm04.d30;

import java.util.Scanner;

public class ArraynFor {
	//배열 a에서 idx 요소를 삭제한 배열 반환//
	//메소드 arrayRmvOf 생성
	static int[] arrayRmvOf(int[] a, int idx) {
		if(idx<0 && idx>=a.length-1)
			return a.clone();			//a의 복사본을 그대로 반환
		else {
			int[] c = new int[a.length-1];
		//-----------------------------------------------//
			int i = 0;
			for(;i<idx; i++)
				c[i]=a[i];
			for(; i<a.length-1; i++)
				c[i]=a[i+1];
			/* => 이것도 가능
			 * int i;
			 * for(i=0;i<idx; i++)
			 * 		c[i]=a[i];
			 * for(;i<a.length-1; i++)
			 * 		c[i]=a[i+1]*/
		//-----------------------------------------------//
			return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++)
			/*배열 x 출력(요소값들은 null)*/
			x[i]=sc.nextInt();			//배열 x의 요소값 입력
		
		int idx = sc.nextInt();
		
		int[] y = arrayRmvOf(x, idx);	//배열 x에서 x[idx]를 삭제한 배열 생성
		
		for(int i = 0; i<y.length; i++)
			/*배열 y 모든 요소값 출력*/;
	}
}
