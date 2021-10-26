package com.wema.kata;

import com.wema.kata.component.ComputingRule;
import com.wema.kata.composite.ComputingRuleComposite;
import com.wema.kata.leaf.ContainsRule;
import com.wema.kata.leaf.DivideRule;
import com.wema.kata.rules.Rule;

public class FooBarQix {

	public String compute(String numberToCompute) {

		Rule ruleForNumberDevisibleByThree = new Rule(3, SubstitutionEnum.FOO.value);
		Rule ruleForNumberDivisibleByFive = new Rule(5, SubstitutionEnum.BAR.value);
		Rule ruleForNumberDivibleBySeven = new Rule(7, SubstitutionEnum.QIX.value);

		Rule[] rulesForSubtitution = { ruleForNumberDevisibleByThree, ruleForNumberDivisibleByFive,
				ruleForNumberDivibleBySeven };

		ComputingRule devide = new DivideRule(rulesForSubtitution);
		ComputingRule contains = new ContainsRule(rulesForSubtitution);

		ComputingRuleComposite computingRuleComposite = new ComputingRuleComposite();
		computingRuleComposite.add(devide);
		computingRuleComposite.add(contains);
		return computingRuleComposite.apply(numberToCompute);

	}

}