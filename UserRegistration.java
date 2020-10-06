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

	@FunctionalInterface
	public interface ValidateDetails {
		public boolean validateDetails(String detail);
	}

	public static void main(String[] args) {
		// Display Message
		System.out.println("Welcome to User Registration");

		Scanner sc = new Scanner(System.in);
		
		//First Name Validation Using Lambda Expression
		System.out.println("Enter Your First Name for User Registration :");
		String firstName = sc.nextLine();
		ValidateDetails firstNameObj = (firstNamePassed) -> {
			if (firstNamePassed.matches(FIRST_NAME_PATTERN))
				return true;
			else
				return false;
		};
		if (firstNameObj.validateDetails(firstName))
			System.out.println("First Name : " + firstName);
		else
			System.out.println("Enter correct First name");
		
		//Last Name Validation Using Lambda Expression
		System.out.println("Enter Your Last Name for User Registration :");
		String lastName = sc.nextLine();
		ValidateDetails lastNameObj = (lastNamePassed) -> {
			if (lastNamePassed.matches(LAST_NAME_PATTERN))
				return true;
			else
				return false;
		};
		if (lastNameObj.validateDetails(lastName))
			System.out.println("Last Name : " + firstName);
		else
			System.out.println("The pattern of Last Name is incorrect. Please try again!");
		
		//Email Id Validation Using Lambda Expression
		System.out.println("Enter Your Email ID for User Registration :");
		String emailId = sc.nextLine();
		ValidateDetails emailIdObj = (emailIdPassed) -> {
			if (emailIdPassed.matches(EMAIL_PATTERN))
				return true;
			else
				return false;
		};
		if (emailIdObj.validateDetails(emailId))
			System.out.println("Entered email id is : " + emailId);
		else
			System.out.println("The pattern of Email Id is incorrect. Please try again!");
		
		//Phone Number Validation Using Lambda Expression
		System.out.println("Enter Your Phone Number for User Registration :");
		String phoneNo = sc.nextLine();
		ValidateDetails phoneNoObj = (phoneNoPassed) -> {
			if (phoneNoPassed.matches(PHONE_NUMBER_PATTERN))
				return true;
			else
				return false;
		};
		if (phoneNoObj.validateDetails(phoneNo))
			System.out.println("Your Phone Number provided is : " + phoneNo);
		else
			System.out.println("The pattern of Phone Number is incorrect. Please try again!");
		
		//Password Validation Using Lambda Expression
		System.out.println("Enter Your Password for User Registration :");
		String password = sc.nextLine();
		ValidateDetails passwordObj = (passwordPassed) -> {
			if (passwordPassed.matches(PASSWORD_PATTERN))
				return true;
			else
				return false;
		};
		if (passwordObj.validateDetails(password))
			System.out.println("Your Password is following the correct format required: " + password);
		else
			System.out.println("The pattern of Password is incorrect. Please try again!");

		System.out.println("Registered Successfully!");
	}
}
