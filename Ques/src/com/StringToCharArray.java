package com;

public class StringToCharArray {

	public static void main(String[] args) {
		String s = "0 0 1 5";
		char c[] = s.toCharArray();
		int x1 = Character.getNumericValue(c[0]);
		int y1 = Character.getNumericValue(c[2]);
		int x2 = Character.getNumericValue(c[4]);
		int y2 = Character.getNumericValue(c[6]);
		
		System.out.println(getDirection(x1,y1,x2,y2));

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
