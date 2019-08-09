package com.kengoweb.hackerrank.euler.multiples3and5;

import java.util.Scanner;

public class Solution {

    static long getSumMultiples3and5(int n) {

    	long result = 0;
    	
    	int lastIndex3 = (n - 1)/3;
    	int lastIndex5 = (n - 1)/5;
    	int lastIndex15 = (n - 1)/15;
    	
    	result = sumOfArithmeticProgression(lastIndex3, 3) +
    			sumOfArithmeticProgression(lastIndex5, 5) -
    			sumOfArithmeticProgression(lastIndex15, 15);
    	
    	return result;

    }

    static long sumOfArithmeticProgression(int n, int d) {
    	if (n == 0) {
    		return 0;
    	}
    	long elementN = d + d * (n - 1);
    	long sum = (n * (d + elementN) / 2);
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
        int t = scanner.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = scanner.nextInt();
            System.out.println(getSumMultiples3and5(n));
        }
        
        scanner.close();
        
	}

}
