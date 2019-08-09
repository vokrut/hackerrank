package testtasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
	
	private static List<Integer> listTotal = new ArrayList<>();
	
    public static void main(String[] args) {
    	add(new int[]{1, 2, 3});
        System.out.println(contains(9));
        add(new int[]{4});
        System.out.println(contains(9));
        add(new int[]{9});
        System.out.println(contains(9));
        
        Random randomGenerator = new Random();
        int size = 100000;
        int[] addInt = new int[size];
        for (int i = 0; i < size; i++) {
        	addInt[i] = randomGenerator.nextInt(size);
        }
        add(addInt);
        System.out.println(contains(99));
    }

	private static boolean contains(Integer sum) {
		printList();
		return listTotal.contains(sum);
	}
	
	private static void add(int[] list) {
		System.out.println("add: " + list.length);
		for (int i = 0; i < list.length; i++) {
			listTotal.add(list[i]);
		}
	}
	
	private static void printList() {
		for (int i = 0; i < listTotal.size(); i++) {
			System.out.print(listTotal.get(i) + ", ");
		}
		System.out.println("");
	}
}
