package com.kengoweb.hackerrank.score15.ds2darray;

import java.util.Scanner;

public class Solution {

	static int hourglassSum(int[][] arr) {

		int maxSumHourglass = -999;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sumHourglass = calculateHourglassSum(i, j, arr);
				if (sumHourglass > maxSumHourglass) {
					maxSumHourglass = sumHourglass;
				}
			}
		}
		
		return maxSumHourglass;

    }

    static int calculateHourglassSum(int i, int j, int[][] arr) {
    	int sumHourglass = 
    			arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
    			arr[i + 1][j + 1] +
    			arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
		return sumHourglass;
	}

	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
