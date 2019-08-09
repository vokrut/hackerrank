package com.kengoweb.hackerrank.score20.pickingnumbers;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		List<Integer> s = Arrays.asList(1, 2, 2, 3, 1, 2);
		int result = 5;
		Assert.assertEquals(Result.pickingNumbers(s), result);
	}

	@Test
	void testCase2() {
		List<Integer> s = Arrays.asList(4, 6, 5, 3, 3, 1);
		int result = 3;
		Assert.assertEquals(Result.pickingNumbers(s), result);
	}

	@Test
	void testCase3() {
		List<Integer> s = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5);
		int result = 5;
		Assert.assertEquals(Result.pickingNumbers(s), result);
	}
}
