package com.wema.kata;

public enum SubstitutionEnum {

	FOO("Foo"), BAR("Bar"), QIX("Qix"), STAR("*");

	public final String value;

	private SubstitutionEnum(String value) {
		this.value = value;
	}
}
