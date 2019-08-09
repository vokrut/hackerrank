package com.kengoweb.hackerrank.score10.birthdaycakecandles;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	// Complete the jumpingOnClouds function below.
	static int birthdayCakeCandles(int[] ar) {

		int[] arr = ar.clone();
		Arrays.sort(arr);
		
		int maxValue = arr[arr.length - 1];
		int result = 1;
		
		for(int i = arr.length - 1; i > 0; i--) {
			if (maxValue == arr[i - 1]) {
				result++;
			}
		}
		
		return result;

    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
