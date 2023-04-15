package dpm04.d15;

import java.util.Scanner;

public class DoWhile_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("숫자를 입력하세요 (2보다 작으면 종료): ");
            num = sc.nextInt();
        } while (num >= 2);

        System.out.println("프로그램을 종료합니다.");
    }
}

/*
무한 루프에 빠져 IDE가 셧아웃되는 코드
public class DoWhileExample {
    public static void main(String[] args) {
        int num=(while을 false로 이끄는 값?);
        do {
            System.out.print("숫자를 입력하세요 (x보다 작으면 종료): ");
        } while (num > x);

        System.out.println("프로그램을 종료합니다.");
    }
}
*/
