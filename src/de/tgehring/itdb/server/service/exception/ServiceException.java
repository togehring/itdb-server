package de.tgehring.itdb.server.service.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ServiceException(String message) {
		super(message);
	}
}