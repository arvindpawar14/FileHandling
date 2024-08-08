package com.tech.FileHandling;

public class FindDuplicateArray {

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 45 };
//		
//		HashSet<Integer> DuplicateNum=new HashSet<>();
//		for(Integer num:inputArray) {
//			if(!DuplicateNum.add(num)) {
//				System.out.println("Duplicate Numbers Are "+ num);
//			}
//		}
//		
		int MaxValue=inputArray[0];
		int MinValue=inputArray[0];
		
		for(int i=0; i<inputArray.length; i++) {
			if(MaxValue<inputArray[i]) {
				MaxValue=inputArray[i];
			}else if (MinValue>inputArray[i]) {
				MinValue=inputArray[i];
			}
		}
		System.out.println(MaxValue);
		System.out.println(MinValue);
	}
}
