package com.akan.forLoop;
import java.util.ArrayList;
import java.util.List;

public class Equilibrium {
	

public static void main(String ar[]) {
	 int[] A = {-7, 1, 5, 2, -4, 3, 0};
     System.out.println("Equilibrium Indices: " + findEquilibriumIndices(A));
}
		       //for multiple index
		            public static List<Integer> findEquilibriumIndices(int[] arr) {
		                List<Integer> result = new ArrayList<>();
		                int totalSum = 0, leftSum = 0;

		                // Calculate total sum of the array
		                for (int num : arr) {
		                    totalSum += num;
		                }

		                // Iterate and check equilibrium condition
		                for (int i = 0; i < arr.length; i++) {
		                    int rightSum = totalSum - leftSum - arr[i];

		                    if (leftSum == rightSum) {
		                        result.add(i);
		                    }

		                    leftSum += arr[i];
		                }
		                return result;
		            }
		            
		            //for single index  
		            
		            int arr[] = {2,5,5,3,4}; // Example array
			        int totalSum = 0, leftSum = 0;

			        // Compute the total sum of the array
			        for (int num : arr) {
			            totalSum += num;
			        }
			        for (int i = 0; i < arr.length; i++) {
			            int rightSum = totalSum - leftSum - arr[i];

			            if (leftSum == rightSum) {
			                System.out.println("Equilibrium index found at: " + i);
			                return; // Exit after finding the first equilibrium index
			            }

			            leftSum += arr[i]; // Update left sum for next iteration
			        }
			        System.out.println("No equilibrium index found");


		        
		       
}   

}
