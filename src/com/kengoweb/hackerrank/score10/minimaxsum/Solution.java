package com.kengoweb.hackerrank.score10.minimaxsum;

import java.util.*;

public class Solution {

	static void miniMaxSum(int[] arr) {

		int[] arrWork = arr.clone();
		
		Arrays.sort(arrWork);
		
		System.out.print(getMinSum(arrWork) + " " + getMaxSum(arrWork));

    }

	static long getMaxSum(int[] arrWork) {
		long result = 0;
		for (int i = arrWork.length; i > arrWork.length - 4; i--) {
			result += arrWork[i - 1];
		}
		return result;
	}

	static long getMinSum(int[] arrWork) {
		long result = 0;
		for (int i = 0; i < 4; i++) {
			result += arrWork[i];
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {

		int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);
        
        scanner.close();
	}

}
