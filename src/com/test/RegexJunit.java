package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.user.UserDetails;

public class RegexJunit {

	@Test
	public void firstNameHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.firstName("David");
		assertEquals(false, output);
	}
	
	@Test
	public void firstNameSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.firstName("david");
		assertEquals(false, output);
	}
	
	@Test
	public void phoneNumberHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.phoneNumber("91 1234567890");
		assertEquals(true, output);
	}
	
	@Test
	public void phoneNumberSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.phoneNumber("hi@@gmail.com");
		assertEquals(false, output);
	}
	
	@Test
	public void passwordHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.password("hi5!There");
		assertEquals(true, output);
	}
	
	@Test
	public void passwordSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.password("hi!!therekfjslkf");
		assertEquals(false, output);
	}
	
	@Test
	public void emailHappy() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.email("hi@gmail.com");
		assertEquals(true, output);
	}
	
	@Test
	public void emailSad() {
		UserDetails userDetails = new UserDetails();
		boolean output = userDetails.email("hi@@gmail.com");
		assertEquals(false, output);
	}
	
}
