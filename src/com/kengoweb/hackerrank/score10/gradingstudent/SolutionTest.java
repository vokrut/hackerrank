package com.kengoweb.hackerrank.score10.gradingstudent;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] grades = {73, 67, 38, 33};
		int[] result = {75, 67, 40, 33};
		Assert.assertArrayEquals(Solution.gradingStudents(grades), result);
	}

}
