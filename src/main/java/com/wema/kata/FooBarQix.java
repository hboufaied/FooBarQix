package com.wema.kata;

public class FooBarQix {

	public String compute(int number) {
		StringBuilder sb = new StringBuilder();
		if (number % 3 == 0) {
			sb.append("Foo");
		}
		char[] charArrayOfNumber = String.valueOf(number).toCharArray();
		for (char caracter : charArrayOfNumber) {
			if (caracter == '3') {
				sb.append("Foo");
			}
		}
		if(sb.length() == 0) {
			sb.append(number);
		}
		return sb.toString();
	}

}