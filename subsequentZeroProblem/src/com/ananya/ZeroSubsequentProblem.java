package com.ananya;

import java.util.Arrays;


//doesn't work as intended
public class ZeroSubsequentProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 0, -2};
		int n = 0;
        System.out.println(countSubSeq(a));

	}

	 static int countSubSeq(int A[]) {
		// TODO Auto-generated method stub
		 // Base case
		 int z =0 , x=0, y=0, ans=0;
		 Arrays.sort(A);
	        for (int i = 1 ; i < A.length ; i++)
	        {
	        	if(A[i] == 0) 
	        		{
	        		z++;
	        		System.out.println("z: " + z);
	        		}
	        	else if(A[i] < 0) 
	        		{
	        		x++;
	        		System.out.println("x: " + x);
	        		}
	            else {
	            	y++;
	            	System.out.println("y: " + y);
	            }
	        	
	        }
	       // System.out.println("before ans: " + ans);
	        ans += (z-1)*(x-1);
	        //System.out.println("after ans: " + ans + "x: " + x + "z: " +z);
	        ans += ((1<<((long)y))-1)*((1<<((long)z))-1);
	        //System.out.println("after ans2: " + ans + "z: " + z + "y: " +y);
	        ans += ((1<<((long)z))-1);
	        //System.out.println("x:" +x + "y: " + y+ " z: " + z);
	        
	        return ans;

}
}
