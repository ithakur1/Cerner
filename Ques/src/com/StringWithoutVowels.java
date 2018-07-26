package com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringWithoutVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		
	
		
	String ans = 	stringWithoutVowel(s);
	System.out.println(ans);

	}

	public static String stringWithoutVowel(String s) {
		
		Character vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		
		List<Character> list = Arrays.asList(vowels);
		
		StringBuffer sb = new StringBuffer(s);
		
		for(int i=0;i<sb.length();i++){
			if(list.contains(sb.charAt(i))){
				sb.replace(i, i+1, "");
			i--;
			}
		}
		
		return sb.toString();
	}

}
