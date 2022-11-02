package com.newbank.onlinebanking.customException;

public class UserExistsException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserExistsException(String errMsg) {
		super(errMsg);
	}
}
