package dpm04.d30;

import java.util.Scanner;

/* int형 1차원 배열과 2차원 배열의 모든 요소값을 표시하는 다중 정의 메소드
 * printArray(int[] a)
 * printArray(int[][] a)
 * 1차원 배열 표시에선 각 요소 사이에 문자 1개분의 공간을 둘 것.
 * 2차원 배열 표시에선 각 열의 숫자가 왼쪽에 정렬되도록 최소한의 공간을 둘 것.
 * 
 * ex1> 1차원 배열
 * 12	536	-8	7	2
 * 
 * ex2> 2차원 배열
 * 32	-1	32	45	67
 * 535	999	2
 * 2	5	-12	9*/

public class ComplicatedMethod {
	static void printArray(int[] a) {
		for(int i = 0; i<a.length-1; i++)
			System.out.print(a[i] + " ");
		System.out.print(a[a.length-1]);
		System.out.println();
	}
	
	
	static void printArray(int[][] a) {
		int[][] w = new int[a.length][];
		int max = 0;
		for(int i = 0; i<a.length; i++) {
			w[i] = new int[a[i].length];
			if(a[i].length>max)
				max = a[i].length;
		}
		
		
		int[] maxW = new int[max];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				int value = a[i][j];
				w[i][j] = (value<0) ? 1 : 0;
		
				
				do {
					w[i][j]++;
					value /= 10; }while(value !=0);
				if(w[i][j] > maxW[j])
					maxW[j] = w[i][j];
				
				
			}
		}
		
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length-1; j++) {
				System.out.print(a[i][j]);
				for(int k = 0; k<=maxW[j] - w[i][j]; k++)
					System.out.print(' ');
			}
			System.out.println(a[i][a[i].length-1]);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[num];
		for(int i = 0; i<num; i++) {
			x[i] = sc.nextInt();
		}
		
		int h = sc.nextInt();
		int[][] y = new int[h][];
		for(int i = 0; i<y.length; i++) {
			int w=sc.nextInt();
			y[i]=new int[w];
		}
		
		for(int i = 0; i<y.length; i++) {
			for(int j = 0; j<y[i].length; j++) {
				y[i][j] = sc.nextInt();
			}
		}
		
		printArray(x);
		System.out.println();
		printArray(y);
	}
}