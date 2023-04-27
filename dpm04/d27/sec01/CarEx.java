package dpm04.d27.sec01;

public class CarEx {
	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		
		//익명 자식 객체가 대입된 필드 사용
		car.run1();
		
		//익명 자식 객체가 대입된 로컬변수 사용
		car.run2();
		
		//익명 자식 객체가 대입된 매개변수 사용
		car.run3(
		
				new Tire() {

					@Override
					public void roll() {
						System.out.println("익명 자식 tire 객체 3이 굴러갑니다.");
					}
				}

				//뭐야 이 미친놈은 왜 변수값 자리에 함수가. 인자는 어디에
				//JQuery가 이짓을 처음으로 시작함
				//-> java에서도 쓰다가 람다식으로 대체?
		);
		
		
	}

}
