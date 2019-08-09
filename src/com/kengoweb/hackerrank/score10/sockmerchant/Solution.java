package com.kengoweb.hackerrank.score10.sockmerchant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

    	int result = 0;
    	
    	Map<Integer, Boolean> pairSocks = new HashMap<>();
    	
    	for (int i = 0; i < n; i++) {
    		if (pairSocks.get(ar[i]) == null) {
    			pairSocks.put(ar[i], true);
    		} else {
    			pairSocks.remove(ar[i]);
    			result++;
    		}
    	}
    	
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
