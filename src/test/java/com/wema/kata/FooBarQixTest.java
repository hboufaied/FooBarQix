package com.wema.kata;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class FooBarQixTest {

	private FooBarQix fooBarQix = new FooBarQix();

	@Test
	public void shouldReturn1WhenNumberIs1() {
		final String value = fooBarQix.compute(1);
		assertThat(value).isEqualTo("1");
	}

	@Test
	public void shouldReturnFooFooWhenNumberIs3() {
		final String value = fooBarQix.compute(3);
		assertThat(value).isEqualTo("FooFoo");
	}
	
	@Test
	public void shouldReturnBarBarWhenNumberIs5() {
		final String value = fooBarQix.compute(5);
		assertThat(value).isEqualTo("BarBar");
	}
	
	@Test
	public void shouldReturnFooWhenNumberIs6() {
		final String value = fooBarQix.compute(6);
		assertThat(value).isEqualTo("Foo");
	}
}
