package com.kengoweb.hackerrank.euler.multiples3and5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int n = 10;
		int result = 23;
		Assert.assertEquals(Solution.getSumMultiples3and5(n), result);
	}

	@Test
	void testCase2() {
		int n = 100;
		int result = 2318;
		Assert.assertEquals(Solution.getSumMultiples3and5(n), result);
	}

}
