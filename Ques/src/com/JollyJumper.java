package com;

public class JollyJumper {

	public static void main(String[] args) {
		int arr[] = {7,7,2,1};
		System.out.println(jollyJumper(arr));

	}

	public static String jollyJumper(int[] arr) {
		
		boolean b [] = new boolean[arr.length];
		//for(int i=0;i<arr.length;i++)
			//b[i] = false;
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++){
			int d = Math.abs(arr[i]-arr[i+1]);
			
			if(d==0 || d>arr.length-1 || b[d]== true)
				return "NOT Jolly";
			else
				b[d]=true;
		}
		return "Jolly";
	}

}
