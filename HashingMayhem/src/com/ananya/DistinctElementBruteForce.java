package com.ananya;

public class DistinctElementBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the brute force method");
		int []a = {1,2,2,4,5,6,6};
		System.out.println("printing the array");
		
		
		int distinctNo = distinctNumber(a);
		System.out.println("res is: " + distinctNo);
		

	}

	private static int distinctNumber(int a[]) {
		// TODO Auto-generated method stub
		int index = 0;
		int res = 0;
		for(int i = 0; i <a.length; i++)
		{
			int flag = 0;
			//System.out.println("Element in i loop: "+ a[i]);
			
			for(int j =0; j<i; j++)
			{
			//	System.out.println("Element in j loop: "+ a[j]);
				if(a[i] != a[j]) 
				{
					flag = flag+1;
			//		System.out.println("flag: " + flag);
					break;
					
				}
			}
			if (flag == 0){   
                index++;    //increment index value  
            } 
			res = flag;
		}
		
			
		return res;
	}

}
