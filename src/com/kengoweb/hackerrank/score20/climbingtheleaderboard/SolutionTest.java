package com.kengoweb.hackerrank.score20.climbingtheleaderboard;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] scores = {100, 90, 90, 80, 75, 60};
		int[] alice = {50, 65, 77, 90, 102};
		int[] result = {6, 5, 4, 2, 1};
		Assert.assertArrayEquals(Solution.climbingLeaderboard(scores, alice), result);
	}

	@Test
	void testCase2() {
		int[] scores = {100, 100, 50, 40, 40, 20, 10};
		int[] alice = {5, 25, 50, 120};
		int[] result = {6, 4, 2, 1};
		Assert.assertArrayEquals(Solution.climbingLeaderboard(scores, alice), result);
	}

	@Test
	void testCase3() {
		int[] scores = {100, 90, 90, 80};
		int[] alice = {70, 80, 105};
		int[] result = {4, 3, 1};
		Assert.assertArrayEquals(Solution.climbingLeaderboard(scores, alice), result);
	}
	
}
