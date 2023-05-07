package dpm05.d07.secStaticImpot;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

class MathMethods_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		double x = sc.nextDouble();
		
		out.println(abs(x));	//절댓값
		out.println(sqrt(x));	//제곱근
		out.println(PI*x*x);	//넓이
	}
}
