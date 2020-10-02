package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	// Constants
	private final static String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-z]{2,}$";
	private final static String LAST_NAME_PATTERN = "^[A-Z]{1}[a-zA-z]{2,}$";
	private final static String EMAIL_PATTERN = "^[a-z0-9-_\\+]+([\\.][a-z0-9]+)*[\\@]([a-z0-9]{1}|[a-z]{2}|[a-z0-9]{3,})[\\.]([a-z]{2}|[a-z0-9]{3,}|(([a-z]{2}|[a-z0-9]{1}|[a-z0-9]{3,})([\\.][a-z]{2}|[\\.][a-z0-9]{3,})))$";
	private final static String PHONE_NUMBER_PATTERN = "^[0-9]{2}(\\s)[7-9][0-9]{9}$";
	private final static String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^a-zA-Z0-9_])([a-zA-Z0-9_]|[^a-zA-Z0-9_]){8,}";

	public boolean firstNameValidation(String firstName) throws UserInvalidDetailsException{
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		Matcher m = pattern.matcher(firstName);
		if(m.matches()) {
			return true;
		}
		else {
			throw new UserInvalidDetailsException("Invalid First Name");
		}
	}
	public boolean lastNameValidation(String lastName) throws UserInvalidDetailsException{
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		Matcher m = pattern.matcher(lastName);
		if(m.matches()) {
			return true;
		}
		else {
			throw new UserInvalidDetailsException("Invalid Last Name");
		}
	}
	public boolean phoneNumberValidation(String phoneNo) throws UserInvalidDetailsException{
			Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
			Matcher m = pattern.matcher(phoneNo);
			if(m.matches()) {
				return true;
			}
			else {
				throw new UserInvalidDetailsException("Invalid Phone Number"); 
			}
	}
	public boolean passwordValidation(String password) throws UserInvalidDetailsException{

			Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
			Matcher m = pattern.matcher(password);
			if(m.matches()) {
				return true;
			}
			else {
				throw new UserInvalidDetailsException("Invalid Password!"); 
			}
	}

	public boolean emailValidation(String email) throws UserInvalidDetailsException{
			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			Matcher m = pattern.matcher(email);
			if(m.matches()) {
				return true;
			}
			else {
				throw new UserInvalidDetailsException("Invalid Email provided"); 
			}
	}

	public static void main(String[] args) {
		boolean match = false;
		UserRegistration user = new UserRegistration();
		// Display Message
		System.out.println("User Registration");

		Scanner sc = new Scanner(System.in);
		// First Name User Input

		try {
			System.out.println("Enter Your First Name for User Registration :");
			String firstName = sc.next();
			match = user.firstNameValidation(firstName);
			if(match)
				System.out.println("First Name : "+firstName);
		}
		catch(UserInvalidDetailsException e) {
			e.getMessage();
		}
		// Last Name User Input
		try {
		System.out.println("Enter Your Last Name for User Registration :");
		String lastName = sc.next();
		match = user.lastNameValidation(lastName);
		if(match)
			System.out.println("Last Name : "+lastName);
		}
		catch(UserInvalidDetailsException e) {
			e.getMessage();
		}

		// Email User Input
		try {
		System.out.println("Enter Your Email ID for User Registration :");
		String email = sc.next();
		sc.nextLine();
		match = user.emailValidation(email);
		if(match)
			System.out.println("Email : "+email);
		}
		catch(UserInvalidDetailsException e) {
			e.getMessage();
		}

		// Phone Number User Input
		try {
		System.out.println("Enter Your Phone Number for User Registration :");
		String phoneNo = sc.nextLine();
		match = user.phoneNumberValidation(phoneNo);
		if(match)
			System.out.println("Phone Number : "+phoneNo);
		}
		catch(UserInvalidDetailsException e) {
			e.getMessage();
		}

		// Password User Input
		try {
		System.out.println("Enter Your Password for User Registration :");
		String password = sc.next();
		match = user.passwordValidation(password);
		if(match)
			System.out.println("Password : "+password);
		}
		catch(UserInvalidDetailsException e) {
			e.getMessage();
		}

		System.out.println("Registered Successfully!");
	}
}