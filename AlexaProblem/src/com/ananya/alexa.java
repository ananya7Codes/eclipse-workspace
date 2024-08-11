package com.ananya;

import java.util.stream.IntStream;

public class alexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Welcome to the alexa problem");
      int[] k = {-1,2,3};
      int n = 3;
      int temp_avg = max_agg_temp_change(n,k);
      System.out.println(temp_avg);	
		
		
	}

	private static int max_agg_temp_change(int n, int[] k) {
		// TODO Auto-generated method stub
		
		if (n ==1)
		{
			return k[0];
		}
		
		int left = k[0];
		int right = IntStream.of(k).sum();
		//int right =0;
		//for(int i =1; i< k.length;i++)
	//	{
	//		right = right + k[i];
//		}
		
		int temp_right_now = Math.max(left,right);
		int max_temp_change = temp_right_now;
		
		for(int i=1; i <n; i++)
		{
			left = left + k[i];
			right = right - k[i-1];
			temp_right_now = Math.max(left, right);
			if(temp_right_now > max_temp_change)
			{
				max_temp_change = temp_right_now;
			}
		}
		
		
		
		return max_temp_change;
	}

}
