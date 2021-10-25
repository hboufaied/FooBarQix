package com.wema.kata.rules;

public class Rule {

	private int number;
	private String replacement;

	public Rule(int number, String replacement) {
		this.number = number;
		this.replacement = replacement;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getReplacement() {
		return replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}
}
