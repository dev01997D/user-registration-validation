package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to User Registration Validation Problem");

		//Taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user Email:");
		String email=sc.next();

		//Generating pattern   
		String pattern="^abc.(xyz|in)@bl.co.(xyz|in)$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher emailId=namePattern.matcher(email);

		int positionOfAt=email.indexOf('@');
		int lastIndexDot=email.lastIndexOf('.');

		if(emailId.matches()  && (lastIndexDot-positionOfAt>=2))
		{
			System.out.println("Valid email id");
		}
		else
			System.out.println("Invalid Email Id. Plz try again!");
	}

}
