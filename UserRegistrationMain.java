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
		String phone=sc.nextLine();

		//Generating pattern   
		String pattern="(?=.*[A-Z])(?=.*\\d)([a-zA-Z0-9_]|[^a-zA-Z0-9_]){8,}$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher phoneNo=namePattern.matcher(phone);

		if(phoneNo.matches())
		{
			System.out.println("Password accepted");
		}
		else
			System.out.println("Invalid Password. Plz try again!");
	}

}
