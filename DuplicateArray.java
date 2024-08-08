package com.tech.FileHandling;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] inputArray = { 2, 4, 6, 9, 70, 46, 78, 35, 78, 90, 1234, 678,1,3,5,2,6,7,8 };

		HashSet<Integer> Dupnumber=new HashSet<>();
		for(Integer number:inputArray) {
			if(!Dupnumber.add(number)) {
				System.out.println("Duplicate Element Found "+ number);
			}
		}
	}

}
