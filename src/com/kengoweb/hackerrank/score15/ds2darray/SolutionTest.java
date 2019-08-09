package com.kengoweb.hackerrank.score15.ds2darray;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[][] arr = {
				{-9, -9, -9,  1, 1, 1},				
				{ 0, -9,  0,  4, 3, 2},
				{-9, -9, -9,  1, 2, 3},
				{ 0,  0,  8,  6, 6, 0},
				{ 0,  0,  0, -2, 0, 0},
				{ 0,  0,  1,  2, 4, 0}};
		int result = 28;
		Assert.assertEquals(Solution.hourglassSum(arr), result);
	}

	@Test
	void testCase2() {
		int[][] arr = {
				{1, 1, 1, 0, 0, 0},				
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}};
		int result = 19;
		Assert.assertEquals(Solution.hourglassSum(arr), result);
	}

}
