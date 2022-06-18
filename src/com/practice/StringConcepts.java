package com.practice;

public class StringConcepts {

	public static void main(String [] args) {
		
		String str = "Tirthankar";
		StringBuilder sb = new StringBuilder(str);
		String str1 = sb.reverse().toString();
		System.out.println(str1);
		
		System.out.println("*************************************");
		
		char [] ch = str.toCharArray();
		
		for (int i = ch.length-1; i>=0; i--) {
			
			System.out.append(ch[i]);
			
		}
		System.out.println();
		
		String a = "hello";
		String b = "java";
		
		System.out.println(a.length()+b.length());
		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1,a.length()));
	}
}
