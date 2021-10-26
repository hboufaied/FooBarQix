package com.wema.kata.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wema.kata.SubstitutionEnum;
import com.wema.kata.component.ComputingRule;

public class ComputingRuleComposite {

	private List<ComputingRule> computingRules = new ArrayList<ComputingRule>();

	public void add(ComputingRule computingRule) {
		this.computingRules.add(computingRule);
	}

	public List<ComputingRule> getComputingRules() {
		return Collections.unmodifiableList(this.computingRules);
	}

	public String apply(String numberToCompute) {
		
		StringBuilder result = new StringBuilder();
		this.computingRules.forEach(computing -> {
			result.append(computing.apply(numberToCompute));
		});

		if (result.length() == 0) {
			return numberToCompute;
		}

		return result.toString().replace("0", SubstitutionEnum.STAR.value);
	}

}
