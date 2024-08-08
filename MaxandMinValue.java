package com.tech.FileHandling;

public class MaxandMinValue {

	public static void main(String[] args) {
		int [] inputArray= {2,4,6,9,70,46,78,35,78,90,1234,678};
		
		
		int MaxValue=inputArray[0];
		int MinValue=inputArray[0];
		
		for(int i=0; i<inputArray.length; i++) {
			if(MaxValue<inputArray[i]) {
				MaxValue=inputArray[i];
			}else if (MinValue>inputArray[i]) {
				MinValue=inputArray[i];
			}
		}
		System.out.println("Maximum Value: " +MaxValue + "  Minimum Value: "+ MinValue);

	}

}
