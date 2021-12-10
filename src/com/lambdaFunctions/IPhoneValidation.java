package com.lambdaFunctions;

import com.exception.InvalidPhoneNumberException;

@FunctionalInterface
public interface IPhoneValidation {

	public boolean phone(String phone) throws InvalidPhoneNumberException;
}
