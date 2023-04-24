package dpm04.d24;

import java.util.Scanner;

public class ArraynFor_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][3];	//4행3열
		int[][] b = new int[3][4];	//3행4열
		int[][] c = new int[4][4];	//a, b 곱을 저장하는 행렬
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				c[i][j]=0;
				for(int k = 0; k<3; k++) {
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}	
		
		for (int i = 0; i<4; i++) {
			for (int j=0;j<4 ;j++)
				System.out.printf("%5d", c[i][j]);
			System.out.println();
		}
		
	}
}
