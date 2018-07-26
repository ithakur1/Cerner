package com;
import java.util.Scanner;

public class HextoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hex number :");
		String s = sc.nextLine();
		
		System.out.println("The decimal number is :"+getHexToDecimal(s));
		

	}

	public static int getHexToDecimal(String s) {
		
		String digits = "0123456789ABCDEF";
		int val = 0;
		String  hex = s.toUpperCase();
		
		for(int i=0;i<s.length();i++){
			
			char c = hex.charAt(i);
			int digit = digits.indexOf(c);
			val = 16*val + digit;
			
		}
	
		
		return val;
	}
	
	public static String decimalToHex(int decimal){    
	     int rem;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	    while(decimal>0)  
	     {  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
	     }  
	    return hex;  
	}    

}
