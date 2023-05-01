package dpm05.d01.secExcep.exam02;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
	
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();	//몇번쨰 줄이 틀렸는지 알 수 있음
		}
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
