package com.wema.kata.rules;

import java.util.Arrays;

public class DivideRule implements ComputingRule {

	private Rule[] rules;

	public DivideRule(Rule[] rules) {
		this.rules = rules;
	}

	@Override
	public String apply(String numberToCompute) {
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
