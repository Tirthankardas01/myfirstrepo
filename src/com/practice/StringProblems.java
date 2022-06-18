package com.practice;

public class StringProblems {

	public static void main(String[] args) {

		String s = "aaaa";
		String s1="";
		String test="";
		
		//Output: a2b3c4
		char [] test1 = s.toCharArray();
		
		for (int i=0; i<test1.length; i++) {
			
			
			int count=1;
			
			
			for (int j=i+1; j<test1.length; j++) {
				
				if (s.charAt(i) == s.charAt(j)) {
					count++;//4
					
					//test1[j]='0';
					s1=String.valueOf(count);
					test+=s.charAt(i)+s1;
				
					
				}
				
				
			}
			//test+=s.charAt(i)+s1;
		}
		System.out.println(test);
		
		
	}

}
