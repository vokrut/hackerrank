package com.kengoweb.hackerrank.score10.divisiblesumpairs;

import java.io.*;
import java.util.*;

public class Solution {

	// Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {

    	int result = 0;
    	
    	for (int i = 0; i < n - 1; i++) {
    		for (int j = i + 1; j < n; j++) {
    			int sum = ar[i] + ar[j];
    			if (sum % k == 0) {
    				result++;
    			}
    		}
    	}
    	
    	return result;

    }

	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
