package com.tech.FileHandling;

public class SwaptwoValues {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before swapping Two Values "+a   +b);
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("After Swapping "+a   +b);
	}

}
