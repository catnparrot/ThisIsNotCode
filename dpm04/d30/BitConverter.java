package dpm04.d30;

import java.util.Scanner;

public class BitConverter {
	static void printBits(byte x) {
		for(int i = 7; i>=0; i--)
			System.out.print(((x >>> i & 1)==1) ? '1' : '0');
	}
	
	static void printBits(short x) {
		for(int i = 15; i>=0; i--)
			System.out.print(((x >>> i & 1)==1) ? '1' : '0');
	}
	
	static void printBits(int x) {
		for(int i = 31; i>=0; i--)
			System.out.print(((x >>> i & 1)==1) ? '1' : '0');
	}
	
	static void printBits(long x) {
		for(int i = 63; i>=0; i--)
			System.out.print(((x >>> i & 1)==1) ? '1' : '0');
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte a = sc.nextByte();
		short b =sc.nextShort();
		int c = sc.nextInt();
		long d = sc.nextLong();
		
		printBits(a);
		System.out.println();
		printBits(b);
		System.out.println();
		printBits(c);
		System.out.println();
		printBits(d);
	}
}
