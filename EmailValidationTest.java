package com.bz.userregistration.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.bz.userregistration.EmailValidationMain;

@RunWith(Parameterized.class)
@SuiteClasses({ UserRegistrationTest.class })

public class EmailValidationTest {
	private String inputString;
	private Boolean expectedResult;
	private EmailValidationMain emailValidationMain;

	@Before
	public void initialize() {
		emailValidationMain = new EmailValidationMain();
	}
	//Constructor
	public EmailValidationTest(String inputString, Boolean expectedResult) {
		this.inputString = inputString;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection emailIds() {
		return Arrays.asList(new Object[][] {
			{ "abc-100@yahoo.com", true },
			{ "abc@yahoo.com", true },
			{ "abc.100@yahoo.com", true },
			{ "abc111@yahoo.com", true },
			{ "abc-100@abc.net", true },
			{"abc.100@abc.com.au", true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc+100@gmail.com", true},
			{"dev.xyz@bl.co.in", false},
			{"dev.xyz.bl.co.in", false}
		});
	}
	@Test
	public void testEmailIds() {
		System.out.println("Parameterized Input Email Id is : " + inputString);
		assertEquals(expectedResult, emailValidationMain.emailValidation(inputString));
	}
}
