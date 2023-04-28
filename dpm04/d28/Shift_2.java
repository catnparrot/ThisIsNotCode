package dpm04.d28;

import java.util.Scanner;

/* 정수 x를 오른쪽으로 n비트 회전한 값을 반환하는 rRotate 메소드와
 * 왼쪽으로 n비트 회전한 값을 반환하는 IRotate 메소드를 작성하자 */

/* 회전이란 최하위 비트와 최상위 비트가 연결돼 있다고 간주하는 것이다.
 * ex> 오른쪽 5비트 회전한 경우:
 *      시프트에 방출된 하위 5비트를 상위 비트로 다시 가져옴*/


public class Shift_2 {
	//비트 구성
	static void printBits(int x) {
		for (int i = 31; i>=0; i--)
			System.out.print( ((x>>>i & 1) == 1 ) ? '1' : '0');
	}
	
	//오른쪽 회전
	static int rRotate(int x, int n) {
		if(n<0) return lRotate(x, -n);
		n%= 32;
		return (n==0 ? x : (x>>>n)|(x<<(32-n)));
	}
	
	//왼쪽으로 회전
	static int lRotate(int x, int n) {
		if(n<0) return rRotate(x, -n);
		n%=32;
		return (n == 0 ? x :(x<<n) | (x>>>(32-n)));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		printBits(x);
		
		printBits(rRotate(x, n));
		printBits(lRotate(x, n));
	}
}