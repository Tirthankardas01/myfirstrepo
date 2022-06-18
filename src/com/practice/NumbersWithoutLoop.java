package com.practice;

public class NumbersWithoutLoop {

	public static void printHelloWorld(int temp) {

		if (temp>0) {
			printHelloWorld(temp-1);
			System.out.println(temp);
			
		}
		
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHelloWorld(10);

	}

}
