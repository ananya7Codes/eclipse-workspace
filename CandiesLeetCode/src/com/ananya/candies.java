package com.ananya;

import java.util.ArrayList;
import java.util.List;

public class candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets crack this!");
		int[] k = {2,3,5,1,3};
		int extra = 3;
		int s =5;
		
		List<Boolean> ans = new ArrayList<>(s);
		try {
			ans = kidsWithCandies(k, extra);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("res: " + ans);
		
		
		
		
		
		
	}

	    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        
	       //Arrays.sort(candies);
	        int s = candies.length;
	        //int[] new_candies = new int[s];
	       List<Boolean> ans = new ArrayList<>(s);
	        //boolean[] ans = new boolean[s];
	       int max = 0;
	        
	        for(int i =0; i< s; i++)
	        {
	            if (candies[i] > max)
	            {
	            	max = candies[i];
	            }
	        }
	        
	           
	           
	            for(int j=0; j<s; j++)
	           {
	               
	        	   int c = candies[j] + extraCandies;
	        	   if(c>= max)
	        	   {
	        		   ans.add(j,true);
	        	   }
	        	   else
	        	   {
	        		   ans.add(j, false);
	        	   }
	        	   
	               
	           }
	            
	        return ans;
	        
	        
	    }

}
