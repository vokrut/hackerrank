package com.kengoweb.hackerrank.score15.countingvalleys;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int n = 12;
		String s = "DDUUDDUDUUUD";
		int result = 2;
		Assert.assertEquals(Solution.countingValleys(n, s), result);
	}

	@Test
	void testCase2() {
		int n = 8;
		String s = "UDDDUDUU";
		int result = 1;
		Assert.assertEquals(Solution.countingValleys(n, s), result);
	}

}
