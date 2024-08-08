package com.tech.FileHandling;

public class FibnocciesSeries {

	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=1; i<=10; i++) {
			int c=a+b;
			System.out.println("Fibnocies Values "+c);
			a=b;
			b=c;
		}
	}

}
