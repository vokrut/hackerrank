package com.kengoweb.hackerrank.score20.repeatedstring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		String s = "aba";
		long n = 10;
		long result = 7;
		Assert.assertEquals(Solution.repeatedString(s, n), result);
	}

	@Test
	void testCase2() {
		String s = "a";
		long n = 1000000000000L;
		long result = 1000000000000L;
		Assert.assertEquals(Solution.repeatedString(s, n), result);
	}

}
