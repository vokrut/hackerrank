package com.kengoweb.hackerrank.score10.betweentwosets;

import java.util.*;

public class Solution {

	/*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
    	return getDividers(a, b).length;
    }
    
    static int[] getDividers(int[] a, int[] b) {
    	Arrays.sort(a);
        Arrays.sort(b);
        int max = a[a.length - 1];
        int min = b[0];
        int iteration = min / max;
        
        Set<Integer> resultSet = new LinkedHashSet<Integer>();
        
        for (int i = 1; i <= iteration; i++) {
        	int divider = max * i;
        	if (dividerGoodForArrayA(a, divider)) {
        		if (dividerGoodForArrayB(b, divider)) {
        			resultSet.add(divider);
        		}
        	}
        }
        
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (Integer value : resultSet) {
        	result[i++] = value;
        }
        
    	return result;
    }

    private static boolean dividerGoodForArrayA(int[] a, int divider) {
		for (int i = 0; i < a.length; i++) {
			if (divider % a[i] != 0) {
				return false;
			}
		}
		return true;
	}
    
    private static boolean dividerGoodForArrayB(int[] b, int divider) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] % divider != 0) {
				return false;
			}
		}
		return true;
	}


	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {

		String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scanner.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);
        int[] result = getDividers(a, b);
        
        System.out.println(total);
        for(int i = 0; i < result.length; i++) {
        	System.out.print(result[i] + " ");
        }
        
        scanner.close();
	}

}
