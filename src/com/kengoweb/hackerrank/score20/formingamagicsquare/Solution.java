package com.kengoweb.hackerrank.score20.formingamagicsquare;

import java.util.Scanner;

public class Solution {

	static int[][][] magicSquares = {
		            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
		            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
		            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
		            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
		            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
		            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
		            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
		            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};
	
	static int formingMagicSquare(int[][] s) {

		int maxMovements = 999;
		
		for (int i = 0; i < magicSquares.length; i++) {
			int[][] magicSquare = magicSquares[i];
			int movements = calculateMovements(s, magicSquare);
			if (movements < maxMovements) {
				maxMovements = movements;
			}
		}
		
		return maxMovements;

    }

    static int calculateMovements(int[][] s, int[][] magicSquare) {
    	int movements = 0;
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
    			movements += Math.abs(s[i][j] - magicSquare[i][j]);
    		}
    	}
		return movements;
	}

	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        
        System.out.println(result);
        
        scanner.close();
        
	}

}
