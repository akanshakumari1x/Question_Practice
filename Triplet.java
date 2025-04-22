package com.akan.questions;

import java.util.Arrays;
public class Triplet {

	    // Function to perform binary search
	    public static boolean search(int sum, int start, int end, int[] arr) {
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (arr[mid] == sum) {
	                return true;
	            } else if (arr[mid] > sum) {
	            	
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        return false;
	    }

	    // Function to check if a triplet exists
	    public static boolean findTriplet(int[] arr) {
	        // Sorting the array
	        Arrays.sort(arr);

	        // Nested loops to check for pairs
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                // Check if the sum exists using binary search
	                if (search(arr[i] + arr[j], j + 1, arr.length - 1, arr)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 32, 1, 7, 10, 50, 19, 21, 2};
	        System.out.println(findTriplet(arr) ? "true" : "false");
	    }
	
}
