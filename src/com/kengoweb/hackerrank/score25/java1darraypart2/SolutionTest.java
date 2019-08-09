package com.kengoweb.hackerrank.score25.java1darraypart2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testCase1() {
		int[] game = {0, 0, 0, 0, 0};
		int leap = 3;
		Assert.assertTrue(Solution.canWin(leap, game));
	}

	@Test
	void testCase2() {
		int[] game = {0, 0, 0, 1, 1, 1};
		int leap = 5;
		Assert.assertTrue(Solution.canWin(leap, game));
	}

	@Test
	void testCase3() {
		int[] game = {0, 0, 1, 1, 1, 0};
		int leap = 3;
		Assert.assertFalse(Solution.canWin(leap, game));
	}
	
	@Test
	void testCase4() {
		int[] game = {0, 1, 0};
		int leap = 1;
		Assert.assertFalse(Solution.canWin(leap, game));
	}
	
	@Test
	void testCaseInput03() {
		List<Boolean> listOutput = new ArrayList<>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\eclipse-workspace\\hackerrank\\src\\com\\kengoweb\\hackerrank\\score25\\java1darraypart2\\output03.txt"));
			String line = bufferedReader.readLine();
			while (line != null) {
				if (line.equals("YES")) {
					listOutput.add(true);
				} else {
					listOutput.add(false);
				}
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			bufferedReader = new BufferedReader(new FileReader("D:\\eclipse-workspace\\hackerrank\\src\\com\\kengoweb\\hackerrank\\score25\\java1darraypart2\\input03.txt"));
			line = bufferedReader.readLine();
			int testCount = Integer.parseInt(line);
			int currentTest = 0;
			System.out.println("Test cases: " + testCount);
			while (line != null) {
				line = bufferedReader.readLine();
				if (line == null) {
					break;
				}

				System.out.print("Test case " + ++currentTest);
				System.out.println(" - expected " + listOutput.get(currentTest - 1));
				
				String[] setItems = line.split(" ");
				int n = Integer.parseInt(setItems[0]);
				int leap = Integer.parseInt(setItems[1]);
				line = bufferedReader.readLine();
				
				String[] arrItems = line.split(" ");
				int[] game = new int[n];
				for (int i = 0; i < n; i++) {
					game[i] = Integer.parseInt(arrItems[i]);
				}

				/*
				if (currentTest == 355) {
					System.out.println("leap = " + leap);
					System.out.println(line);
					Solution.canWin(leap, game);
				}
				*/
				
				boolean testResult = Solution.canWin(leap, game);
				if (testResult != listOutput.get(currentTest - 1)) {
					System.out.println("leap = " + leap);
					System.out.println(line);
					System.out.println(testResult);
					//Solution.canWin(leap, game);
					break;
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
