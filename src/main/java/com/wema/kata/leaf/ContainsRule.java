package com.wema.kata.leaf;

import com.wema.kata.component.ComputingRule;
import com.wema.kata.rules.Rule;

public class ContainsRule implements ComputingRule {

	private Rule[] rules;

	public ContainsRule(Rule[] rules) {
		super();
		this.rules = rules;
	}


	@Override
	public String apply(String numberToCompute) {
		StringBuilder containNumberResult = new StringBuilder();

		numberToCompute.chars().mapToObj(c -> (char) c).forEach(caracter -> {
			for (Rule rule : rules) {
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

}
