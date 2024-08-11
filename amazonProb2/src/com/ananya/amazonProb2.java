package com.ananya;

public class amazonProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lets crack this!");
		int[] k = {3,1,1,1,1,1};
		int res = findAverage(k);
		System.out.println("res: " + res);

	}

	private static int findAverage(int[] k) {
		// TODO Auto-generated method stub
		int len = k.length;
		int r[];
		
		int left = k[0];
		int right_sum = 0;
		int j =0;
		
		for(int i =1; i< len; i++)
		{
		  right_sum = right_sum + k[i];
		  j = i;
		  
		}
		
		int right_avg  = right_sum / j;
		System.out.println("right avg: "+ right_avg);
		int diff = Math.abs(left - right_avg);
		int res_before = diff;
		
		for (int i = 1; i <len; i++)
		{
			int left_sum = left + k[i];
			int left_avg = left_sum / (i+1);
			int right_total = right_sum - k[i-1];
			right_avg = right_total/(len-i -1);
			diff = left_avg - right_avg;
			int res_current = Math.abs(diff);
			System.out.println("i: " + i + " left_avg :" + left_avg + " right_avg: " + right_avg + " res_current: " + res_current);
			
			if(res_current > res_before)
			{
				return i;
			}
		}
		
		return 1;
	}

}
