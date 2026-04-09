package assignment;

public class Assignment_7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; 

        boolean isSorted = true; 

        // check ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break; 
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}

	    
	


