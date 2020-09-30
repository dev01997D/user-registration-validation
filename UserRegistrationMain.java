package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to User Registration Validation Problem");

		//Taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user Phone Number:");
		String phone=sc.nextLine();

		//Generating pattern   
		String pattern="^[0-9]{2}(\\s)[7-9][0-9]{9}$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher phoneNo=namePattern.matcher(phone);

		if(phoneNo.matches())
		{
			System.out.println("Valid Phone Number");
		}
		else
			System.out.println("Invalid Phone Number. Plz try again!");
	}

}
