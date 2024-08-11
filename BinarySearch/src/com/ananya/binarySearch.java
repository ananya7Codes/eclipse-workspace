package com.ananya;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		// perfoming binary search
		 int low = 0;
		 int high = intArray.length - 1;
		 int mid = (low + high) / 2;
		 
		 Scanner sc = new Scanner(System.in);
	     System.out.println("input the number needs to be searched ");
	     int key = sc.nextInt();
		 sc.close();
		 while(high >= low)
		 {
			 
		 if(intArray[mid] == key) 
			 {
			  	System.out.println("Found it at this poistion in array: " + mid);
			  	break;		 
			 }
		 else if (key > intArray[mid]) low = mid + 1;
			 
		 else high = mid -1;
		 
		 }		 
		//System.out.println("element not found in the ");

	}

}
