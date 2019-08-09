package com.kengoweb.hackerrank.score10.divisiblesumpairs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int n = 6;
		int k = 5;
		int[] ar = {1, 2, 3, 4, 5, 6};
		int result = 3;
		Assert.assertEquals(Solution.divisibleSumPairs(n, k, ar), result);
	}

	@Test
	void testCase2() {
		int n = 6;
		int k = 3;
		int[] ar = {1, 3, 2, 6, 1, 2};
		int result = 5;
		Assert.assertEquals(Solution.divisibleSumPairs(n, k, ar), result);
	}
	
}
