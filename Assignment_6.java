package assignment;

public class Assignment_6 {
	
	    public static void main(String[] args) {
	        int[] arr = {4, 2, 7, 2, 9, 1}; // array of size 6

	        // Step 1: Find smallest
	        int smallest = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < smallest) {
	                smallest = arr[i];
	            }
	        }

	        // Step 2: Find second smallest
	        int secondSmallest = Integer.MAX_VALUE;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != smallest && arr[i] < secondSmallest) {
	                secondSmallest = arr[i];
	            }
	        }

	        // Step 3: Handle case when all elements are same
	        if (secondSmallest == Integer.MAX_VALUE) {
	            System.out.println("All elements are same, no second smallest.");
	        } else {
	            System.out.println("Second smallest: " + secondSmallest);
	        }
	    }
	}

