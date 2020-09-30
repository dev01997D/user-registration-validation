package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to User Registration Validation Problem");
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the user First Name:");
		String firstName=sc.next();
		System.out.println("Enter the User Last Name:");
		String lastName=sc.next();
		
		//Generating pattern
		String pattern="^[A-Z][a-z]{2,}$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher fName=namePattern.matcher(firstName);
		Matcher lName=namePattern.matcher(lastName);
		
		
		if(fName.matches() && lName.matches()) {
			System.out.println("Welcome, "+firstName+" "+lastName);
		}
		else
			System.out.println("Invalid User Name, first and last name should start with capital letter and have minimum 3 characters. Please try again!");
	}

}
