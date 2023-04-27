package dpm04.d27.sec02;

import java.util.Scanner;

public class T05 {
	//문자 변수 c를 n개 연속 표시
	static void putChars(char c, int n) {
		while(n-- >0)
			System.out.print(c);
	}
	
	//--------------문자 '*'를 n개 연속 표시--------------//
	static void putStars(int n) {
		putChars('*', n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//왼쪽 아래가 직각인 이등변 삼각형 표시
		int n = sc.nextInt(); 
		for (int i = 1; i<=n; i++) {
			putStars(i);
			System.out.println();
		}
		
	}
}
