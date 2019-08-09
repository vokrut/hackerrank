package com.kengoweb.hackerrank.score20.jumpingontheclouds;

import java.util.Scanner;

public class Solution {

	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

    	int steps = 0;
    	int currentCloud = 0;
    	int countClouds = c.length;
    	boolean isEnd = false;
    	
    	while (!isEnd) {
    		if (currentCloud == countClouds - 2) {
    			currentCloud += 1;
    		} else if (c[currentCloud + 2] == 0) {
    			currentCloud += 2;
    		} else {
    			currentCloud += 1;
    		}
    		steps++;
    		if (currentCloud == countClouds - 1) {
    			isEnd = true;
    		}
    	}
    	
    	return steps;

    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
