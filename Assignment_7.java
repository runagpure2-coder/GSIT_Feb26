package assignment;

public class Assignment_7 {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4}; // try {1, 3, 2} also

	        boolean result = isSorted(arr);
	        System.out.println("Is array sorted? " + result);
	    }

	    static boolean isSorted(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                return false; // not ascending
	            }
	        }
	        return true; // ascending
	    }
	}


