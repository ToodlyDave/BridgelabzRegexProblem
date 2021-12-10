package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.exception.InvalidEmailException;
import com.exception.InvalidNameException;
import com.exception.InvalidPasswordException;
import com.exception.InvalidPhoneNumberException;
import com.lambdaFunctions.IEmailValidation;
import com.lambdaFunctions.INameValidation;
import com.lambdaFunctions.IPasswordValidation;
import com.lambdaFunctions.IPhoneValidation;

public class UserDetails {

	final String NAME = "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";
	final String EMAIL = "^[\\w+-]+(\\.[\\w-]+)*@[^_\\W]+(\\.[^_\\W]+)?(?=(\\.[^_\\W]{3,}$|\\.[a-zA-Z]{2}$)).*$";
	final String PHONE = "^[0-9]{1,3}[\\s][0-9]{10}$";
	final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=[^_\\W]*[_\\W][^_\\W]*$).{8,}$";
	
	public INameValidation name = new INameValidation() {
		
		@Override
		public boolean name(String name) throws InvalidNameException {
			Pattern pattern = Pattern.compile(NAME);
			Matcher match = pattern.matcher(name);
			System.out.println(match.matches());
			if(!match.matches())
				throw new InvalidNameException();
			return match.matches();
		}
	};
	
	public IEmailValidation email = new IEmailValidation() {
		
		@Override
		public boolean email(String email) throws InvalidEmailException {
			Pattern pattern = Pattern.compile(EMAIL);
			Matcher match = pattern.matcher(email);
			System.out.println(match.matches());
			if(!match.matches())
				throw new InvalidEmailException();
			return match.matches();
		}
	};
	
	public IPhoneValidation phone = new IPhoneValidation() {
		
		@Override
		public boolean phone(String phone) throws InvalidPhoneNumberException {
			Pattern pattern = Pattern.compile(PHONE);
			Matcher match = pattern.matcher(phone);
			System.out.println(match.matches());
			if(!match.matches())
				throw new InvalidPhoneNumberException();
			return match.matches();
		}
	};
	
	public IPasswordValidation password = new IPasswordValidation() {
		
		@Override
		public boolean password(String password) throws InvalidPasswordException {
			Pattern pattern = Pattern.compile(PASSWORD);
			Matcher match = pattern.matcher(password);
			System.out.println(match.matches());
			if(!match.matches())
				throw new InvalidPasswordException();
			return match.matches();
		}
	};
	
}
