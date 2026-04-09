package assignment;

public class Assignment_8 {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 0, 3, 0, 5};

	        int count = 0; // position for non-zero elements

	        // Step 1: Move non-zero elements forward
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                arr[count] = arr[i];
	                count++;
	            }
	        }

	        // Step 2: Fill remaining positions with 0
	        while (count < arr.length) {
	            arr[count] = 0;
	            count++;
	        }

	        // Step 3: Print result
	        System.out.print("Array after moving zeros: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

