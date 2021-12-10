package com.lambdaFunctions;

import com.exception.InvalidPasswordException;

@FunctionalInterface
public interface IPasswordValidation {

	public boolean password(String password) throws InvalidPasswordException;
}
