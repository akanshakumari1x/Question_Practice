package com.akan.questions;

import java.util.ArrayList;
import java.util.List;

public class MissingNo {
	
	static ArrayList<Integer>missingNum(int[]arr) {
		
		int n = arr.length;
		int repeat = -1;
		int missing = -1;
		int fre[] = new int[n+1];
		
		for(int i=0;i<n;i++) {
			fre[arr[i]]++;
		}
		for(int i=1; i<=n; i++) {
			if(fre[i]==0) {
				missing = i;
			}
			else if(fre[i]==2) {
				repeat = i;
			}
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		res.add(repeat);
		res.add(missing);
		
		return res;
	}
	
	
	public static void main(String []arg) {
		
		//using series method 
		
//      int arr[]= {2,4,6,8,12};
//		int a = arr[0];
//		int d = arr[1]-arr[0];
//		int n = arr.length;
//		int miss = a +(n-1)*d;
//		System.out.println(" missing no. is " + miss);
		
        //missing and repeated  
		
		int arr[] = {5,2,4,2,1};
	    ArrayList<Integer>ans = missingNum(arr);
		System.out.println(ans.get(0)+ " "+ ans.get(1));
		
	}

	
}
