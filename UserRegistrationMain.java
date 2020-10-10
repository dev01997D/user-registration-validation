package com.bz.userregistration;

import java.util.regex.*;

public class UserRegistrationMain {

	public boolean firstNameValidation(String firstName) {
		String pattern = "^[A-Z][a-z]{2,}$";
		Pattern namePattern = Pattern.compile(pattern);
		Matcher fNameMatcher = namePattern.matcher(firstName);
		boolean checker = matchDetails(fNameMatcher);
		return checker;
	}

	public boolean lastNameValidation(String lastName) {
		String pattern = "^[A-Z][a-z]{2,}$";
		Pattern namePattern = Pattern.compile(pattern);
		Matcher lNameMatcher = namePattern.matcher(lastName);
		boolean checker = matchDetails(lNameMatcher);
		return checker;
	}

	public boolean phoneNumberValidation(String phoneNo) {
		String pattern = "^[0-9]{2}(\\s)[7-9][0-9]{9}$";
		Pattern phonePattern = Pattern.compile(pattern);
		Matcher phoneMatcher = phonePattern.matcher(phoneNo);
		boolean checker = matchDetails(phoneMatcher);
		return checker;
	}

	public boolean passwordValidation(String password) {
		String pattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^a-zA-Z0-9_])([a-zA-Z0-9_]|[^a-zA-Z0-9_]){8,}";
		Pattern passwordPattern = Pattern.compile(pattern);
		Matcher passwordMatcher = passwordPattern.matcher(password);
		boolean checker = matchDetails(passwordMatcher);
		return checker;
	}

	public boolean emailValidation(String email) {
		String pattern = "^(abc)+(((\\.[0-9])|(\\-[0-9])|(\\+[0-9])|[0-9]){0,})@[a-z0-9]{1,}(.)(([a-z0-9]{2,}(.))|([a-z0-9]{2,}(,)))[a-z0-9]{0,}$";
		Pattern emailPattern = Pattern.compile(pattern);
		Matcher emailMatcher = emailPattern.matcher(email);
		boolean checker = matchDetails(emailMatcher);
		return checker;
	}

	// Method to check if details matches with pattern or not
	public boolean matchDetails(Matcher m) {
		if (m.matches())
			return true;
		else
			return false;
	}
}
