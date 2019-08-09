package com.kengoweb.hackerrank.score10.drawingbook;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int n = 6;
		int p = 2;
		int result = 1;
		int resultFromStart = 1;
		int resultFromEnd = 2;
		Assert.assertEquals(Solution.pageCount(n, p), result);
		Assert.assertEquals(Solution.turnPagesFromStart(n, p), resultFromStart);
		Assert.assertEquals(Solution.turnPagesFromEnd(n, p), resultFromEnd);
	}

	@Test
	void testCase2() {
		int n = 5;
		int p = 4;
		int result = 0;
		int resultFromStart = 2;
		int resultFromEnd = 0;
		Assert.assertEquals(Solution.pageCount(n, p), result);
		Assert.assertEquals(Solution.turnPagesFromStart(n, p), resultFromStart);
		Assert.assertEquals(Solution.turnPagesFromEnd(n, p), resultFromEnd);
	}
}
