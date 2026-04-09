package assignment;

public class Assignment_3 {

	public static void main(String[] args) {
		
		        int n = 10; 
		        int a = 0, b = 1;

		        System.out.print("Fibonacci Series: ");
		        for (int i = 1; i <= n; i++) {
		            System.out.print(a + " ");
		            if (a > 100) {
		                break; // stop if term > 100
		            }
		            int next = a + b;
		            a = b;
		            b = next;
		        }
		    }
		}

	


