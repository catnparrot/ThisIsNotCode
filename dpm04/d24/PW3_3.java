package dpm04.d24;

import java.util.Scanner;

public class PW3_3 {
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		int x=0;
		System.out.println("환영합니다");
	
		 do{
			System.out.print("아이디 입력:");
			String id=sca.nextLine();
			if(id.equals("ezen")) {
				break;
			}else{
				System.out.println("아이디가 틀렸습니다");
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}while(true);
		 
		while(x<3) {
			System.out.print("비밀번호 입력 :");
		String pass=sca.nextLine();
			
			if(pass.equals("12345")){
				System.out.println("OK");
				System.exit(1);					
				}else {
					System.out.println("비밀번호가틀렸습니다");
					x++;
		}
		}
		System.out.println("Get Out!");
	}
}
