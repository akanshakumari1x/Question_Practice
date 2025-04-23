package com.akan.questions;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
	
	public static void main(String arg[]) {
		//dice 
		int n = 2;
		int dice = 7;
		int diff = dice - n;
		System.out.println(" diff "+ diff);
		
		//intersection of array
		
		int arr[] = {2,4,5};
		int arr1[] = {4,3,2};
		List list = new ArrayList();
		for(int i=0;i<arr.length; i++) {
			for(int j =0; j< arr1.length; j++) {
				if(list.contains(arr1[j])) {
					System.out.print(" skip element ");
				}else {
					if(arr[i]==arr1[j]) {
						list.add(arr1[j]); }
				     }
			}
			
		}
		 for (int i = 0; i < list.size(); i++) {
	            System.out.print(list.get(i) + " ");  }
	}
	
	

}
