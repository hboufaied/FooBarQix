package com.wema.kata.leaf;

import java.util.Arrays;

import com.wema.kata.component.ComputingRule;
import com.wema.kata.rules.Rule;

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
