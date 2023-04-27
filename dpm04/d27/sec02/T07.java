package dpm04.d27.sec02;

import java.util.Scanner;

public class T07 {
	static Scanner sc = new Scanner(System.in);
	
	//양의 정숫값을 읽어서 반환	
	static int readPlusInt() {
		int x;
		do {
			x=sc.nextInt();				//양의 정숫값
		}while (x<=0);
		return x;
	}
	
	public static void main(String[] args) {
		int x;
		do {
			int n = readPlusInt();
			
			//값을 거꾸로 반환
			while (n>0) {
				System.out.print(n%10);			//n의 마지막 자릿수
				n /= 10;
			}
			do {
				x=sc.nextInt();
			}while (x!=0 && x!=1);
		}while(x==1);
	}
}
