package com.kengoweb.hackerrank.score10.minimaxsum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] arr = {1, 3, 5, 7, 9};
		int resultMin = 16;
		int resultMax = 24;
		Assert.assertEquals(Solution.getMinSum(arr), resultMin);
		Assert.assertEquals(Solution.getMaxSum(arr), resultMax);
	}

	@Test
	void testCase2() {
		int[] arr = {1, 2, 3, 4, 5};
		int resultMin = 10;
		int resultMax = 14;
		Assert.assertEquals(Solution.getMinSum(arr), resultMin);
		Assert.assertEquals(Solution.getMaxSum(arr), resultMax);
	}
	
	
}
