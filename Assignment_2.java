package assignment;

public class Assignment_2 {
	
	    public static void main(String[] args) {
	        // Step 1: character
	        char ch = 'R';

	        // Step 2: Convert char to int (ASCII value)
	        int asciiValue = (int) ch;

	        // Step 3: Add 5 to ASCII value
	        int newAsciiValue = asciiValue + 5;

	        // Step 4: Convert new ASCII value back to char
	        char newChar = (char) newAsciiValue;

	        
	        System.out.println("Character entered: " + ch);
	        System.out.println("ASCII value: " + asciiValue);
	        System.out.println("New ASCII value: " + newAsciiValue);
	        System.out.println("New character: " + newChar);
	    }
	}

