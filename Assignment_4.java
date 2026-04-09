package assignment;

public class Assignment_4 {
	
	    public static void main(String[] args) {
	        int n = 60; 
	        System.out.print("Prime factors: ");

	        // loop from 2 up to n/2
	        for (int i = 2; i <= n / 2; i++) {
	            // check if i divides n
	            if (n % i == 0) {
	                // check if i is prime (basic way)
	                boolean isPrime = true;
	                for (int j = 2; j <= i / 2; j++) {
	                    if (i % j == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }

	                // if prime, print it
	                if (isPrime) {
	                    System.out.print(i + " ");
	                }
	            }

	            // stop if factor becomes greater than n/2
	            if (i > n / 2) {
	                break;
	            }
	        }
	    }
	}


