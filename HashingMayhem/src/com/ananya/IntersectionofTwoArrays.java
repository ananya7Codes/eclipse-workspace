package com.ananya;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the HashSet method");
		int []a = {5,10,15,5,10};
		//System.out.println("printing the array");
		
		int []b = {15,10,4}
;		int distinctNo = distinctNumber(a,b);
		System.out.println("res is: " + distinctNo);


	}

	private static int distinctNumber(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for(int el: a)
		{
			set.add(el);
		}
		for(int elem: b)
		{
			if(set.contains(elem))
			{
				count = count+1;
				set.remove(elem);
			}
			
		}
		
		return count;
	}

}
