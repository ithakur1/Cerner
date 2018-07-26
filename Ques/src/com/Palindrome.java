package com;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		
		
		System.out.println("The count to check if the number is palindrome :" + toCalcSum(num));
		
	}
	
	public static int toCalcSum(int number){
		int count = 0;
		int sumNum = number;
		while (true){
			count++;
			sumNum = sumNum + reverse(sumNum); 
			System.out.println("Sum "+sumNum);
		
			if(isPalindrome(sumNum))
			return count;
		}
		}

	
	public static boolean isPalindrome(int n){
		int temp=reverse(n);  
		System.out.println(temp == n);
		if(temp==n)    
		   return true; 
		else    
		   return false;
	}

	public static int reverse(int num) {
		int reverse = 0;
		while(num != 0){
			reverse = (reverse*10) + (num%10);
			num = num/10;
		}
		System.out.println(reverse);
		return reverse;
	}

}
