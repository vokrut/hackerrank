package com.kengoweb.hackerrank.score20.pickingnumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    	int maxLengthSubarray = 1;
    	
    	Collections.sort(a);
    	for (int i = 0; i < a.size() - 1; i++) {
    		int lengthSubarray = 1;
    		for (int j = i + 1; j < a.size(); j++) {
    			if (Math.abs(a.get(i) - a.get(j)) <= 1) {
    				lengthSubarray++;
    			} else {
    				break;
    			}
    		}
    		if (lengthSubarray > maxLengthSubarray) {
    			maxLengthSubarray = lengthSubarray;
    		}
    	}
    	
    	return maxLengthSubarray;
    }

}

public class Solution {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);
        
        System.out.println(result);
        
        bufferedReader.close();
        
	}

}
