package com.ananya;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to be checked");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		//System.out.println("hi");
		while (num > 0)
		{
		//	System.out.println("hi2");
			int n = num%10;
			sum = sum *10 + n;
			num = num/10;
		}
		
       if (temp == sum)
       {
    	   System.out.println("Number is Palindrome");
       }
       else
       {
    	   System.out.println("Number is not Palindrome");
       }
	}

}
