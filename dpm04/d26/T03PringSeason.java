package dpm04.d26;

import java.util.Scanner;

public class T03PringSeason {
	static void printSeason(int m) {
		switch (m) {
			case 3: case 4: case 5: System.out.print("봄"); break;
			case 6: case 7: case 8: System.out.print("여름"); break;
			case 9: case 10: case 11: System.out.print("가을"); break;
			case 12: case 1: case 2: System.out.print("겨울"); break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month;
		do {
			month = sc.nextInt();		//월 입력
		}while(month <1 || month>12);
		
		printSeason(month);
	}
}
