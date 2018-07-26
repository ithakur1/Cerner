package com;

import java.util.Scanner;

public class StringWOVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		
	
		
		stringWithoutVowel(s);
		

	}
	
	public static void stringWithoutVowel(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!='a'&& s.charAt(i) != 'A' && s.charAt(i) != 'e'&& s.charAt(i) != 'E'
					&& s.charAt(i) != 'i' && s.charAt(i) != 'I' && s.charAt(i) != 'o' && s.charAt(i) != 'O'
					&& s.charAt(i) != 'u'&& s.charAt(i) != 'U')
				
			
			System.out.print(""+s.charAt(i));
		}
		
		System.out.println();
	}

}
