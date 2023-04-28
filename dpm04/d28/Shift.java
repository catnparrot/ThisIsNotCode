package dpm04.d28;

import java.util.Scanner;

//정수를 좌우로 시프트한 값이 '정수x2의 거듭제곱' 및 '정수/2의 거듭제곱'과 같은지 확인하는 프로그램


public class Shift {
	static int pow2(int no) {
		int pw = 1;
		while (no-- > 0)
			pw*=2;
		return pw;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	//정수 n 입력
		
		int n = sc.nextInt();	//시프트 n(비트) 입력
		
		int mPower = x*pow2(n);
		int dPower = x/pow2(n);
		int lshift = x << n;		//n비트 왼쪽으로 시프트한 값
		int rshift = x >> n;		//n비트 오른쪽으로 시프트한 값
		
		
		
		System.out.printf("[a]x * (2의%d승=%d\n", n, mPower);
		System.out.printf("[b]x / (2의%d승=%d\n", n, dPower);
		System.out.printf("[c]x << %d =%d\n", n, lshift);
		System.out.printf("[d]x >> %d =%d\n", n, rshift);
		
		
		
		
		System.out.println("[a} = [c]"+((mPower == lshift) ? "입니다." : "가 아닙니다."));
		System.out.println("[b} = [d]"+((dPower == rshift) ? "입니다." : "가 아닙니다."));		
	}
}

