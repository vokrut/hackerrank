package com.kengoweb.hackerrank.score20.arraysleftrotation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] a = {1, 2, 3, 4, 5};
		int d = 4;
		int[] result = {5, 1, 2, 3, 4};
		Assert.assertArrayEquals(Solution.rotLeft(a, d), result);
	}

	@Test
	void testCase2() {
		int[] a = {1, 2, 3, 4, 5};
		int d = 2;
		int[] result = {3, 4, 5, 1, 2};
		Assert.assertArrayEquals(Solution.rotLeft(a, d), result);
	}

}
