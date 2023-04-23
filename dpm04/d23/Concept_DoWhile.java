package dpm04.d23;

import java.util.Random;
import java.util.Scanner;

public class Concept_DoWhile {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		a[0] = 1+rd.nextInt(10);			//0+1 난수
											//a[o]는 따로 변수값 지정?
		
		for(int i=1; i<n; i++) {
			do {
				a[i]=1+rd.nextInt(10);		//1+1 ~ 9+1 난수
			}while(a[i]==a[i-1]);			//a[i_2]가 이전에 나온 a[i_1]과 변수값이 동일하면 do-while에서 빠져나오지 못하게
		}
		
		for(int i=0; i<n; i++)
			/*a[0]~a[i]의 변수값*/;
	}

}
