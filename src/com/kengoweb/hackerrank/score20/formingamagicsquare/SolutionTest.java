package com.kengoweb.hackerrank.score20.formingamagicsquare;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[][] s = {
				{5, 3, 4},				
				{1, 5, 8},
				{6, 4, 2}};
		int result = 7;
		Assert.assertEquals(Solution.formingMagicSquare(s), result);
	}

	@Test
	void testCase2() {
		int[][] s = {
				{4, 9, 2},				
				{3, 5, 7},
				{8, 1, 5}};
		int result = 1;
		Assert.assertEquals(Solution.formingMagicSquare(s), result);
	}

	@Test
	void testCase3() {
		int[][] s = {
				{4, 8, 2},				
				{4, 5, 7},
				{6, 1, 6}};
		int result = 4;
		Assert.assertEquals(Solution.formingMagicSquare(s), result);
	}
}
