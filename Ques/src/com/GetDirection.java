package com;

import java.util.Scanner;

public class GetDirection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the x1 coordinate :");
		int x1 = sc.nextInt();
		System.out.println("Enter the y1 coordinate :");
		int y1 = sc.nextInt();
		System.out.println("Enter the x2 coordinate :");
		int x2 = sc.nextInt();
		System.out.println("Enter the y2 coordinate :");
		int y2 = sc.nextInt();
		
		System.out.println("The direction is :" + getDirection(x1,y1,x2,y2));
		

	}

	public static String getDirection(int x1, int y1, int x2, int y2) {
		if(x1==x2 && y1==y2){
			return "here";
		}
		else if(y1==y2){
			if(x2>x1)
				return "E";
				else
				return "W";	
		}else if (x1==x2){
			if(y2>y1)
				return "N";
			else
				return "S";
		}else if(x2<x1 && y2>y1)
			return "NW";
		else if(x2>x1 && y2>y1)
			return "NE";
		else if(x2<x1 && y2<y1 )
			return "SW";
		else
		return "SE";
	}

}
