package com.kengoweb.hackerrank.score15.countingvalleys;

import java.util.Scanner;

public class Solution {

	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

    	int result = 0;
    	
    	char[] steps = s.toCharArray();
    	int seaLevel = 0;
    	boolean valley = false;
    	
    	for (int i = 0; i < steps.length; i++) {
    		if (steps[i] == 'U') {
    			seaLevel++;
    		} else {
    			seaLevel--;
    		}
    		if (seaLevel == -1 && !valley) {
    			valley = true;
    		} else if (seaLevel == 0 && valley) {
    			valley = false;
    			result++;
    		}
    	}
    	
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
