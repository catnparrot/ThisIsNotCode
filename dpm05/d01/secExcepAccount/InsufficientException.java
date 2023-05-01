package dpm05.d01.secExcepAccount;

public class InsufficientException extends Exception {
	public InsufficientException() {
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
