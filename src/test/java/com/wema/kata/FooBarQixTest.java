package com.wema.kata;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FooBarQixTest {

	private FooBarQix fooBarQix = new FooBarQix();

	@Test
	public void shouldReturn1WhenNumberIs1() {
		final String value = fooBarQix.compute("1");
		assertThat(value).isEqualTo("1");
	}

	@Test
	public void shouldReturnFooFooWhenNumberIs3() {
		final String value = fooBarQix.compute("3");
		assertThat(value).isEqualTo("FooFoo");
	}
	
	@Test
	public void shouldReturnBarBarWhenNumberIs5() {
		final String value = fooBarQix.compute("5");
		assertThat(value).isEqualTo("BarBar");
	}
	
	@Test
	public void shouldReturnFooWhenNumberIs6() {
		final String value = fooBarQix.compute("6");
		assertThat(value).isEqualTo("Foo");
	}
	
	@Test
	public void shouldReturnQixQixWhenNumberIs7() {
		final String value = fooBarQix.compute("7");
		assertThat(value).isEqualTo("QixQix");
	}
	
	@Test
	public void shouldReturnFooBarBarWhenNumberIs15() {
		final String value = fooBarQix.compute("15");
		assertThat(value).isEqualTo("FooBarBar");
	}
	
	@Test
	public void shouldReturnFooFooFooWhenNumberIs33() {
		final String value = fooBarQix.compute("33");
		assertThat(value).isEqualTo("FooFooFoo");
	}
	
	@Test
	public void shouldReturnBarFooWhenNumberIs53() {
		final String value = fooBarQix.compute("53");
		assertThat(value).isEqualTo("BarFoo");
	}
	
	@Test
	public void shouldReturnNumberFormatExceptionWhenIsNotANumber() {
		NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
			fooBarQix.compute("not a number");
        });
		assertThat(exception).isInstanceOf(NumberFormatException.class);
	}

}
