package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class ArraySum {
	
	
	
	public static void main(String args[]) {
		
		Hashtable ht = new Hashtable();
		ht.put("A", new Integer(10));
		ht.put("C", new Integer(12));
		ht.put("E", new Integer(14));
		
		int[] A;
		//A[0] = 0;
		ht.remove(new String("E"));
		System.out.println(ht);
		int ar1[] = {6,7};
		boolean a = true;
		boolean b = false, d = true;
		
		boolean c = d && a | b;
		Class ad;
		sd aa = new sd();
		
		
		ad = aa.getClass();
		System.out.println(ad.getSuperclass());
		
		System.out.println(c);
//		System.out.println(Arrays.equals(ar1, ar2));
		
//		int arr[] = {1,-3,2,-1,5,6,-4,-2};
//		int target = 0;
//		psvm(arr, new ArrayList<>(), 0, target, 0);
//		String s = "";
//		s.toLower
	}
	
	public static void indentation(int n) {
		for(int i =0;i<n; i++){
			System.out.print("    ");
		}
	}
	
	
	public static void psvm(int[] arr, ArrayList<Integer> choosen, int curr_sum, int target, int index) {
		indentation(choosen.size());
		System.out.println("Function(currsum= " + curr_sum +" ,index= "+index+", choosen.size= "+choosen.size()+")");
		if(target == curr_sum && choosen.size() == 4) {
			System.out.println(Arrays.toString(choosen.toArray()));
			return;
		}
		if(choosen.size() == 4 || index == arr.length){
			return;
		}
		//{1,-3,2,-1,5,6,-4,-2};
		int curr = arr[index];
		choosen.add(curr);
		psvm(arr, choosen, curr_sum+curr, target, index+1);
		choosen.remove(choosen.size()-1);
		psvm(arr, choosen, curr_sum, target, index+1);

	}
	
	

}

class sd extends ssd{ 
	
}

class ssd {
	
}

