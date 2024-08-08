package com.tech.FileHandling;

public class FirstNumSecondNum {

	public static void main(String[] args) {
		int [] inputArray= {1,2,3,4,5,6,7,8,9,10};
		
		int firstNum=0;
		int secondNum=0;
		
		for(int i=0; i<inputArray.length; i++) {
			if(firstNum<inputArray[i]) {
				secondNum=firstNum;
				firstNum=inputArray[i];
			}else if (secondNum<inputArray[i]) {
				secondNum=inputArray[i];
			}
		}
		System.out.println("Largest Num "+ firstNum);
		System.out.println(secondNum);
	}

}
