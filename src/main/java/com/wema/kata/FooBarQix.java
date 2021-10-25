package com.wema.kata;

public class FooBarQix {

	private static final String FOO = "Foo";
	private static final String BAR = "Bar";

	public String compute(int number) {
		StringBuilder result = new StringBuilder();
		if (number % 3 == 0) {
			result.append(FOO);
		}
		if (number % 5 == 0) {
			result.append(BAR);
		}
		char[] charArrayOfNumber = String.valueOf(number).toCharArray();
		for (char caracter : charArrayOfNumber) {
			if (caracter == '3') {
				result.append(FOO);
			}
			if (caracter == '5') {
				result.append(BAR);
			}
		}

		// if number is not devised by 3 or not contain 3, then we return the same
		// number
		if (result.length() == 0) {
			result.append(number);
		}

		return result.toString();
	}

}