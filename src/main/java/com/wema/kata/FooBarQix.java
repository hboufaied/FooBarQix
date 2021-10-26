package com.wema.kata;

import com.wema.kata.composite.ComputingRuleComposite;
import com.wema.kata.rules.ComputingRule;
import com.wema.kata.rules.ContainsRule;
import com.wema.kata.rules.DivideRule;
import com.wema.kata.rules.Rule;

public class FooBarQix {

	public String compute(String numberToCompute) {

		Rule substitutionRuleForThree = new Rule(3, SubstitutionEnum.FOO.value);
		Rule substitutionRuleForFive = new Rule(5, SubstitutionEnum.BAR.value);
		Rule substitutionRuleForSeven = new Rule(7, SubstitutionEnum.QIX.value);

		Rule[] rules = { substitutionRuleForThree, substitutionRuleForFive,
				substitutionRuleForSeven };

		ComputingRule devide = new DivideRule(rules);
		ComputingRule contains = new ContainsRule(rules);

		ComputingRuleComposite computingRuleComposite = new ComputingRuleComposite();
		computingRuleComposite.add(devide);
		computingRuleComposite.add(contains);
		return computingRuleComposite.apply(numberToCompute);

	}

}