package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationMain {

	public boolean firstNameValidation(String firstName) {
		String pattern="^[A-Z][a-z]{2,}$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher fNameMatcher=namePattern.matcher(firstName);

		if(fNameMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
	public boolean lastNameValidation(String lastName) {
		String pattern="^[A-Z][a-z]{2,}$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher lNameMatcher=namePattern.matcher(lastName);

		if(lNameMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
	public boolean phoneNumberValidation(String phoneNo) {
		String pattern="^[0-9]{2}(\\s)[7-9][0-9]{9}$";
		Pattern phonePattern=Pattern.compile(pattern);
		Matcher phoneMatcher=phonePattern.matcher(phoneNo);

		if(phoneMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
	public boolean passwordValidation(String password) {
		String pattern="(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^a-zA-Z0-9_])([a-zA-Z0-9_]|[^a-zA-Z0-9_]){8,}";
		Pattern passwordPattern=Pattern.compile(pattern);
		Matcher passwordMatcher=passwordPattern.matcher(password);

		if(passwordMatcher.matches()) {
			return true;
		}
		else
			return false;
	}

	public boolean emailValidation(String email) {
		String pattern="^(abc)+(((\\.[0-9])|(\\-[0-9])|(\\+[0-9])|[0-9]){0,})@[a-z0-9]{1,}(.)(([a-z0-9]{2,}(.))|([a-z0-9]{2,}(,)))[a-z0-9]{0,}$";
		Pattern emailPattern=Pattern.compile(pattern);
		Matcher emailMatcher=emailPattern.matcher(email);

		if(emailMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
}

