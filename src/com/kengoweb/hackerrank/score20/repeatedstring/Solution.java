package com.kengoweb.hackerrank.score20.repeatedstring;

import java.util.Scanner;

public class Solution {

	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    	long result = 0;
    	
    	long neededCharInSourceString = 0;
    	long neededCharInRestOfSourceString = 0;
    	long howManyTimesSourceStringIn = n / s.length();
    	long restOfSourceString = n % s.length();
    	
    	char[] chars = s.toCharArray();
    	for (int i = 0; i < chars.length; i++) {
    		if (chars[i] == 'a') {
    			neededCharInSourceString++;
    			if (i < restOfSourceString) {
    				neededCharInRestOfSourceString++;
    			}
    		}
    	}

    	result = howManyTimesSourceStringIn * neededCharInSourceString + neededCharInRestOfSourceString;
    	
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
