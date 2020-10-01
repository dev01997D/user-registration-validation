package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to User Registration Validation Problem");

		//Taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Password here:");
		String password=sc.nextLine();

		//Generating pattern  
		String pattern="(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^a-zA-Z0-9_])([a-zA-Z0-9_]|[^a-zA-Z0-9_]){8,}";
		Pattern namePattern=Pattern.compile(pattern);   //
		Matcher passwordMatcher=namePattern.matcher(password);

		if(passwordMatcher.matches())
		{
			System.out.println("The Password is accepted!. Thank You!");
		}
		else
			System.out.println("The Password is not valid! It should follow the patterns. Plz try again!");
	}

}
