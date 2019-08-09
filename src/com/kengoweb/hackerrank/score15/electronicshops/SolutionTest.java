package com.kengoweb.hackerrank.score15.electronicshops;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] keyboards = {40, 50, 60};
		int[] drives = {5, 8, 12};
		int b = 60;
		int result = 58;
		Assert.assertEquals(Solution.getMoneySpent(keyboards, drives, b), result);
	}

	@Test
	void testCase2() {
		int[] keyboards = {3, 1};
		int[] drives = {5, 2, 8};
		int b = 10;
		int result = 9;
		Assert.assertEquals(Solution.getMoneySpent(keyboards, drives, b), result);
	}

	@Test
	void testCase3() {
		int[] keyboards = {4};
		int[] drives = {5};
		int b = 5;
		int result = -1;
		Assert.assertEquals(Solution.getMoneySpent(keyboards, drives, b), result);
	}

}
