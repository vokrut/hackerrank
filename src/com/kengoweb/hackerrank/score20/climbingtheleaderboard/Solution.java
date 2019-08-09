package com.kengoweb.hackerrank.score20.climbingtheleaderboard;

import java.util.Scanner;

public class Solution {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {

		int[] alicePlaces = new int[alice.length];
	
		int lastCheckedPosition = 0;
		int placeInScores = 1;
		int previousScore = scores[0];
		
		for (int i = alice.length - 1; i >= 0; i--) {
			int currentAliceScore = alice[i];
			boolean positionFounded = false;
			for (int j = lastCheckedPosition; j < scores.length; j++) {
				if (scores[j] != previousScore) {
					placeInScores++;
					previousScore = scores[j];
				}
				if (currentAliceScore >= scores[j]) {
					lastCheckedPosition = j;
					alicePlaces[i] = placeInScores;
					positionFounded = true;
					break;
				}
			}
			if (!positionFounded) {
				alicePlaces[i] = placeInScores + 1;
				lastCheckedPosition = scores.length;
			}
		}
		
		return alicePlaces;

    }

	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);
        
        for (int i = 0; i < result.length; i++) {
        	System.out.print(result[i]);
        	if (i != result.length - 1) {
        		System.out.print(" ");
            }
        }
        
        scanner.close();
        
	}

}
