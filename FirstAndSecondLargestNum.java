package com.tech.FileHandling;

public class FirstAndSecondLargestNum {

	public static void main(String[] args) {
		int [] inputArray = {1,2,3,4,5};
		int FirstLargestNum =0;
		int SecondLargestNum=0;
		
		for(int i=0; i<inputArray.length; i++) {
			if(FirstLargestNum<inputArray[i]) {
				SecondLargestNum=FirstLargestNum;
				FirstLargestNum=inputArray[i];
			}else if (SecondLargestNum<inputArray[i]) {
				SecondLargestNum=inputArray[i];
			}
		}
		System.out.println("FirstLargest Number :" +FirstLargestNum + " Second Largest Num: "+SecondLargestNum);
	}

}
