package com.ananya;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementwithSet {

	public static void main(String[] args) {
		System.out.println("Welcome to the HashSet method");
		int []a = {1,2,2,4,5,6,6};
		System.out.println("printing the array");
		
		
		int distinctNo = distinctNumber(a);
		System.out.println("res is: " + distinctNo);

	}

	private static int distinctNumber(int[] a) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		for(int el: a)
		{
			set.add(el);
		}
		
		return set.size();
	}

}
