package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	
	final String NAME = "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";
	final String EMAIL = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$";
	
	public void firstName(String name) {
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
		
	}
	
	public void email(String email) {
		
		Pattern pattern = Pattern.compile(EMAIL);
		Matcher match = pattern.matcher(email);
		System.out.println(match.matches());
		
	}
}
