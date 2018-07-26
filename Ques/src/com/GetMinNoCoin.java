package com;

import java.util.Scanner;

public class GetMinNoCoin {
	
	//you are given 3 coins of value 1, 3 and 5. 
	//You are also given a total which you have to arrive at. 
	//Find the minimum number of coins to arrive at it. 

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the target");
		int target = sc.nextInt();
		
		int result = getMinNoCoin(target);
		System.out.println("Min number of coins needed: "+result);

	}

	public static int getMinNoCoin(int target) {
		int min5=0;
		int min3 = 0;
		int min1=0;
		if(target == 0)
			return -1;
		else 
		{min5 = target/5;
		min3 = (target-min5*5)/3;
		min1 = (target-(min5*5 + min3*3));
			
		}
		return min5+min3+min1;
	}

}
