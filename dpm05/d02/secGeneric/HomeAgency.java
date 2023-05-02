package dpm05.d02.secGeneric;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}
	
}
