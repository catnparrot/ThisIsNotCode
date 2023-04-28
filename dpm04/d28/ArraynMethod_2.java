package dpm04.d28;

import java.util.Scanner;

/* n개의 요소를 삭제하는 arrayRmvN 메소드
 * a[idx]보다 뒤에 있는 모든 요소를 하나씩 앞으로 이동하여 삭제
 * 이동 대상이 아닌 요소는 기존값 유지
 * ex> a[6] = {1, 3, 4, 7, 9, 11} 일때 aryRmvN(a, 1, 3)라고 호출하면
 * 배열 a의 요소는 {1, 3x, 4x, 7x, 9, 11}:뒷열 세 개가 남음
 * 					-> +{1, 3, x, (7, 9, 11)}
 *  => {1, 9, 11, 7, 9, 11} 									*/


public class ArraynMethod_2 {
	//a[idx]로부터 n개의 요소 삭제
	static void aryRmvN(int[] a, int idx, int n) {
		if(n>0 && idx >=0 && idx+n<a.length) {
			int idx2 = idx+n-1;
			if(idx2>a.length -n-1)
				idx2 = a.length-n-1;
			for(int i = idx; i<=idx2; i++)
				a[i] = a[i+n];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i<num; i++)
			a[i] = sc.nextInt();	//a[0~i] 입력

		int idx = sc.nextInt();		//삭제를 시작할 인덱스
		
		int n = sc.nextInt();		//삭제할 요소의 수
		
		aryRmvN(a, idx, n);			//배열 a에서 a[idx]부터 n개 요소 삭제
		
		for(int i = 0; i<num; i++)
			/*a[i] 출력*/;
	}
	
}