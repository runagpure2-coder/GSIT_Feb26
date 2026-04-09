package assignment;

public class Assignment_5 {
	
	    public static void main(String[] args) {
	        int n = 57243; 
	        int position = 1;
	        int result = 0;
	        int multiplier = 1;

	        while (n > 0) {
	            int digit = n % 10; // extract last digit

	            if (position % 2 != 0) { // odd position
	                if (digit <= 4) {
	                    digit = digit * 2;
	                }
	                // else keep as it is
	            } else { // even position
	                digit = 1;
	            }

	            // build result number
	            result = result + digit * multiplier;
	            multiplier *= 10;

	            n /= 10;
	            position++;
	        }

	        System.out.println("Transformed number: " + result);
	    }
	}



