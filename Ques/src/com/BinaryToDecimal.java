package com;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number :");
		int num = sc.nextInt();
		
		System.out.println("The decimal number is :"+ binaryToDecimal(num));
	}

	public static int binaryToDecimal(int num) {
		int decimal = 0;
		int p = 0;
		while(num!=0){
			int temp = num%10;
			decimal = (int) (decimal + temp*Math.pow(2, p));
			num = num / 10;
			p++;
			
		}
		return decimal;
	}

}
