package dpm04.d16;

import dpm04.d16.I_C_M_02_Person;

public class I_C_M_03 {
    public static void main(String[] args) {
        I_C_M_02_Person john = new I_C_M_02_Person(); // "~Person" 클래스를 기반으로 "john"이라는 인스턴스 생성
        john.name = "John"; // 인스턴스 필드 초기화
        john.age = 20; // 인스턴스 필드 초기화
        john.sayHello(); // 인스턴스 메소드 호출
    }
}
