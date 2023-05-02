package dpm05.d02.secGeneric;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		return new Car();
	}	
}
