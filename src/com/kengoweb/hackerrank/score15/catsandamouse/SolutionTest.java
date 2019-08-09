package com.kengoweb.hackerrank.score15.catsandamouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int x = 2;
		int y = 5;
		int z = 4;
		String result = "Cat B";
		Assert.assertEquals(Solution.catAndMouse(x, y, z), result);
	}

	@Test
	void testCase2() {
		int x = 1;
		int y = 2;
		int z = 3;
		String result = "Cat B";
		Assert.assertEquals(Solution.catAndMouse(x, y, z), result);
	}

	@Test
	void testCase3() {
		int x = 1;
		int y = 3;
		int z = 2;
		String result = "Mouse C";
		Assert.assertEquals(Solution.catAndMouse(x, y, z), result);
	}

}
