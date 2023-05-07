package dpm05.d07.secStaticImpot;

import java.util.Scanner;

class MathMethods_00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		System.out.println(Math.abs(x));	//절댓값
		System.out.println(Math.sqrt(x));	//제곱근
		System.out.println(Math.PI*x*x);	//넓이
	}
}
