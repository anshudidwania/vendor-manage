package com.manage.vendor.user.exception;

public class UserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorKey;
	private String exceptionType;
	private String errorMessage;
	
	public UserException(String errorKey) {

		super(errorKey);
		this.errorKey = errorKey;
	}

	public UserException(String errorKey, Exception e) {
		super(errorKey,e);
		this.exceptionType = e.getMessage();
	}
	
	public UserException(String errorKey, Exception e, String errorMessage) {
		super(errorKey);
		this.errorKey = errorKey;
		this.exceptionType = e.getMessage();
		this.errorMessage = errorMessage;
	}

	public String getErrorKey() {
		return errorKey;
	}

	public void setErrorKey(String errorKey) {
		this.errorKey = errorKey;
	}

	public String getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
