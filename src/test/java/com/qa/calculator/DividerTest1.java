package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest1 {

	private Divider divider;
	
	@Test
	public void test() {
		divider = new Divider();
		int expectedValue = 2;
		int actualValue = divider.divider(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}