package com.ananya;

public class FlowerGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		patternFlower(3);
	}

	private static void patternFlower(int n) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[n][2*n];
		int x, cnt;
		for(int i = 0; i < n; i++)
		{
			cnt = 0;
			x = 64+n;
			for(int j =0; j<n;j++)
			{
				arr[i][j] =x;
				if(cnt<i)
				{
					cnt++;
					x--;
				}
					
			}
		}
		//update right half of array by using left half
		//as right half id mirror ofleft half of array
		for(int i =0; i<n;i++)
		{
			int k =1;
			for(int j=n; j<2*n; j++)
			{
				arr[i][j] = arr[i][j-k];
				k = k+2;
			}
		}
		//print upper half
		for(int i =0; i<n;i++)
		{
			for(int j = 0; j<2*n; j++)
			{
				System.out.print((char)arr[i][j]);
			}
			System.out.println();
		}
		//print lower half by reversing the array
		// as lower half is mirror image of upper half
		for(int i = n-1; i>=0; i--)
		{
			for(int j =0; j<2*n; j++)
			{
				System.out.print((char)arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
