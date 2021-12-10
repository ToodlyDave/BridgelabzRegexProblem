package com.lambdaFunctions;

import com.exception.InvalidEmailException;

@FunctionalInterface
public interface IEmailValidation {

	public boolean email(String email) throws InvalidEmailException;
}
