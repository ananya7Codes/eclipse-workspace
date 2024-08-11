package com.ananya;

import java.util.ArrayList;
import java.util.HashMap;

public class packagingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello!");
		int[] parcels = {2,3,6,10,11};
		int k = 9;
		
		int cost = getMinCost(parcels, k);
		System.out.println("ans: "+ cost);

	}

	private static int getMinCost(int[] parcels, int k) {
		// TODO Auto-generated method stub
		int count_parcels = parcels.length;
		if (count_parcels == k)
			return 0;
		HashMap<Integer, Integer> parcels_item = new HashMap<>();
		for(int i =0; i< k; i++)
		{
			System.out.println("value of k: "+ k + "size of hashmap: " +parcels_item.size() );
			parcels_item.put(parcels[i], 1);
		}
		int transport_cost = 0;
		int j = 1;
		while(j<=k && count_parcels!=k)
		{
			for(int i =0; i<=count_parcels; i++)
			{
				if(j!= parcels_item.get(i))
				{
					parcels_item.put(j, 1);
					transport_cost = transport_cost + j;
					count_parcels = count_parcels + 1;
				}
				j = j+1;
			}
			
		}
		
		return transport_cost;
	}

}
