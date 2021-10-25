package com.wema.kata;

import java.util.Arrays;

import com.wema.kata.rules.Rule;

public class FooBarQix {

	private static final String FOO = "Foo";
	private static final String BAR = "Bar";
	private static final String QIX = "Qix";
	private static final String STAR = "*";

	public String compute(String numberToCompute) {
		StringBuilder result = new StringBuilder();

		Rule ruleForNumberDevisibleByThree = new Rule(3, FOO);
		Rule ruleForNumberDivisibleByFive = new Rule(5, BAR);
		Rule ruleForNumberDivibleBySeven = new Rule(7, QIX);

		Rule[] rulesForReplacement = { ruleForNumberDevisibleByThree, ruleForNumberDivisibleByFive,
				ruleForNumberDivibleBySeven };

		result.append(computeDevidedNumber(numberToCompute, rulesForReplacement));

		result.append(computeContainNumber(numberToCompute, rulesForReplacement));


		if (result.length() == 0) {
			return numberToCompute;
		}

		return result.toString().replace("0", STAR);
	}

	private String computeContainNumber(String numberToCompute, Rule[] rules) {
		StringBuilder containNumberResult = new StringBuilder();

		numberToCompute.chars().mapToObj(c -> (char)c).forEach(caracter -> {
			for(Rule rule : rules) {
			if (Character.getNumericValue(caracter) == rule.getNumber()) {
				containNumberResult.append(rule.getReplacement());
			} else if (Character.getNumericValue(caracter) == 0) {
				containNumberResult.append("0");
				break;
			}
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