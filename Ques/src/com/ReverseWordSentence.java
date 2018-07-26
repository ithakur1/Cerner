package com;

import java.util.Scanner;

public class ReverseWordSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String:");
		String s = sc.nextLine();
		
		String s1 = reverseWord(s);
		System.out.println(s1);

	}

	public static String reverseWord(String s) {
		String res = "";
		String temp = "";
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				temp = temp + s.charAt(i);
			}
			else {
				res = temp + " " + res;
				temp = "";
			}
		}
		return (temp + " " + res).trim();
	}
	

}
