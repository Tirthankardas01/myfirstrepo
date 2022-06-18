package com.practice;

import java.util.Scanner;

public class HelloWorldWithoutLoops {

	
	public static void printHelloWorld(int count) {
	
		if (count<5) {
			System.out.println("Hello World");
			count++;
			printHelloWorld(count);
		}
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		printHelloWorld(num);
	}

}
