package com.akan.forLoop;

public class MergeSort {
	
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		
		int temp[] = new int[m + n];
		int x = 0;
		for (int i = 0; i < m; i++) {
			temp[x] = nums1[i];
			x++; }
		
		for (int j = 0; j < n; j++) {
			temp[x] = nums2[j];
			x++; 	}
		return temp;
	}

	
		public static void main(String[] args) {

			int nums1[] = {2,3,4,0,0,0};
			int nums2[] = {5,9,7};
			int store = 0, m = 3, n = 3;
			int arr[] = merge(nums1,m,nums2,n);
			
			//sort the array 
			   for(int i=0;i<arr.length;i++){
		             for(int k=i+1; k<arr.length; k++){
		                 if(arr[i]>arr[k]){
		                     store = arr[i];
		                     arr[i] = arr[k];
		                     arr[k] = store;  }
		             }
		        }
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " "); }
			
		}
		
}


