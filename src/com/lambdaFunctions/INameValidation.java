package com.lambdaFunctions;

import com.exception.InvalidNameException;

@FunctionalInterface
public interface INameValidation {

	public boolean name(String name) throws InvalidNameException;
}
