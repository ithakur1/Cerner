package com;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySumCount {
	
	
	
	public static void main(String args[]) {
		int arr[] = {1,-3,2,-1,5,6,-4,-2};
		System.out.println(psvm(arr, new ArrayList<>(), 0, 0, 0));
	}
	
	public static void indentation(int n) {
		for(int i =0;i<n; i++){
			System.out.print("    ");
		}
	}
	
	
	public static int psvm(int[] arr, ArrayList<Integer> choosen, int sum, int target, int index) {
		indentation(choosen.size());
		System.out.println("Function(currsum= " + sum +" ,index= "+index+", choosen.size= "+choosen.size()+")");
		if(target == sum && choosen.size() == 4) {
			System.out.println(Arrays.toString(choosen.toArray()));
			return 1;
		}
		if(choosen.size() == 4 || index == arr.length){
			return 0;
		}
		int curr = arr[index];
		int counter = 0;
		choosen.add(curr);
		counter += psvm(arr, choosen, sum+curr, target, index+1);
		choosen.remove(choosen.size()-1);
		counter += psvm(arr, choosen, sum, target, index+1);
		return counter;

	}
	
	

}


