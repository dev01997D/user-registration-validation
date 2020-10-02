package com.bz.userregistration.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bz.userregistration.UserRegistrationMain;

public class UserRegistrationTest {
	
	static UserRegistrationMain userMain=null;
	@BeforeClass
	public static void setup() {
		userMain=new UserRegistrationMain();
	}
	
	@Test
	public void testFirstName() {
		assertTrue("Check pattern defined for correct type of First Name", userMain.firstNameValidation("Dev"));
		assertFalse("Check pattern defined for wrong type of First Name", userMain.firstNameValidation("dev"));
	}
	@Test
	public void testLastName() {
		assertTrue("Check pattern defined for correct type of Last Name", userMain.lastNameValidation("Kumar"));;
		assertFalse("Check pattern defined for wrong type of Last Name", userMain.lastNameValidation("kumar"));
	}
	@Test
	public void testEmail() {
		assertTrue("Check pattern defined for correct type of Email", userMain.emailValidation("abc-100@yahoo.com"));;
		assertFalse("Check pattern defined for wrong type of Email", userMain.emailValidation("dev.xyz@bl.co.in"));
	}
	@Test
	public void testPhoneNumber() {
		assertTrue("Check pattern defined for correct type of Phone Number", userMain.phoneNumberValidation("91 7870752948"));;
		assertFalse("Check pattern defined for wrong type of Phone Number", userMain.phoneNumberValidation("91 457826512"));
	}
	@Test
	public void testPassword() {
		assertTrue("Check pattern defined for correct type of Password", userMain.passwordValidation("Kumar@123"));;
		assertFalse("Check pattern defined for wrong type of Password", userMain.passwordValidation("kumar@123"));
		assertFalse("Check pattern defined for wrong type of Password", userMain.passwordValidation("Kumar123"));
	}
	@AfterClass
	public static void closeSetup() {
		
	}
}
