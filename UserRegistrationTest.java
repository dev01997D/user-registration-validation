package com.bz.userregistration.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bz.userregistration.UserInvalidDetailsException;
import com.bz.userregistration.UserRegistrationMain;

public class UserRegistrationTest {
	
	static UserRegistrationMain userMain=null;
	@BeforeClass
	public static void setup() {
		userMain=new UserRegistrationMain();
	}
	
	@Test
	public void testFirstName() throws UserInvalidDetailsException{
		assertTrue("Check pattern defined for correct type of First Name", userMain.firstNameValidation("Dev"));
		assertFalse("Check pattern defined for wrong type of First Name", userMain.firstNameValidation("dev"));
	}
	@Test
	public void testLastName() {
		assertTrue("Check pattern defined for correct type of Last Name", userMain.lastNameValidation("Kumar"));;
		assertFalse("Check pattern defined for wrong type of Last Name", userMain.lastNameValidation("kumar"));
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
	@Test
	public void testEmail() {
		assertTrue("Check pattern defined for correct type of Email 1", userMain.emailValidation("abc-100@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 2", userMain.emailValidation("abc@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 3", userMain.emailValidation("abc.100@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 4", userMain.emailValidation("abc111@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 5", userMain.emailValidation("abc-100@abc.net"));
		assertTrue("Check pattern defined for correct type of Email 6", userMain.emailValidation("abc.100@abc.com.au"));
		assertTrue("Check pattern defined for correct type of Email 7", userMain.emailValidation("abc@1.com"));
		assertTrue("Check pattern defined for correct type of Email 8", userMain.emailValidation("abc@gmail.com.com"));
		assertTrue("Check pattern defined for correct type of Email 9", userMain.emailValidation("abc+100@gmail.com"));
		
		assertFalse("Check pattern defined for wrong type of Email", userMain.emailValidation("dev.xyz@bl.co.in"));
		assertFalse("Check pattern defined for wrong type of Email", userMain.emailValidation("dev.xyz.bl.co.in"));
	}
	@AfterClass
	public static void closeSetup() {
		
	}
}
