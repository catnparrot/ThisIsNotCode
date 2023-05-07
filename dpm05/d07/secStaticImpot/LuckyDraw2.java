package dpm05.d07.secStaticImpot;
/* 정적 임포트 선언(static import)
 * 정적 임포트를 사용하면 클래스의 '정적 멤버'인 다음 2개를 임포트할 수 있다.
 * 클래스 변수(정적 필드) / 클래스 메소드(정적 메소드)
 * 형 임포트 선언과 마찬가지로 정적 임포트 선언에도 2가지 종류가 있다.
 * import static 패키지명.형명.식별자명;	-단일 정적 임포트 선언
 * import static 패키지명.형명.*;		-온 디맨드 정적 임포트 선언  */

import java.util.GregorianCalendar;
import java.util.Random;
import static java.util.GregorianCalendar.*;	//---(1)

class LuckyDraw2 {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);	//---(2)
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);
		System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n", y, m, d);
		
		/*
		Random rd = new Random();	//-┐
		int k = rd.nextInt(10);		//---(3)
		*/
		
		int k = (new Random().nextInt(10)); //---(4)
		
		System.out.println("오늘의 운세는 ");
		switch(k) {
		case 0:					System.out.print("대길");	break;
		case 1:	case 2:	case 3:	System.out.print("길");	break;
		case 4:	case 5:	case 6:	System.out.print("중길");	break;
		case 7:	case 8:			System.out.print("소길");	break;
		case 9:					System.out.print("흉");	break;
		}
		System.out.println("입니다.");
	}
}

/* (1)의 정적 임포트 선언에선 java.util.Gregoriancalendar
 * 클래스에 속하는 정적 멤버를 '온 디맨드 정적 임포트'하도록
 * 지시한다. (2)에선 java.util.GregorianCalendar 클래스에
 * 속하는 클래스 변수 YEAR, MONTH, DATE를 단순 명칭으로
 * 접근한다. LuckyDraw1 프로그램에선 각 변수를
 * GregorianCalendar.YEAR, GregorianCalendar.MONTH,
 * GregorianCalendar.DATE인 완전 한정 명칭으로 접근했었다.
 * Random 클래스는 인스턴스를 생성하지만, 변수 rd가 사용되는
 * 곳은 한 곳이므로 (3)은 (4)로 간결하게 표현할 수 있다. */
 