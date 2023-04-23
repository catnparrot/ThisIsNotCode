package dpm04.d23;

import java.util.Random;
import java.util.Scanner;

public class WhatisTheVar_last {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] monthString = {				//입력해야하는 정답
				"January", "February", "March", "April",
				"May", "June", "July", "August",
				"September", "October", "November", "December"
		};
		
		int retry;	//리트라이 버튼?
		int last = -1;
		
		do {
			int month;
			do {
				month = rd.nextInt(12);			//출제 월 난수 설정
			}while(month == last);
			last = month;
			
			while(true) {
				System.out.print(month + 1);
				String s = sc.next();			//정답 입력란(String)

				if(s.equals(monthString[month]))	break;
				/*"틀렸습니다"*/
			}
						
			retry=sc.nextInt();
		}while(retry==1);
		
		/*프로그램 종료*/
	}
}
