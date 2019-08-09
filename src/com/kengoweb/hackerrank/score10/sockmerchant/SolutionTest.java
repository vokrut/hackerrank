package com.kengoweb.hackerrank.score10.sockmerchant;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.kengoweb.hackerrank.score10.sockmerchant.Solution;

class SolutionTest {

	@Test
	void testCase1() {
		int[] ar = {1, 2, 1, 2, 1, 3, 2};
		int n = 7;
		int result = 2;
		Assert.assertEquals(Solution.sockMerchant(n, ar), result);
	}

	@Test
	void testCase2() {
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int n = 9;
		int result = 3;
		Assert.assertEquals(Solution.sockMerchant(n, ar), result);
	}

}
