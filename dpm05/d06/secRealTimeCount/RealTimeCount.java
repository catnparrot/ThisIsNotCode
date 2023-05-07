package dpm05.d06.secRealTimeCount;

import java.util.Scanner;

public class RealTimeCount {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("카운트다운을 시작합니다. 시간을 입력하세요. : ");
        int s;
        do {
            s = sc.nextInt();
            if (s <= 0) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        } while (s <= 0);

        for (; s >= 0; s--) {
            System.out.println(s + "초");
            Thread.sleep(1000); // 1초 대기
        }

        System.out.println("카운트다운이 종료되었습니다.");
    }
}