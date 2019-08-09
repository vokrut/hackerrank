package com.kengoweb.hackerrank.score10.appleandorange;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int s = 7;
		int t = 10;
		int a = 4;
		int b = 12;
		int[] apples = {2, 3, -4};
		int[] oranges = {3, -2, -4};
		int resultApples = 1;
		int resultOranges = 2;
		Assert.assertEquals(Solution.countFruits(s, t, a, apples), resultApples);
		Assert.assertEquals(Solution.countFruits(s, t, b, oranges), resultOranges);
	}

	@Test
	void testCase2() {
		int s = 7;
		int t = 11;
		int a = 5;
		int b = 15;
		int[] apples = {-2, 2, 1};
		int[] oranges = {5, -6};
		int resultApples = 1;
		int resultOranges = 1;
		Assert.assertEquals(Solution.countFruits(s, t, a, apples), resultApples);
		Assert.assertEquals(Solution.countFruits(s, t, b, oranges), resultOranges);
	}
}
