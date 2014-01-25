package de.tgehring.itdb.server.service.exception;

public class LoginServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public LoginServiceException(String message) {
		super(message);
	}
	
	public LoginServiceException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
