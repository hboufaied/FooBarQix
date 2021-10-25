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

}
