package com.kengoweb.hackerrank.score20.jumpingontheclouds;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] s = {0, 0, 1, 0, 0, 1, 0};
		int result = 4;
		Assert.assertEquals(Solution.jumpingOnClouds(s), result);
	}

	@Test
	void testCase2() {
		int[] s = {0, 0, 0, 0, 1, 0};
		int result = 3;
		Assert.assertEquals(Solution.jumpingOnClouds(s), result);
	}

}
