package com.kengoweb.hackerrank.score25.java1darraypart2;

import java.util.Scanner;

public class Solution {

	public static boolean canWinEasyMoveFirst(int leap, int[] game) {
		boolean hasNextMove = true;
        boolean result = true;
        boolean hasMoveBackward = false;
        int currentIndex = 0;
        int indexStartBackward = 0;
        int gameSize = game.length;
        while (hasNextMove) {
        	int nextMoveWithLeap = currentIndex + leap;
        	if ((nextMoveWithLeap >= gameSize) ||
            		(currentIndex == gameSize - 1)) {
                break;
            }
        	
        	int nextMove = currentIndex + 1;
            if (!hasMoveBackward) {
	            if (game[nextMove] == 0) {
	                currentIndex = nextMove;
	                continue;
	            }
            }
            
            if (game[nextMoveWithLeap] == 0) {
            	if (hasMoveBackward) {
            		if (nextMoveWithLeap > indexStartBackward) {
            			hasMoveBackward = false;
                		indexStartBackward = 0;
            		} else {
            			result = false;
            			break;
            		}
            	}
                currentIndex = nextMoveWithLeap;
                continue;
            }
            
            nextMove = currentIndex - 1;
            if (nextMove < 0) {
                result = false;
                break;
            }
            if (game[nextMove] == 0) {
            	if (!hasMoveBackward) {
            		indexStartBackward = currentIndex;
            	}
            	hasMoveBackward = true;
                currentIndex = nextMove;
                continue;
            }
            hasNextMove = false;
            result = false;
        }
        return result;
    }
	
	public static boolean canWinLeapFirst(int leap, int[] game) {
		boolean hasNextMove = true;
        boolean result = true;
        boolean hasMoveBackward = false;
        int currentIndex = 0;
        int indexStartBackward = 0;
        int gameSize = game.length;
        while (hasNextMove) {
        	int nextMoveWithLeap = currentIndex + leap;
            if ((nextMoveWithLeap >= gameSize) ||
            		(currentIndex == gameSize - 1)) {
                break;
            }
            if (game[nextMoveWithLeap] == 0) {
            	if (hasMoveBackward) {
            		if (nextMoveWithLeap > indexStartBackward) {
            			hasMoveBackward = false;
                		indexStartBackward = 0;
            		} else {
            			result = false;
            			break;
            		}
            	}
                currentIndex = nextMoveWithLeap;
                continue;
            }
            
        	int nextMove = currentIndex + 1;
            if (!hasMoveBackward) {
	            if (game[nextMove] == 0) {
	                currentIndex = nextMove;
	                continue;
	            }
            }
            
            nextMove = currentIndex - 1;
            if (nextMove < 0) {
                result = false;
                break;
            }
            if (game[nextMove] == 0) {
            	if (!hasMoveBackward) {
            		indexStartBackward = currentIndex;
            	}
            	hasMoveBackward = true;
                currentIndex = nextMove;
                continue;
            }
            hasNextMove = false;
            result = false;
        }
        return result;
    }
	
	public static boolean canWin(int leap, int[] game) {
		boolean result = canWinEasyMoveFirst(leap, game);
		if (!result && leap > 1) {
			result = canWinLeapFirst(leap, game);
		}
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
	}

}
