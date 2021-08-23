package org.ssglobal.training.codes;

public class DayOutofBoundsException extends Exception {

	 String message = "You have entered imaginary days";
	
	public DayOutofBoundsException() {}
	
	public DayOutofBoundsException(String newMessage) {
		message = newMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void printStackTrace() {
		System.err.println(message);
	} 
}
