package com.akan.questions;

public class TwoPointerQstn {
	
	
	public static void main(String[] args) {
	    int arr1[] = {1, 4, 5, 7}; 
	    int arr2[] = {10, 20, 30, 40};
	    int x = 32;
	    int left = 0;
	    int right = arr2.length- 1;
	    int diff = Integer.MAX_VALUE;
	    int resl =0; 
	    int resR =0;
	    
	      while(left< arr1.length && right >=0) {
	    	  if(Math.abs(arr1[left] + arr2[right] - x) < diff) {
	    		  resl = left;
	    		  resR = right;
	    		  diff = Math.abs(arr1[left] + arr2[right]- x);
	    	  }
	    	  if(arr1[left] + arr2[right] > x)
	    		  right--;
	    	  else
	    		  left++;
	        }
           System.out.print("The closest pair is [" + arr1[resl] + ", " + arr2[resR] + "]");
	    
	    
	    
	   // Finding the closet pair
	    
	    int  arr[]= {1, 2, 4, 5, 6, 6, 8, 9};
	    int target = 11;
	    int res = arr[0];
	    
	    for(int i=1; i<arr.length; i++) {
	    	if(Math.abs(arr[i] - target) <=Math.abs(res - target)) {
	    		res = arr[i];  }
	    }
	    System.out.println(" array " + res);
	}
}
