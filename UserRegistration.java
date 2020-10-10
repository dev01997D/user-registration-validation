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

		// First Name Validation Using Lambda Expression
		System.out.println("Enter Your First Name for User Registration :");
		String firstName = sc.nextLine();
		validateDetails(firstName, FIRST_NAME_PATTERN);

		// Last Name Validation Using Lambda Expression
		System.out.println("Enter Your Last Name for User Registration :");
		String lastName = sc.nextLine();
		validateDetails(lastName, LAST_NAME_PATTERN);

		// Email Id Validation Using Lambda Expression
		System.out.println("Enter Your Email ID for User Registration :");
		String emailId = sc.nextLine();
		validateDetails(emailId, EMAIL_PATTERN);

		// Phone Number Validation Using Lambda Expression
		System.out.println("Enter Your Phone Number for User Registration :");
		String phoneNo = sc.nextLine();
		validateDetails(phoneNo, PHONE_NUMBER_PATTERN);

		// Password Validation Using Lambda Expression
		System.out.println("Enter Your Password for User Registration :");
		String password = sc.nextLine();
		validateDetails(password, PASSWORD_PATTERN);

		System.out.println("Registered Successfully!");
		sc.close();
	}

	// Lambda expression to validate all the details
	private static void validateDetails(String parameter, String pattern) {
		ValidateDetails parameterObj = (parameterPassed) -> {
			if (parameterPassed.matches(pattern))
				return true;
			else
				return false;
		};
		if (parameterObj.validateDetails(parameter))
			System.out.println("Your Detail provided is accepted : " + parameter);
		else
			System.out.println("The detail provided is not in correct format. Please try again!");
	}
}