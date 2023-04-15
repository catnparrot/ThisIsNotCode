//약속 날짜를 잡기 위한 코드 coded by GPT4;

package dpm04.d15;

import java.util.Scanner;

public class DoWhile_03 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] availableDates = {422, 423, 506, 507, 513, 514, 520, 521};
	        boolean isAvailable = false;
	        int inputDate;
	        
	        do {
	            System.out.print("약속 가능한 날짜를 입력하세요 (ex. 4월 22일 -> 422): ");
	            inputDate = sc.nextInt();
	            for (int date : availableDates) {
	                if (inputDate == date) {
	                    isAvailable = true;
	                    break;
	                }
	            }
	            if (isAvailable) {
	                System.out.println("대면이 가능한 날짜입니다.");
	            } else {
	                System.out.println("대면이 불가능합니다. 다른 날짜를 입력해주세요.");
	            }
	            // 다음 입력을 위해 엔터키 제거
	            sc.nextLine();
	        } while (!isAvailable);
	        
	        sc.close();
	}
}
