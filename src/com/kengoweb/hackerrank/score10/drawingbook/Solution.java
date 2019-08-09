package com.kengoweb.hackerrank.score10.drawingbook;

import java.util.Scanner;

public class Solution {

	static int pageCount(int n, int p) {
        return Math.min(turnPagesFromStart(n, p), turnPagesFromEnd(n, p));
    }

	static int turnPagesFromStart(int n, int p) {
		if (p == 1) {
			return 0;
		}
		int result = 1;
		while (result * 2 + 1 < p) {
			result++;
		}
		return result;
	}

	static int turnPagesFromEnd(int n, int p) {
		int lastPage = n % 2;
		if (p + lastPage >= n) {
			return 0;
		}
		int result = 1;
		while (n - result * 2 - lastPage > p) {
			result++;
		}
		return result;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
