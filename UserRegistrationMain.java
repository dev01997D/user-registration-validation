package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to User Registration Validation Problem");

		//Taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Email Id here:");
		String phone=sc.nextLine();

		//Generating pattern   
		//String pattern="^[a-zA-Z0-9_+&-]+(?:\\\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";
		String pattern="^(abc)+(((\\.[0-9])|(\\-[0-9])|[0-9]){0,})@[a-z0-9]{1,}(.)(([a-z0-9]{2,}(.))|([a-z0-9]{2,}(,)))[a-z0-9]{2,}";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher phoneNo=namePattern.matcher(phone);

		if(phoneNo.matches())
		{
			System.out.println("The email provided is valid one. Thank You!");
		}
		else
			System.out.println("The email is not valid address. Plz try again!");
	}

}
