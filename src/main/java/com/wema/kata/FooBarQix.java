package com.wema.kata;

import java.util.Arrays;

import com.wema.kata.rules.Rule;

public class FooBarQix {

	private static final String FOO = "Foo";
	private static final String BAR = "Bar";
	private static final String QIX = "Qix";

	public String compute(String numberToCompute) {
		StringBuilder result = new StringBuilder();

		Rule ruleForNumberThree = new Rule(3, FOO);
		Rule ruleForNumberFive = new Rule(5, BAR);
		Rule ruleForNumberSeven = new Rule(7, QIX);
		Rule[] rules = {ruleForNumberThree, ruleForNumberFive, ruleForNumberSeven};
		
		result.append(computeDevidedNumber(numberToCompute, rules));

		char[] charArrayOfNumber = String.valueOf(numberToCompute).toCharArray();
		for (char caracter : charArrayOfNumber) {
			result.append(computeContainNumber(caracter, rules));
		}

		// if number is not devised by 3 or not contain 3, then we return the same
		// number
		if (result.length() == 0) {
			return numberToCompute;
		}

		return result.toString();
	}

	private String computeContainNumber(char caracter, Rule[] rules) {
		StringBuilder containNumberResult = new StringBuilder();

		Arrays.stream(rules).forEach(rule -> {
			if (Character.getNumericValue(caracter) == rule.getNumber()) {
				containNumberResult.append(rule.getReplacement());
			}
		});
		return containNumberResult.toString();
	}

	private String computeDevidedNumber(String numberToCompute, Rule[] rules) {
		StringBuilder devideNumberResult = new StringBuilder();
		int number = Integer.parseInt(numberToCompute);
		
		Arrays.stream(rules).forEach(rule -> {
			if (number % rule.getNumber() == 0) {
				devideNumberResult.append(rule.getReplacement());
			}
		});
		return devideNumberResult.toString();
	}

}