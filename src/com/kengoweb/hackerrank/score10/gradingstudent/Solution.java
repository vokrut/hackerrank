package com.kengoweb.hackerrank.score10.gradingstudent;

import java.util.Scanner;

public class Solution {

	static int[] gradingStudents(int[] grades) {
		int[] result = new int[grades.length];
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 38) {
				result[i] = grades[i];
			} else {
				result[i] = convertGrade(grades[i]);
			}
		}
		
        return result;
    }

    private static int convertGrade(int grade) {
    	if (grade % 5 == 0) {
    		return grade;
    	}
    	int multiply5 = grade / 5;
    	int nextGrade = 5 * (multiply5 + 1);
    	int diff = nextGrade - grade;
    	if (diff < 3) {
    		return nextGrade;
    	} else {
    		return grade;
    	}
	}

	private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int n = Integer.parseInt(scanner.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scanner.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
        	System.out.println(result[resultItr]);
        }
        
        scanner.close();
        
	}

}
