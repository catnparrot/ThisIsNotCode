package dpm05.d08.secRPSGame;

import java.util.Scanner;

public class FingerFlashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		String[] hands = {"가위", "바위", "보"};
		
		int retry;
		do {
			int comp = cp.nextHand();
			int user = hp.nextHand();
			System.out.println("컴퓨터는 "+hands[comp]+"를 냈다.");
			System.out.println("당신은 "+hands[user]+"를 냈다.");
			
			int judge = (user - comp +3)%3;
			switch (judge) {
			case 0 : System.out.println("비겼습니다. "); 		break;
			case 1 : System.out.println("당신이 졌습니다. "); 	break;
			case 2 : System.out.println("당신이 이겼습니다.");	break;
			}
			do {
				System.out.print("다시 한번? (0)아니오  (1)네:");
				retry = sc.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}
