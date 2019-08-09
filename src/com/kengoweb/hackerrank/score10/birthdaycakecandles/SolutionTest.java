package com.kengoweb.hackerrank.score10.birthdaycakecandles;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] ar = {4, 4, 1, 3};
		int result = 2;
		Assert.assertEquals(Solution.birthdayCakeCandles(ar), result);
	}

	@Test
	void testCase2() {
		int[] ar = {3, 2, 1, 3};
		int result = 2;
		Assert.assertEquals(Solution.birthdayCakeCandles(ar), result);
	}

}
