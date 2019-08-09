package com.kengoweb.hackerrank.score10.betweentwosets;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testGetTotalX_case1() {
		int[] a = {2, 6};
		int[] b = {24, 36};
		int[] result = {6, 12};
		Assert.assertArrayEquals(Solution.getDividers(a, b), result);
		Assert.assertTrue(Solution.getTotalX(a, b) == result.length);
	}

	@Test
	void testGetTotalX_case2() {
		int[] a = {2, 4};
		int[] b = {16, 32, 96};
		int[] result = {4, 8, 16};
		Assert.assertArrayEquals(Solution.getDividers(a, b), result);
		Assert.assertTrue(Solution.getTotalX(a, b) == result.length);
	}
	
	
}
