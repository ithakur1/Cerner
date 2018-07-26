package com;

import java.util.Scanner;

public class NextToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String res = sc.nextLine();
		
		String word = nextToLast(res);
		System.out.println(word);
	}

	public static  String nextToLast(String res) {
		String wordArr[] = res.trim().split(" ");
		return wordArr[wordArr.length-2];
	}

}
