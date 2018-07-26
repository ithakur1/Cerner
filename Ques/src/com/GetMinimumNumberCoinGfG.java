package com;

import java.util.Scanner;

public class GetMinimumNumberCoinGfG {

	public static void main(String[] args) {
	 int coins[] = {5,3,1};
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Target:");
	 int V = sc.nextInt();
	 int length = coins.length;
	 
	 System.out.println("The minimum num of coins needed :"+ minCoin(coins,length,V));

	}
	// length is size of coins array (number of different coins)
	public static int minCoin(int[] coins, int length, int V) {
		if(V == 0)
			return 0;	
	    // Initialize result
		int res = Integer.MAX_VALUE;
		
		for(int i=0;i<length;i++){
			if(coins[i] <= V){
				int sub_res = minCoin(coins, length, V-coins[i]);
				
				 // Check for INT_MAX to avoid overflow and see if
	             // result can minimized
				if(sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
					res = sub_res + 1;
			}
		}
		return res;
	}

}
