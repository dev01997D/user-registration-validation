package com.bz.userregistration;

public class UserInvalidDetailsException extends Exception{

	public UserInvalidDetailsException(String message) {
		System.out.println(message);
	}
}
