package com;

import java.util.ArrayList;
import java.util.HashSet;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*get the next to the last word in sentence*/
		String s1 = "Riten is in MS.";
		System.out.println(nextToLastWord(s1));
		
		/*given a number reverse it and add it to itself and check if it is palindrome 
		 * repete this process and find the number of steps it took to make it palindrome*/
		int number = 156;
		System.out.println(stepToMakePalindrome(number));
		
		//print the input string without containing vowels.
		String sv = "Riten is boy.";
		printWOVowels(sv);
		
		/*Given coins of 1,3,5 find the minimum number of coins required to get the input value*/
		System.out.println(getMinNoCoin(13));
		
		/*reverse the word of the string*/
		System.out.println("Riten is boy --->  "+reverseWordOfString("Riten is boy"));
		//System.out.println(0+'a');
		
		/*int[] numbers = {6,3,8,10,1};
		int result = 0;
	    for(int i =0; i<numbers.length; i++){
	    	allCombinationSumZero(numbers, i, numbers[i], 18, result); 
	    }*/
		
		System.out.println(getDirection(3, 5, -2, 4));
		
		System.out.println(BinaryToDecimal(1111));
		
		int[] jolly = {3,3,2};
		System.out.println(jollyJumber(jolly));
		
		System.out.println(hexToDecimal("AB8"));
		System.out.println("Is Prime :"+isPrime(13));
		int[] arr1 = {1,-1,2,-3,4,-4,-2};
		System.out.println(getTotalCombination(arr1, 0, 0));
		
		System.out.println(longestRepeatedSubstring("abcfbceazbcdbc"));
	}
	
	/*get the next to the last word in sentence*/
	public static String nextToLastWord(String s){
		String[] wordArr = s.trim().split(" ");
		return wordArr[wordArr.length-2];
	}
	
	/*given a number reverse it and add it to itself and check if it is palindrome 
	 * repete this process and find the number of steps it took to make it palindrome*/
	public static int stepToMakePalindrome(int number){
		int count =0;
		int sumNumber = number;
		while(true){
			count++;
			sumNumber= sumNumber+ reverseNumebr(sumNumber);
			//System.out.println(sumNumber);
			if(isPalindrome(sumNumber))
				return count;
		}
	}
	public static boolean isPalindrome(int n){
		int temp=reverseNumebr(n);    
		if(temp==n)    
		   return true; 
		else    
		   return false;
	}
	public static int reverseNumebr(int number){
		int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
	}
	
	//print the input string without containing vowels.
	public static void printWOVowels(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != 'a' && s.charAt(i) != 'A' && s.charAt(i) != 'e'&& s.charAt(i) != 'E'
					&& s.charAt(i) != 'i' && s.charAt(i) != 'I' && s.charAt(i) != 'o' && s.charAt(i) != 'O'
					&& s.charAt(i) != 'u'&& s.charAt(i) != 'U')
				System.out.print(""+s.charAt(i));
		}
		System.out.println();
	}
	
	/*Given coins of 1,3,5 find the minimum number of coins required to get the input value*/
	public static int getMinNoCoin(int target){
		int min5Coin = 0 , min3Coin = 0, min1Coin = 0;
		min5Coin = target/5;
		min3Coin += (target - min5Coin*5) / 3;
		min1Coin += (target - (min5Coin*5 + min3Coin*3));
		
		return min5Coin+min3Coin+min1Coin;
	}
	
	/*reverse the word of the string*/
	public static String reverseWordOfString(String s){
		String result = "";
		String tmp = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				result = tmp+" "+result;
				tmp = "";
			}
			else{
				tmp += s.charAt(i); 
			}
		}
		return (tmp+" "+result).trim();
	}
	
	/*given an array of integer return the total number of possible combination sum 0*/
	/*public static int allCombinationSumZero(int[] arr, int i, int sum, int target, Integer result){
		
		for(int j = i+1; j<arr.length; j++){
	        if(sum+arr[j] == target){
	        	return 1;
	        }else{
	        	return 0+allCombinationSumZero(arr, j, sum+arr[j], target, result);
	        }
	    }
	}*/
	
	public static String getDirection(int x1,int y1,int x2,int y2){
		if(x1==x2 && y1==y2){
			return "Both are in same direction";
		}
		if(y1==y2){
			if(x2>x1)
				return "E";
			else
				return "W";
		}else if(x1==x2){
			if(y2>y1)
				return "N";
			else
				return "S";
		}else{
			if(x2>x1 && y2>y1)
				return "NE";
			else if(x2<x1 && y2>y1)
				return "NW";
			else if(x2<x1 && y2<y1)
				return "SW";
			else
				return "SE";
		}
	}
	
	public static int BinaryToDecimal(int binaryNumber){
	    int decimal = 0;
	    int p = 0;
	    while(binaryNumber != 0){
	      
	          int temp = binaryNumber%10;
	          decimal += temp*Math.pow(2, p);
	          binaryNumber = binaryNumber/10;
	          p++;
	      
	    }
	    return decimal;
	    //System.out.println("Output: "+Integer.parseInt(binaryString,2));
	  }
	
	public static String jollyJumber(int[] arr){
		boolean a [] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
			a[i] = false;
		
		for(int i=0;i<arr.length-1;i++){
			int d = Math.abs(arr[i]-arr[i+1]);
			
			if(d==0 || d > arr.length-1 || a[d]==true)
				return "Not Jolly";
			else
				a[d]=true;
		}
		//if()
		return "Jolly";
	}
	
	public static int hexToDecimal(String hex){  
	    String digits = "0123456789ABCDEF";  
         hex = hex.toUpperCase();  
         int val = 0;  
         for (int i = 0; i < hex.length(); i++)  
         {  
             char c = hex.charAt(i);  
             int d = digits.indexOf(c);  
             val = 16*val + d;  
         }  
         return val;  
	}
	
	public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
      
        // Check from 2 to n-1
        for (int i = 2; i <n; i++)
            if (n % i == 0)
                return false;
      
        return true;
    }
	
	/*public static boolean subSetDP(int[] A, int sum) {
		boolean[][] solution = new boolean[A.length + 1][sum + 1];		
		// if sum is not zero and subset is 0, we can't make it 
		for(int i=1;i<=sum;i++){
			solution[0][i]=false;
		}
		// if sum is 0 the we can make the empty subset to make sum 0
				for(int i=0;i<=A.length;i++){
					solution[i][0]=true;
				}
		//
		for(int i=1;i<=A.length;i++){
			for(int j=1;j<=sum;j++){				
				//first copy the data from the top
				solution[i][j] = solution[i-1][j];
				
				//If solution[i][j]==false check if can be made
				if(solution[i][j]==false && j>=A[i-1])
					solution[i][j] = solution[i][j] || solution[i-1][j-A[i-1]];				
			}
		}		
		return solution[A.length][sum];
	}*/
	int result = 0;
	public static int getTotalCombination(int[] arr, int k, int target){
		
		if(k==arr.length)
			return 0;
		if(arr[k] == target){
			//System.out.print(arr[k]);
			return 1;
		}
		else{
			return getTotalCombination(arr, k+1, target) + getTotalCombination(arr, k+1, target-arr[k]);
		}
		
	}
	/*public static ArrayList<ArrayList<Integer>> getTotalCombination(int[] arr, int k, int target){
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> aa = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> s = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> t = new ArrayList<ArrayList<Integer>>();
		if(k==arr.length)
			return aa;
		if(arr[k] == target){
			System.out.print(arr[k]);
			a.add(arr[k]);
			aa.add(a);
			return aa;
		}
		else{
			s = getTotalCombination(arr, k+1, target);
			t = getTotalCombination(arr, k+1, target-arr[k]);
			System.out.println(s);
			System.out.println(t);
			for(int i=0;i<t.size();i++)
				s.add(t.get(i));
		}
		
		return s;
		
	}*/
	public static String longestRepeatedSubstring(String s){
		int n = s.length();
		int[][] L = new int[n+1][n+1];
		
		for(int i=0;i<n+1;i++)
			for(int j=0;j<n+1;j++)
				L[i][j] =0;
		String res = "";
		int res_length = 0, index=0;
		
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++){
				if(s.charAt(i-1)==s.charAt(j-1) && L[i-1][j-1]<(j-i)){
					L[i][j] = L[i-1][j-1]+1;
					
					if(L[i][j] > res_length){
						res_length = L[i][j];
						index = Math.max(i, index);
					}
				}
				else
					L[i][j] = 0;
			}
		}
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				System.out.print(L[i][j]);
			}
			System.out.println();
		}
		if(res_length > 0){
			for(int i=index - res_length+1;i<=index;i++)
			{
				res = res+s.charAt(i-1);
			}
		}
		return res;
	}

}