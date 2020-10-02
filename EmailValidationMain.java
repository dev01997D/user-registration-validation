package com.bz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidationMain {

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
