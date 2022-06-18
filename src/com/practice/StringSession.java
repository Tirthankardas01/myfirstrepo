package com.practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSession {

	public static void main (String [] args) {

		String s = "welcomejava";
		int k=3;
		
		List <String> l1 = new ArrayList<String>();
		
		for (int i=0; i<=s.length()-k; i++) {

			l1.add(s.substring(i, i+k));
			
		}
		
		Collections.sort(l1);
		
		String smallest = l1.get(0);
		String  largest = l1.get(l1.size()-1);
		
		System.out.println(smallest);
		System.out.println();
		System.out.println(largest);
		

	
	
	
	
	}
	
}
		
		
