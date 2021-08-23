package org.ssglobal.training.codes;

public class ElementDecimalException extends Exception{

	private String message = "Invalid value: [float]";
	
	public ElementDecimalException() {} 
	
	public ElementDecimalException(String newMessage) {
		message = newMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void printStackTrace() {
		System.err.println(message);
	}
}
