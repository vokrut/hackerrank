package com.kengoweb.hackerrank.score15.dynamicarray;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		List<List<Integer>> queries = Arrays.asList(
				Arrays.asList(1, 2, 2, 3, 1, 2));
		int n = 1;
		int result = 5;
		Assert.assertEquals(Solution.dynamicArray(n, queries), result);
	}

	@Test
	void testCase2() {
		List<List<Integer>> queries = Arrays.asList(
				Arrays.asList(1, 2, 2, 3, 1, 2));
		int n = 1;
		int result = 5;
		Assert.assertEquals(Solution.dynamicArray(n, queries), result);
	}

}
